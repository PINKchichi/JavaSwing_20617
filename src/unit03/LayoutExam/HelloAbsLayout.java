package unit03.LayoutExam;

import javax.swing.*;

public class HelloAbsLayout extends JFrame{
	public HelloAbsLayout() {
		setLayout(null);
		JButton b = new JButton("버튼1");
		b.setSize(70,40);
		b.setLocation(10,30);
		JButton b2 = new JButton("버튼2");
		b2.setSize(90,20);
		b2.setLocation(150,30);
		add(b);
		add(b2);
		setTitle("보더 레이아웃");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new HelloAbsLayout();
	}

}
