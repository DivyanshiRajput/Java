package demo19029;

import java.util.*;
import base.*;

public class myHighway extends Highway
{
  ArrayList<Truck> trucks = new ArrayList<Truck>();

  public myHighway()
  {
    super();
  }

  public synchronized boolean hasCapacity() //checks if the highway has capacity to add a new truck
  {
    if (this.trucks.size() < this.getCapacity())
      return true;

    else
      return false;
  }

  public synchronized boolean add(Truck t) //if highway has capacity adds truck to the highway and returns true else returns false
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

  public synchronized void remove(Truck t) //removes truck from the list of trucks on the highway
  {
    if (this.trucks.size() > 0)
    {
      this.trucks.remove(t);
    }
  }
}
