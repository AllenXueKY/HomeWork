package com.AllenXue.JavaBase.Homework6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.JEditorPane;
import java.awt.FlowLayout;
import javax.swing.DropMode;

public class Calculator extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("\u8BA1\u7B97\u5668");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 291, 427);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u67E5\u770B(V)    ");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("\u7F16\u8F91(E)    ");
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("\u5E2E\u52A9(H)   ");
		mnNewMenu_2.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		menuBar.add(mnNewMenu_2);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(49, 40));
		getContentPane().add(panel, BorderLayout.CENTER);

		JButton btnNewButton_5 = new JButton("MC");
		btnNewButton_5.setPreferredSize(new Dimension(49, 40));
		btnNewButton_5.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setToolTipText("0");
		textField.setFont(new Font("ËÎÌå", Font.BOLD, 28));
		textField.setText("\r\n0");
		panel.add(textField);
		textField.setPreferredSize(new Dimension(15, 75)); 

		textField.setColumns(16);
		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("MR");
		btnNewButton_6.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_6.setPreferredSize(new Dimension(49, 40));
		btnNewButton_6.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_1 = new JButton("MS");
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1.setPreferredSize(new Dimension(49, 40));
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("M+");
		btnNewButton_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2.setPreferredSize(new Dimension(49, 40));
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("M-");
		btnNewButton_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_3.setPreferredSize(new Dimension(49, 40));
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnNewButton_3);
		
		JButton button_2 = new JButton("\u2190");
		button_2.setPreferredSize(new Dimension(49, 40));
		button_2.setMargin(new Insets(0, 0, 0, 0));
		button_2.setFont(new Font("Dialog", Font.BOLD, 34));
		panel.add(button_2);
		
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
		
		JButton btnNewButton = new JButton("\u00B1");
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton.setPreferredSize(new Dimension(49, 40));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("\u221A");
		btnNewButton_4.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_4.setPreferredSize(new Dimension(49, 40));
		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(btnNewButton_4);
		
		JButton button_3 = new JButton("7");
		button_3.setPreferredSize(new Dimension(49, 40));
		button_3.setMargin(new Insets(0, 0, 0, 0));
		button_3.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.setPreferredSize(new Dimension(49, 40));
		button_4.setMargin(new Insets(0, 0, 0, 0));
		button_4.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setPreferredSize(new Dimension(49, 40));
		button_5.setMargin(new Insets(0, 0, 0, 0));
		button_5.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_5);
		
		JButton button_6 = new JButton("/");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setPreferredSize(new Dimension(49, 40));
		button_6.setMargin(new Insets(0, 0, 0, 0));
		button_6.setFont(new Font("Dialog", Font.BOLD, 22));
		panel.add(button_6);
		
		JButton button_7 = new JButton("\uFF05");
		button_7.setPreferredSize(new Dimension(49, 40));
		button_7.setMargin(new Insets(0, 0, 0, 0));
		button_7.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_7);
		
		JButton button_8 = new JButton("4");
		button_8.setPreferredSize(new Dimension(49, 40));
		button_8.setMargin(new Insets(0, 0, 0, 0));
		button_8.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_8);
		
		JButton button_9 = new JButton("5");
		button_9.setPreferredSize(new Dimension(49, 40));
		button_9.setMargin(new Insets(0, 0, 0, 0));
		button_9.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_9);
		
		JButton button_10 = new JButton(" 6");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_10.setPreferredSize(new Dimension(49, 40));
		button_10.setMargin(new Insets(0, 0, 0, 0));
		button_10.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.setPreferredSize(new Dimension(49, 40));
		button_11.setMargin(new Insets(0, 0, 0, 0));
		button_11.setFont(new Font("Dialog", Font.BOLD, 20));
		panel.add(button_11);
		
		JButton btnx = new JButton(" 1/x");
		btnx.setPreferredSize(new Dimension(49, 40));
		btnx.setMargin(new Insets(0, 0, 0, 0));
		btnx.setFont(new Font("¿¬Ìå", Font.BOLD, 16));
		panel.add(btnx);
		
		JButton button_14 = new JButton("1");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_14.setPreferredSize(new Dimension(49, 40));
		button_14.setMargin(new Insets(0, 0, 0, 0));
		button_14.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_14);
		
		JButton button_18 = new JButton("2");
		button_18.setPreferredSize(new Dimension(49, 40));
		button_18.setMargin(new Insets(0, 0, 0, 0));
		button_18.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_18);
		
		JButton button_15 = new JButton("3");
		button_15.setPreferredSize(new Dimension(49, 40));
		button_15.setMargin(new Insets(0, 0, 0, 0));
		button_15.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_15);
		
		JButton button_13 = new JButton("-");
		button_13.setPreferredSize(new Dimension(49, 40));
		button_13.setMargin(new Insets(0, 0, 0, 0));
		button_13.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_13);
		
		JButton button_17 = new JButton("0");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button_16 = new JButton("+");
		button_16.setPreferredSize(new Dimension(49, 40));
		button_16.setMargin(new Insets(0, 0, 0, 0));
		button_16.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_16);
		button_17.setPreferredSize(new Dimension(103, 40));
		button_17.setMargin(new Insets(0, 0, 0, 0));
		button_17.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_17);
		
		JButton button_19 = new JButton(".");
		button_19.setPreferredSize(new Dimension(49, 40));
		button_19.setMargin(new Insets(0, 0, 0, 0));
		button_19.setFont(new Font("Dialog", Font.BOLD, 22));
		panel.add(button_19);
		
		JButton button_20 = new JButton("=");
		button_20.setPreferredSize(new Dimension(102, 40));
		button_20.setMargin(new Insets(0, 0, 0, 0));
		button_20.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(button_20);
	}

}
