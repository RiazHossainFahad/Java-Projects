import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Fool1 extends JFrame implements MouseListener,ActionListener
{
	private JLabel labelText,labelTextYes;
	private JButton backButton,exitButton;
	private JPanel panel;
	
	public Fool1(){
		super("Fool Game");
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		labelText=new JLabel("Are You a Fool? ");
		labelText.setBounds(100,10,200,30);
		labelText.setFont(new Font(null,Font.ITALIC+Font.BOLD,25));
		labelText.setBackground(Color.BLACK);
		labelText.setForeground(Color.BLUE);
		labelText.addMouseListener(this);
		labelText.setOpaque(true);
		panel.add(labelText);
		
		labelTextYes=new JLabel("OOPS!!!You are a Fool ");
		labelTextYes.setBounds(80,100,300,30);
		labelTextYes.setFont(new Font(null,Font.ITALIC,25));
		labelTextYes.setBackground(Color.BLACK);
		labelTextYes.setForeground(Color.BLUE);
		labelTextYes.setOpaque(true);
		panel.add(labelTextYes);
		
		backButton=new JButton("BACK");
		backButton.setBounds(120,160,80,30);
		backButton.setBackground(Color.GREEN);
		backButton.setForeground(Color.WHITE);
		backButton.addMouseListener(this);
		backButton.addActionListener(this);
		panel.add(backButton);
		
		exitButton=new JButton("EXIT");
		exitButton.setBounds(220,160,80,30);
		exitButton.setBackground(Color.RED);
		exitButton.setForeground(Color.WHITE);
		exitButton.addMouseListener(this);
		exitButton.addActionListener(this);
		panel.add(exitButton);
		
		this.add(panel);
	}
	
	public Fool1(int a){
		super("Fool Game");
		setIconImage(new ImageIcon(getClass().getResource("fool.jpg")).getImage());
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		labelText=new JLabel("Are You a Fool? ");
		labelText.setBounds(100,10,200,30);
		labelText.setFont(new Font(null,Font.ITALIC+Font.BOLD,25));
		labelText.setBackground(Color.BLACK);
		labelText.setForeground(Color.BLUE);
		labelText.addMouseListener(this);
		labelText.setOpaque(true);
		panel.add(labelText);
		
		labelTextYes=new JLabel("You Are a Genius");
		labelTextYes.setBounds(100,100,250,30);
		labelTextYes.setFont(new Font(null,Font.BOLD,25));
		labelTextYes.setBackground(Color.BLACK);
		labelTextYes.setForeground(Color.BLUE);
		labelTextYes.setOpaque(true);
		panel.add(labelTextYes);
		
		backButton=new JButton("BACK");
		backButton.setBounds(120,160,80,30);
		backButton.setBackground(Color.GREEN);
		backButton.setForeground(Color.WHITE);
		backButton.addMouseListener(this);
		backButton.addActionListener(this);
		panel.add(backButton);
		
		exitButton=new JButton("EXIT");
		exitButton.setBounds(220,160,80,30);
		exitButton.setBackground(Color.RED);
		exitButton.setForeground(Color.WHITE);
		exitButton.addMouseListener(this);
		exitButton.addActionListener(this);
		panel.add(exitButton);
		
		this.add(panel);
		
	}
	
	public void mouseEntered(MouseEvent me){
		if(me.getSource().equals(backButton)){
			backButton.setBackground(Color.MAGENTA);
		}
		else if(me.getSource().equals(exitButton)){
			exitButton.setBackground(Color.MAGENTA);
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource().equals(backButton)){
			backButton.setBackground(Color.GREEN);
		}
		else if(me.getSource().equals(exitButton)){
			exitButton.setBackground(Color.RED);
		}
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	public void actionPerformed(ActionEvent ae){
		String elementText=ae.getActionCommand();
		if(elementText.equals(backButton.getText())){
			Fool f=new Fool();
			f.setVisible(true);
			this.setVisible(false);
			
		}
		else if(elementText.equals(exitButton.getText())){
			
			System.exit(0);
		}
		else {}
	}
}