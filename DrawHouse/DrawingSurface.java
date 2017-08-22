import java.awt.Dimension;
import javax.swing.JFrame;
import processing.awt.PSurfaceAWT;
import processing.core.PApplet;
import processing.core.PShape;
public class DrawingSurface extends PApplet {

	private House house;
	private Person person;
	
	public DrawingSurface(){
		house = new House();
		person = new Person();
	}
	
	public void draw() {
		house.draw(this);
		person.draw(this);
		
	}
	
	

}
