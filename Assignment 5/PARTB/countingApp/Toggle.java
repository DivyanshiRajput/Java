package countingApp;

import display.Display;
import widgets.*;

public class Toggle extends Button {

	public Toggle (int w1, int h1)
	{
		super(w1, h1);
	}

	// redefines draw so that it draws a circular outline
	// (instead of the default rectangular outline of Button)
	// "position" of Toggle is defined as the lower left corner of the
	// box that would enclose the circle
	public void draw()
	{
		int radius = this.getWidth() / 2;
		int cx = this.getPos().getX() + radius;
		int cy = this.getPos().getY() + radius;
		int x0 = this.getPos().getX();
		int y0 = this.getPos().getY();
		Display.drawCircle(cx, cy, radius);
		Display.drawText(x0, y0, this.getText());
	}

	// Toggles its state on each click.
	// Displays the text "Up" or "Down" accordingly
	protected void handleClick(){
		this.setFlag(true);
		if (this.getText().equals("Up"))
			this.setText("Down");
		else
			this.setText("Up");
	}

	// has a method to get its current state
	public String getState()
	{
		return this.getText();
	}


}
