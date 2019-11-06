package com.AllenXue.JavaBase.Homework6;

import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
	private JTextField textField;
	
	public static void main(String[] args) {
		Calculator frame = new Calculator();
		frame.setVisible(true);
	}

	public Calculator() {
		
		/**
		 * 设计窗体
		 */
		setTitle("计算器");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 291, 427);
		
		/**
		 * 设置菜单
		 */
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("查看(V)    ");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("编辑(E)    ");
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("帮助(H)   ");
		mnNewMenu_2.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		menuBar.add(mnNewMenu_2);
		
		/**
		 * 设计图层
		 */
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(49, 40));
		getContentPane().add(panel, BorderLayout.CENTER);
		
		/**
		 * 上面的输入框
		 */
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setToolTipText("0");
		textField.setFont(new Font("宋体", Font.BOLD, 28));
		textField.setText("\r\n0");
		panel.add(textField);
		textField.setPreferredSize(new Dimension(16, 75)); 
		textField.setColumns(16);
		
		/**
		 * 设计按钮部分
		 */
		JButton btnNewButton_MC = new JButton("MC");
		btnNewButton_MC.setPreferredSize(new Dimension(49, 40));
		btnNewButton_MC.setMargin(new Insets(0, 0, 0, 0));
		
		btnNewButton_MC.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnNewButton_MC);
		
		JButton btnNewButton_MR = new JButton("MR");
		btnNewButton_MR.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_MR.setPreferredSize(new Dimension(49, 40));
		btnNewButton_MR.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnNewButton_MR);
		
		JButton btnNewButton_MS = new JButton("MS");
		btnNewButton_MS.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_MS.setPreferredSize(new Dimension(49, 40));
		btnNewButton_MS.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnNewButton_MS);
		
		JButton btnNewButton_MAdd = new JButton("M+");
		btnNewButton_MAdd.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_MAdd.setPreferredSize(new Dimension(49, 40));
		btnNewButton_MAdd.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnNewButton_MAdd);
		
		JButton btnNewButton_MSub = new JButton("M-");
		btnNewButton_MSub.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_MSub.setPreferredSize(new Dimension(49, 40));
		btnNewButton_MSub.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnNewButton_MSub);
		
		JButton button_Jiantou = new JButton("\u2190");			//计算器第二行第一个左箭头
		button_Jiantou.setPreferredSize(new Dimension(49, 40));
		button_Jiantou.setMargin(new Insets(0, 0, 0, 0));
		button_Jiantou.setFont(new Font("Dialog", Font.BOLD, 34));
		panel.add(button_Jiantou);
		
		JButton btnCe = new JButton("CE");
		btnCe.setPreferredSize(new Dimension(49, 40));
		btnCe.setMargin(new Insets(0, 0, 0, 0));
		btnCe.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.setPreferredSize(new Dimension(49, 40));
		btnC.setMargin(new Insets(0, 0, 0, 0));
		btnC.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnC);
		
		JButton btnNewButton = new JButton("\u00B1");      //第二行的加减号
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton.setPreferredSize(new Dimension(49, 40));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnNewButton);
		
		JButton btnNewButton_Genhao = new JButton("\u221A");   //第二行的根号
		btnNewButton_Genhao.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_Genhao.setPreferredSize(new Dimension(49, 40));
		btnNewButton_Genhao.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnNewButton_Genhao);
		
		JButton button_7 = new JButton("7");
		button_7.setPreferredSize(new Dimension(49, 40));
		button_7.setMargin(new Insets(0, 0, 0, 0));
		button_7.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setPreferredSize(new Dimension(49, 40));
		button_8.setMargin(new Insets(0, 0, 0, 0));
		button_8.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setPreferredSize(new Dimension(49, 40));
		button_9.setMargin(new Insets(0, 0, 0, 0));
		button_9.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_9);
		
		JButton button_ChuHao = new JButton("/");
		button_ChuHao.setPreferredSize(new Dimension(49, 40));
		button_ChuHao.setMargin(new Insets(0, 0, 0, 0));
		button_ChuHao.setFont(new Font("Dialog", Font.BOLD, 22));
		panel.add(button_ChuHao);
		
		JButton button_BaiFenHao = new JButton("\uFF05");		//第三行的百分号
		button_BaiFenHao.setPreferredSize(new Dimension(49, 40));
		button_BaiFenHao.setMargin(new Insets(0, 0, 0, 0));
		button_BaiFenHao.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_BaiFenHao);
		
		JButton button_4 = new JButton("4");
		button_4.setPreferredSize(new Dimension(49, 40));
		button_4.setMargin(new Insets(0, 0, 0, 0));
		button_4.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setPreferredSize(new Dimension(49, 40));
		button_5.setMargin(new Insets(0, 0, 0, 0));
		button_5.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_5);
		
		JButton button_6 = new JButton(" 6");
		button_6.setPreferredSize(new Dimension(49, 40));
		button_6.setMargin(new Insets(0, 0, 0, 0));
		button_6.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_6);
		
		JButton button_ChengHao = new JButton("*");
		button_ChengHao.setPreferredSize(new Dimension(49, 40));
		button_ChengHao.setMargin(new Insets(0, 0, 0, 0));
		button_ChengHao.setFont(new Font("Dialog", Font.BOLD, 20));
		panel.add(button_ChengHao);
		
		JButton btnx = new JButton(" 1/x");
		btnx.setPreferredSize(new Dimension(49, 40));
		btnx.setMargin(new Insets(0, 0, 0, 0));
		btnx.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnx);
		
		JButton button_1 = new JButton("1");
		button_1.setPreferredSize(new Dimension(49, 40));
		button_1.setMargin(new Insets(0, 0, 0, 0));
		button_1.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setPreferredSize(new Dimension(49, 40));
		button_2.setMargin(new Insets(0, 0, 0, 0));
		button_2.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setPreferredSize(new Dimension(49, 40));
		button_3.setMargin(new Insets(0, 0, 0, 0));
		button_3.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_3);
		
		JButton button_JianHao = new JButton("-");
		button_JianHao.setPreferredSize(new Dimension(49, 40));
		button_JianHao.setMargin(new Insets(0, 0, 0, 0));
		button_JianHao.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_JianHao);
		
		JButton button_Add = new JButton("+");
		button_Add.setPreferredSize(new Dimension(49, 40));
		button_Add.setMargin(new Insets(0, 0, 0, 0));
		button_Add.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_Add);
		
		JButton button_0 = new JButton("0");
		button_0.setPreferredSize(new Dimension(103, 40));
		button_0.setMargin(new Insets(0, 0, 0, 0));
		button_0.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_0);
		
		JButton button_Dian = new JButton(".");
		button_Dian.setPreferredSize(new Dimension(49, 40));
		button_Dian.setMargin(new Insets(0, 0, 0, 0));
		button_Dian.setFont(new Font("Dialog", Font.BOLD, 22));
		panel.add(button_Dian);
		
		JButton button_Equal = new JButton("=");
		button_Equal.setPreferredSize(new Dimension(102, 40));
		button_Equal.setMargin(new Insets(0, 0, 0, 0));
		button_Equal.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_Equal);
	}

}
