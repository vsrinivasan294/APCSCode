import java.awt.geom.Point2D;
import java.math.*;
import processing.core.PApplet;

public class Circle {

	private double x, y, width, height;
	
	
	public Circle() {
		x = 0;
		y = 0;
		width = 0;
		height = 0;
	}

	// Creates a new instance of a Circle object with the left and right
	// edges of the rectangle at x and x + width. The top and bottom edges
	// are at y and y + height.
	public Circle(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	//Radius here is the average of the widths and heights of the ellipse
	public double getPerimeter() {
		return Math.PI*Math.abs((height+width)/2);
	}

	
	//Radius here is the average of the widths and heights of the ellipse
	public double getArea() {
		return Math.PI*((height+width)/2)*((height+width)/2)/4;
	}
	
	
	public Point2D.Double getCenter() {
		return new Point2D.Double(x+width/2,y+height/2);
	}

	
	public boolean isPointInside(double x, double y) {
		return (x >= this.x && y >= this.y && x <= this.x + width && y <= this.y + height);
	}

	
	public void draw(PApplet drawer) {
		drawer.ellipseMode(PApplet.CORNER);
		drawer.ellipse((float)x, (float)y, (float)width, (float)height);
	}
	
	// Sets the coordinate of the Rectangle when the mouse is dragged
	public void setPoint(double x, double y) {
		width = x-this.x;
		height = y-this.y;
	}

	
	
	
	
}
