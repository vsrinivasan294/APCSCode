import java.awt.geom.Point2D;

import processing.core.PApplet;

public class Rectangle {

	private double x, y, width, height;
	
	// Constructors
	// Creates a default instance of a Rectangle object with all dimensions
	//   set to zero.
	public Rectangle() {
		x = 0;
		y = 0;
		width = 0;
		height = 0;
	}

	// Creates a new instance of a Rectangle object with the left and right
	// edges of the rectangle at x and x + width. The top and bottom edges
	// are at y and y + height.
	public Rectangle(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// Methods
	// Calculates and returns the perimeter of the rectangle
	public double getPerimeter() {
		return 2*(width+height);
	}

	// Calculates and returns the area of the rectangle
	public double getArea() {
		return width*height;
	}
	
	// Returns the center point of the rectangle
	public Point2D.Double getCenter() {
		return new Point2D.Double(x+width/2,y+height/2);
	}

	// Determines whether the point x,y is contained inside this rectangle
	public boolean isPointInside(double x, double y) {
		return (x >= this.x && y >= this.y && x <= this.x + width && y <= this.y + height);
	}

	// Draws a new instance of a Rectangle object with the left and right
	// edges of the rectangle at x and x + width. The top and bottom edges
	// are at y and y + height.
	public void draw(PApplet drawer) {
		drawer.rectMode(PApplet.CORNER);
		drawer.rect((float)x, (float)y, (float)width, (float)height);
	}
	
	// Sets the coordinate of the Rectangle when the mouse is dragged
	public void setPoint(double x, double y) {
		width = x-this.x;
		height = y-this.y;
	}
	
	public void setColor() {
		
	}

	public void setColorBack() {
		
	}
	
	
	
	
}
