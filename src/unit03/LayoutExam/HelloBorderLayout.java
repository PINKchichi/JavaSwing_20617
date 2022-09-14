package unit03.LayoutExam;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloBorderLayout extends JFrame {
	public HelloBorderLayout() {
		JPanel jp = new JPanel();
		jp.setBackground(Color.CYAN);
		add(jp);
		jp.setLayout(new BorderLayout());
		
		JButton jb = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		jp.add(jb,BorderLayout.NORTH);
		jp.add(jb2, BorderLayout.CENTER);
		jp.add(jb3, BorderLayout.SOUTH);
		jp.add(jb4, BorderLayout.WEST);
		jp.add(jb5, BorderLayout.EAST);
		
		
		setTitle("보더 레이아웃");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new HelloBorderLayout();
		
	}

}
