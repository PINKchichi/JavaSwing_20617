package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HellowFlowLayout extends JFrame{
	HellowFlowLayout() {
		JPanel jp = new JPanel();
		jp.setBackground(Color.CYAN);
		add(jp);
		
		JButton jb = new JButton("��ư1");
		JButton jb2 = new JButton("��ư2");
		JButton jb3 = new JButton("��ư3");
		JButton jb4= new JButton("��ư4");
		JButton jb5 = new JButton("��ư5");
		JButton jb6 = new JButton("��ư6");
		JButton jb7 = new JButton("��ư7");
		jp.add(jb);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jb7);
		
		//
		setTitle("�ȳ� �÷ο췹�̾ƿ�");
		setSize(300,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new HellowFlowLayout();

	}

}
