package vishnu.shapedemo;

import khosla.shapes.Shape;
import processing.core.PApplet;

public class PhysicsShape {
	
	private Shape boundingShape;

	private double vx, vy;
	
	
	public PhysicsShape(Shape s) {
		this.boundingShape =  s;
		vx = 0;
		vy = 0;
		
	}
	
	public void draw (PApplet drawer) {
		boundingShape.draw(drawer);
	}
	
	public Shape getBoundingShape() {
		return boundingShape;
	}
	
	public void setVelocity(double vx, double vy) {
		this.vx = vx;
		this.vy = vy;	
	}
	
	public void act() {
	
		double x = boundingShape.getX();
		double y = boundingShape.getY();
	}
}
