package myAirline;
import java.util.*;

class PriorityQueueFlight
{
  private ArrayList<Flight> flights = new ArrayList<Flight>();

  boolean isEmpty() {
    if (flights.size() == 0)
      return true;
    else
      return false;
  }

  Flight peek(){
    Flight f = flights.get(0);
    return f;
  }

  Flight pop(){
    if (flights.size() > 0)
    { Flight f = flights.get(0);
      flights.remove(0);
      return f;
    }
    else
      return null;
  }

  void add(Flight newFlight)
  {
    if (flights.size() == 0){
      flights.add(newFlight);
    }

    else
    {
      for (int i = 0; i < flights.size(); i++)
      {
        Flight temp = flights.get(i);

        if (newFlight.getPrice() < temp.getPrice()){
          flights.add(i, newFlight);
        }
      }
    }
  }
}
