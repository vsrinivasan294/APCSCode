import java.awt.geom.Point2D;

import processing.core.PApplet;
import vishnu.shapes.Circle;
import vishnu.shapes.Rectangle;

public class DrawingSurface extends PApplet {

	private Rectangle r;
	private Circle c;
	
	public DrawingSurface() {
		r = null;
		c = null;
		
		runSketch();
	
	}
	
	public void draw() { 
		background(255);   // Clear the screen with a white background
		fill(255);
		stroke(255,0,255);
		fill(255);
		r.draw(this);
		
	}
	
	
}
