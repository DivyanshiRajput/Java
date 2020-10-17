package demo19029;

import java.util.*;
import base.*;

public class myHub extends Hub
{
  Random rand = new Random();
  ArrayList<Truck> trucks = new ArrayList<Truck>();

  public myHub(Location l)
  {
    super(l);
  }

  public synchronized boolean add(Truck t) //adds truck to the list of trucks at this hub and returns true else returns false if hub is full
  {
    if (this.trucks.size() >= this.getCapacity())
    {
      return false;
    }
    else
    {
      this.trucks.add(0, t);
      return true;
    }
  }

  public synchronized void remove(Truck t) //removes truck from the list of trucks
  {
    if (this.trucks.size() > 0)
    {
      this.trucks.remove(t);
    }
  }

  public Highway getNextHighway(Hub last, Hub dest) //returns the next highway on which we have to send the truck
  {
    HashMap<Hub,Hub> map = this.getMap(last, dest);
    Hub temp = map.get(dest);
    Hub next_hub = dest;

    while(last.getLoc().getX()!=temp.getLoc().getX() && last.getLoc().getY()!=temp.getLoc().getY())
    {
      next_hub = temp;
      temp = map.get(temp);
    }


    for(Highway h:this.getHighways())
    {
      if(h.getEnd().getLoc().getX() == next_hub.getLoc().getX() && h.getEnd().getLoc().getY()== next_hub.getLoc().getY())
      {
        return h;
      }
    }

    return getHighways().get(rand.nextInt(getHighways().size()));
  }

  protected void processQ(int deltaT) //process truck after every deltaT time
  {
    while(this.trucks.size() > 0)
    {
      Truck t = this.trucks.get(0);
      Highway h = this.getNextHighway(t.getLastHub(), Network.getNearestHub(t.getDest())); //calls the getNextHighway function and adds truck to that highway
      if (h.hasCapacity())
      {
        t.enter(h);
        this.remove(t);
      }
    }
  }

  private HashMap getMap (Hub last, Hub dest)
  {
    Queue<Hub> path = new LinkedList<Hub>();
    path.add(last);

    ArrayList<Hub> visited = new ArrayList<Hub>();
    visited.add(last);

    HashMap<Hub,Hub> map = new HashMap<Hub,Hub>();

    while(path.size() > 0)
    {
      Hub curr_hub = path.remove();

      if(curr_hub.getLoc().getX() == dest.getLoc().getX() && curr_hub.getLoc().getY() == dest.getLoc().getY())
      {
        break;
      }
      for(Highway h:curr_hub.getHighways())
      {
        if(!visited.contains(h.getEnd()))
        {
          path.add(h.getEnd());
          visited.add(h.getEnd());
          map.put(h.getEnd(),curr_hub);
        }
      }
    }

    return map;
  }

}
