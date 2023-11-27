package negocio;

public class H2 extends TagDecorator {

  public H2(Html tag, String title) {
    super(tag);
    this.code = "<h2>" + title + "</h2>";
  }

  @Override
  public String getCode() {
    return this.tag.getCode() + "\n" + this.code;
  }

}
