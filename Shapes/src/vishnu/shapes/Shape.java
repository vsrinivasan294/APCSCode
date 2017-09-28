package vishnu.shapes;

import java.awt.Color;

public class Shape {

	//Fields
	protected double x;
	protected double y;
	private Color fill;
	private Color stroke;
	private float strokeWeight;
	
	
	//Constructor
	public Shape(double x,  double y) {
		strokeWeight=1;
		fill = null;
		stroke = null;
		this.x =  x;
		this.y =  y;
	}
	
	//Methods
	public void Shapes(Color fill, Color stroke, float strokeWeight) {
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
	
	
	
}
