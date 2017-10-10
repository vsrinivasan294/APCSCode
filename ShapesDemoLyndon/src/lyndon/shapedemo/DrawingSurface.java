package lyndon.shapedemo;
import java.awt.Color;
import java.util.ArrayList;

import processing.core.PApplet;
import vishnu.shapes.*;

public class DrawingSurface extends PApplet {
	private MovingShape shape;
	Rectangle r;
	private ArrayList<Line> bounds;
	
	public DrawingSurface() {
		shape = new MovingShape(new Circle(100,0,20,20, Color.BLACK, Color.BLUE,1));
		bounds = new ArrayList<Line>();
		//r = new Rectangle(300,10,20,20, Color.BLUE, Color.BLUE, 5);
		bounds.add(new Line(0,0,100,100));
	}

	public void draw() {
		background(255);
		shape.draw(this);
		shape.act();
		//r.draw(this);
		line(0,206,100,206);
		if (shape.getY()+20 > 206) {
			shape.setYVelocity(-shape.getYSpeed());
		}
	}
	
	public void mousePressed() {
		shape.setYVelocity(-10);
	}
}