package br.edu.univas.exerc.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaDaProva  extends  JFrame {


	private static final long serialVersionUID = -5487941854826955215L;
	private JPanel contentPane  =  null ;
	
	public  TelaDaProva () {
		this . setTitle ( " Aprendendo Swing " );
		this . setSize ( 500 , 420 );
		this . setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
		this . setLocationRelativeTo ( null );
		addComponents ();
	}
	public void addComponents(){
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		this.setContentPane(contentPane);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.darkGray);
		westPanel.setPreferredSize(new Dimension(130,0));
		contentPane.add(westPanel, BorderLayout.WEST);
 


		JButton Bot�o1 = new JButton();
		Bot�o1.setText("Bot�o1");
		Bot�o1.setPreferredSize(new Dimension(100,20));
		ButtonListener button = new ButtonListener();
		Bot�o1.addActionListener(button);
		westPanel.add(Bot�o1);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o2 = new JButton();
		Bot�o2.setText("Bot�o2");
		Bot�o2.setPreferredSize(new Dimension(100,20));
		westPanel.add(Bot�o2);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o3 = new JButton();
		Bot�o3.setText("Bot�o3");
		Bot�o3.setPreferredSize(new Dimension(100,20));
		westPanel.add(Bot�o3);
		contentPane.add(westPanel, BorderLayout.WEST);
		 
		JButton Bot�o4 = new JButton();
		Bot�o4.setText("Bot�o4");
		Bot�o4.setPreferredSize(new Dimension(100,20));
		westPanel.add(Bot�o4);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o5 = new JButton();
		Bot�o5.setText("Bot�o5");
		Bot�o5.setPreferredSize(new Dimension(100,20));
		westPanel.add(Bot�o5);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o6 = new JButton();
		Bot�o6.setText("Bot�o6");
		Bot�o6.setPreferredSize(new Dimension(100,20));
		westPanel.add(Bot�o6);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o7 = new JButton();
		Bot�o7.setText("Bot�o7");
		Bot�o7.setPreferredSize(new Dimension(100,20));
		westPanel.add(Bot�o7);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o8 = new JButton();
		Bot�o8.setText("Bot�o8");
		Bot�o8.setPreferredSize(new Dimension(100,20));
		westPanel.add(Bot�o8);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o9 = new JButton();
		Bot�o9.setText("Bot�o9");
		Bot�o9.setPreferredSize(new Dimension(100,20));
		westPanel.add(Bot�o9);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o10 = new JButton();
		Bot�o10.setText("Bot�o10");
		Bot�o10.setPreferredSize(new Dimension(100,20));
		westPanel.add(Bot�o10);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		
	}	
		
}	