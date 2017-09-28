package vishnu.testers;
import java.awt.Color;
import java.awt.Point;

import processing.core.PApplet;
import vishnu.shapes.*;
import yoshida.shapes.Circle;
import yoshida.shapes.Rectangle;
import yoshida.shapes.RegularPolygon;
import yoshida.shapes.Sphere;


public class DrawingSurface extends PApplet{

	private Rectangle rectA, rectB, rectC;
	private Circle circA, circB, circC;
	private Sphere sA;
	private RegularPolygon pDefault,pA,pSquare,pOctagon,pEnneadecagon, pEnneacontakaihenagon;
	private boolean clickedRectA, clickedRectB, clickedRectC;
	private boolean clickedCircA, clickedCircB, clickedCircC;
	
	public DrawingSurface() {
		rectA = new Rectangle();
		rectB = new Rectangle(0, 80, 400, 160);
		rectC = new Rectangle(100, 100, 20, 300);

		circA = new Circle();
		circB = new Circle(300, 200, 50);
		circC = new Circle(380, 200, 30);
		
		sA = new Sphere(400, 400, 0, 100, 0, 0, 0, 125);
		pDefault = new RegularPolygon();
		pA = new RegularPolygon(200,200,5,50,Color.BLACK,1);
		pSquare = new RegularPolygon(100, 100, 4, 100, Color.BLUE, 1);
		pOctagon = new RegularPolygon(100, 300, 8, 57.5f, Color.RED, 1);
		this.pEnneadecagon = new RegularPolygon(300, 300, 19, 20, Color.GREEN, 1);
		this.pEnneacontakaihenagon = new RegularPolygon(500, 500, 91, 5f, Color.CYAN, 1);
		
		clickedRectA = clickedRectB = clickedRectC = false;
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
		sA.draw(this);
		strokeWeight(1);
		
		
		
		
		circA.setStrokeColor(Color.BLACK);
		circB.setStrokeColor(Color.BLACK);
		circC.setStrokeColor(Color.BLACK);
		
		circA.setStrokeWeight(1);
		circB.setStrokeWeight(1);
		circC.setStrokeWeight(1);
		
		if(clickedCircA) {
			circA.setFillColor(Color.YELLOW);
		} else {
			circA.setFillColor(Color.WHITE);
		}
		circA.draw(this);
		
		if(clickedCircB) {
			circB.setFillColor(Color.MAGENTA);
		} else {
			circB.setFillColor(Color.WHITE);
		}
		circB.draw(this);
		
		if(clickedCircC) {
			circC.setFillColor(Color.CYAN);
		} else {
			circC.setFillColor(Color.WHITE);
		}
		circC.draw(this);
		
		
		
		textSize(12);
		
		textAlign(CENTER);
		if(rectA!=null) {
			if(rectB!=null) {
				if(rectC!=null) {//all three rectangles exist
					text("rectA intersects rectB: "+rectA.intersects(rectB), width/2, 10);
					text("rectB intersects rectC: "+rectB.intersects(rectC), width/2, 22);
					text("rectA intersects rectC: "+rectA.intersects(rectC), width/2, 34);
				} else {//only rect a and b
					text("rectA intersects rectB: "+rectA.intersects(rectB), width/2, 10);
				}
			} else {
				if(rectC!=null) {//only rect a and c
					text("rectA intersects rectC: "+rectA.intersects(rectC), width/2, 34);
				} else {//only rect a
					
				}
			}
		} else {
			if(rectB!=null) {
				if(rectC!=null) {//rect b and c
					text("rectB intersects rectC: "+rectB.intersects(rectC), width/2, 22);
				} else {//only rect b
					
				}
			} else {
				if(rectC!=null) {//only rect c
					
				} else { //no rects
					
				}
			}
		}
		
		//Check for intersections
		if(circA!=null) {
			if(circB!=null) {
				if(circC!=null) {//all three rectangles exist
					text("circA intersects circB: "+circA.intersect(circB), width/2, 46);
					text("circB intersects circC: "+circB.intersect(circC), width/2, 58);
					text("circA intersects circC: "+circA.intersect(circC), width/2, 70);
				} else {//only rect a and b
					text("circA intersects circB: "+circA.intersect(circB), width/2, 46);
				}
			} else {
				if(circC!=null) {//only rect a and c
					text("circA intersects circC: "+circA.intersect(circC), width/2, 70);
				} else {//only rect a
					
				}
			}
		} else {
			if(circB!=null) {
				if(circC!=null) {//rect b and c
					text("circB intersects circC: "+circB.intersect(circC), width/2, 58);
				} else {//only rect b
					
				}
			} else {
				if(circC!=null) {//only rect c
					
				} else { //no rects
					
				}
			}
		}


		pDefault.draw(this);
		pA.draw(this);
		pSquare.draw(this);
		pOctagon.draw(this);
		this.pEnneadecagon.draw(this);
		this.pEnneacontakaihenagon.draw(this);
		
		
		popMatrix();
	}
	
	public void mousePressed() {
		if(mouseButton == LEFT) {
			if(rectA.isPointInside(mouseX, mouseY)) {
				clickedRectA = !clickedRectA;
			}
			if(rectB.isPointInside(mouseX, mouseY)) {
				clickedRectB = !clickedRectB;
			}
			if(rectC.isPointInside(mouseX, mouseY)) {
				clickedRectC = !clickedRectC;
			}
			if(circA.isPointInside(mouseX, mouseY)) {
				clickedCircA = !clickedCircA;
			}
			if(circB.isPointInside(mouseX, mouseY)) {
				clickedCircB = !clickedCircB;
			}
			if(circC.isPointInside(mouseX, mouseY)) {
				clickedCircC = !clickedCircC;
			}
			
			
		}
	}
	
	public void keyPressed() {
		if(key == CODED) {
			if(keyCode == UP) {
				rectA.move(0, -2);
				rectB.move(0, -2);
				rectC.move(0, -2);
				circA.move(0, -2);
				circB.move(0, -2);
				circC.move(0, -2);
				sA.moveBy(0, -2, 0);
			} else if(keyCode == DOWN) {
				rectA.move(0, 2);
				rectB.move(0, 2);
				rectC.move(0, 2);
				circA.move(0, 2);
				circB.move(0, 2);
				circC.move(0, 2);
				sA.moveBy(0, 2, 0);
			} else if(keyCode == RIGHT) {
				rectA.move(2, 0);
				rectB.move(2, 0);
				rectC.move(2, 0);
				circA.move(2, 0);
				circB.move(2, 0);
				circC.move(2, 0);
				sA.moveBy(2, 0, 0);
			} else if(keyCode == LEFT) {
				rectA.move(-2, 0);
				rectB.move(-2, 0);
				rectC.move(-2, 0);
				circA.move(-2, 0);
				circB.move(-2, 0);
				circC.move(-2, 0);
				sA.moveBy(-2, 0, 0);
			}
		}
	}
}
