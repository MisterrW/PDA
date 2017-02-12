package guitars;

public abstract class Guitar{
  private int strings;
  private String body_material;
  private String neck_material;
  private double volume;

  public Guitar(int strings, String body_material, String neck_material, double volume){
    this.strings = strings;
    this.volume = volume;
    this.body_material = body_material;
    this.neck_material = neck_material;
  }

  public double getVolume(){
    return this.volume;
  }
  public String identifySelfType(){
    return "I am a guitar";
  }
}