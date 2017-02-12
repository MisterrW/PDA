package guitars;

public class Amplifier{
  private Amplifiable instrument;
  private int amplificationFactor;
  private String type;

  public Amplifier(Amplifiable instrument, int amplificationFactor , String type){
    this.instrument = instrument;
    this.amplificationFactor = amplificationFactor;
    this.type = type;
  }

  public void play(){
    double totalVolume = (this.amplificationFactor * this.instrument.getVolume());
    System.out.println(this.instrument.identifySelfType());
    String outputString = String.format("Now playing at a volume of %f, which is %d times louder than I would be without an amp (my unamplified volume is a puny %f)", totalVolume, this.amplificationFactor, this.instrument.getVolume());
    System.out.println(outputString);
  }
}