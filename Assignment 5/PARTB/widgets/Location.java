package widgets;

public class Location {
	// convenience class - encapsulates the pair x,y
	public Location(int x, int y) {  
		px = x; py = y;
	}
	
	public void setPos(int x, int y) {
		px = x; py = y;
	}
	
	public int getX() { return px; }
	public int getY() { return py; }
	
	private int px, py;
}
