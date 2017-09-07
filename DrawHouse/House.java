
import java.awt.Window;

import processing.core.PApplet;


public class House  {
	   
	private int color = 0;
	private int x,y;
	private float size;
	private int dispx, dispy;
	
	public House() {
		x = 150;
		y = 120;
		
		dispx = 150;
		dispy = 120;
		
		
		size = 1;
	}
	
	  	public void draw(PApplet drawer) {
		  int height = drawer.height;
		  int width = drawer.width;
		  
		  drawer.pushMatrix();
		  drawer.translate(dispx, dispy);
		  drawer.scale((float)size, (float)size);
		  drawer.translate(-150,  -125);	   
		  drawer.fill(color);
		  drawer.rect(100, 100, 200, 100);
		  drawer.triangle(100, 100, 300, 100, 200, 75);
		  //drawer.rect(185, 160, 30, 40);
		  drawer.line(185, 140, 185, 190);
		  drawer.line(215, 140, 215, 190);
		  drawer.line(185, 190, 215, 190);
		  drawer.line(185, 140, 215, 140);
		  drawer.rect(120, 120, 30, 30);
		  drawer.rect(250, 120, 30, 30);
		  
		  drawer.popMatrix();
		}

	  	public void setColor(int c) {
	  		color = c;
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
		public void changeSize(double d) {
			size += d;
		}
		public Line rightLine() {
			// return new Line(215 + dispx, 140 + dispy, 215 + dispx, 190 + dispy);
			return new Line(215, 140, 215, 190);
		}
		public Line leftLine() {
			return new Line(185, 140, 185, 190);
		}
		public Line bottomLine() {
			return new Line(185, 190, 215, 190);
		}
		public Line topLine() {
			return new Line(185, 140, 215, 140);
		}
	
		// Code for free hand drawing	
		/*  
			public void draw() {
				stroke(255); // Change the color of the thing drawing the lines
				if (mousePressed == true) {
					line(mouseX, mouseY, pmouseX, pmouseY);
				}
			}
			
		*/
		
}


