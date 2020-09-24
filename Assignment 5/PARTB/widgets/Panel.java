package widgets;

import display.Display;
import java.util.ArrayList;

public class Panel extends Widget {
	private ArrayList<Widget> widgets = new ArrayList<Widget>();

	public Panel (int width, int height)
	{
		super(width, height);
	}

	public void addWidget(Widget w, Location loc) {
		// add a child widget
		int x = loc.getX() + this.getPos().getX();
		int y = loc.getY() + this.getPos().getY();
		Location l = new Location(x, y);
		w.setPos(l);
		widgets.add(w);
		// position of lower left of child is at loc in Panel coordinates

	}

	// implements/overrides draw. Draws a box corresponding to its size and
	// calls draw on each child widget
	public void draw()
	{
		int x0 = this.getPos().getX();
		int y0 = this.getPos().getY();
		int x1 = x0 + this.getWidth();
		int y1 = y0 + this.getHeight();

		if (this.getFlag() == true)
		{
			Display.drawBox(x0, y0, x1, y1);
			this.setFlag(false);
		}

		for (Widget w: widgets)
		{
			if (w.getFlag() == true)
			{
				w.draw();
				w.setFlag(false);
			}
			else
				continue;
		}
	}

}
