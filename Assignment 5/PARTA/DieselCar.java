public class DieselCar extends Car{
  double eff;
  double fuel;
  DieselCar(double eff, double fuel){
    this.eff = eff;
    this.fuel = fuel;
  }

  public double range(){
    return this.eff * this.fuel;
  }

}
