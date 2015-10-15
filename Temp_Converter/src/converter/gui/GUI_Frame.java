package converter.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class GUI_Frame extends GUI {

	public JFrame frame;
	public GUI_Panel p1 = new GUI_Panel();

	public GUI_Frame() {
		frame = new JFrame();
		p1.rbPanel();
		p1.convertButton();
		p1.fcPanel();
		p1.cfPanel();
	}

	public void createFrame() {
		frame.setTitle("Temperature Converter");
		frame.setSize(new Dimension(600, 200));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(p1.rbPanel, BorderLayout.WEST);
		frame.getContentPane().add(p1.convertButton, BorderLayout.SOUTH);
		
		if (p1.fcButton.isSelected()) {
			frame.getContentPane().remove(p1.cfPanel);
			frame.getContentPane().add(p1.fcPanel, BorderLayout.EAST);
		}
		if (p1.cfButton.isSelected()) {
			frame.getContentPane().remove(p1.fcPanel);
			frame.getContentPane().add(p1.cfPanel, BorderLayout.CENTER);
		}
	}
}
