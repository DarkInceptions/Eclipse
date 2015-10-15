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
	public JPanel fcPanel;
	public JPanel cfPanel;

	public JLabel fLabel;
	public JLabel cLabel;
	public JLabel fAns;
	public JLabel cAns;

	public JTextField fTextField;
	public JTextField cTextField;

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
		fcPanel = new JPanel(new GridLayout(0, 1));
		cfPanel = new JPanel(new GridLayout(0, 1));
		fc = new F_to_C();
		cf = new C_to_F();
		fIn_p = 0;
		fOut_p = 0;
		cIn_p = 0;
		cOut_p = 0;
		fcButton = new JRadioButton("Convert Fahrenheit to Celsius");
		cfButton = new JRadioButton("Convert Celsius to Fahrenheit");
		rbGroup = new ButtonGroup();

		fcButton.setSelected(true);
		//cfButton.setSelected(true);
	}

	public void rbPanel() {
		rbGroup.add(fcButton);
		rbGroup.add(cfButton);
		
		rbPanel.add(fcButton);
		rbPanel.add(cfButton);
		
		if(fcButton.isSelected()) {
			fcButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					cfButton.setSelected(false);
					fcButton.setSelected(true);
					fAns.setText(null);
					cAns.setText(null);
					fTextField.setText(null);
					cTextField.setText(null);
				}
			});
		}

		if(cfButton.isSelected()) {
			cfButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					fcButton.setSelected(false);
					cfButton.setSelected(true);
					fAns.setText(null);
					cAns.setText(null);
					fTextField.setText(null);
					cTextField.setText(null);
				}
			});
		}
	}

	public void convertButton() {
		convertButton = new JButton("Convert");

		if(fcButton.isSelected()) {
			convertButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					fIn_p = Double.parseDouble(fTextField.getText());
					cOut_p = ((fIn_p-32)*(5D / 9D));
					cOut_p = Math.round(cOut_p*100.0)/100.0;
					fAns.setText(fIn_p +" Degrees Fahrenheit is Equal to " + cOut_p + " Degrees Celsius");
				}
			});
		}
		if(cfButton.isSelected()) {
			convertButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					cIn_p = Double.parseDouble(cTextField.getText());
					fOut_p = ((cIn_p * 9D/5D) + 32);
					fOut_p = Math.round(fOut_p*100.0)/100.0;
					cAns.setText(cIn_p +" Degrees Celsius is Equal to " + fOut_p + " Degrees Fahrenheit");
				}
			});
		}
		rbPanel.add(convertButton);
	}


	public void fcPanel() {
		fLabel = new JLabel("Enter Degrees Fahrenheit:");
		fcPanel.add(fLabel);

		fTextField = new JTextField();
		fTextField.setPreferredSize(new Dimension(400, 15));
		fcPanel.add(fTextField);

		fAns = new JLabel(" ");
		fcPanel.add(fAns);
	}

	public void cfPanel() {
		cLabel = new JLabel("Enter Degrees Celsius:");
		cfPanel.add(cLabel);

		cTextField = new JTextField();
		cTextField.setPreferredSize(new Dimension(100, 30));
		cfPanel.add(cTextField);

		cAns = new JLabel(" ");
		cfPanel.add(cAns);
	}
}
