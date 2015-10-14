package converter.gui;
import java.awt.Dimension;
import javax.swing.JFrame;

public class GUI_Frame extends GUI {
	
	public GUI_Frame() {
		//Constructor
	}
	
	public void createFrame() {
		JFrame frame = new JFrame();
		frame.setTitle("Temperature Conversion");
		frame.setSize(new Dimension(600,400));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
