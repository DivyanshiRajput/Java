package p1;

import java.lang.Math;

public class Point{
  private double x, y;

  public Point (double x, double y)
  {
    this.x = x;
    this.y = y;
  }

// getters for all the private data members

  public double getX()
  {
    return this.x;
  }

  public double getY()
  {
    return this.y;
  }

// setters for all the private data members

  public void setX(double X)
  {
    this.x = X;
  }

  public void setY(double Y)
  {
    this.y = Y;
  }

  public double Distance(double x2, double y2) // returns distance from a point (x2, y2)
  {
    double dis = Math.sqrt(Math.pow((x2-this.x), 2) + Math.pow((y2-this.y), 2));
    return dis;
  }
}
