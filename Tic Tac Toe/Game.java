import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Game extends JFrame implements MouseListener,ActionListener{
	
	private JLabel mark,playerMove,iconLabel,playerLabel,winner;
	private JComboBox selectIcon;
	private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,restart,exit;
	private JPanel panel;
	private ButtonGroup group;
	private String player,icon,icon2,player2,pw1p,pw1i,pw2p,pw2i;
	private int flag=0;
	
	public Game(String player,String icon){
		super("Tic Tac Toe");
		this.setSize(600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.player=player;
		this.icon=icon;
		this.pw1p=player;
		this.pw1i=icon;
		setPw2();
		
		panel=new JPanel();
		panel.setBackground(Color.cyan);
		panel.setLayout(null);
		
		playerMove=new JLabel(" will make Move Now");
		playerMove.setBounds(400,40,240,30);
		playerMove.setBackground(Color.cyan);
		playerMove.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		playerMove.setForeground(Color.BLUE);
		playerMove.setOpaque(true);
		panel.add(playerMove);
		
		playerLabel=new JLabel(player);
		playerLabel.setBounds(340,40,60,30);
		playerLabel.setBackground(Color.cyan);
		playerLabel.setOpaque(true);
		playerLabel.setForeground(Color.RED);
		playerLabel.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		panel.add(playerLabel);
		
		iconLabel=new JLabel(icon);
		iconLabel.setBounds(430,90,50,30);
		iconLabel.setBackground(Color.cyan);
		iconLabel.setOpaque(true);
		iconLabel.setForeground(Color.RED);
		iconLabel.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		panel.add(iconLabel);
		
		mark=new JLabel("Mark is: ");
		mark.setBounds(350,90,200,30);
		mark.setBackground(Color.cyan);
		mark.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		mark.setForeground(Color.BLUE);
		mark.setOpaque(true);
		panel.add(mark);
		
		winner=new JLabel("Winner: ");
		winner.setBounds(350,130,200,30);
		winner.setBackground(Color.cyan);
		winner.setOpaque(true);
		winner.setFont(new Font("Comic Sans MS",Font.BOLD,16));
		winner.setForeground(Color.BLUE);
		panel.add(winner);
		
		restart=new JButton("Restart");
		restart.setBounds(320,200,130,40);
		restart.setBackground(Color.YELLOW);
		restart.setFont(new Font("SERIF",Font.BOLD,20));
		restart.addActionListener(this);
		restart.addMouseListener(this);
		panel.add(restart);
		
		exit=new JButton("Exit");
		exit.setBounds(320,260,130,40);
		exit.setBackground(Color.RED);
		exit.setFont(new Font("SERIF",Font.BOLD,20));
		exit.addActionListener(this);
		exit.addMouseListener(this);
		panel.add(exit);
		
		button1=new JButton("1");
		button1.setBounds(20,30,80,80);
		button1.setBackground(Color.GREEN);
		button1.setForeground(Color.RED);
		button1.setFont(new Font("SERIF",Font.BOLD,45));
		button1.addActionListener(this);
		panel.add(button1);
		
		button2=new JButton("2");
		button2.setBounds(110,30,80,80);
		button2.setBackground(Color.GREEN);
		button2.setForeground(Color.RED);
		button2.setFont(new Font("SERIF",Font.BOLD,45));
		button2.addActionListener(this);
		panel.add(button2);
		
		button3=new JButton("3");
		button3.setBounds(200,30,80,80);
		button3.setBackground(Color.GREEN);
		button3.setForeground(Color.RED);
		button3.setFont(new Font("SERIF",Font.BOLD,45));
		button3.addActionListener(this);
		panel.add(button3);
		
		button4=new JButton("4");
		button4.setBounds(20,120,80,80);
		button4.setBackground(Color.GREEN);
		button4.setForeground(Color.RED);
		button4.setFont(new Font("SERIF",Font.BOLD,45));
		button4.addActionListener(this);
		panel.add(button4);
		
		button5=new JButton("5");
		button5.setBounds(110,120,80,80);
		button5.setBackground(Color.GREEN);
		button5.setForeground(Color.RED);
		button5.setFont(new Font("SERIF",Font.BOLD,45));
		button5.addActionListener(this);
		panel.add(button5);
		
		button6=new JButton("6");
		button6.setBounds(200,120,80,80);
		button6.setBackground(Color.GREEN);
		button6.setForeground(Color.RED);
		button6.setFont(new Font("SERIF",Font.BOLD,45));
		button6.addActionListener(this);
		panel.add(button6);
		
		button7=new JButton("7");
		button7.setBounds(20,210,80,80);
		button7.setBackground(Color.GREEN);
		button7.setForeground(Color.RED);
		button7.setFont(new Font("SERIF",Font.BOLD,45));
		button7.addActionListener(this);
		panel.add(button7);
		
		button8=new JButton("8");
		button8.setBounds(110,210,80,80);
		button8.setBackground(Color.GREEN);
		button8.setForeground(Color.RED);
		button8.setFont(new Font("SERIF",Font.BOLD,45));
		button8.addActionListener(this);
		panel.add(button8);
		
		button9=new JButton("9");
		button9.setBounds(200,210,80,80);
		button9.setBackground(Color.GREEN);
		button9.setForeground(Color.RED);
		button9.setFont(new Font("SERIF",Font.BOLD,45));
		button9.addActionListener(this);
		panel.add(button9);
		
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource().equals(restart)){
			restart.setBackground(Color.GREEN);
		}
		else if(me.getSource().equals(exit)){
			exit.setBackground(Color.PINK);
		}
		
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource().equals(restart)){
			restart.setBackground(Color.YELLOW);
		}
		else if(me.getSource().equals(exit)){
			exit.setBackground(Color.RED);
		}
		
	}
	
	public void setIcon(String p,String i){
		if(i.equals("X")&&p.equals("Player1")){this.icon="0";this.player="Player2";}
		else if(i.equals("0")&&p.equals("Player1")){this.icon="X";this.player="Player2";}
		else if(i.equals("X")&&p.equals("Player2")){this.icon="0";this.player="Player1";}
		else if(i.equals("0")&&p.equals("Player2")){this.icon="X";this.player="Player1";}
		else{}
	}
	
	public void setPw2(){
		if(pw1i.equals("X")&&pw1p.equals("Player1")){this.pw2i="0";this.pw2p="Player2";}
		else if(pw1i.equals("0")&&pw1p.equals("Player1")){this.pw2i="X";this.pw2p="Player2";}
		else if(pw1i.equals("X")&&pw1p.equals("Player2")){this.pw2i="0";this.pw2p="Player1";}
		else if(pw1i.equals("0")&&pw1p.equals("Player2")){this.pw2i="X";this.pw2p="Player1";}
		else{}
		
	}
	
	public void checkWinner(){
		String s1,s2,s3,s4,s5,s6,s7,s8,s9;
		s1=button1.getText();
		s2=button2.getText();
		s3=button3.getText();
		s4=button4.getText();
		s5=button5.getText();
		s6=button6.getText();
		s7=button7.getText();
		s8=button8.getText();
		s9=button9.getText();
		
		if(s1.equals(s2)&&s1.equals(s3)){
			if(s1.equals(pw1i)){
				winner.setText("Winner: "+pw1p);
				flag=9;
			}
			else if(s1.equals(pw2i)){
				winner.setText("Winner: "+pw2p);
				flag=9;
			}
		}
		else if(s1.equals(s4)&&s1.equals(s7)){
			if(s1.equals(pw1i)){
				winner.setText("Winner: "+pw1p);
				flag=9;
			}
			else if(s1.equals(pw2i)){
				winner.setText("Winner: "+pw2p);
				flag=9;
			}
		}
		else if(s1.equals(s5)&&s1.equals(s9)){
			if(s1.equals(pw1i)){
				winner.setText("Winner: "+pw1p);
				flag=9;
			}
			else if(s1.equals(pw2i)){
				winner.setText("Winner: "+pw2p);
				flag=9;
			}
		}
		
		else if(s2.equals(s5)&&s2.equals(s8)){
			if(s2.equals(pw1i)){
				winner.setText("Winner: "+pw1p);
				flag=9;
			}
			else if(s2.equals(pw2i)){
				winner.setText("Winner: "+pw2p);
				flag=9;
			}
		}
		else if(s3.equals(s6)&&s3.equals(s9)){
			if(s3.equals(pw1i)){
				winner.setText("Winner: "+pw1p);
				flag=9;
			}
			else if(s3.equals(pw2i)){
				winner.setText("Winner: "+pw2p);
				flag=9;
			}
		}
		else if(s3.equals(s5)&&s3.equals(s7)){
			if(s3.equals(pw1i)){
				winner.setText("Winner: "+pw1p);
				flag=9;
			}
			else if(s3.equals(pw2i)){
				winner.setText("Winner: "+pw2p);
				flag=9;
			}
		}
		else if(s4.equals(s5)&&s4.equals(s6)){
			if(s4.equals(pw1i)){
				winner.setText("Winner: "+pw1p);
				flag=9;
			}
			else if(s4.equals(pw2i)){
				winner.setText("Winner: "+pw2p);
				flag=9;
			}
		}
		else if(s7.equals(s8)&&s7.equals(s9)){
			if(s7.equals(pw1i)){
				winner.setText("Winner: "+pw1p);
				flag=9;
			}
			else if(s7.equals(pw2i)){
				winner.setText("Winner: "+pw2p);
				flag=9;
			}
		}
		
		else{
			flag++;
			if(flag==9){
			winner.setText("Winner: Draw");	
			}
			
			
		}
		
	}
	
	public void actionPerformed(ActionEvent ae){
		
		String iconText=iconLabel.getText();
		String playerText=playerLabel.getText();
		String elementText=ae.getActionCommand();
		
		if(elementText.equals(button1.getText())&&flag!=9){
			if((button1.getText())!="0"&&(button1.getText())!="X"){
			button1.setText(iconText);
			playerLabel.setText(playerText);
			this.checkWinner();
			this.setIcon(player,icon);
			playerLabel.setText(player);
			iconLabel.setText(icon);
		}
		}
		
		else if(elementText.equals(button2.getText())&&flag!=9){
			if((button2.getText())!="0"&&(button2.getText())!="X"){
			button2.setText(iconText);
			playerLabel.setText(playerText);
			this.checkWinner();
			this.setIcon(player,icon);
			playerLabel.setText(player);
			iconLabel.setText(icon);
		}
		}
		
		else if(elementText.equals(button3.getText())&&flag!=9){
			if((button3.getText())!="0"&&(button3.getText())!="X"){
			button3.setText(iconText);
			playerLabel.setText(playerText);
			this.checkWinner();
			this.setIcon(player,icon);
			playerLabel.setText(player);
			iconLabel.setText(icon);
		}
		}
		
		else if(elementText.equals(button4.getText())&&flag!=9){
			if((button4.getText())!="0"&&(button4.getText())!="X"){
			button4.setText(iconText);
			playerLabel.setText(playerText);
			this.checkWinner();
			this.setIcon(player,icon);
			playerLabel.setText(player);
			iconLabel.setText(icon);
		}
		}
		
		else if(elementText.equals(button5.getText())&&flag!=9){
			if((button5.getText())!="0"&&(button5.getText())!="X"){
			button5.setText(iconText);
			playerLabel.setText(playerText);
			this.checkWinner();
			this.setIcon(player,icon);
			playerLabel.setText(player);
			iconLabel.setText(icon);
		}
		}
		
		else if(elementText.equals(button6.getText())&&flag!=9){
			if((button6.getText())!="0"&&(button6.getText())!="X"){
			button6.setText(iconText);
			playerLabel.setText(playerText);
			this.checkWinner();
			this.setIcon(player,icon);
			playerLabel.setText(player);
			iconLabel.setText(icon);
		}
		}
		
		else if(elementText.equals(button7.getText())&&flag!=9){
			if((button7.getText())!="0"&&(button7.getText())!="X"){
			button7.setText(iconText);
			playerLabel.setText(playerText);
			this.checkWinner();
			this.setIcon(player,icon);
			playerLabel.setText(player);
			iconLabel.setText(icon);
		}
		}
		
		else if(elementText.equals(button8.getText())&&flag!=9){
			if((button8.getText())!="0"&&(button8.getText())!="X"){
			button8.setText(iconText);
			playerLabel.setText(playerText);
			this.checkWinner();
			this.setIcon(player,icon);
			playerLabel.setText(player);
			iconLabel.setText(icon);
		}
		}
		
		else if(elementText.equals(button9.getText())&&flag!=9){
			if((button9.getText())!="0"&&(button9.getText())!="X"){
			button9.setText(iconText);
			playerLabel.setText(playerText);
			this.checkWinner();
			this.setIcon(player,icon);
			playerLabel.setText(player);
			iconLabel.setText(icon);
		}
		}
	
	else if(elementText.equals(restart.getText())){
		Game g1=new Game(pw1p,pw1i);
		g1.setVisible(true);
		this.setVisible(false);
	}
	
	else if(elementText.equals(exit.getText())){
		System.exit(0);
	}
	}
	
}

