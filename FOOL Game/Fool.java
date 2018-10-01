import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Fool extends JFrame implements MouseListener,ActionListener,FocusListener
{
	private JLabel labelText;
	private JButton yesButton,noButton;
	private JPanel panel;
	
	public Fool(){
		super("Fool Game");
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		
		labelText=new JLabel("Are You a Fool? ");
		labelText.setBounds(100,100,200,30);
		labelText.setFont(new Font(null,Font.ITALIC+Font.BOLD,25));
		labelText.setBackground(Color.BLACK);
		labelText.setForeground(Color.BLUE);
		labelText.addMouseListener(this);
		labelText.setOpaque(true);
		panel.add(labelText);
		
		yesButton=new JButton("YES");
		yesButton.setBounds(120,160,60,30);
		yesButton.setBackground(Color.GREEN);
		yesButton.setForeground(Color.RED);
		yesButton.addMouseListener(this);
		yesButton.addActionListener(this);
		panel.add(yesButton);
		
		noButton=new JButton("NO");
		noButton.setBounds(200,160,60,30);
		noButton.setBackground(Color.RED);
		noButton.setForeground(Color.WHITE);
		noButton.addMouseListener(this);
		noButton.addActionListener(this);
		noButton.addFocusListener(this);
		panel.add(noButton);
		
		this.add(panel);
	}
	public void mouseEntered(MouseEvent me){
		if(me.getSource().equals(yesButton)){
			yesButton.setBackground(Color.MAGENTA);
		}
		else if(me.getSource().equals(noButton)){
			noButton.setBackground(Color.MAGENTA);
			Random r=new Random();
			int x=r.nextInt(350);
			int y=r.nextInt(150);
			noButton.setBounds(x,y,60,30);
		}
		
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource().equals(yesButton))
		{
			yesButton.setBackground(Color.GREEN);
		}
		else if(me.getSource().equals(noButton))
		{
			noButton.setBackground(Color.RED);
		}
		
	}
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	public void actionPerformed(ActionEvent ae){
		String elementText=ae.getActionCommand();
		if(elementText.equals(yesButton.getText())){
			Fool1 f1=new Fool1();
			f1.setVisible(true);
			this.setVisible(false);
		}
		else if(elementText.equals(noButton.getText())){
		}
	}
	
	public void focusLost(FocusEvent fe){}
	public void focusGained(FocusEvent fe){
		if(fe.getSource().equals(noButton)){
		Fool1 f2=new Fool1(1);
		f2.setVisible(true);
		this.setVisible(false);
		}
	}
}