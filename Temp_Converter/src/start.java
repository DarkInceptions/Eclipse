import converter.gui.GUI;

public class start {

	public static void main(String[] args) {
		Thread t = new Thread(new GUI());
		t.start();
		
	}
}
