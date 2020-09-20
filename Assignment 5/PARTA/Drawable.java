import java.lang.*;

public interface Drawable {
	public abstract void draw();  // should draw derived object. For now, assume derived object will
				  // print out series of points that when joined together will be the
				  // outline of the object
}
