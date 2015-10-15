package converter.gui;

public class GUI {
	
	public GUI() {
		//frame = new JFrame();
		//rbPanel = new JPanel(new GridLayout(1, 0));
	}
	
	public static void main(String[] args) {
		GUI_Frame f = new GUI_Frame();
		f.createFrame();
		f.frame.setVisible(true);
	}
}
