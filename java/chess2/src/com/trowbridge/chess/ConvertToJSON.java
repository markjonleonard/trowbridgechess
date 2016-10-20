package com.trowbridge.chess;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class ConvertToJSON {

    
    private static final String PATH = "../../trowbridge chess club site/game_results/";
    private static final String xmlFileName = PATH + "json_ready_2013-13.xml";
    private static final String OUT_XML = PATH + "chess_results_2013-13.json";
    // "chess_results_2008-13.xml";
    private static final String xsltFileName = PATH + "xml-to-json.xsl";
    // "combine_results_2012.xsl";

    public static void main(String[] args) {

        System.setProperty("javax.xml.transform.TransformerFactory",
                "net.sf.saxon.TransformerFactoryImpl");  // use saxon for xslt 2.0 support

        try {
            Source xmlSource = new StreamSource(new File(xmlFileName));
            Source xsltSource = new StreamSource(new File(xsltFileName));

            TransformerFactory factory = TransformerFactory.newInstance(
                    "net.sf.saxon.TransformerFactoryImpl", null);
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
