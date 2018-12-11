package GamePlay;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Start extends JPanel {
	
	public Start() {
		setLayout(null);
		
		setBackground(Color.WHITE);
		
		BaseSetting();
	}
	
	void BaseSetting() {
		
		JLabel l = new JLabel("숫자 야구");
		l.setFont(new Font("바탕",Font.PLAIN, 45));
		l.setBounds(190,70,400,100);
		add(l);
	}

}
