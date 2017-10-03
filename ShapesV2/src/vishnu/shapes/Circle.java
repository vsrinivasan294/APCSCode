package vishnu.shapes;
import java.awt.Color;
import java.awt.Point;

import processing.core.PApplet;

/**
 * Models a Circle
 * 
 * 
 * 
 *
 */



public class Circle extends Shapes{

	
	private float x, y, radius;
	
	
	/**
	 * Creates a default instance of a Circle with all fields set to zero meaning it is set at point (0,0) and has radius 0 and default fill and stroke black and strokeWeight 1
	 */
	public Circle() {
		super();
		x=y=radius=0;
		
	}
	
	
	/**
	 * Creates a new instance of circle with center set at point (x, y) and a radius default color black, stroke black, weight 1
	 * 
	 * 
	 * @param x x-coordinate of the center of the circle 
	 * @param y y-coordinate of the center of the circle
	 * @param radius the radius of the circle
	 */
	public Circle(double x, double y, double radius) {
		super();
		this.x = (float)x;
		this.y = (float)y;
		this.radius = (float)radius;
		
	}
	/**
	 * 
	 * @param x x-coordinate of the center of the circle 
	 * @param y y-coordinate of the center of the circle
	 * @param radius the radius of the circle
	 * @param fill color to fill the circle
	 * @param stroke color to draw the circle outline
	 * @param strokeWeight the thickness of the stroke
	 */
	public Circle(double x, double y, double radius, Color fill, Color stroke, double strokeWeight) {
		super(fill, stroke, (float)strokeWeight);
		this.x = (float)x;
		this.y = (float)y;
		this.radius = (float)radius;
	}
	
	
	//METHODS
	
	/**
	 * Calculates and returns the perimeter of the Circle
	 * 
	 * @return double the perimeter of the Circle
	 */
	public double getPerimeter() {
		return Math.PI*2*radius;
	}
	
	/**
	 * Calculates and returns the area of the Circle
	 * 
	 * @return double - the area of the Circle
	 */
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	/**
	 * Takes in the parameters double x, double y and determines if these points are inside the circle
	 * 
	 * @param x double x-coordinate of the point to check
	 * @param y double y-coordinate of the point to check
	 * @return a boolean whether the point is inside the circle
	 */
	public boolean isPointInside(double x, double y) {
		double distance = Math.sqrt(Math.pow((x-this.x), 2)+Math.pow((y-this.y), 2));
		
		return distance <= radius;
		
	}
	
	/**
	 * Takes in the parameter of another circle and determines if this circle intesects the other circle
	 * 
	 * @param other Another Circle that is compared against this circle for intersection
	 * @pre other must not be null
	 * @post returns true if tangency occurs
	 * @return a boolean whether the circles do intersect
	 */
	public boolean intersect(Circle other) {
		double neededDistance = getRadius() + other.getRadius();
		
		Point a = getPoint();
		Point b = other.getPoint();
		float distance = (float) Math.sqrt(Math.pow((a.x-b.x), 2) + Math.pow((a.y-b.y), 2));
		
		 
		if(distance <= neededDistance && distance >= Math.abs(radius- other.getRadius())) {
			return true;
		} else {
			return false;
		}
		
	}
	
	/**
	 * Moves the Circle x amount along the x-axis and y amount along the y-axis
	 * 
	 * @param x amount to move on x-axis
	 * @param y amount to move on y-axis
	 */
	public void move(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}
	
	/**
	 * Draws the text at the center of the circle
	 * @param str the string to draw
	 * @param marker the PApplet to draw on
	 * @post textSize is set to 12
	 * @post textAlign is set to (CENTER, CENTER)
	 * @post fill is set to 0 or Black
	 */
	public void drawText(String str, PApplet marker) {
		marker.textAlign(marker.CENTER, marker.CENTER);
		marker.textSize(12f);
		marker.fill(0);
		marker.text(str, x, y);
	}
	
	
	/**
	 * Draws the Circle based on the x and y coordinates and the radius with ellipseMode(CENTER)
	 * 
	 * @param marker PApplet used to draw on
	 * @post fill is set to BLACK
	 * @post textAlign is set to CENTER
	 * @post ellipseMode is set to CENTER
	 * @post fill is set to noFill
	 * @post stroke is set to noStroke
	 * @post strokeWeight is set 0
	 */
	public void draw(PApplet marker) {
		super.draw(marker);
		
		marker.ellipseMode(marker.CENTER);
		marker.ellipse(x, y, radius*2, radius*2);
		
		
		
		marker.noFill();
		marker.noStroke();
		marker.strokeWeight(0);
	}
	
	
	
	/**
	 * Get method to find radius of the Circle
	 * @return double - the radius of the circle
	 */
	public double getRadius() {
		return radius;
	}
	
	
	/**
	 * Get method to find the center of the Circle
	 * 
	 * @return Point - the center of the circle
	 */
	public Point getPoint() {
		return new Point((int)x, (int)y);
	}


	public void setPoint(int mouseX, int mouseY) {
		radius = mouseY-this.y;
		
	}
	
	
}
