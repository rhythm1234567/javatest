package 实验3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;

public class test3_1 implements ActionListener {
	static JPasswordField tmi=new JPasswordField("");
	static JLabel is=new JLabel("");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("test");
		f.setSize(300,200);
		f.setLocation(200,200);
		JPanel p1=new JPanel();
		p1.setBounds(50, 50, 300, 100);
		p1.setBackground(Color.pink);
		JLabel mi=new JLabel("密码：");
		
		tmi.setText("zt123456");
		tmi.setPreferredSize(new Dimension(200,20));
		JButton b1=new JButton("确定");
		b1.addActionListener(new test3_1());
		is.setPreferredSize(new Dimension(180,20));
		
		p1.add(mi);
	
		p1.add(tmi);
	
		p1.add(is);
		p1.add(b1);
		f.add(p1);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		char [] password =tmi.getPassword();
		String p=String.valueOf(password);
		String s="[a-zA-Z0-9]{8,}";
	
		boolean flag=false;
	flag=p.matches(s);
		if(flag==false)
		is.setText("密码格式错误");
		else
		is.setText("√");
	}

	
}
