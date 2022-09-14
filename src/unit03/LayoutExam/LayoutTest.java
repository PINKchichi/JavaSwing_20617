package unit03.LayoutExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class LayoutTest	extends JFrame {
	public LayoutTest() {
		setLayout(new GridLayout(0,1));
		
		JPanel p = new JPanel();
		p.setBackground(Color.CYAN);
		p.setLayout(new GridLayout(0,2));
	
		JPanel p1 = new JPanel();
		p1.setBackground(Color.PINK);
		p1.setLayout(new FlowLayout());
		
		
		
		JButton b = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		JButton b3 = new JButton("버튼3");
		JButton b4 = new JButton("버튼4");
		JButton b5 = new JButton("버튼5");	
		JButton b6 = new JButton("버튼6");
		JButton b7 = new JButton("버튼7");
	
		p.add(b);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		
		
		add(p);
		add(p1);
		
		
		setTitle("레이아웃 섞기");
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LayoutTest();

	}

}
