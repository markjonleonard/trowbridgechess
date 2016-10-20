package com.trowbridge.chess;

import generated.com.trowbridge.chess.Chess;
import generated.com.trowbridge.chess.Competition;
import generated.com.trowbridge.chess.DateType;
import generated.com.trowbridge.chess.Gameinfo;
import generated.com.trowbridge.chess.Grade;
import generated.com.trowbridge.chess.Match;
import generated.com.trowbridge.chess.Opponents;
import generated.com.trowbridge.chess.Player;
import generated.com.trowbridge.chess.Players;
import generated.com.trowbridge.chess.Value;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

public class ChessResults {
	private Chess chess;
	private Integer i = 0;
	private JAXBContext jc;
	private File file;

	public ChessResults(String fileName) throws JAXBException {
		jc = JAXBContext.newInstance(Chess.class);
		Unmarshaller u = jc.createUnmarshaller();
		file = new File("/home/mleonard/chess_workspace/trowbridge chess club site/public_html/game_results/" + fileName);
		JAXBElement<Chess> doc = u.unmarshal(new StreamSource(file), Chess.class);
		chess = doc.getValue();

		Players players = chess.getPlayers();
		if (players != null) {
			// System.out.println(players.getPlayer());
			Player player = players.getPlayer().get(0);
			try {
				// System.out.println("Club = " + player.getClub().get(0));
			} catch (Exception e) {
			}
			// System.out.println("Grade count = " + player.getGrade().size());
			// Grade grade = player.getGrade().get(0);
			// System.out.println("Ref = " + grade.getRef());
		}
	}

	public void addCompetition(Competition comp) {
		chess.getCompetition().add(comp);
	}

	// Update one Grade content from another
	public void copyGradeContent(Grade grade, Grade newGrade, String targetGradingDate) {
		List<Object> content = grade.getContent();

		// Check existing grade content for each value in the "new" grade
		// content
		for (Object n : newGrade.getContent()) {
			boolean present = false;

			// Iterate existing content
			for (Object o : content) {
				if (n instanceof Value && o instanceof Value) {
					Value newValue = (Value) n;
					Value oldValue = (Value) o;
					if (gradeDatesMatch(newValue, oldValue)) {
						// Found same start range
						present = true;
						// Check grade value is the same
						if (!newValue.getValue().equals(oldValue.getValue())) {
							System.out.println("error - new value " + ((Value) n).getValue() + " not equal to old value " + ((Value) o).getValue());
						}
						// Finished looking
						break;
					}
				} else {
					System.out.println("Old grade " + o);
				}
			}

			// Append the new grade value
			if (!present) {
				if (n instanceof Value) {
					Value newValue = (Value) n;
					if (targetGradingDate.compareTo(newValue.getStart()) >= 0) {
						System.out.println("Appending grade " + newValue.getValue() + " (" + newValue.getStart() + ") of type " + newValue.getType());
						content.add(n);
					}
				} else {
					content.add(n);
				}
			}
		}
	}

	public Competition getCompetition(Competition findme) {
		List<Competition> cList = chess.getCompetition();
		for (Competition c : cList) {
			if (c.getName().equals(findme.getName()) || (c.getEcfname() != null && c.getEcfname().equals(findme.getEcfname()))) {
				return c;
			}
		}
		return null;
	}

	public Integer getLatestGrade(Player player, String ref) {
		List<Grade> gradeList = player.getGrade();
		for (Grade grade : gradeList) {
			if (!grade.getRef().equals(ref)) {
				continue;
			}
			List<Object> values = grade.getContent();
			for (Object o : values) {
				if (o instanceof Value) {
					Value value = (Value) o;
					return value.getValue().intValue();
				} else {
					return Integer.parseInt((String) o);
				}
			}
		}
		return null;
	}

	public Gameinfo getNextGame() {
		Competition comp = chess.getCompetition().get(i);
		return comp.getMatch().get(0).getGameinfo().get(0);
	}

	public Player getPlayer(String ref) {
		Player p = null;
		if (chess.getPlayers() != null) {
			for (Player player : chess.getPlayers().getPlayer()) {
				for (Grade grade : player.getGrade()) {
					if (grade.getRef().equals(ref))
						p = player;
					break;
				}
			}
		}
		return p;
	}

	public List<Player> getPlayersList() {
		if (chess.getPlayers() == null) {
			return null;
		}
		return chess.getPlayers().getPlayer();
	}

	public String prettyPrint(String s) {
		s = s.replaceAll("(</match>)(?!<match)", "$1\n");
		s = s.replaceAll("(</away>)<date", "$1\n<date");
		s = s.replaceAll("(</gameinfo>)(?!<gameinfo)", "$1\n");
		s = s.replaceAll("(<(gameinfo.*?|competition.*?|match|player(s| .*?)?)>)", "\n$1");
		s = s.replaceAll("(</(players|chess)>)", "\n$1");

		return s.replaceAll(
				"<chess>\n",
				"\n<?xml-stylesheet type=\"text/xsl\" href=\"player_records.xsl\"?>\n<chess xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"chess.xsd\">\n");
	}

	@Override
	public String toString() {
		Competition comp = chess.getCompetition().get(i);
		return comp.getName();
	}

	public String toXML(Object o) throws JAXBException {
		if (o == null)
			return "null";
		jc = JAXBContext.newInstance(Chess.class);
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
		m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		StringWriter sw = new StringWriter();
		m.marshal(o, sw);
		return sw.toString();
	}

	public String toXML(List<Gameinfo> games) throws JAXBException {
		String s = "";
		for (Gameinfo info : games) {
			s += toXML(info);
		}
		return s;
	}

	public String toXML(Set<Competition> games) throws JAXBException {
		String s = "";
		for (Competition c : games) {
			s += toXML(c);
		}
		return s;
	}

	public void writeToFile() throws JAXBException, IOException {
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
		m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		StringWriter sw = new StringWriter();
		m.marshal(chess, sw);
		String s = sw.toString();
		s = prettyPrint(s);
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
		try {
			out.write(s);
		} finally {
			out.close();
		}

	}

	public boolean hasMatch(Competition c, Match match) throws JAXBException {
		for (Match m : c.getMatch()) {
			if (matchesAreEqual(m, match)) {
				return true;
			}
		}
		try {
			System.out.println(toXML(match));
			System.out.println(prettyPrint(toXML(c)));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	private boolean matchesAreEqual(Match m1, Match m2) throws JAXBException {
		DateType d1 = m1.getEcfdate();
		DateType d2 = m2.getEcfdate();
		if (d1 == null)
			d1 = m1.getDate();
		if (d2 == null)
			d2 = m2.getDate();

		if (datesAreEqual(d1, d2)) {
			List<Gameinfo> g1 = m1.getGameinfo();
			List<Gameinfo> g2 = m2.getGameinfo();
			for (Gameinfo g : g1) {
				Opponents o1 = g.getOpponents();
				if (g2.size() < 1) {
					return false;
				}
				Opponents o2 = g2.get(0).getOpponents();
				String w1 = o1.getWhite().getPlayerRef().getRef();
				String w2 = o2.getWhite().getPlayerRef().getRef();
				String b1 = o1.getBlack().getPlayerRef().getRef();
				String b2 = o2.getBlack().getPlayerRef().getRef();
				String r1 = g.getResult().getRes();
				String r2 = g2.get(0).getResult().getRes();

				if ("reversed".equals(o1.getEcf())) {
					String temp = w1;
					w1 = b1;
					b1 = temp;
					if ("1-0".equals(r1)) {
						r1 = "0-1";
					} else if ("0-1".equals(r1)) {
						r1 = "1-0";
					}
				}

				if (r1.equals(r2) && w1.equals(w2) && b1.equals(b2)) {
					return true;
				} else if ("no_colours".equals(o1.getEcf()) || "no_colours".equals(o2.getEcf())) {
					// Reverse and re-test
					if ("1-0".equals(r1)) {
						r1 = "0-1";
					} else if ("0-1".equals(r1)) {
						r1 = "1-0";
					}
					if (r1.equals(r2) && w1.equals(b2) && b1.equals(w2)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean datesAreEqual(DateType d1, DateType d2) {
		return (d1.getDay().equals(d2.getDay()) && d1.getMonth().equals(d2.getMonth()) && d1.getYear().equals(d2.getYear()));
	}

	public boolean gradeDatesMatch(Value g1, Value g2) {
		if (g1.getStart().equals(g2.getStart())) {
			if (g1.getType() == null) {
				return g2.getType() == null;
			} else {
				return g1.getType().equals(g2.getType());
			}
		}
		return false;
	}

	public List<Competition> getCompetitions(Competition findme) {
		List<Competition> cList = new ArrayList<Competition>();
		for (Competition c : chess.getCompetition()) {
			if (c.getName().equals(findme.getName()) || (c.getEcfname() != null && c.getEcfname().equals(findme.getEcfname()))) {
				cList.add(c);
			}
		}
		return cList;
	}

	public Set<Competition> getCompetitions() {
		Set<Competition> cSet = new HashSet<Competition>();
		for (Competition c : chess.getCompetition()) {
			cSet.add(c);
		}
		return cSet;
	}

	public Set<String> getOpponentRefs(Set<Competition> games, String playerRef) {
		HashSet<String> refs = new HashSet<String>();

		for (Competition c : games) {
			for (Match m : c.getMatch()) {
				for (Gameinfo g : m.getGameinfo()) {
					String white = g.getOpponents().getWhite().getPlayerRef().getRef();
					String black = g.getOpponents().getBlack().getPlayerRef().getRef();
					if (white != playerRef) {
						refs.add(white);
					}
					if (black != playerRef) {
						refs.add(black);
					}
				}
			}
		}

		return refs;
	}

	public String lookupPlayerName(String name) {
		for (Player p : getPlayersList()) {
			if (name.equals(p.getName()) || name.equals(p.getEcfname())) {
				return p.getGrade().get(0).getRef();
			}
		}
		return null;
	}

}
