import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class HomePage extends JFrame implements MouseListener,ActionListener{
	
	private JLabel labelText,icon,playerLevel;
	private JButton startGame,exitGame;
	private JComboBox selectIcon;
	private JRadioButton player11,player22;
	private JPanel panel;
	private ButtonGroup group;
	
	public HomePage(){
		super("Tic Tac Toe");
		this.setSize(600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setLayout(null);
		
		labelText=new JLabel("Tic Tac Toe ");
		labelText.setBounds(150,80,180,30);
		labelText.setForeground(Color.BLUE);
		labelText.setFont(new Font("DIALOG",Font.BOLD,30));
		panel.add(labelText);
		
		playerLevel=new JLabel(" Which Player Are You?");
		playerLevel.setBounds(140,200,220,30);
		playerLevel.setForeground(Color.BLACK);
		playerLevel.setBackground(Color.CYAN);
		playerLevel.setOpaque(true);
		playerLevel.setFont(new Font("DIALOG",Font.PLAIN,20));
		panel.add(playerLevel);
		
		player11=new JRadioButton("Player1");
		player11.setBounds(150,250,100,30);
		player11.setBackground(Color.CYAN);
		player11.setForeground(Color.BLUE);
		player11.setFont(new Font("DIALOG",Font.PLAIN,20));
		panel.add(player11);
		
		player22=new JRadioButton("Player2");
		player22.setBounds(260,250,100,30);
		player22.setBackground(Color.CYAN);
		player22.setForeground(Color.BLUE);
		player22.setFont(new Font("DIALOG",Font.PLAIN,20));
		panel.add(player22);
		
		group=new ButtonGroup();
		group.add(player11);
		group.add(player22);
		
		icon=new JLabel("Choose Your Mark: ");
		icon.setBounds(150,320,180,30);
		icon.setForeground(Color.BLACK);
		icon.setBackground(Color.CYAN);
		icon.setOpaque(true);
		icon.setFont(new Font("DIALOG",Font.PLAIN,20));
		panel.add(icon);
		
		String []s={"X","0"};
		selectIcon=new JComboBox(s);
		selectIcon.setBounds(340,320,60,30);
		selectIcon.setForeground(Color.BLUE);
		selectIcon.setFont(new Font("DIALOG",Font.PLAIN,15));
		panel.add(selectIcon);
		
		startGame=new JButton("Start Game");
		startGame.setBounds(150,380,115,40);
		startGame.setBackground(Color.GREEN);
		startGame.setFont(new Font("DIALOG",Font.BOLD,15));
		startGame.addMouseListener(this);
		startGame.addActionListener(this);
		panel.add(startGame);
		
		exitGame=new JButton("Exit Game");
		exitGame.setBounds(290,380,115,40);
		exitGame.setBackground(Color.RED);
		exitGame.setFont(new Font("DIALOG",Font.BOLD,15));
		exitGame.addMouseListener(this);
		exitGame.addActionListener(this);
		panel.add(exitGame);
		
		this.add(panel);	
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource().equals(startGame)){
			startGame.setBackground(Color.yellow);
		}
		else if(me.getSource().equals(exitGame)){
			exitGame.setBackground(Color.yellow);
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource().equals(startGame)){
			startGame.setBackground(Color.GREEN);
		}
		else if(me.getSource().equals(exitGame)){
			exitGame.setBackground(Color.RED);
		}	
	}
	
	public void actionPerformed(ActionEvent ae){
		String elementtext=ae.getActionCommand();
		if(elementtext.equals(startGame.getText())){
			String s1="",s2;
			if(player11.isSelected()){s1=player11.getText();}
			else if(player22.isSelected()){s1=player22.getText();}
			else {JOptionPane.showMessageDialog(this,"Choose which Player you are!!");}
			s2=selectIcon.getSelectedItem().toString();
			if(s1!=""){
			Game g=new Game(s1,s2);
			g.setVisible(true);
			this.setVisible(false);}	
		}
		else if(elementtext.equals(exitGame.getText())){
			System.exit(0);
			

		}
	}
}