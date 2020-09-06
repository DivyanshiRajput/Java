package myAirline;
import java.util.*;

public class Airline{
  PriorityQueueFlight queue = new PriorityQueueFlight();

  public void bookFlight()
  {
    Flight f = queue.peek();
    f.seatNo = f.getSeats() - 1;
  }

  public Flight leastPrice()
  {
    Flight f = queue.peek();
    return f;
  }
}
