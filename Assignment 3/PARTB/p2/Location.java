package p2;

import p1.*;
import java.lang.Math;
import java.util.*;

public class Location{
  private String name;
  private Point p;

  public Location (String name, Point p)
  {
    this.name = name;
    this.p = p;
  }

// getters for all the private data members

  public String getName(){
    return this.name;
  }

  public Point getPoint(){
    return this.p;
  }
}
