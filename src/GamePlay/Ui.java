package GamePlay;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Ui extends JFrame {
	
	public Ui() {
		setTitle("숫자 야구게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel l = new JLabel("숫자 야구");
		l.setFont(new Font("바탕",Font.PLAIN, 30));
		l.setSize(400,100);
		l.setLocation(220,10);
		c.add(l);
		JButton easy = new JButton("하");
		easy.setSize(200, 50);
		easy.setLocation(180,350);
		easy.setBackground(Color.LIGHT_GRAY);
		c.add(easy);
		JButton medium = new JButton("중");
		medium.setSize(200,50);
		medium.setLocation(180,250);
		medium.setBackground(Color.LIGHT_GRAY);
		c.add(medium);
		JButton hard = new JButton("상");
		hard.setSize(200,50);
		hard.setLocation(180,150);
		hard.setBackground(Color.LIGHT_GRAY);
		c.add(hard);
		c.setBackground(Color.WHITE);
		c.addMouseListener(new MyMouseListener());
		JLabel h = new JLabel("?");
		h.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "사용되는 숫자는 0에서 9까지 서로 다른 숫자이다.\r\n" + 
						"\r\n" + 
						"숫자는 맞지만 위치가 틀렸을 때는 볼.\r\n" + 
						"\r\n" + 
						"숫자와 위치가 전부 맞으면 스트라이크.\r\n" + 
						"\r\n" + 
						"숫자와 위치가 전부 틀리면 아웃. \"틀렸다\"는 게 중요하다.\r\n" + 
						"\r\n" + 
						"물론 무엇이 볼이고 스트라이크인지는 알려주지 않는다.\r\n" + 
						"\r\n" + 
						"중복 숫자는 사용하지 않는다.", "How to Play", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		h.setFont(new Font("바탕",Font.PLAIN,50));
		h.setSize(50,50);
		h.setLocation(500,500);
		c.add(h);
		
		setSize(600,600);
		setVisible(true);
		
		
	}
	
	class MyMouseListener extends MouseAdapter{
		
	}
	public static void main(String args[]) {
		new Ui();
	}

}
