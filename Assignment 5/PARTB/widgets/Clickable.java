package widgets;

public interface Clickable {
	void onClick(Location p);
	// mouse has been clicked at location p in global coordinate system
	// Derived object can decide if it wants to process this event					
}
