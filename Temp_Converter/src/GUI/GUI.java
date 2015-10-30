package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUI {
	double fIn;
	double fOut;
	double cIn;
	double cOut;
	
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
		frame.setSize(new Dimension(400, 200));
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
		
		convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fc.isSelected()) {
					fIn = Double.parseDouble(textfield.getText());
					cOut = ((fIn-32)*(5D / 9D));
					cOut = Math.round(cOut*100.0)/100.0;
					ans.setText(fIn +" \u00B0Fahrenheit is Equal to " + cOut + " \u00B0Celsius");
				}
				if(cf.isSelected()) {
					cIn = Double.parseDouble(textfield.getText());
					fOut = ((cIn * 9D/5D) + 32);
					fOut = Math.round(fOut*100.0)/100.0;
					ans.setText(cIn +" \u00B0Celsius is Equal to " + fOut + " \u00B0Fahrenheit");
				}
			}
		});

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
		
		fc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Enter \u00B0Fahrenheit:");
				textfield.setText(null);
				ans.setText(null);
			}
		});
		
		cf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Enter \u00B0Celsius:");
				textfield.setText(null);
				ans.setText(null);
			}
		});
	}
}
