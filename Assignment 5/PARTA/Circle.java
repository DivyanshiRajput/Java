import java.lang.*;

public class Circle {
  double radius;
  double x;
  double y;
	// has center and radius
	// set up constructor
  Circle(double radius, double x, double y)
  {
    this.radius = radius;
    this.x = x;
    this.y = y;
  }
	// implement method to get radius, center
  double getRadius(){
    return this.radius;
  }

  double getX(){
    return this.x;
  }

  double getY(){
    return this.y;
  }
	// implement area
	double getArea() {
    return Math.PI * Math.pow(this.radius, 2);
	}
}
