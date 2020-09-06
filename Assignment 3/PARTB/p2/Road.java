package p2;

import p1.*;
import java.lang.Math;
import java.util.*;

public class Road{
  private double width;
  private String name;
  private Location start, end;
  private Line line;

  public Road(String name, double width, Location start, Location end)
  {
    this.name = name;
    this.width = width;
    this.start = start;
    this.end = end;
    this.line = new Line(start.getPoint(), end.getPoint());
  }

  // getters for all the private data members

  public double getWidth(){
    return this.width;
  }

  public String getName(){
    return this.name;
  }

  public Line getLine(){
    return this.line;
  }

  public String getStart()
  {
    String n = this.start.getName();
    return n;
  }

  public String getEnd()
  {
    String n = this.end.getName();
    return n;
  }

}
