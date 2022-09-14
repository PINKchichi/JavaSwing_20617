package unit03.component;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButtonEvent extends JFrame implements ActionListener{
	JPanel p;
	JButton b,b2;
	
	public HelloButtonEvent() {
		
		p = new JPanel();
		p.setBackground(Color.CYAN);
		add(p);
		
		b = new JButton("노란색");
		b2= new JButton("핑크색");
		
		p.add(b);
		p.add(b2);
		b.addActionListener(this);
		b2.addActionListener(this);
		setTitle("버튼 이벤트");
		setSize(700,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new HelloButtonEvent();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== b) 
			p.setBackground(Color.YELLOW);
		else if(e.getSource()== b2)
			p.setBackground(Color.PINK);
		
	}
	
}
