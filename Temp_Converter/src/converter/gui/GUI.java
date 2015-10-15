package converter.gui;

public class GUI {
	public static GUI_Frame f = new GUI_Frame();

	public GUI() {
		//
	}

	public static void main(String[] args) {
		f.frame.setVisible(true);
		f.createFrame();
		f.changePane();
	}
}
