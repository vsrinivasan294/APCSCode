package vishnu.shapes;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.math.*;
import processing.core.PApplet;

/**
 * 
 * @author Vishnu
 *
 */
public class Circle extends Shape {

	private double width, height;
	
	
	public Circle() {
		super (0,0);
	
		width = 0;
		height = 0;
	}

	// Creates a new instance of a Circle object with the left and right
	// edges of the rectangle at x and x + width. The top and bottom edges
	// are at y and y + height.
	/**
	 * This creates the constructor for a circle
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public Circle(double x, double y, double width, double height) {
		
		super(x,y);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public Circle(double x, double y, double width, double height, Color fill, Color stroke, double strokeWeight) {
		super(fill, stroke, (float)strokeWeight);
		this.x = (float)x;
		this.y = (float)y;
		this.width = width;
		this.height = height;
	}
	
	//Radius here is the average of the widths and heights of the ellipse
	/**
	 * This is for the perimeter of the circle/ellipse
	 * @pre - Needs an object to check it
	 * @post - Will have the perimeter calculated and changing based on the new situation
	 * @return - Will return the perimeter
	 */
	public double getPerimeter() {
		return Math.PI*Math.abs((height+width)/2);
	}

	
	//Radius here is the average of the widths and heights of the ellipse
	/**
	 * This is the area of the circle/ellipse
	 * @pre - needs an object to start the function
	 * @post - will calculate the area based on the situation
	 * @return - area
	 */
	public double getArea() {
		return Math.PI*((height+width)/2)*((height+width)/2)/4;
	}
	
	
	public Point2D.Double getCenter() {
		return new Point2D.Double(x+width/2,y+height/2);
	}

	/**
	 * 
	 * @param x - x of the circle 
	 * @param y - y  of the circle
	 * @return the boolean as to whether the shapes intersect
	 */
	public boolean isPointInside(double x, double y) {
		return (x >= this.x && y >= this.y && x <= this.x + width && y <= this.y + height);
	}

	/**
	 * 
	 * @param drawer - is the object being drawn
	 * @pre - needs an object to be called
	 * @post - will change the previous drawing
	 *
	 */
	public void draw(PApplet drawer) {
		drawer.ellipseMode(PApplet.CORNER);
		drawer.ellipse((float)x, (float)y, (float)width, (float)height);
	}
	
	// Sets the coordinate of the Circle when the mouse is dragged
	/**
	 * 
	 * @param x - x point of the circle
	 * @param y - y point of the circle
	 */
	public void setPoint(double x, double y) {
		width = x-this.x;
		height = y-this.y;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
}
