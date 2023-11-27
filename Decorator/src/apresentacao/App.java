package apresentacao;

import java.io.FileWriter;

import negocio.DocumentoHtml;
import negocio.H1;
import negocio.H2;
import negocio.Html;

public class App {
    public static void main(String[] args) throws Exception {
        Html html = new DocumentoHtml();
        html = new H1(html, "titulo 1");
        html = new H2(html, "titulo 2");

        System.out.println(html.getCode());
        FileWriter fw = new FileWriter(System.getProperty("user.dir")+"/index.html");
        fw.write(html.getCode());
        fw.close();
        // System.out.println(System.getProperty("user.dir"));
    }
}
