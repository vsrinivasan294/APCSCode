package vishnu.shapes;
import java.awt.Color;
import java.awt.Point;

import processing.core.PApplet;
import processing.core.PConstants;


/**
 * Models a Rectangle
 * 
 * 
 */



public class Rectangle extends Shapes{

	//FIELDS
	private float x, y, width, height;
	
	
	/**
	 * Creates new Rectangle with all fields set to zero.  Fill and stroke is set to black and strokeWeight is set to 1
	 * 
	 * @post all fields set to zero
	 */
	//CONSTRUCTORS
	public Rectangle() {
		super();
		x=0;
		y=0;
		width=0;
		height=0;
		
	}
	
	/**
	 * Creates new Rectangle with location, width, and height set
	 * 
	 * @param x x-coordinate of the Rectangle
	 * @param y y-coordinate of the Rectangle
	 * @param width width of the Rectangle
	 * @param height height of the Rectangle
	 * 
	 * @post location is set to rectangles top left corner
	 */
	public Rectangle(double x, double y, double width, double height) {
		super();
		this.x = (float)x;
		this.y = (float)y;
		this.width = (float)width;
		this.height = (float)height;
		
	}
	
	/**
	 * Creates new Rectangle with location, width, and height set
	 * 
	 * @param x x-coordinate of the Rectangle
	 * @param y y-coordinate of the Rectangle
	 * @param width width of the Rectangle
	 * @param height height of the Rectangle
	 * @param fill the fill color of the rectangle
	 * @param stroke the stroke color of the rectangle
	 * @param strokeWeight thickness of the stroke
	 * @param fill color of the fill
	 * @param stroke color of the stroke
	 * 
	 * @post location is set to rectangles top left corner
	 */
	public Rectangle(double x, double y, double width, double height, Color fill, Color stroke, double strokeWeight) {
		super(fill, stroke, (float)strokeWeight);
		this.x = (float)x;
		this.y = (float)y;
		this.width = (float)width;
		this.height = (float)height;
		
	}
	
	//METHODS
	
	/**
	 * Returns a double of the perimeter of the rectangle
	 * 
	 * @return double perimeter of the rectangle
	 */
	public double getPerimeter() {
		//perimeter is 2*width + 2*height
		double perimeter = 2*width + 2*height;
		return perimeter;
	}
	
	/**
	 * Returns a double of the area of the rectangle
	 * 
	 * @return double area
	 */
	public double getArea() {
		//area is width*height
		double area = width*height;
		return area;
	}
	
	
	/**
	 * Returns true if the point given in the parameter is inside the rectangle
	 * 
	 * @param x the x-value of the point to check
	 * @param y the y-value of the point to check
	 * @return boolean if the (x,y) point is inside the rectangle
	 */
	public boolean isPointInside(double x, double y) {
		
		//Check x
		boolean xInside = x>=this.x && x<=(this.x + width);
		boolean yInside = y>=this.y && y<=(this.y + height);
		return xInside&&yInside;
	}
	
	
	/**
	 * Finds the 4 lines that make up a rectangle
	 * 
	 * @post always returns array of four lines
	 * @return Line[] returns the lines that make up the rectangle 
	 */
	public Line[] findLines() {
		Line[] l = new Line[4];
		l[0] = new Line((int)x, (int)y, (int)(x+width), (int)(y));
		l[1] = new Line((int)(x+width), (int)(y), (int)(x+width), (int)(y+height));
		l[2] = new Line((int)(x+width), (int)(y+height), (int)x, (int)(y+height));
		l[3] = new Line((int)x, (int)(y+height), (int)x, (int)y);
		
		return l;
	}
	
	
	/**
	 * Uses the lines and the lines' intersect methods to check for overlapping rectangles and returns a boolean based on that information
	 * 
	 * @param other Another rectangle to check against
	 * @return boolean whether the rectangles overlap
	 */
	public boolean intersects(Rectangle other) {
		 Line[] l1 = other.findLines();
		 Line[] l2 = findLines();
		 
		 boolean returnType = false;
		 for(int i = 0; i < l1.length; i++) {
			 for(int x = 0; x < l2.length; x++) {
				 if(l1[i].intersects(l2[x])) {
					 returnType = true;
				 }
			 }
		 }
		 return returnType;
		
	}
	
	
	/**
	 * Takes in two parameters and increases the x and y values based on these parameters
	 * 
	 * @param x float value of amount to move the rectangle along the x-axis
	 * @param y float value of amount to move the rectangle along the y-axis
	 * @post the coordinates of the rectangle are moved
	 */
	public void move(float x, float y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}
	
	
	
	/**
	 * Finds the point that is the center of the rectangle
	 * 
	 * @return Point the center of the rectangle
	 */
	public Point getCenter() {
		return new Point((int)(x + (width/2)), (int)(y + (height/2)));
	}
	
	
	/**
	 * Draws the text at the center of the rectangle
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
		marker.text(str, x + width/2, y + width/2);
	}
	
	
	
	/**
	 * Draws the rectangle based on the lines it is made of.  This rectangle will have top left coordinates x,y and the specified width and height
	 * 
	 * @param marker - from the PApplet class used to draw on  
	 * @pre drawer must not be null
	 * @post textAlign is set to CENTER
	 * @post textAlign is set to CENTER
	 * @post fill is set to noFill
	 * @post stroke is set to noStroke
	 * @post strokeWeight is set to 0
	 */
	public void draw(PApplet marker) {
	
		super.draw(marker);
		
		marker.rect(x, y, width, height);
		
		
		marker.noFill();
		marker.noStroke();
		marker.strokeWeight(0);
	}

	public void setPoint(int mouseX, int mouseY) {
		width = mouseX-this.x;
		height = mouseY-this.y;	
	}
	
}
