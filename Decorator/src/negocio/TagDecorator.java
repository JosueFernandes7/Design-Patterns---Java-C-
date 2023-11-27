package negocio;

public class TagDecorator extends Html {

  protected Html tag;

  public TagDecorator(Html tag) {
    this.tag = tag;
  }

  @Override
  public String getCode() {
    return this.getCode() + "\n" + this.code;
  }

}
