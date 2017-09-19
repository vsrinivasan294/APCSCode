
import java.awt.geom.Point2D;

import processing.core.PApplet;


public class DrawingSurface extends PApplet {

	private Rectangle r;
	private Circle c;
	
	public DrawingSurface() {
		r = null;
		c = null;
		
	//	runSketch();
	
	}
	
	// The statements in the setup() function 
	// execute once when the program begins
	public void setup() {

	}
	
	// The statements in draw() are executed until the 
	// program is stopped. Each statement is executed in 
	// sequence and after the last line is read, the first 
	// line is executed again.
	public void draw() { 
		background(255);   // Clear the screen with a white background
		fill(255);
		textAlign(CENTER);
		
		if (r != null) {
			stroke(255,0,255);
			fill(255);
			r.draw(this);
			Point2D.Double center = r.getCenter();
			fill(0);
			text(r.getPerimeter()+"\n"+r.getArea(),(float)center.x,(float)center.y);
		}
		if (c != null) {
			stroke(0,255,255);
			fill(255);
			c.draw(this);
			Point2D.Double center = c.getCenter();
			fill(0);
			text(c.getPerimeter()+"\n"+c.getArea(),(float)center.x,(float)center.y);
		}
		fill(0);
		textSize(12);
		
	}
	
	
	public void mousePressed() {
		if (mouseButton == LEFT) {
			r = new Rectangle(mouseX,mouseY,0,0);
		} 
		 else if (mouseButton == RIGHT) {
				c = new Circle(mouseX,mouseY,0,0);
		}
	}
	public void mouseDragged() {
		if (mouseButton == LEFT) {
			r.setPoint(mouseX,mouseY);
		} 
		else if (mouseButton == RIGHT) {
			c.setPoint(mouseX,mouseY);
	}
	
	}
}










