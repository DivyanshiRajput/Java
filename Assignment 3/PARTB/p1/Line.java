package p1;

import java.lang.Math;
import java.util.*;

public class Line{
  private Point p1, p2;

  public Line( Point p1, Point p2)
  {
    this.p1 = p1;
    this.p2 = p2;
  }

  public double length() // returns length of line
  {
    double length = Math.sqrt(Math.pow((this.p2.getX() - this.p1.getX()), 2) + Math.pow((this.p2.getY() - this.p1.getY()), 2));
    return length;
  }

  public static double totalLength( ArrayList<Line> lines)  // static method which returns sum of length of all lines present in ArrayList
  {
    double totalLen = 0;
    for (Line i: lines)
    {
      totalLen += i.length();
    }

    return totalLen;
  }
}
