package com.trowbridge.chess;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class ApplyXSLT {

    private static final String PATH = "../../trowbridge chess club site/game_results/";
    private static final String OUT_XML = PATH + "json_ready_2013-13.xml";
            //"chess_results_2008-13.xml";
    private static final String xsltFileName = PATH + "attr_to_elems.xsl";
    // "combine_results_2012.xsl";

    public static void main(String[] args) {

        String xmlFileName = PATH + "chess_results_2012-13.xml";
        try {
            Source xmlSource = new StreamSource(new File(xmlFileName));
            Source xsltSource = new StreamSource(new File(xsltFileName));

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(xsltSource);
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();
            transformer.transform(xmlSource, new StreamResult(bOut));
            bOut.close();

            PrintWriter out = new PrintWriter(OUT_XML);
            out.write(bOut.toString());
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Exception occurred: " + e);
        }
    }
}
