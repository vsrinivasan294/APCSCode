package lyndon.shapedemo;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import processing.core.PApplet;
import vishnu.shapes.Rectangle;
import vishnu.shapes.Shape;

public class MovingShape {
	
	private double vx, vy;
	private double gravity;
	private double friction;
	private Shape boundingShape;
	
	public MovingShape(Shape s) {
		boundingShape = s;
		gravity = 0;
		friction = 0;
		vx = 0;
		vy = 0;
	}
	
	public void draw(PApplet marker) {
		boundingShape.draw(marker);
	}
	
	public Shape getBoundingShape() {
		return boundingShape;
	}
	
	public void setXVelocity(double vx) {
		this.vx = vx;
		boundingShape.moveX(this.vx);
	}
	
	public void setYVelocity(double vy) {
		this.vy = vy;
		boundingShape.moveY(this.vy);
	}
	
	public void act() {
		if (vy == 0)
			gravity = 0;
		gravity += 0.4;
		setYVelocity(gravity);
	}
	
	public double getX() {
		return boundingShape.getX();
	}
	
	public double getY() {
		return boundingShape.getY();
	}
	
	public double getXSpeed() {
		return vx;
	}
	
	public double getYSpeed() {
		return vy;
	}
}

