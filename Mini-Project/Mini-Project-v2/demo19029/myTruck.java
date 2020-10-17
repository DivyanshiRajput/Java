package demo19029;

import base.*;
import java.math.*;
import java.util.*;

public class myTruck extends Truck
{
  private boolean start = false; //flag which tells if the truck has started or not
  private boolean reached = false; //turns true when it reaches destination
  private boolean on_highway = false; //flag for checking if truck is on any highway
  private boolean on_hub = false; //flag for checking if truck is on any hub
  private Highway curr_highway; //stores current highway;
  private Hub last_hub; //stores last hub on which truck was there
  private Hub curr_hub; //stores current hub

  public myTruck()
  {
    super();
  }

  public String getTruckName() {
    return "Truck19029";
  }

  public Hub getLastHub() // returns the Hub from which it last exited.
  {
    return this.last_hub;
  }

  public void enter(Highway hwy) // adds the truck to the given highway and changes flag on_highway and on_hub
  {
    hwy.add(this);
    this.curr_highway = hwy;
    on_highway = true;
    on_hub = false;
  }

  protected void update(int deltaT) //updates the position of the truck every deltaT time
  {
    if (deltaT >= this.getStartTime()) //condition for starting the truck
    {
      this.curr_hub = Network.getNearestHub(this.getLoc());
      if (this.start == false && this.curr_hub.add(this) == true)
      {
        this.last_hub = this.curr_hub;
        this.setLoc(this.curr_hub.getLoc()); //sets location of the truck equal to its nearest hub
        on_hub = true;
        on_highway = false;
        start = true; //tells that truck has started
      }

      else //conditions if the truck was already on any highway or hub
      {
        if (on_highway)	// If on a road/highway, moves towards next Hub
        {
          this.updateLoc(deltaT); // called every deltaT time to update its status/position
        }
        else if (reached) // If at dest Hub, moves towards dest
        {
          this.setLoc(this.getDest());
          on_hub = false;
        }
      }
    }

    else // If less than startTime, does nothing
    {
      this.setStartTime(this.getStartTime() - deltaT);
    }
  }

  private void updateLoc(int deltaT) //called by update function to update the location of truck when it is on highway
  {
    int speed = this.curr_highway.getMaxSpeed(); //speed by which the truck can travel
    Hub next_hub = this.curr_highway.getEnd(); //end if the current highway
    Location end = next_hub.getLoc();
    double cos = (end.getX() - this.getLoc().getX()) / Math.sqrt(end.distSqrd(this.getLoc()));
    double sin = (end.getY() - this.getLoc().getY()) / Math.sqrt(end.distSqrd(this.getLoc()));
    if (speed*deltaT*0.002 < Math.sqrt(this.getLoc().distSqrd(end))) // truck moves according to this condition on any highway
    {
      int x = this.getLoc().getX() + (int)(cos*speed*deltaT*0.001);
      int y = this.getLoc().getY() + (int)(sin*speed*deltaT*0.001);
      this.setLoc(new Location(x, y)); //updating location
    }
    else //if truck is at the end of the highway adding it to the next hub (end of highway)
    {
      this.setLoc(next_hub.getLoc());
      if (next_hub.getLoc().getX() == Network.getNearestHub(this.getDest()).getLoc().getX() && next_hub.getLoc().getY() == Network.getNearestHub(this.getDest()).getLoc().getY()) // if end of the highway is the destination hub
      {
        on_hub = true;
        reached = true; //turns the reached flag true as it has reached the destination hub
        //System.out.println("reached");
        on_highway = false;
        curr_highway.remove(this);
      }
      else if (next_hub.add(this)) //if the highway end is not the destination hub, adds truck to the next_hub and then next hub process it accordingly
      {
        on_hub = true;
        on_highway = false;
        curr_highway.remove(this);
        last_hub = curr_hub;
        curr_hub = next_hub;
      }
    }
  }
}
