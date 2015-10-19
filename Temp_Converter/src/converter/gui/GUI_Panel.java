package converter.gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import converter.util.C_to_F;
import converter.util.F_to_C;

public class GUI_Panel extends GUI {

	public JPanel rbPanel;
	public JPanel panel;

	public JLabel Label;
	public JLabel Ans;

	public JTextField TextField;

	public JButton convertButton;
	
	public ButtonGroup rbGroup;

	public JRadioButton fcButton;
	public JRadioButton cfButton;

	public F_to_C fc;
	public C_to_F cf;

	public double fIn_p;
	public double cOut_p;

	public double cIn_p;
	public double fOut_p;

	public GUI_Panel() {
		rbPanel = new JPanel(new GridLayout(0, 1));
		panel = new JPanel(new GridLayout(0, 1));
		
		fcButton = new JRadioButton("Convert Fahrenheit to Celsius");
		cfButton = new JRadioButton("Convert Celsius to Fahrenheit");
		
		Label = new JLabel("");
		Ans = new JLabel("");
		
		TextField = new JTextField();
		
		rbGroup = new ButtonGroup();
		
		fc = new F_to_C();
		cf = new C_to_F();
		
		fIn_p = 0;
		fOut_p = 0;
		cIn_p = 0;
		cOut_p = 0;

		fcButton.setSelected(true);
		//cfButton.setSelected(true);
	}

	public void rbPanel() {
		rbGroup.add(fcButton);
		rbGroup.add(cfButton);
		
		rbPanel.add(fcButton);
		rbPanel.add(cfButton);
	}

	public void convertButton() {
		convertButton = new JButton("Convert");

		if(fcButton.isSelected()) {
			convertButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					fIn_p = Double.parseDouble(TextField.getText());
					cOut_p = ((fIn_p-32)*(5D / 9D));
					cOut_p = Math.round(cOut_p*100.0)/100.0;
					Ans.setText(fIn_p +" Degrees Fahrenheit is Equal to " + cOut_p + " Degrees Celsius");
				}
			});
		}
		if(cfButton.isSelected()) {
			convertButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					cIn_p = Double.parseDouble(TextField.getText());
					fOut_p = ((cIn_p * 9D/5D) + 32);
					fOut_p = Math.round(fOut_p*100.0)/100.0;
					Ans.setText(cIn_p +" Degrees Celsius is Equal to " + fOut_p + " Degrees Fahrenheit");
				}
			});
		}
		rbPanel.add(convertButton);
	}
	
	public void createPanel() {

		if(fcButton.isSelected()) {
			Label.setText("Enter Degrees Fahrenheit:");

			fcButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Ans.setText(null);
					TextField.setText(null);
					cfButton.setSelected(false);
					fcButton.setSelected(true);
				}
			});
		}

		if(cfButton.isSelected()) {
			Label.setText("Enter Degrees Celsius:");

			cfButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Ans.setText(null);
					TextField.setText(null);
					fcButton.setSelected(false);
					cfButton.setSelected(true);
				}
			});
		}
		
		panel.add(Label);
		TextField.setPreferredSize(new Dimension(400, 10));
		panel.add(TextField);
		panel.add(Ans);
	}
}
