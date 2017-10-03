package vishnu.shapes;

import java.awt.Color;

import processing.core.PApplet;

public class Shapes {
	
	private Color fill;
	private Color stroke;
	private float strokeWeight;
	
	
	
	
	public Shapes() {
		strokeWeight=1;
		fill = null;
		stroke = null;
	}
	
	public Shapes(Color fill, Color stroke, float strokeWeight) {
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
