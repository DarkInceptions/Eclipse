package converter.gui;

public class GUI {
	public static GUI_Frame f1 = new GUI_Frame();

	public GUI() {
		//
	}

	public static void main(String[] args) {
		f1.createFrame();
		f1.frame.setVisible(true);
	}
}
