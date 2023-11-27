package negocio;

public class H1 extends TagDecorator {

  public H1(Html tag, String title) {
    super(tag);
    this.code = "<h1>" + title + "</h1>";
  }

  @Override
  public String getCode() {
    return this.tag.getCode() + "\n" + this.code;
  }

}
