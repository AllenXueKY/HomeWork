package com.AllenXue.JavaBase.Homework6;
import java.awt.*;
import javax.swing.*;
public class CalculatorUI extends JFrame{
	
	public JLayeredPane navigation;//������
	public JPanel panel1;
	public JButton bts1;
	
	public CalculatorUI()
	{
		navigation = new JLayeredPane();
		setSize(300,400);//���ô��ڴ�С
		setTitle("������");//���ô��ڱ���
		setLayout(null);
		panel1=new JPanel();
		panel1.setSize(300,350);
		panel1.setLocation(30, 30);
		panel1.setLayout(new GridLayout(2,4));
		String[] strs1={"1","2","3","4","5","6","7","8"};
		bts1=new JButton("MC");
		panel1.add(bts1);
		this.add(panel1);
		setVisible(true);//���ô��ڿɼ�
		
	}
}
