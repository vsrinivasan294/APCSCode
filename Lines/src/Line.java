import java.awt.geom.Point2D;

import processing.core.PApplet;
/* +good fields
 * +Everything is organized and split up
 * 
 * In your line constructor, your Y1 is equal to itself.
 * You haven't completed your intersection method, which is why it doesn't work
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */






public class Line {

double X1, Y1, X2, Y2;	
double p2x, p2y;

	public Line(double x1, double y1, double x2, double y2) {
		
		X1 = x1;
		Y1 = y1;
		X2 = x2;
		Y2 = y2;
		
	}

	// Sets this line’s second point (x2, y2) to a new coordinate
	public void setPoint2(double x2, double y2) {
		this.X2 = x2;
		this.Y2 = y2;
	}

	// Draws this line using the PApplet passed as an argument
	public void draw(PApplet drawer) {
		
		drawer.line((int)(X1), (int)(Y1), (int)(X2), (int)(Y2));
		
	}

	// Returns true if this line segment and the segment other intersect each other. Returns false if they do not intersect.
	public boolean intersects(Line other) {
	//	Point2D.Double int = calculateIntersectionPoint(other);
		
			return true;
		
	}


	
}
