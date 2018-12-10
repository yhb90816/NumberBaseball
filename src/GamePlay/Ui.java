package GamePlay;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Ui extends JFrame {
	Hard hard = new Hard();
	Medium medium = new Medium();
	Easy easy = new Easy();
	
	public Ui() {
		setTitle("숫자 야구게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel l = new JLabel("숫자 야구");
		l.setFont(new Font("바탕",Font.PLAIN, 30));
		l.setBounds(220,10,400,100);
		c.add(l);
		JButton e = new JButton("하");
		e.setBounds(180,350,200,50);
		e.setBackground(Color.LIGHT_GRAY);
		e.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				c.removeAll();
				c.revalidate();
				c.repaint();
				setContentPane(easy);
			}
		});
		c.add(e);
		JButton m = new JButton("중");
		m.setBounds(180,250,200,50);
		m.setBackground(Color.LIGHT_GRAY);
		m.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				c.removeAll();
				c.revalidate();
				c.repaint();
				setContentPane(medium);
			}
		});
		c.add(m);
		JButton h = new JButton("상");
		h.setBounds(180,150,200,50);
		h.setBackground(Color.LIGHT_GRAY);
		h.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				c.removeAll();
				c.revalidate();
				c.repaint();
				setContentPane(hard);
			}
		});
		c.add(h);
		c.setBackground(Color.WHITE);
		JLabel ht = new JLabel("?");
		ht.addMouseListener(new MouseAdapter(){
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
		ht.setFont(new Font("바탕",Font.PLAIN,50));
		ht.setBounds(500,500,50,50);
		c.add(ht);
		
		setSize(600,600);
		setVisible(true);		
	}
	
	public static void main(String args[]) {
		new Ui();
	}

}
