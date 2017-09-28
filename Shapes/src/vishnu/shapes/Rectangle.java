package vishnu.shapes;


import java.awt.Color;
import java.awt.geom.Point2D;

import processing.core.PApplet;

/**
 * 
 * @author Vishnu
 * This is the rectangle class which creates and draws a rectangle in the Drawing Surface
 */
public class Rectangle extends Shape {

	private double width, height, color;
	
	// Constructors
	// Creates a default instance of a Rectangle object with all dimensions
	//   set to zero.
	
	public Rectangle() {
		super (0,0);
		width = 0;
		height = 0;
		color = 20;
	}

	// Creates a new instance of a Rectangle object with the left and right
	// edges of the rectangle at x and x + width. The top and bottom edges
	// are at y and y + height.
	/**
	 * 
	 * @param x - x coordinate of the rect
	 * @param y - y coordianate of the rect
	 * @param width -  width of the rect
	 * @param height - height of the rect 
	 */
	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.x = (float)x;
		this.y = (float)y;
		this.width = (float)width;
		this.height = (float)height;
		
	}
	public Rectangle(double x, double y, double width, double height, Color fill, Color stroke, double strokeWeight) {
		super(fill, stroke, (float)strokeWeight);
		this.x = (float)x;
		this.y = (float)y;
		this.width = (float)width;
		this.height = (float)height;
		
	}
	
	// Methods
	// Calculates and returns the perimeter of the rectangle
	/**
	 * For the Perimeter of the Rectangle
	 * @pre Need to have a object with values
	 * @post returns the perimeter
	 * @return perimeter
	 */
	public double getPerimeter() {
		return 2*(width+height);
	}

	// Calculates and returns the area of the rectangle
	/**
	 * For the Area of the Rectangle
	 * @return Area
	 * @pre Need to have a object with values
	 * @post returns the area
	 */
	public double getArea() {
		return width*height;
	}
	
	// Returns the center point of the rectangle
	/**
	 * For the center of the rectangle
	 * @pre needs an object with values in it
	 * @post returns the center
	 * @return the center
	 */
	public Point2D.Double getCenter() {
		return new Point2D.Double(x+width/2,y+height/2);
	}

	// Determines whether the point x,y is contained inside this rectangle
	/**
	 * This is to check if a point is inside
	 * @param x
	 * @param y
	 * @pre Need to have a object with values and another to compare it with
	 * @post returns whether they intersect
	 * @return the point
	 * 
	 */
	public boolean isPointInside(double x, double y) {
		boolean xInside = x>=this.x && x<=(this.x + width);
		boolean yInside = y>=this.y && y<=(this.y + height);
		return xInside&&yInside;
	}

	// Draws a new instance of a Rectangle object with the left and right
	// edges of the rectangle at x and x + width. The top and bottom edges
	// are at y and y + height.
	/**
	 * drawing method
	 * @param drawer - is the rectangle object
	 * @pre must have a non null object
	 * @post draws a rectangle 
	 */
	public void draw(PApplet drawer) {
		drawer.rectMode(PApplet.CORNER);
	//	drawer.fill((int) color);
		drawer.rect((float)x, (float)y, (float)width, (float)height);
	}
	
	// Sets the coordinate of the Rectangle when the mouse is dragged
	/**
	 * Set the point of the first origin of the rectangle
	 * @param x - X Coordinate of the Rect
	 * @param y - Y Coordinate of the Rect
	 * @pre - need only a double passed in 
	 * @post - starts the rectangle from these coordinates
	 */
	public void setPoint(double x, double y) {
		width = x-this.x;
		height = y-this.y;
	}
	
	/**
	 * This is for the color change
	 */
	public void setColor() {
		
	}

	/**
	 * This is for the set color again
	 */
	public void setColorBack() {
		
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
