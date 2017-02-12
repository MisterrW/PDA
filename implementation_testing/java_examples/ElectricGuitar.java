import java.util.*;

public class ElectricGuitar extends Guitar implements Amplifiable{
  private ArrayList<String> pickups;

  public ElectricGuitar(int strings, String body_material, String neck_material, int volume, ArrayList<String> pickups){
    super(strings, body_material, neck_material, volume);
    this.pickups = pickups;
  }
}