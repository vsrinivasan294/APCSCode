

import java.awt.Color;

import processing.core.PApplet;
import vishnu.shapes.*;


public class DrawingSurfaceIllusion extends PApplet{

	private Circle circle[];
	private Rectangle rectangle;

	
	public DrawingSurfaceIllusion() {
		
		Circle circle0 = new Circle(250, 250, 160, Color.BLACK, Color.WHITE, 5f);
		Circle circle1 = new Circle(250, 250, 150, Color.BLACK, Color.WHITE, 5f);
		Circle circle2 = new Circle(250, 250, 140, Color.BLACK, Color.WHITE, 5f);
		Circle circle3 = new Circle(250, 250, 130, Color.BLACK, Color.WHITE, 5f);
		Circle circle4 = new Circle(250, 250, 120, Color.BLACK, Color.WHITE, 5f);
		Circle circle5 = new Circle(250, 250, 110, Color.BLACK, Color.WHITE, 5f);
		Circle circle6 = new Circle(250, 250, 100, Color.BLACK, Color.WHITE, 5f);
		Circle circle7 = new Circle(250, 250, 90, Color.BLACK, Color.WHITE, 5f);
		Circle circle8 = new Circle(250, 250, 80, Color.BLACK, Color.WHITE, 5f);
		Circle circle9 = new Circle(250, 250, 70, Color.BLACK, Color.WHITE, 5f);
		Circle circle10 = new Circle(250, 250, 60, Color.BLACK, Color.WHITE, 5f);
		Circle circle11 = new Circle(250, 250, 50, Color.BLACK, Color.WHITE, 5f);
		Circle circle12 = new Circle(250, 250, 40, Color.BLACK, Color.WHITE, 5f);
		Circle circle13 = new Circle(250, 250, 30, Color.BLACK, Color.WHITE, 5f);
		Circle circle14 = new Circle(250, 250, 20, Color.BLACK, Color.WHITE, 5f);
		Circle circle15 = new Circle(250, 250, 10, Color.BLACK, Color.WHITE, 5f);
		Circle circle16 = new Circle(250, 250, 5, Color.WHITE, Color.WHITE, 5f);
		
		Circle circ[] = {circle0,circle1,circle2,circle3,circle4,circle5,circle6,circle7,circle8,circle9,circle10,circle11,circle12,circle13,circle14,circle15, circle16};
		circle = circ;
		
		rectangle = new Rectangle(125,125,250,250,null,Color.BLACK,10f);
		
	}
	
	public void draw() {
		
		background(255);
		
		for(int i = 0; i < circle.length; i++) {
			circle[i].draw(this);
		}
		
		rectangle.draw(this);
		
		
	}

}
