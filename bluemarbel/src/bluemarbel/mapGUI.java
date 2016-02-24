package bluemarbel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.*;

public class mapGUI extends JFrame implements ActionListener{

	private JPanel panel_main;
	private JPanel panel_center;
	private JPanel panel_list;
	private JTextArea diceArea;
	private JTextArea userArea;
	private JLabel []label_list=new JLabel[10];
	private JButton button_rolling=new JButton("Roll");
	private JButton []button_city=new JButton[16];
	
	public void makingGUI()
	{
		setButton();
		setTextArea();
		setPanel();
		setLabel();
		makingMap();
		this.add(panel_main,BorderLayout.CENTER);
		this.add(panel_list,BorderLayout.EAST);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 392);
		setVisible(true);
	}
	private void makingMap()
	{
		panel_main.add(button_city[4]);
		panel_main.add(button_city[5]);
		panel_main.add(button_city[6]);
		panel_main.add(button_city[7]);
		panel_main.add(button_city[8]);
		////////////////////////////////////////////////////////
		panel_main.add(button_city[3]);
		panel_main.add(label_list[0]);
		panel_main.add(label_list[1]);
		panel_main.add(label_list[2]);
		panel_main.add(button_city[9]);
		////////////////////////////////////////////////////////
		panel_main.add(button_city[2]);
		panel_main.add(label_list[3]);
		panel_main.add(panel_center);
		panel_main.add(label_list[4]);
		panel_main.add(button_city[10]);
		///////////////////////////////////////////////////////
		panel_main.add(button_city[1]);
		panel_main.add(label_list[5]);
		panel_main.add(label_list[6]);
		panel_main.add(label_list[7]);
		panel_main.add(button_city[11]);
		/////////////////////////////////////////////////////////
		panel_main.add(button_city[0]);
		panel_main.add(button_city[15]);
		panel_main.add(button_city[14]);
		panel_main.add(button_city[13]);
		panel_main.add(button_city[12]);
	}
	private void setButton()
	{
		for(int i=0;i<16;i++) {
			button_city[i]=new JButton("City"+i);
			button_city[i].addActionListener(this);
			button_city[i].setBackground(Color.WHITE);
		}
		button_rolling.addActionListener(this);
		
	}
	private void setPanel() {
		panel_main = new JPanel();
		panel_main.setLayout(new GridLayout(5,5));
		panel_center=new JPanel();
		panel_center.setLayout(new GridLayout(2,1));
		panel_center.add(diceArea);
		panel_center.add(button_rolling);
		panel_list=new JPanel();
		panel_list.add(userArea);
	}
	private void setLabel()
	{
		for(int i=0;i<10;i++) {
			label_list[i]=new JLabel("");
			label_list[i].enable(false);
		}
	}
	private void setTextArea() {
		diceArea = new JTextArea();
		diceArea.setEnabled(false);
		diceArea.setDisabledTextColor(Color.BLACK);
		diceArea.setAlignmentX(Component.CENTER_ALIGNMENT);
		diceArea.setAlignmentY(Component.CENTER_ALIGNMENT);
		userArea=new JTextArea();
		userArea.setText(" User List ");
	}	
	/*
	public void setController(guiController control)
	{
		this.gui_control=control;
	}
	*/
	public void turnMessage(String string) {
		// TODO Auto-generated method stub
		diceArea.setText(string);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		CityInfoGUI cityinfoGUI=new CityInfoGUI();
		
	}
	public void setLocation(int number)
	{
		//button[number].
		
	}
	public void setButtonColor(int location, Color color) {
		button_city[location].setBackground(color);	
	}
}
