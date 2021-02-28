package org.bridgelabz;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class PDFReader extends Base {

   @Test
    public  void readPdf() throws IOException {
       driver.get("http://www.africau.edu/images/default/sample.pdf");
       String currentUrl = driver.getCurrentUrl();
       URL url = new URL(currentUrl);
       InputStream inputStream= url.openStream();

       BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
       PDDocument pddocument = null;
       pddocument = PDDocument.load(bufferedInputStream);
       String pdfcontent = new PDFTextStripper().getText(pddocument);
       System.out.println(pdfcontent);
       Assert.assertTrue(pdfcontent.contains("A Simple PDF File"));

    }
}
