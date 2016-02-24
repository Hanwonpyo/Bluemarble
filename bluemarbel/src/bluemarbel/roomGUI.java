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

public class roomGUI extends JFrame implements ActionListener{

	private JPanel panel_main=new JPanel();
	private JPanel panel_list=new JPanel();
	private JTextArea area_user=new JTextArea();
	private JButton button_start=new JButton("Start");
	
	roomGUI()
	{
		setPanel();
		setButton();
		setTextArea();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 392);
		setVisible(true);
	}
	private void setButton()
	{
		this.add(button_start,BorderLayout.SOUTH);
	}
	private void setPanel()
	{
		JLabel temp = new JLabel(new ImageIcon("bluemarble.jpg"));
		panel_main.add(temp);
		this.add(panel_main,BorderLayout.CENTER);
	}
	private void setTextArea()
	{
		area_user.setText("  User List  ");
		this.add(area_user,BorderLayout.EAST);
	}	
	public void appendMessage(String name)
	{
		// TODO Auto-generated method stub
		area_user.setText(name+"\n");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}	
