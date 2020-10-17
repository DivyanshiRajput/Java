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

  public void remove(Truck t) //removes truck from the list of trucks
  {
    if (this.trucks.size() > 0)
    {
      this.trucks.remove(t);
    }
  }

  public Highway getNextHighway(Hub last, Hub dest) //returns the next highway on which we have to send the truck
  {
      for (Highway i: this.getHighways())
      {
        if (i.getEnd() == dest)
        {
          return i;
        }
      }
      Highway hwy = getHighways().get(rand.nextInt(getHighways().size()));
      return hwy;
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

}
