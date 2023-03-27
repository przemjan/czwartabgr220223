package ZapisDoPliku;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo  {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("danie.txt");

        pw.println("Olgierd nie  lubi kiełbasy :)");

        //zapisanie kolejnej linii
        //pw.println("Kamil lubi jeść (dużo!)");

        pw.close();
    }
}
