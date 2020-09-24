package widgets;

import display.Display;

public abstract class Widget {
	private int width;
	private int height;
	private Location l;
	private boolean flag = true;

	public Widget(int width, int height) {
			this.width = width;
			this.height = height;
	}

	//setters
	public void setPos(Location p) { // what is appropriate access specifier here?
		// position of lower left corner of widget in global coordinates of Display
		this.l = p;
	}

	public void setFlag(boolean b)
	{
		this.flag = b;
	}

	//getters
	public Location getPos() {   // what is the appropriate access specifier here?
		return this.l;
	}

	public int getWidth()
	{
		return this.width;
	}

	public int getHeight()
	{
		return this.height;
	}

	public boolean getFlag()
	{
		return this.flag;
	}

	abstract public void draw();
	// widget uses methods of Display to draw an outline
	// and any text within the outline
	// widgets should redraw themselves only if they have changed since last
	// draw

	// add other protected/public methods as needed
}
