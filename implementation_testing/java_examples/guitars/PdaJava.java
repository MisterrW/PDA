import java.util.*;
import guitars.*;

public class PdaJava{
  public static void main(String[] args) {
    System.out.println("Hello");
    ArrayList<String> pickups = new ArrayList<String>();
    pickups.add("Dimarzio SC Neck");
    pickups.add("EMG HB Bridge");
    ElectricGuitar myGuitar = new ElectricGuitar(6, "alder", "maple", 0.1, pickups);
    Amplifier myAmp = new Amplifier(myGuitar, 1000, "valve");
    myAmp.play();
  }
}