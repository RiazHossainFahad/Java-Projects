import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GamePage extends JFrame implements MouseListener,ActionListener,Runnable {
	
	private JLabel labelText;
	private JButton restart,exit;
	private JPanel panel;
	private JButton Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9,Button10;
	private int score,flag=0;
	
	public GamePage(){
		super("Click N Score");
		this.setSize(400,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		
		labelText=new JLabel("Your Score: "+score);
		labelText.setBounds(80,20,280,30);
		labelText.setForeground(Color.BLUE);
		labelText.setFont(new Font("DIALOG",Font.BOLD,20));
		labelText.addMouseListener(this);
		panel.add(labelText);
		
		Button1=new JButton("1");
		Button1.setBounds(40,80,100,40);
		Button1.addMouseListener(this);
		Button1.setBackground(Color.RED);
		Button1.addActionListener(this);
		panel.add(Button1);
		
		Button2=new JButton("2");
		Button2.setBounds(40,130,100,40);
		Button2.setBackground(Color.RED);
		Button2.addMouseListener(this);
		Button2.addActionListener(this);
		panel.add(Button2);
		
		Button3=new JButton("3");
		Button3.setBounds(40,180,100,40);
		Button3.setBackground(Color.RED);
		Button3.addMouseListener(this);
		Button3.addActionListener(this);
		panel.add(Button3);
		
		Button4=new JButton("4");
		Button4.setBounds(40,230,100,40);
		Button4.setBackground(Color.RED);
		Button4.addMouseListener(this);
		Button4.addActionListener(this);
		panel.add(Button4);
		
		Button5=new JButton("5");
		Button5.setBounds(40,280,100,40);
		Button5.setBackground(Color.RED);
		Button5.addMouseListener(this);
		Button5.addActionListener(this);
		panel.add(Button5);
		
		Button6=new JButton("6");
		Button6.setBounds(170,80,100,40);
		Button6.setBackground(Color.RED);
		Button6.addActionListener(this);
		panel.add(Button6);
		
		Button7=new JButton("7");
		Button7.setBounds(170,130,100,40);
		Button7.setBackground(Color.RED);
		Button7.addMouseListener(this);
		Button7.addActionListener(this);
		panel.add(Button7);
		
		Button8=new JButton("8");
		Button8.setBounds(170,180,100,40);
		Button8.setBackground(Color.RED);
		Button8.addMouseListener(this);
		Button8.addActionListener(this);
		panel.add(Button8);
		
		Button9=new JButton("9");
		Button9.setBounds(170,230,100,40);
		Button9.setBackground(Color.RED);
		Button9.addMouseListener(this);
		Button9.addActionListener(this);
		panel.add(Button9);
		
		Button10=new JButton("10");
		Button10.setBounds(170,280,100,40);
		Button10.setBackground(Color.RED);
		Button10.addMouseListener(this);
		Button10.addActionListener(this);
		panel.add(Button10);
		
		exit=new JButton("Exit");
		exit.setBounds(60,360,200,35);
		exit.setBackground(Color.RED);
		exit.setFont(new Font("DIALOG",Font.BOLD,15));
		exit.addMouseListener(this);
		exit.addActionListener(this);
		panel.add(exit);
		
		this.add(panel);	
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource().equals(exit)){
			exit.setBackground(Color.WHITE);
		}
	}
	public void mouseExited(MouseEvent me){
		 if(me.getSource().equals(exit)){
			exit.setBackground(Color.RED);
		}	
	}
	
	public void actionPerformed(ActionEvent ae){
		Color c=Color.GREEN;
		String elementText=ae.getActionCommand();
		if(elementText.equals(exit.getText())){
			System.exit(0);
		}
		else if(flag==0&&elementText.equals(Button1.getText())&&c.equals(Button1.getBackground())){
		score=score+10;
		labelText.setText("Your Score is: "+score);
		}
		else if(flag==0&&elementText.equals(Button2.getText())&&c.equals(Button2.getBackground())){
		score=score+10;
		labelText.setText("Your Score is: "+score);
		}
		else if(flag==0&&elementText.equals(Button3.getText())&&c.equals(Button3.getBackground())){
		score=score+10;
		labelText.setText("Your Score is: "+score);
		}
		else if(flag==0&&elementText.equals(Button4.getText())&&c.equals(Button4.getBackground())){
		score=score+10;
		labelText.setText("Your Score is: "+score);
		}
		else if(flag==0&&elementText.equals(Button5.getText())&&c.equals(Button5.getBackground())){
		score=score+10;
		labelText.setText("Your Score is: "+score);
		}
		else if(flag==0&&elementText.equals(Button6.getText())&&c.equals(Button6.getBackground())){
		score=score+10;
		labelText.setText("Your Score is: "+score);
		}
		else if(flag==0&&elementText.equals(Button7.getText())&&c.equals(Button7.getBackground())){
		score=score+10;
		labelText.setText("Your Score is: "+score);
		}
		else if(flag==0&&elementText.equals(Button8.getText())&&c.equals(Button8.getBackground())){
		score=score+10;
		labelText.setText("Your Score is: "+score);
		}
		else if(flag==0&&elementText.equals(Button9.getText())&&c.equals(Button9.getBackground())){
		score=score+10;
		labelText.setText("Your Score is: "+score);
		}
		else if(flag==0&&elementText.equals(Button10.getText())&&c.equals(Button10.getBackground())){
		score=score+10;
		labelText.setText("Your Score is: "+score);
		}
		else if(flag==0){
		score=score-10;
		labelText.setText("Your Score is: "+score);
		}
	}
	
	public void run(){
		Random r=new Random();
		
		int x=0;
		for(int i=0;i<10;i++){
			x=r.nextInt(9);
			System.out.println(x);
		if(x==1){
			Button1.setBackground(Color.GREEN);
		}
		else if(x==2){
			Button2.setBackground(Color.GREEN);
		}
		else if(x==3){
			Button3.setBackground(Color.GREEN);
		}
		else if(x==4){
			Button4.setBackground(Color.GREEN);
		}
		else if(x==5){
			Button5.setBackground(Color.GREEN);
		}
		else if(x==6){
			Button6.setBackground(Color.GREEN);
		}
		else if(x==7){
			Button7.setBackground(Color.GREEN);
		}
		else if(x==8){
			Button8.setBackground(Color.GREEN);
		}
		else if(x==9){
			Button2.setBackground(Color.GREEN);
		}
		else{
			Button10.setBackground(Color.GREEN);
		}
		try{
			Thread.sleep(2000);
		if(x==1){
			Button1.setBackground(Color.RED);
		}
		else if(x==2){
			Button2.setBackground(Color.RED);
		}
		else if(x==3){
			Button3.setBackground(Color.RED);
		}
		else if(x==4){
			Button4.setBackground(Color.RED);
		}
		else if(x==5){
			Button5.setBackground(Color.RED);
		}
		else if(x==6){
			Button6.setBackground(Color.RED);
		}
		else if(x==7){
			Button7.setBackground(Color.RED);
		}
		else if(x==8){
			Button8.setBackground(Color.RED);
		}
		else if(x==9){
			Button9.setBackground(Color.RED);
		}
		else {
			Button10.setBackground(Color.RED);
		}
		}
			catch(Exception e){}
		}
		flag=1;
	}
}