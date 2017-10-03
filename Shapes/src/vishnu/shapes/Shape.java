package vishnu.shapes;

import java.awt.Color;

import processing.core.PApplet;

/**
 * 
 * @author Vishnu
 *
 */
public class Shape {
	
	private Color fill;
	private Color stroke;
	private float strokeWeight;
	protected static double y;
	protected static double x;
	private double height;
	private double width;
	
	
	
	/**
	 * 
	 * @param x - X Coordinate of the point
	 * @param y - Y Coordinate of the point
	 * @param height - Height of the shape
	 * @param width - Width of the Shape
	 */
	public Shape(double x, double y, double height, double width) {
		this.x = x;
		this.y = y;
		strokeWeight=1;
		fill = null;
		stroke = null;
		this.height = height;
		this.width = width;
	}
	
	/**
	 * 
	 * @param fill - fill a color for the shape
	 * @param stroke - stroke color of the shape
	 * @param strokeWeight -- thickness of the line 
	 */
	public Shape(Color fill, Color stroke, float strokeWeight) {
		this.fill = fill;
		this.stroke = stroke;
		this.strokeWeight = strokeWeight;
	}
	
	
	
	
	public void setFillColor(Color c) {
		this.fill = c;
	}
	public Color getFillColor() {
		return this.fill;
	}
	
	public void setStrokeColor(Color c) {
		this.stroke = c;
	}
	public Color getStrokeColor() {
		return this.stroke;
	}
	
	public void setStrokeWeight(float newWeight) {
		this.strokeWeight = newWeight;
	}
	public void increaseStrokeWeight(float amount) {
		this.strokeWeight = this.strokeWeight + amount;
	}
	public float getStrokeWeight() {
		return this.strokeWeight;
	}
	
	
	public void draw(PApplet d) {
		if(fill != null) {
			d.fill(fill.getRed(), fill.getGreen(), fill.getBlue());
		} else {
			d.noFill();
		}
		
		
		if(stroke != null) {
			d.stroke(stroke.getRed(), stroke.getGreen(), stroke.getBlue());
		} else {
			d.noStroke();
		}
		
		d.strokeWeight(strokeWeight);
		
	}
	

}
