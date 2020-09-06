package myAirline;
import java.util.*;

public class Flight
{
  private String origin;
  private String destination;
  public int seatNo;
  private int price;

  Flight(String origin, String destination, int seatNo, int price)
  {
    this.origin = origin;
    this.destination = destination;
    this.seatNo = seatNo;
    this.price = price;
  }

  public String getOrigin(){
    return this.origin;
  }

  public String getDestination(){
    return this.destination;
  }

  public int getSeats(){
    return this.seatNo;
  }

  public int getPrice(){
    return this.price;
  }

  static public Flight minPrice( ArrayList<Flight> flights)
  {
      int minPrice = Integer.MAX_VALUE;
      Flight cheapFlight = new Flight("", "", 0, 0);
      for (Flight i: flights)
      {
        if (i.getPrice() < minPrice){
          cheapFlight = i;
          minPrice = i.getPrice();
        }
      }
      return cheapFlight;
  }

}
