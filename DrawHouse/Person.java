import java.awt.Window;

import processing.core.PApplet;
public class Person {
 	public void draw(PApplet drawerPerson) {
		
 		
 		// This is the animated figure class and there will be a person or object represented in this class
 		
		  int height = drawerPerson.height;
		  int width = drawerPerson.width;
		  drawerPerson.scale(width/400f,height/300f);
		  drawerPerson.fill(200, 100, 100);
		  drawerPerson.line(50, 150, 50, 200);
		  drawerPerson.line(50, 200, 25, 225);
		  drawerPerson.line(50, 200, 75, 225);
		  drawerPerson.line(50, 150, 25, 150);
		  drawerPerson.line(50, 150, 75, 150);
		  drawerPerson.ellipse(50, 120, 55, 55);;
		}

}
