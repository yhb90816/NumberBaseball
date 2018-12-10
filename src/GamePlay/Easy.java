package GamePlay;

import java.awt.*;
import java.awt.List;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;

public class Easy extends JPanel {
	
	int strikeCount = 0;
	int ballCount = 0;
	int tryingCount = 0;
	String judgeOut;
	String[] ans = new String[3];
	String[] num = new String[3];
	Ui ui = new Ui();
	
	public Easy() {
		setLayout(null);
		setBackground(Color.WHITE);
		
		ArrayList list = new ArrayList();
		String[] numberArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
		for (String i : numberArray) {
			list.add(i);
		}
		Collections.shuffle(list);
		for (int i = 0; i < 6; i++) {
			list.remove(0);
		}
		Iterator iterator = list.iterator();
		for(int i=0;iterator.hasNext();i++) {
			ans[i] = (String)iterator.next();
		}
		
		BaseSetting();
	}
	public void BaseSetting() {
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b0 = new JButton("Enter");
		b1.setBackground(Color.LIGHT_GRAY);
		b2.setBackground(Color.LIGHT_GRAY);
		b3.setBackground(Color.LIGHT_GRAY);
		b4.setBackground(Color.LIGHT_GRAY);
		b5.setBackground(Color.LIGHT_GRAY);
		b6.setBackground(Color.LIGHT_GRAY);
		b7.setBackground(Color.LIGHT_GRAY);
		b8.setBackground(Color.LIGHT_GRAY);
		b9.setBackground(Color.LIGHT_GRAY);
		b0.setBackground(Color.LIGHT_GRAY);
		b1.setBounds(180,300,50,50);
		b2.setBounds(255,300,50,50);
		b3.setBounds(330,300,50,50);
		b4.setBounds(180,375,50,50);
		b5.setBounds(255,375,50,50);
		b6.setBounds(330,375,50,50);
		b7.setBounds(180,450,50,50);
		b8.setBounds(255,450,50,50);
		b9.setBounds(330,450,50,50);
		b0.setBounds(405,450,75,50);
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b0);
		JTextField t1 = new JTextField(30);
		t1.setBounds(208,250,150,30);
		add(t1);
		String header[]= {"입력된 숫자","스트라이크","볼","아웃"};
		String contents[][]= {};
		DefaultTableModel model = new DefaultTableModel(contents,header);
		JTable table = new JTable(model);
		JScrollPane sc = new JScrollPane(table);
		sc.setBounds(40,30,500,200);
		add(sc);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().length()<5) {
					t1.setText(t1.getText()+"1 ");
				}
				else {
					JOptionPane.showMessageDialog(null, "입력가능한 길이를 초과했습니다.","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().length()<5) {
					t1.setText(t1.getText()+"2 ");
				}
				else {
					JOptionPane.showMessageDialog(null, "입력가능한 길이를 초과했습니다.","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().length()<5) {
					t1.setText(t1.getText()+"3 ");
				}
				else {
					JOptionPane.showMessageDialog(null, "입력가능한 길이를 초과했습니다.","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().length()<5) {
					t1.setText(t1.getText()+"4 ");
				}
				else {
					JOptionPane.showMessageDialog(null, "입력가능한 길이를 초과했습니다.","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().length()<5) {
					t1.setText(t1.getText()+"5 ");
				}
				else {
					JOptionPane.showMessageDialog(null, "입력가능한 길이를 초과했습니다.","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().length()<5) {
					t1.setText(t1.getText()+"6 ");
				}
				else {
					JOptionPane.showMessageDialog(null, "입력가능한 길이를 초과했습니다.","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().length()<5) {
					t1.setText(t1.getText()+"7 ");
				}
				else {
					JOptionPane.showMessageDialog(null, "입력가능한 길이를 초과했습니다.","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().length()<5) {
					t1.setText(t1.getText()+"8 ");
				}
				else {
					JOptionPane.showMessageDialog(null, "입력가능한 길이를 초과했습니다.","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().length()<5) {
					t1.setText(t1.getText()+"9 ");
				}
				else {
					JOptionPane.showMessageDialog(null, "입력가능한 길이를 초과했습니다.","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(t1.getText().length()==6) {
						String first = t1.getText();
						StringTokenizer st = new StringTokenizer(first," ");
						int n = st.countTokens();
						for(int i =0;i<n;i++) {
							num[i]=st.nextToken();
						}
						if(!(num[0].equals(num[1])||num[1].equals(num[2])||num[2].equals(num[0]))) {
							for(int k=0;k<3;k++) {
								if(num[k].equals(ans[k])) {
									strikeCount++;
								}
							}
							for(int j = 0;j<3;j++) {
								for(int l = 0;l<3;l++) {
									if(!num[j].equals(ans[j])&&num[j].equals(ans[l])) {
										ballCount++;
									}
								}
							}
							if(strikeCount==0&&ballCount==0) {
								judgeOut = "O";
							}
							else {
								judgeOut = "X";
							}
							if(strikeCount==3) {
								JOptionPane.showMessageDialog(null, "정답입니다!", "", JOptionPane.INFORMATION_MESSAGE);
								
							}
							String inputStr[] = new String[4];
							
							inputStr[0] = t1.getText();
							inputStr[1] = Integer.toString(strikeCount);
							inputStr[2] = Integer.toString(ballCount);
							inputStr[3] = judgeOut;
							
							model.addRow(inputStr);
							tryingCount++;
							strikeCount = 0;
							ballCount = 0;
							t1.setText("");
							for(int i=0;i<ans.length;i++) {
								System.out.println(ans[i]);
							}
							if(tryingCount==7) {
								JOptionPane.showMessageDialog(null, "게임 오버", "Game Over", JOptionPane.INFORMATION_MESSAGE);
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "중복된 수가 있습니다.", "Error", JOptionPane.ERROR_MESSAGE);
							t1.setText("");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "3자리 숫자가 아닙니다.", "Error", JOptionPane.ERROR_MESSAGE);
						t1.setText("");
					}
			}
		});
	}

}
