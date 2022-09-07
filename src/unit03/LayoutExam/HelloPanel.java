package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloPanel extends JFrame{
	HelloPanel(){
		
		JPanel jp = new JPanel();
		jp.setBackground(Color.CYAN);
		add(jp);
		
		
		JButton jb = new JButton("버튼1");
		jb.setBackground(Color.yellow);
		jp.add(jb);
		
		JButton JBt = new JButton("버튼2");
		JBt.setBackground(Color.MAGENTA);
		jp.add(JBt);
		
		setTitle("안녕 패널");
		setSize(300,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new HelloPanel();
//
	}

}
