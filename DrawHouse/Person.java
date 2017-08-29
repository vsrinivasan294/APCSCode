import java.awt.Window;

import processing.core.PApplet;
public class Person {
	
	
	private int X,Y;
	private int dispx, dispy;
	//private int xPos;
	private float size;
	
	
	public Person() {
		dispx = 0;
		dispy = 0;
		
		
		size = 1;
	}
 	public void draw(PApplet drawerPerson) {
		
 		
 		// This is the animated figure class and there will be a person or object represented in this class
 		
		  drawerPerson.pushMatrix();
		  drawerPerson.translate(dispx, dispy);
		  drawerPerson.scale((float)size, (float)size);
		  drawerPerson.fill(200, 100, 100);
		  
		  
		  drawerPerson.pushMatrix();
		  drawerPerson.translate(dispx, dispy);
		  drawerPerson.line(50, 150, 50, 200); //Body
		  drawerPerson.popMatrix();
		  
		  drawerPerson.pushMatrix();
		  drawerPerson.translate(dispx, dispy);
		  drawerPerson.line(50, 200, 25, 225); //Hands
		  drawerPerson.popMatrix();
		  
		  drawerPerson.pushMatrix();
		  drawerPerson.translate(dispx, dispy);
		  drawerPerson.line(50, 200, 75, 225);
		  drawerPerson.popMatrix();
		  
		  drawerPerson.pushMatrix();
		  drawerPerson.translate(dispx, dispy);
		  drawerPerson.line(50, 150, 25, 150); //Legs
		  drawerPerson.popMatrix();
		  
		  drawerPerson.pushMatrix();
		  drawerPerson.translate(dispx, dispy);
		  drawerPerson.line(50, 150, 75, 150);
		  drawerPerson.popMatrix();
		  
		  drawerPerson.pushMatrix();
		  drawerPerson.translate(dispx, dispy);
		  drawerPerson.ellipse(50, 120, 55, 55); //Head  
		  drawerPerson.popMatrix();
		  
		  drawerPerson.popMatrix();
		}

	public void moveXR(int XRPos) {
		dispx += XRPos;
	}
	public void moveYU(int YUPos) {
		dispy -= YUPos;
	}
	public void moveYD(int YDPos) {
		dispy += YDPos;
	}
	public void moveXL(int XLPos) {
		dispx -= XLPos;
	}
	}