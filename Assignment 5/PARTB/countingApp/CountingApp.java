package countingApp;

import display.Display;
import widgets.*;

public class CountingApp {
	private Display disp;

	public CountingApp(Display d) {
		// Display object made available at construction. Cannot be changed
		this.disp = d;
	}

	public void init()
	{
		// sets up widgets

		// create a Panel with location 50,50 and width 400, height 200
		Panel panel = new Panel(400,200);
		this.disp.set(panel, 50, 50);

		// creates the following widgets, which are added as children of this panel
		// Note locations are relative to Panel
		// - Toggle button:   location 100, 60, size 50, 50
		Toggle tbutton = new Toggle(50, 50);
		Location temp1 = new Location(100, 60);
		tbutton.setText("Up");
		panel.addWidget(tbutton, temp1);

		// - Counter button:  location 200, 60, size 100, 40
		Counter cbutton = new Counter(100, 40);
		Location temp2 = new Location(200, 60);
		cbutton.setToggle(tbutton);
		cbutton.setText("0");
		panel.addWidget(cbutton, temp2);

		// - Label: location  150, 150, text: "Vote up or down"
		Label label = new Label("Vote up or down");
		Location temp3 = new Location(150, 150);
		panel.addWidget(label, temp3);

		// registers those widgets that are Clickable with Display
		this.disp.registerClickable(tbutton);
		this.disp.registerClickable(cbutton);

		this.disp.redisplay();
	}

}
