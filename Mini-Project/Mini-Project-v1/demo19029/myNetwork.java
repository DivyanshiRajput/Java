package demo19029;

import java.util.*;
import base.*;

public class myNetwork extends Network
{
  private ArrayList<Hub> hubs = new ArrayList<Hub>();
  private ArrayList<Truck> trucks = new ArrayList<Truck>();
  private ArrayList<Highway> highways = new ArrayList<Highway>();

  public myNetwork()
  {
    super();
  }

  public void add (Hub hub) //adding hubs to the list of hubs
  {
    this.hubs.add(hub);
  }

  public void add (Truck truck) //adding trucks to the list of trucks
  {
    this.trucks.add(truck);
  }

  public void add (Highway highway) //adding highways to the list of highways
  {
    this.highways.add(highway);
  }

  public void start() //starting the hubs and trucks
  {
    for (Hub i: this.hubs)
    {
      i.start();
    }

    for (Truck t: this.trucks)
    {
      t.start();
    }
  }

  public void redisplay(Display disp) // calls draw function on the list of hubs, trucks and highways
  {
    for (Hub i: this.hubs)
    {
      i.draw(disp);
    }

    for (Truck t: this.trucks)
    {
      t.draw(disp);
    }

    for (Highway h: this.highways)
    {
      h.draw(disp);
    }
  }

  protected Hub findNearestHubForLoc(Location loc) //iterates over the list of hub to find the nearest hub
  {
    Hub temp; //using temp to store the nearest hub
    temp = this.hubs.get(0);
    int min_dist = Integer.MAX_VALUE;
    for (Hub i: this.hubs)
    {
      if(min_dist > i.getLoc().distSqrd(loc)) //update temp if the following condition is true
      {
        min_dist = i.getLoc().distSqrd(loc);
        temp = i;
      }
      else
        continue;
    }
    return temp;
  }

}
