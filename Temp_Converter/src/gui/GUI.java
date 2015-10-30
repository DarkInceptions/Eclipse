package gui;

import java.awt.*;

import javax.swing.*;

public class GUI {
	JFrame frame;
	JPanel conversionPanel;
	JPanel buttonPanel;
	JButton convert;
	JRadioButton fc;
	JRadioButton cf;
	ButtonGroup group;
	JLabel label;
	JLabel ans;
	JTextField textfield;

	public GUI() {
		frame = new JFrame();
		conversionPanel = new JPanel();
		buttonPanel = new JPanel();
		convert = new JButton("Convert");
		label = new JLabel("Please select a conversion.");
		ans = new JLabel();
		textfield = new JTextField();
		group = new ButtonGroup();
		fc = new JRadioButton("\u00B0Fahrenheit to \u00B0Celsius");
		cf = new JRadioButton("\u00B0Celsius to \u00B0Fahrenheit");
	}

	public static void main(String[] args) {
		GUI g = new GUI();
		g.createFrame();
		g.createConversionPanel();
		g.createButtonPanel();
	}

	public void createFrame() {
		frame.setSize(new Dimension(300, 200));
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setTitle("Temperature Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(buttonPanel, BorderLayout.NORTH);
		frame.getContentPane().add(conversionPanel, BorderLayout.CENTER);
		frame.getContentPane().add(convert, BorderLayout.SOUTH);
		frame.setVisible(true);
	}

	public void createConversionPanel() {
		conversionPanel.setLayout(new GridLayout(0,1));

		textfield.setPreferredSize(new Dimension(100, 30));

		if(fc.isSelected()) {
			label.setText("Enter \u00B0Fahrenheit:");
		}
		if(cf.isSelected()) {
			label.setText("Enter \u00B0Celsius:");
		}

		conversionPanel.add(label);
		conversionPanel.add(textfield);
		conversionPanel.add(ans);
	}

	public void createButtonPanel() {
		group.add(fc);
		group.add(cf);

		buttonPanel.setLayout(new GridLayout(0,1));
		buttonPanel.add(fc);
		buttonPanel.add(cf);
	}
}
