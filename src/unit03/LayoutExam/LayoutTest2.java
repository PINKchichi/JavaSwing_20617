package unit03.LayoutExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutTest2 extends JFrame{
	public LayoutTest2() {
		
		setLayout(new BorderLayout(0,3));
		JPanel p = new JPanel();
		p.setBackground(Color.CYAN);	
		p.setLayout(new GridLayout(0,2));
		JPanel p2 = new JPanel();
		p2.setBackground(Color.PINK);
		p2.setLayout(new FlowLayout());
		JPanel p3 = new JPanel();
		p3.setBackground(Color.red);
		p3.setLayout(new FlowLayout());
		JButton b = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		JButton b3 = new JButton("버튼3");
		JButton b4 = new JButton("버튼4");
		JButton b5 = new JButton("버튼5");	
		JButton b6 = new JButton("버튼6");
		
		p2.add(b);
		p2.add(b2);
		p.add(b3);
		p.add(b4);
		p3.add(b5);
		p3.add(b6);
		add(p, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		add(p2, BorderLayout.NORTH);
		setTitle("보더 레이섞기");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LayoutTest2();
	}

}