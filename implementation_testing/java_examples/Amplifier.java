public class Amplifier{
  private Amplifiable instrument;
  private int amplificationFactor;
  private String type;

  public Amplifier(Amplifiable instrument, int amplificationFactor , String type){
    private int 
    this.instrument = instrument;
    this.amplificationFactor = amplificationFactor;
    this.type = type;
  }

  public String play(){
    private int totalVolume = this.amplificationFactor * this.instrument.getVolume();
    System.out.println("now playing at a volume of %d", totalVolume);
  }
}