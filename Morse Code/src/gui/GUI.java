package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI {
	String A = "A .-";
	String B = "B -...";
	String C = "C -.-.";
	String D = "D -..";
	String E = "E .";
	String F = "F ..-.";
	String G = "G --.";
	String H = "H ....";
	String I = "I ..";
	String J = "J .---";
	String K = "K -.-";
	String L = "L .-..";
	String M = "M --";
	String N = "N -.";
	String O = "O ---";
	String P = "P .--.";
	String Q = "Q --.-";
	String R = "R .-.";
	String S = "S ...";
	String T = "T -";
	String U = "U ..-";
	String V = "V ...-";
	String W = "W .--";
	String X = "X -..-";
	String Y = "Y -.--";
	String Z = "Z --..";
	String v1 = "1 .----";
	String v2 = "2 ..---";
	String v3 = "3 ...--";
	String v4 = "4 ....-";
	String v5 = "5 .....";
	String v6 = "6 -....";
	String v7 = "7 --...";
	String v8 = "8 ---..";
	String v9 = "9 ----.";
	String v0 = "0 -----";

	ButtonGroup group;

	JButton convert;

	JRadioButton mt;
	JRadioButton tm;

	JFrame frame;

	JPanel codec_main;
	JPanel codec_letters;
	JPanel codec_numbers;
	JPanel button_panel;
	JPanel main;
	JPanel input_panel;
	JPanel output_panel;

	JTextArea output_text;
	JTextArea input_text;

	public GUI() {
		frame = new JFrame();

		codec_main = new JPanel();
		codec_letters = new JPanel();
		codec_numbers = new JPanel();

		button_panel = new JPanel();
		group = new ButtonGroup();
		mt = new JRadioButton("Morse Code to Text");
		tm = new JRadioButton("Text to Morse Code");

		main = new JPanel();	
		input_panel = new JPanel();
		input_text = new JTextArea();
		output_panel = new JPanel();
		output_text = new JTextArea();

		convert = new JButton("Convert");
	}

	public static void main(String[] args) {
		GUI g = new GUI();
		g.createCodecMain();
		g.createCodecLetters();
		g.createCodecNumbers();
		g.createRadioButtons();
		g.createConvert();
		g.createInput();
		g.createOutput();
		g.createMain();
		g.createFrame();
	}

	public void createFrame() {
		frame.setTitle("Morse Code");
		frame.setSize(new Dimension(700,800));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void createCodecMain() {
		codec_main.setLayout(new GridLayout(0,3));
		codec_main.add(codec_letters);

		JPanel space = new JPanel();
		codec_main.add(space);

		codec_main.add(codec_numbers);
		frame.getContentPane().add(codec_main, BorderLayout.WEST);
	}

	public void createCodecLetters() {
		JLabel a = new JLabel(A);
		JLabel b = new JLabel(B);
		JLabel c = new JLabel(C);
		JLabel d = new JLabel(D);
		JLabel e = new JLabel(E);
		JLabel f = new JLabel(F);
		JLabel g = new JLabel(G);
		JLabel h = new JLabel(H);
		JLabel i = new JLabel(I);
		JLabel j = new JLabel(J);
		JLabel k = new JLabel(K);
		JLabel l = new JLabel(L);
		JLabel m = new JLabel(M);
		JLabel n = new JLabel(N);
		JLabel o = new JLabel(O);
		JLabel p = new JLabel(P);
		JLabel q = new JLabel(Q);
		JLabel r = new JLabel(R);
		JLabel s = new JLabel(S);
		JLabel t = new JLabel(T);
		JLabel u = new JLabel(U);
		JLabel v = new JLabel(V);
		JLabel w = new JLabel(W);
		JLabel x = new JLabel(X);
		JLabel y = new JLabel(Y);
		JLabel z = new JLabel(Z);

		a.setFont(new Font("Arial", Font.PLAIN, 24));
		b.setFont(new Font("Arial", Font.PLAIN, 24));
		c.setFont(new Font("Arial", Font.PLAIN, 24));
		d.setFont(new Font("Arial", Font.PLAIN, 24));
		e.setFont(new Font("Arial", Font.PLAIN, 24));
		f.setFont(new Font("Arial", Font.PLAIN, 24));
		g.setFont(new Font("Arial", Font.PLAIN, 24));
		h.setFont(new Font("Arial", Font.PLAIN, 24));
		i.setFont(new Font("Arial", Font.PLAIN, 24));
		j.setFont(new Font("Arial", Font.PLAIN, 24));
		k.setFont(new Font("Arial", Font.PLAIN, 24));
		l.setFont(new Font("Arial", Font.PLAIN, 24));
		m.setFont(new Font("Arial", Font.PLAIN, 24));
		n.setFont(new Font("Arial", Font.PLAIN, 24));
		o.setFont(new Font("Arial", Font.PLAIN, 24));
		p.setFont(new Font("Arial", Font.PLAIN, 24));
		q.setFont(new Font("Arial", Font.PLAIN, 24));
		r.setFont(new Font("Arial", Font.PLAIN, 24));
		s.setFont(new Font("Arial", Font.PLAIN, 24));
		t.setFont(new Font("Arial", Font.PLAIN, 24));
		u.setFont(new Font("Arial", Font.PLAIN, 24));
		v.setFont(new Font("Arial", Font.PLAIN, 24));
		w.setFont(new Font("Arial", Font.PLAIN, 24));
		x.setFont(new Font("Arial", Font.PLAIN, 24));
		y.setFont(new Font("Arial", Font.PLAIN, 24));
		z.setFont(new Font("Arial", Font.PLAIN, 24));

		codec_letters.setLayout(new GridLayout(0,1));

		codec_letters.add(a);
		codec_letters.add(b);
		codec_letters.add(c);
		codec_letters.add(d);
		codec_letters.add(e);
		codec_letters.add(f);
		codec_letters.add(g);
		codec_letters.add(h);
		codec_letters.add(i);
		codec_letters.add(j);
		codec_letters.add(k);
		codec_letters.add(l);
		codec_letters.add(m);
		codec_letters.add(n);
		codec_letters.add(o);
		codec_letters.add(p);
		codec_letters.add(q);
		codec_letters.add(r);
		codec_letters.add(s);
		codec_letters.add(t);
		codec_letters.add(u);
		codec_letters.add(v);
		codec_letters.add(w);
		codec_letters.add(x);
		codec_letters.add(y);
		codec_letters.add(z);
	}

	public void createCodecNumbers() {
		JLabel l1 = new JLabel(v1);
		JLabel l2 = new JLabel(v2);
		JLabel l3 = new JLabel(v3);
		JLabel l4 = new JLabel(v4);
		JLabel l5 = new JLabel(v5);
		JLabel l6 = new JLabel(v6);
		JLabel l7 = new JLabel(v7);
		JLabel l8 = new JLabel(v8);
		JLabel l9 = new JLabel(v9);
		JLabel l0 = new JLabel(v0);

		l1.setFont(new Font("Arial", Font.PLAIN, 24));
		l2.setFont(new Font("Arial", Font.PLAIN, 24));
		l3.setFont(new Font("Arial", Font.PLAIN, 24));
		l4.setFont(new Font("Arial", Font.PLAIN, 24));
		l5.setFont(new Font("Arial", Font.PLAIN, 24));
		l6.setFont(new Font("Arial", Font.PLAIN, 24));
		l7.setFont(new Font("Arial", Font.PLAIN, 24));
		l8.setFont(new Font("Arial", Font.PLAIN, 24));
		l9.setFont(new Font("Arial", Font.PLAIN, 24));
		l0.setFont(new Font("Arial", Font.PLAIN, 24));

		codec_numbers.setLayout(new GridLayout(0,1));

		codec_numbers.add(l1);
		codec_numbers.add(l2);
		codec_numbers.add(l3);
		codec_numbers.add(l4);
		codec_numbers.add(l5);
		codec_numbers.add(l6);
		codec_numbers.add(l7);
		codec_numbers.add(l8);
		codec_numbers.add(l9);
		codec_numbers.add(l0);
	}

	public void createRadioButtons() {
		group.add(mt);
		group.add(tm);

		mt.setFont(new Font("Arial", Font.PLAIN, 24));
		tm.setFont(new Font("Arial", Font.PLAIN, 24));

		button_panel.setLayout(new GridLayout(1,0));
		button_panel.add(mt);
		button_panel.add(tm);

		frame.getContentPane().add(button_panel, BorderLayout.NORTH);

		mt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input_text.setText(null);
				output_text.setText(null);
			}
		});

		tm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input_text.setText(null);
				output_text.setText(null);
			}
		});
	}

	public void createMain() {
		main.setLayout(new GridLayout(2,0));

		main.add(input_panel);
		main.add(output_panel);

		frame.getContentPane().add(main, BorderLayout.EAST);
	}

	public void createInput() {
		input_text.setEditable(true);
		input_text.setPreferredSize(new Dimension(300, 200));
		input_text.setLineWrap(true);
		input_text.setWrapStyleWord(true);

		JScrollPane input_scroll = new JScrollPane(input_text);

		input_panel.add(input_scroll);
		input_panel.add(input_text);
	}

	public void createOutput() {
		output_text.setEditable(false);
		output_text.setPreferredSize(new Dimension(300, 200));
		output_text.setLineWrap(true);
		output_text.setWrapStyleWord(true);

		JScrollPane output_scroll = new JScrollPane(output_text);

		output_panel.add(output_scroll);
		output_panel.add(output_text);
	}

	public void createConvert() {
		frame.getContentPane().add(convert, BorderLayout.SOUTH);

		convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mt.isSelected()) {
					input_text.setText(null);
				}
				if(tm.isSelected()) {
					input_text.setText(null);
				}
			}
		});
	}
}
