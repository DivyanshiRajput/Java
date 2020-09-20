public class ElectricCar extends Car{
  double eff;
  double fuel;
  ElectricCar(double eff, double fuel){
    this.eff = eff;
    this.fuel = fuel;
  }

  public double range(){
    return (this.fuel * 1000) / this.eff;
  }
}
