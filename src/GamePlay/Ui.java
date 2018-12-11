package GamePlay;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Ui extends JFrame {
	
	Hard hard = new Hard();
	Medium medium = new Medium();
	Easy easy = new Easy();
	Start start = new Start();
	JButton ea = new JButton("하");

	public Ui() {
		setTitle("숫자 야구게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(start);
		
		ea.setBounds(180,550,200,100);
		ea.setBackground(Color.LIGHT_GRAY);
		ea.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("하")) {
					Container c1 = getContentPane();
					c1.removeAll();
					c1.revalidate();
					c1.repaint();
					setContentPane(easy);
					ea.setText("중");
					ea.setBounds(305, 683, 120, 50);
					add(ea);
				}
				else if(b.getText().equals("중")) {
					Container c2 = getContentPane();
					c2.removeAll();
					c2.revalidate();
					c2.repaint();
					setContentPane(medium);
					ea.setText("상");
					ea.setBounds(305,683,120,50);
					add(ea);
				}
				else if(b.getText().equals("상")) {
					Container c5 = getContentPane();
					c5.removeAll();
					c5.revalidate();
					c5.repaint();
					setContentPane(hard);
					ea.setText("종료");
					ea.setBounds(450, 683, 120, 50);
					add(ea);
				}
				else if(b.getText().equals("종료")) {
					System.exit(0);
				}
			}
		});
		add(ea);
		JButton m = new JButton("중");
		m.setBounds(180,400,200,100);
		m.setBackground(Color.LIGHT_GRAY);
		m.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("중")) {
					Container c3 = getContentPane();
					c3.removeAll();
					c3.revalidate();
					c3.repaint();
					setContentPane(medium);
					m.setText("상");
					m.setBounds(305, 683, 120, 50);
					add(m);
				}
				else if(b.getText().equals("상")) {
					Container c7 = getContentPane();
					c7.removeAll();
					c7.revalidate();
					c7.repaint();
					setContentPane(hard);
					m.setText("종료");
					m.setBounds(450, 683, 120, 50);
					add(m);
				}
				else if(b.getText().equals("종료")) {
					System.exit(0);
				}
			}
		});
		add(m);
		JButton h = new JButton("상");
		h.setBounds(180,250,200,100);
		h.setBackground(Color.LIGHT_GRAY);
		h.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("상")) {
					Container c4 = getContentPane();
					c4.removeAll();
					c4.revalidate();
					c4.repaint();
					setContentPane(hard);
					h.setText("종료");
					h.setBounds(450, 683, 120, 50);
					add(h);
				}
				else if(b.getText().equals("종료")) {
					System.exit(0);
				}
			}
		});
		add(h);
		setBackground(Color.WHITE);
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
		ht.setBounds(500,675,50,50);
		add(ht);
		
		setSize(600,800);
		setVisible(true);		
	}
	
	public static void main(String args[]) {
		new Ui();
	}

}
