package countingApp;

import widgets.*;

public class Counter extends Button {
  private Toggle toggle;

  public Counter(int w2, int h2)
  {
    super(w2, h2);
  }

	// has a reference to an instance of Toggle button
  public void setToggle(Toggle g)  //set toggle
  {
    this.toggle = g;
  }

  protected void handleClick() //defined abstract function from class Button
  {
    this.setFlag(true);
    // Everytime it is clicked, it increments or decrements counter by 1
  	// depending on state of the Toggle instance
    int i = Integer.parseInt(this.getText());
    if(this.toggle.getState().equals("Up")){
      i++;}
    else{
      i--;}
    // Shows the current count as its text
    this.setText(Integer.toString(i));
  }
}
