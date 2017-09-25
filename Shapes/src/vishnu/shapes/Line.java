package vishnu.shapes;
import java.awt.geom.Point2D;

import processing.core.PApplet;
/* +good fields
 * +Everything is organized and split up
 * 
 * In your line constructor, your Y1 is equal to itself.
 * You haven't completed your intersection method, which is why it doesn't work
 * 
 * 
 */
/**
 * 
 * @author Vishnu
 * This is the Line class which creates and draws a Line in the Drawing Surface
 */
public class Line {

private double X1, Y1, X2, Y2;	

/**
 * 
 * @param x1 - one x coordinate of the line
 * @param y1 - corresponding y cooridnate of the point
 * @param x2 - other x coordinate of the line
 * @param y2 - y coordinate of the cother point of the line
 */
	public Line(double x1, double y1, double x2, double y2) {
		
		X1 = x1;
		Y1 = y1;
		X2 = x2;
		Y2 = y2;
		
	}

	// Sets this line’s second point (x2, y2) to a new coordinate
	/**
	 * 
	 * @param x2 - sets the x2 point to a new location when dragged from the initial one
	 * @param y2 - sets the y2 point to a new location when dragged from the initial one
	 */
	public void setPoint2(double x2, double y2) {
		this.X2 = x2;
		this.Y2 = y2;
	}

	// Draws this line using the PApplet passed as an argument
	/**
	 * 
	 * @param drawer - This dreaws the line usinbg the processing library
	 */
	public void draw(PApplet drawer) {
		
		drawer.line((int)(X1), (int)(Y1), (int)(X2), (int)(Y2));
		
	}

	// Returns true if this line segment and the segment other intersect each other. Returns false if they do not intersect.
	/**
	 * 
	 * @param other - Checks if the other line intersects or not
	 * @return - Gives a Boolean as to whetgher the lines intersect or not
	 */
	public boolean intersects(Line other) {
	//	Point2D.Double int = calculateIntersectionPoint(other);
		
			double x3 = other.X1;
			double x4 = other.X2;
			double y3 = other.Y1;
			double y4 = other.Y2;
			
			double den = (X1-X2)*(y3-y4)-(Y1-Y2)*(x3-x4);
			if (Double.compare(den, 0.0)==0) {
				return false;
			}
			
			float xint = (float) (((X1*Y2 - Y1*X2)*(x3-x4) - (X1-X2) * (x3*y4 - y3*x4))/den);
			float yint = (float) (((X1*Y2 - Y1*X2)*(y3-y4) - (Y1-Y2) * (x3*y4 - y3*x4))/den);
			
			if ((xint>X1 && xint<X2) || (xint>X2 && xint<X1) ) {
				if ((xint>x3 && xint<x4) || (xint>x4 && xint<x3) ) {
					if ((yint>Y1 && xint<Y2) || (xint>Y2 && xint<Y1) ) {
						if ((yint>y3 && xint<y4) || (xint>y4 && xint<y3) ) {
							return true;							
						}
					}
				}
			}
			else {
			return false;
	}
			return true;
	}
			
			


	
}
