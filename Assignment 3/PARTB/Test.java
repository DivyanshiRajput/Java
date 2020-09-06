import p1.*;
import p2.*;

import java.lang.Math;
import java.util.*;

public class Test{
  public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);

      String s1 = input.nextLine();
      int n1 = Integer.parseInt(s1);
      ArrayList<Location> locations = new ArrayList<Location>(); // list of locations.
      for (int i = 0; i < n1; i++) // loop for taking input of locations.
      {
        String s = input.nextLine();
        String[] parts = s.split(" ");
        double x = Double.parseDouble(parts[0]);
        double y = Double.parseDouble(parts[1]);
        Point p = new Point(x, y);
        Location temp = new Location(parts[2], p);
        locations.add(temp);
      }


      String s2 = input.nextLine();
      int n2 = Integer.parseInt(s2);
      ArrayList<Road> roads = new ArrayList<Road>(); // list of roads.
      for (int i = 0; i < n2; i++) // loop for taking input of roads.
      {
        String s = input.nextLine();
        String[] parts = s.split(" ");
        Location start = locations.get(Integer.parseInt(parts[0]));
        Location end = locations.get(Integer.parseInt(parts[1]));
        double width = Double.parseDouble(parts[3]);
        Road temp = new Road(parts[2], width, start, end);
        roads.add(temp);
      }


      String s3 = input.nextLine();
      int n3 = Integer.parseInt(s3);
      ArrayList<Route> routes = new ArrayList<Route>(); // list of routes.
      for (int i = 0; i < n3; i++) // loop for taking input of routes.
      {
        String s = input.nextLine();
        String[] parts = s.split(" ");
        Route temp = new Route();
        int j = Integer.parseInt(parts[0]);
        for (int k = 1 ; k <= j ; k++ )
        {
          temp.getPath().add(roads.get(Integer.parseInt(parts[k]))); // calls getPath() from class route to add a road to the given route.
        }
        routes.add(temp);
      }

      int i = 1; // integer variable for keeping track of number of roads.
      for (Route r: routes) // prints the route after checking if it is valid or not.
      {
        if (Route.isConnected(r.getPath()))
        {
            System.out.printf("Route %d: Length %.2f, Width %.2f, %s\n",i, Route.routeLength(r.getPath()), Route.maxWidth(r.getPath()), Route.getPath(r.getPath()));
        }

        else
          System.out.printf("Route %d: Invalid route\n", i);

        i++;
      }
  }
}
