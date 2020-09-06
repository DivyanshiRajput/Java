package p2;

import p1.*;
import java.lang.Math;
import java.util.*;

public class Route{
  private ArrayList<Road> path = new ArrayList<Road>();

  public ArrayList<Road> getPath() // returns the data member --> ArrayList<Road> path
  {
    return this.path;
  }

  public static boolean isConnected(ArrayList<Road> roads) // static funtion which returns if the given route is valid or not
  {
    for (int i = 0; i < roads.size()-1; i++)
    {
      Road current = roads.get(i);
      Road next = roads.get(i+1);
      if (current.getEnd() != next.getStart()) // condition for checking if the end of the current road is same as the start of the next road
      {
        return false;
      }
    }
    return true;
  }

  public static double routeLength(ArrayList<Road> route) // returns total length of the route
  {
    ArrayList<Line> lines = new ArrayList<Line>();
    for (Road r: route)
    {
      Line temp = r.getLine(); // calling getLine() function from the road class to make a list of lines of the route
      lines.add(temp);
    }

    double length = Line.totalLength(lines); // calling static function totalLength() from class Line in package 1
    return length;
  }

  public static double maxWidth(ArrayList<Road> route) // returns the max width of the vehicle which can pass through the route
  {
    double temp = 10000;
    for (Road r : route)
    {
      if (r.getWidth() < temp)
        temp = r.getWidth();

      else
        continue;
    }

    return temp;
  }

  public static String getPath(ArrayList<Road> route) // returns route traversal as a string.
  {
    String path = "Start at " + route.get(0).getStart() + ".";
    for (int i = 0; i < route.size() ; i++)
    {
      path += " Follow " + route.get(i).getName() + " to " + route.get(i).getEnd() + ".";
    }
    return path;
  }
}
