public abstract class Guitar{
  private int strings;
  private String body_material;
  private String neck_material;
  private int volume;

  public guitar(int strings, String body_material, String neck_material, int volume){
    this.strings = strings;
    this.volume = volume;
    this.body_material = body_material;
    this.neck_material = neck_material;
  }
}