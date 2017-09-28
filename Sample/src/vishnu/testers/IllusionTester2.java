package vishnu.testers;
import java.awt.Dimension;

import javax.swing.JFrame;

public class IllusionTester2 {

	public static void main(String args[]) {
		DrawingSurfaceIllusion2 drawing = new DrawingSurfaceIllusion2();
		drawing.init();
		JFrame window = new JFrame("Lab Lines");
		window.setSize(600, 480);
		window.setMinimumSize(new Dimension(100,100));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(drawing);
		window.setVisible(true);
	}
}
