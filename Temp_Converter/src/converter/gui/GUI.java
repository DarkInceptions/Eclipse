package converter.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUI implements Runnable {

	public JPanel rbPanel;
	public JPanel panel;

	public JLabel Label;
	public JLabel Ans;

	public JTextField TextField;

	public JButton convertF;
	public JButton convertC;

	public ButtonGroup rbGroup;

	public JRadioButton fcButton;
	public JRadioButton cfButton;

	public double fIn_p;
	public double cOut_p;

	public double cIn_p;
	public double fOut_p;

	public GUI() {
		fcButton = new JRadioButton("Convert Fahrenheit to Celsius");
		cfButton = new JRadioButton("Convert Celsius to Fahrenheit");

		Label = new JLabel("");
		Ans = new JLabel("");

		TextField = new JTextField();	

		fIn_p = 0;
		fOut_p = 0;
		cIn_p = 0;
		cOut_p = 0;

		fcButton.setSelected(true);
		//cfButton.setSelected(true);
	}

	public void run() {
		GUI g = new GUI();
		JFrame frame = new JFrame();

		g.rbPanel();
		if(g.fcButton.isSelected()) {
			g.convertF();
			frame.getContentPane().add(g.convertF, BorderLayout.SOUTH);
		}
		if(g.cfButton.isSelected()) {
			g.convertC();
			frame.getContentPane().add(g.convertC, BorderLayout.SOUTH);
		}
		g.createPanel();

		frame.setTitle("Temperature Converter");
		frame.setSize(new Dimension(600, 200));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(g.rbPanel, BorderLayout.WEST);

		frame.getContentPane().add(g.panel, BorderLayout.EAST);
		frame.setVisible(true);

	}

	public void rbPanel() {
		rbPanel = new JPanel(new GridLayout(0, 1));

		rbGroup = new ButtonGroup();

		rbGroup.add(fcButton);
		rbGroup.add(cfButton);

		rbPanel.add(fcButton);
		rbPanel.add(cfButton);
	}

	public void convertF() {
		convertF = new JButton("Convert");

		Label.setText("Enter Degrees Fahrenheit:");

		if(fcButton.isSelected()) {

			convertF.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					fIn_p = Double.parseDouble(TextField.getText());
					cOut_p = ((fIn_p-32)*(5D / 9D));
					cOut_p = Math.round(cOut_p*100.0)/100.0;
					Ans.setText(fIn_p +" Degrees Fahrenheit is Equal to " + cOut_p + " Degrees Celsius");
				}
			});
		}
	}

	public void convertC() {
		convertC = new JButton("Convert");

		Label.setText("Enter Degrees Celsius:");

		if(cfButton.isSelected()) {

			convertC.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					cIn_p = Double.parseDouble(TextField.getText());
					fOut_p = ((cIn_p * 9D/5D) + 32);
					fOut_p = Math.round(fOut_p*100.0)/100.0;
					Ans.setText(cIn_p +" Degrees Celsius is Equal to " + fOut_p + " Degrees Fahrenheit");
				}
			});
		}
	}

	public void createPanel() {
		panel = new JPanel(new GridLayout(0, 1));

		panel.add(Label);
		TextField.setPreferredSize(new Dimension(400, 10));
		panel.add(TextField);
		panel.add(Ans);
	}
}