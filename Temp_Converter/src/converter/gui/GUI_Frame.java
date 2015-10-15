package converter.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class GUI_Frame extends GUI {

	public JFrame frame;
	public GUI_Panel p = new GUI_Panel();

	public GUI_Frame() {
		frame = new JFrame();
		p.rbPanel();
		p.convertButton();
		p.fcPanel();
		p.cfPanel();
	}

	public void createFrame() {
		frame.setTitle("Temperature Converter");
		frame.setSize(new Dimension(600, 200));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(p.rbPanel, BorderLayout.WEST);
		
		if (p.fcButton.isSelected()) {
			frame.getContentPane().add(p.fcPanel, BorderLayout.EAST);
		}
		if (p.cfButton.isSelected()) {
			frame.getContentPane().add(p.cfPanel, BorderLayout.CENTER);
		}
		
		frame.getContentPane().add(p.convertButton, BorderLayout.SOUTH);
	}
}
