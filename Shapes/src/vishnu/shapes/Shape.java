package vishnu.shapes;

import java.awt.Color;

import processing.core.PApplet;

public abstract class Shape {

	//Fields
	protected double x;
	protected double y;
	protected Color fill;
	protected Color stroke;
	protected float strokeWeight;
	
	
	//Constructor
	public Shape(double x,  double y) {
		strokeWeight=1;
		fill = null;
		stroke = null;
		this.x =  x;
		this.y =  y;
	}
	
	//Methods
	
	public abstract double calcArea();
	
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
	
	public void draw(PApplet drawer) {
		drawer.translate((float)(x),(float)(y));
		drawer.stroke(stroke.getRGB());
		
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
	
	
	
}
