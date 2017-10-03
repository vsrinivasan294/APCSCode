package vishnu.testers;
import java.awt.Color;
import java.awt.Point;

import processing.core.PApplet;
import yoshida.shapes.*;


public class DrawingSurface extends PApplet{

	private Rectangle rectA, rectB, rectC;
	private Circle circA, circB, circC;
	private Line lineA;
	private boolean clickedRectA, clickedRectB, clickedRectC;
	private boolean clickedCircA, clickedCircB, clickedCircC;
	
	public DrawingSurface() {
		rectA = new Rectangle();
		rectB = new Rectangle(0, 80, 400, 160);
		rectC = new Rectangle(100, 100, 20, 300);

		circA = new Circle();
		circB = new Circle(300, 200, 50);
		circC = new Circle(380, 200, 30);
		
		lineA = new Line(100, 100, 0, 50);
		
	
	}
	
	
	public void draw() {
		pushMatrix();
		background(255);
		stroke(0);
		
		
		//check for mouse presses
		if(clickedRectA) {
			rectA.setStrokeColor(Color.RED);
		} else {
			rectA.setStrokeColor(Color.BLACK);
		}
		rectA.draw(this);
		
		if(clickedRectB) {
			rectB.setStrokeColor(Color.GREEN);
		} else {
			rectB.setStrokeColor(Color.BLACK);
		}
		rectB.draw(this);
		
		if(clickedRectC) {
			rectC.setStrokeColor(Color.BLUE);
		} else {
			rectC.setStrokeColor(Color.BLACK);
		}
		rectC.draw(this);
		
		fill(0);
		
		//Draw sphere
		//sA.draw(this);
		//strokeWeight(1);
		
		circA.setStrokeColor(Color.BLACK);
		circB.setStrokeColor(Color.BLACK);
		circC.setStrokeColor(Color.BLACK);
		
		circA.setStrokeWeight(1);
		circB.setStrokeWeight(1);
		circC.setStrokeWeight(1);
		
		
	}
	

	}

