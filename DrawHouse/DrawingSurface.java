import java.awt.Dimension;
import javax.swing.JFrame;
import processing.awt.PSurfaceAWT;
import processing.core.PApplet;
import processing.core.PShape;
public class DrawingSurface extends PApplet {

	PShape square;
	PShape triangle;
	PShape windows;
	PShape doors;
	public static void main(String args[]) {
		DrawingSurface drawing = new DrawingSurface();
		PApplet.runSketch(new String[]{""}, drawing);
		PSurfaceAWT surf = (PSurfaceAWT) drawing.getSurface();
		PSurfaceAWT.SmoothCanvas canvas = (PSurfaceAWT.SmoothCanvas) surf.getNative();
		JFrame window = (JFrame)canvas.getFrame();

		
		window.setSize(400, 300);
		window.setMinimumSize(new Dimension(100,100));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);

	}
	
	  // The PShape object

	public void setup() {
	  size(100, 100);
	  // Creating the PShape as a square. The
	  // numeric arguments are similar to rect().
	  square = createShape(RECT, 0, 0, 120, 80);
	  square.setFill(color(0, 0, 255));
	  square.setStroke(false);
	  triangle = createShape(TRIANGLE,30, 75, 90, 20, 146, 75);
	  triangle.setFill(color(0, 255, 255));
	  triangle.setStroke(false);
	  windows = createShape(RECT, 0, 0, 20, 20);
	  windows.setFill(color(255, 0, 255));
	  windows.setStroke(false);
	  doors = createShape(RECT, 0, 0, 20, 30);
	  doors.setFill(color(255, 0, 255));
	  doors.setStroke(false);
	}

	public void draw() {
	  shape(square, 170, 150);
	  shape(triangle, 142, 75);
	  shape(windows, 182, 165);
	  shape(windows, 255, 165);
	  shape(doors, 218, 195);
	}
	
/*  // Code for free hand drawing
	public void draw() {
		stroke(255); // Change the color of the thing drawing the lines
		if (mousePressed == true) {
			line(mouseX, mouseY, pmouseX, pmouseY);
		}
	}
	
*/

	
}
