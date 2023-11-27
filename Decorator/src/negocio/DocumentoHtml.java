package negocio;

public class DocumentoHtml extends Html {

  public DocumentoHtml() {
    this.code = "<!-- Comecando meu documento!-->";
  }

  @Override
  public String getCode() {
    return this.code;
  }

}
