import java.awt.Dimension;
import javax.swing.JFrame;
import processing.awt.PSurfaceAWT;
import processing.core.PApplet;
import processing.core.PShape;
public class DrawingSurface extends PApplet {

	private House house;
	private Person person;
	
	private static final int DRAWING_WIDTH = 400, DRAWING_HEIGHT = 300;
	
	public DrawingSurface(){
		house = new House();
		person = new Person();
	}
	
	public void draw() {
		scale ((float)width/DRAWING_WIDTH, (float)height/DRAWING_HEIGHT);
		house.draw(this);
		person.draw(this);
		
	}
	public void keyPressed() { // pressing w makes the house white and b makes it black 
		  if (key == 98) {
		    house.setColor(0);
		  } else if (key == 119) {
			  house.setColor(250);
		  }
		  	else if (key == 37) {
			  person.moveX(10);
		  }
	}

}
