package widgets;

import display.Display;

public class Label extends Widget {
	// has a text string as data - which is provided at create time
	// width and height are determined from this
	// assume each character is 5 units wide and 10 units high
	private String text;

	public Label (String text)
	{
		super(5 * text.length(), 10);
		this.text = text;
	}

	public void draw() //overrides the draw function from class Widget
	{
		int x0 = this.getPos().getX();
		int y0 = this.getPos().getY();
		Display.drawText(x0, y0, this.text);
	}
	// does not react to mouse events

	// provides methods to get text
	public String getText()
	{
		return this.text;
	}

}
