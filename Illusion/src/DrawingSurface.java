import java.awt.geom.Point2D;

import processing.core.PApplet;
import vishnu.shapes.Circle;
import vishnu.shapes.Rectangle;

public class DrawingSurface extends PApplet {

	private Rectangle r;
	private Circle c, c1, c2, c3, c4, c5, c6, c7, c8, c9;
	
	public DrawingSurface() {
		r = null;
	//	c = null;
		c = new Circle(180,120,10,10);
		c1 = new Circle(180,120,20,20);
		c2 = new Circle(180,120,30,30);
		c3 = new Circle(180,120,40,40);
		c4 = new Circle(180,120,50,50);
		c5 = new Circle(180,120,60,60);
		c6 = new Circle(180,120,70,70);
		c7 = new Circle(180,120,80,80);
		c8 = new Circle(180,120,90,90);
		c9 = new Circle(180,120,100,100);
		
		//runSketch();
	
	}
	
	public void draw() { 
		background(255);   // Clear the screen with a white background
		stroke(0,0,0);
	//	cd.draw(this);
		c.draw(this);
		c1.draw(this);
		c2.draw(this);
		c3.draw(this);
		c4.draw(this);
		c5.draw(this);
		c6.draw(this);
		c7.draw(this);
		c8.draw(this);
		c9.draw(this);
		
	}
	
	
}
