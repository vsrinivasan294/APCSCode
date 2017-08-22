
import java.awt.Window;

import processing.core.PApplet;

public class House  {
	   
	  	public void draw(PApplet drawer) {
		
		  int height = drawer.height;
		  int width = drawer.width;
		  drawer.scale(width/400f,height/300f);
		  drawer.fill(255);
		  drawer.rect(100, 100, 200, 100);
		  drawer.triangle(100, 100, 300, 100, 200, 75);
		  drawer.rect(185, 160, 30, 40);
		  drawer.rect(120, 120, 30, 30);
		  drawer.rect(250, 120, 30, 30);
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


