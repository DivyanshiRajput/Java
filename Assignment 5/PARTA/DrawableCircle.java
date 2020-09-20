import java.lang.*;

public class DrawableCircle extends Circle implements Drawable {

	public DrawableCircle(double d, double x, double y) {
    super(d, x, y);
	}

  public void draw(){

    double angle = 0;
    while (angle < 2 * Math.PI){
      double a = this.radius * Math.cos(angle);
      double b = this.radius * Math.sin(angle);
      System.out.printf("%.2f %.2f\n", a, b);
      angle += Math.PI / 4;
    }
  }

}
