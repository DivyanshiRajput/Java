import java.lang.*;

public class Lab41 {

	public static void main(String[] args) {
		Cylinder cyl = new Cylinder(5.0,7.0);
		System.out.println("Area = " + cyl.getArea() + " Volume = " + cyl.getVolume());
	}

}


// move these into separate files
class Circle {
  double radius;
	public Circle(double rad) {
    this.radius = rad;
	}
	public double getArea() {
    return Math.PI * Math.pow(this.radius, 2);
	}
	public double getCircumference() {
    return 2 * Math.PI * this.radius;
	}
}

class Cylinder {
  Circle circle;
  double height;
  double radius;

	public Cylinder(double rad, double height) {
    this.circle = new Circle(rad);
    this.radius = rad;
    this.height = height;
	}

	public double getArea() {
    return (this.height * this.circle.getCircumference()) + (2 * this.circle.getArea());
		// should use appropriate methods of Circle to get properties of the base circle
	}

	public double getVolume() {
    return this.height * this.circle.getArea();
		// should use appropriate methods of Circle to get properties of the base circle
	}

}
