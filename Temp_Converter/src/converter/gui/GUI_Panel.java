package converter.gui;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
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
	
	public JRadioButton fcButton;
	public JRadioButton cfButton;
	
	public F_to_C fc;
	public C_to_F cf;

	public double fIn_p;
	public double fOut_p;
	public double cIn_p;
	public double cOut_p;
	
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
	}

	public void rbPanel() {
		fcButton = new JRadioButton("Convert Fahrenheit to Celsius");
		fcButton.setSelected(true);
		rbPanel.add(fcButton);

		cfButton = new JRadioButton("Convert Celsius to Fahrenheit");
		//cfButton.setSelected(true);
		rbPanel.add(cfButton);
	}

	public void convertButton() {
		convertButton = new JButton("Convert");
		rbPanel.add(convertButton);
	}


	public void fcPanel() {
		fLabel = new JLabel("Enter Degrees Fahrenheit:");
		fcPanel.add(fLabel);

		fTextField = new JTextField();
		fTextField.setPreferredSize(new Dimension(100, 30));
		fcPanel.add(fTextField);
		
		fAns = new JLabel(fIn_p +" Degrees Fahrenheit is Equal to " + cOut_p + " Degrees Celsius");
		fcPanel.add(fAns);
	}
	
	public void cfPanel() {
		cLabel = new JLabel("Enter Degrees Celsius:");
		cfPanel.add(cLabel);

		cTextField = new JTextField();
		cTextField.setPreferredSize(new Dimension(100, 30));
		cfPanel.add(cTextField);
		
		cAns = new JLabel(cIn_p +" Degrees Celsius is Equal to " + fOut_p + " Degrees Fahrenheit");
		cfPanel.add(cAns);
	}
}
