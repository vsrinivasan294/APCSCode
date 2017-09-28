package vishnu.shapes;
import java.awt.Color;

import processing.core.PApplet;
import vishnu.shapes.Line;
import vishnu.shapes.Shapes;

public class Line extends Shapes{
	/**
	 * Models a Line
	 * 
	 * @author Vishnu Srinivasan
	 * 
	 */
	
	private int x1, y1, x2, y2;
	private double pX,pY;

	
	/**
	 * Creates a new instance of a line using two points
	 * 
	 * @param x1 the x value of the first point
	 * @param y1 the y value of the first point
	 * @param x2 the x value of the second point
	 * @param y2 the y value of the second point
	 * 
	 * @post the color of the line is black
	 * @post the fill is set to no fill
	 * @post the strokeWeight is set to 1
	 */
	public Line(int x1, int y1, int x2, int y2) {
		super(null,Color.BLACK,1);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		pX = pY = -100.0;
	}
	
	
	
	/**
	 * Creates a new instance of a line using two points
	 * 
	 * @param x1 the x value of the first point
	 * @param y1 the y value of the first point
	 * @param x2 the x value of the second point
	 * @param y2 the y value of the second point
	 * @param c the color of the Line
	 * @param strokeWeight the thickness of the line
	 * 
	 * @post the fill is set to no fill
	 */
	public Line(int x1, int y1, int x2, int y2, Color c, float strokeWeight) {
		super(null,c,strokeWeight);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		pX = pY = -100.0;
	}
	
	
	/**
	 * Draws the line
	 * @param d the PApplet the line is drawn on
	 * @pre stroke must be set
	 * @pre strokeWeight must be set
	 */
	public void draw(PApplet d) {
		super.draw(d);
		d.line(x1, y1, x2, y2);
		
		
	}
	
	/**
	 * boolean whether the two lines intersect
	 * @param l the line to be compared against
	 * @return true if the lines intersect
	 */
	public boolean intersects(Line l) {
		//get "l's" points
		int x3 = l.getX1();
		int y3 = l.getY1();
		int x4 = l.getX2();
		int y4 = l.getY2();
		
		//check for 0 denom
		double denom = (x1-x2)*(y3-y4) - (y1-y2)*(x3-x4);
		
		if(Math.abs(denom) < 0.000001) {
			
			
			return false;
		} else {
			double numX = ((x1*y2)-(y1*x2))*(x3-x4) - (x1-x2)*((x3*y4)-(y3*x4));
			double numY = ((x1*y2)-(y1*x2))*(y3-y4) - (y1-y2)*((x3*y4)-(y3*x4));
			pX = numX/denom;
			pY = numY/denom;
			
			boolean pXTrue = false;
			
			
			if(x1 >= x2) {//line 1 direction left
				if(x3 >= x4) {//line 2 direction left
					if(pX<=x1 && pX>=x2 && pX<=x3 && pX>=x4){
						pXTrue = true;
					}
				} else if(x3 <= x4) {//line 2 direction right
					if(pX<=x1 && pX>=x2 && pX>=x3 && pX<=x4){
						pXTrue = true;
					}
				}
			} else if(x1 <= x2) {//line 1 direction right
				if(x3 >= x4) {//line 2 direction left
					if(pX>=x1 && pX<=x2 && pX<=x3 && pX>=x4){
						pXTrue = true;
					}
				} else if(x3 <= x4) {
					if(pX>=x1 && pX<=x2 && pX>=x3 && pX<=x4){
						pXTrue = true;
					}
				}
			}
			return pXTrue;
		}
		
	}
	
	/**
	 * Sets the second point of the line;
	 * @param x2 x-coordinate of the second point
	 * @param y2 y-coordinate of the second point
	 */
	public void setPoint2(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}
	
	/**
	 * Get method to find x-coordinate of the first point
	 * @return x-coordinate of the first point
	 */
	public int getX1() {
		return x1;
	}
	
	/**
	 * Get method to find y-coordinate of the first point
	 * @return y-coordinate of the first point
	 */
	public int getY1() {
		return y1;
	}
	
	/**
	 * Get method to find x-coordinate of the second point
	 * @return x-coordinate of the second point
	 */
	public int getX2() {
		return x2;
	}
	
	/**
	 * Get method to find y-coordinate of the second point
	 * @return y-coordinate of the second point
	 */
	public int getY2() {
		return y2;
	}
}
