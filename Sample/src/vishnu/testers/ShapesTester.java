package vishnu.testers;
import java.awt.Dimension;

import javax.swing.JFrame;

import yoshida.testers.DrawingSurface;


public class ShapesTester {
	
	public static void main(String args[]) {
		DrawingSurface drawing = new DrawingSurface();
		//Canvas c = new Canvas(); //for sphere drawings
		drawing.init();
		JFrame window = new JFrame("Lab Shapes");
		window.setSize(600, 480);
		window.setMinimumSize(new Dimension(100,100));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(drawing);
		window.setVisible(true);
		window.setMinimumSize(new Dimension(100,100));
	}

}
