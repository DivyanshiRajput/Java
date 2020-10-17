package demo19029;

import base.*;
import java.util.*;

public class FactoryDemo extends Factory
{

  public Network createNetwork() //creates my network
  {
    return new myNetwork();
  }

	public Highway createHighway() //creates my highway
  {
    return new myHighway();
  }

	public Hub createHub(Location location) //creates hub at given location
  {
    return new myHub(location);
  }

	public Truck createTruck() //creates myTruck objects
  {
    return new myTruck();
  }
}
