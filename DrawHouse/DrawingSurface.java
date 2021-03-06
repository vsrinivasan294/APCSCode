import java.awt.Dimension;
import javax.swing.JFrame;
import processing.awt.PSurfaceAWT;
import processing.core.PApplet;
import processing.core.PShape;
public class DrawingSurface extends PApplet {

	private House house;
	private Person person;
	private Line line;
	
	private static final int DRAWING_WIDTH = 400, DRAWING_HEIGHT = 300;
	
	public DrawingSurface(){
		house = new House();
		person = new Person();
		line = null;
	}
	
	public void draw() {
		background(255);
		scale ((float)width/DRAWING_WIDTH, (float)height/DRAWING_HEIGHT);
		house.draw(this);
		person.draw(this);
		
		Line leftDoor = new Line(house.leftLine());
		Line rightDoor = new Line(house.rightLine());
		Line bottomDoor = new Line(house.bottomLine());
		Line topDoor = new Line(house.topLine());
		
		
		if (rightDoor.intersects(person.leftArm()) || rightDoor.intersects(person.rightArm())||leftDoor.intersects(person.leftArm()) || leftDoor.intersects(person.rightArm())||topDoor.intersects(person.leftArm()) || topDoor.intersects(person.rightArm()) ||bottomDoor.intersects(person.leftArm()) || bottomDoor.intersects(person.rightArm())) {
			person.changeColor(true);
		}
		else {
			person.changeColor(false);
		}
	}
	public void keyPressed() { // pressing w makes the house white and b makes it black 
		  if (key == 98) {
		    house.setColor(0);
		  } else if (key == 119) {
			  house.setColor(250);
		  }
		  	else if (key == 99) {
			  person.moveXR(10);
		  }
		  	else if (key == 120) {
				  person.moveYD(10);
		  }
		  	else if (key == 122) {
				  person.moveXL(10);
		  }
		  else if (key == 115) {
				  person.moveYU(10);
		  }
		  else if (key == 107) {
				  house.moveXR(10);
		  }
     	  else if (key == 106) {
				  house.moveYD(10);
		  }
		  else if (key == 104) {
				  house.moveXL(10);
		  }
	      else if (key == 117) {
				  house.moveYU(10);
		  }		
	      else if (key == 116) {
			  house.changeSize(-.1);
	  }		
	      else if (key == 121) {
			  house.changeSize(.1);
	  }		  
		  
	}

}
