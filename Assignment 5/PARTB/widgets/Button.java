package widgets;

import display.Display;

public abstract class Button extends Widget implements Clickable {
	private String text;

	public Button(int w, int h)
	{
		super(w, h);
	}

	// has methods to get/set text
	public void setText (String t) //setText
	{
		this.text = t;
	}

	public String getText() //getText
	{
		return this.text;
	}

	// implements/overrides draw to draw a box at the correct position and size
	// and displays the text of the button
	public void draw()
	{
		int x0 = this.getPos().getX();
		int y0 = this.getPos().getY();
		int x1 = x0 + this.getWidth();
		int y1 = y0 + this.getHeight();
		Display.drawBox(x0, y0, x1, y1);
		Display.drawText(x0, y0, this.text);
	}

	// implement the onClick method to check if the click is within its bounds
	// and if so, invokes protected method handleClick
	public void onClick( Location p)
	{
		int x0 = this.getPos().getX();
		int y0 = this.getPos().getY();
		int x1 = x0 + this.getWidth();
		int y1 = y0 + this.getHeight();
		int x = p.getX();
		int y = p.getY();
		if ( x > x0 && x < x1 && y > y0 && y < y1)
		{
			handleClick();
		}
	}


	abstract protected void handleClick();   // should we make this abstract? yes, as it will be according to the type of the button
}
