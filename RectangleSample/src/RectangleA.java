import java.awt.geom.Point2D;

import processing.core.PApplet;

public class RectangleA {

	private double x, y, width, height;
	
	// Constructors
	// Creates a default instance of a Rectangle object with all dimensions
	//   set to zero.
	public RectangleA() {
		x = 0;
		y = 0;
		width = 0;
		height = 0;
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
	public RectangleA(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// Methods
	// Calculates and returns the perimeter of the rectangle
	/**
	 * For the Perimeter of the Rectangle
	 * @pre Need to have a object with values
	 * @post returns the perimeter after the size changes
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
	 * @post returns the area after the size changes
	 */
	public double getArea() {
		return width*height;
	}
	
	// Returns the center point of the rectangle
	/**
	 * For the center of the rectangle
	 * @pre needs an object with values in it
	 * @post returns the center after the shape and size changes
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
	 * @post returns whether they intersect after the shapes change
	 * @return the point
	 * 
	 */
	public boolean isPointInside(double x, double y) {
		return (x >= this.x && y >= this.y && x <= this.x + width && y <= this.y + height);
	}

	// Draws a new instance of a Rectangle object with the left and right
	// edges of the rectangle at x and x + width. The top and bottom edges
	// are at y and y + height.
	/**
	 * drawing method
	 * @param drawer - is the rectangle object
	 * @pre must have a non null object
	 * @post draws a rectangle over the existing one
	 */
	public void draw(PApplet drawer) {
		drawer.rectMode(PApplet.CORNER);
		drawer.rect((float)x, (float)y, (float)width, (float)height);
	}
	
	
	// Sets the coordinate of the bottom right corner of the Rectangle
	/**
	 * Set the point of the first origin of the rectangle
	 * @param x - X Coordinate of the Rect
	 * @param y - Y Coordinate of the Rect
	 * @pre - need only a double passed in 
	 * @post - starts the rectangle from these coordinates whhich change everytime
	 */
	public void setBottomRight(double x, double y) {
		width = x-this.x;
		height = y-this.y;
	}

	
	
	
	
}
