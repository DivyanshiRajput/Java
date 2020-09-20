import java.util.*;

public class Main{

  public static void main(String[] args) {
    ElectricCar car1 = new ElectricCar(150.5, 73);
    DieselCar car2 = new DieselCar(15.0, 11.5);

    System.out.println(car1.range());
    System.out.println(car2.range());
  }
}
