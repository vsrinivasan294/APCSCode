
import java.awt.Window;

import processing.core.PApplet;


public class House  {
	   
	private int color = 0;
	private int x,y;
	private float size;
	
	public House() {
		x = 150;
		y = 120;
		
		size = 1;
	}
	
	  	public void draw(PApplet drawer) {
		
		  int height = drawer.height;
		  int width = drawer.width;
		  
		  drawer.pushMatrix();
		  drawer.translate(x, y);
		  drawer.scale((float)size, (float)size);
		  drawer.translate(-150,  -125);	   
		  drawer.fill(color);
		  drawer.rect(100, 100, 200, 100);
		  drawer.triangle(100, 100, 300, 100, 200, 75);
		  drawer.rect(185, 160, 30, 40);
		  drawer.rect(120, 120, 30, 30);
		  drawer.rect(250, 120, 30, 30);
		  
		  drawer.popMatrix();
		}

	  	public void setColor(int c) {
	  		color = c;
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


