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
 


		JButton Botão1 = new JButton();
		Botão1.setText("Botão1");
		Botão1.setPreferredSize(new Dimension(100,20));
		ButtonListener button = new ButtonListener();
		Botão1.addActionListener(button);
		westPanel.add(Botão1);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão2 = new JButton();
		Botão2.setText("Botão2");
		Botão2.setPreferredSize(new Dimension(100,20));
		westPanel.add(Botão2);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão3 = new JButton();
		Botão3.setText("Botão3");
		Botão3.setPreferredSize(new Dimension(100,20));
		westPanel.add(Botão3);
		contentPane.add(westPanel, BorderLayout.WEST);
		 
		JButton Botão4 = new JButton();
		Botão4.setText("Botão4");
		Botão4.setPreferredSize(new Dimension(100,20));
		westPanel.add(Botão4);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão5 = new JButton();
		Botão5.setText("Botão5");
		Botão5.setPreferredSize(new Dimension(100,20));
		westPanel.add(Botão5);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão6 = new JButton();
		Botão6.setText("Botão6");
		Botão6.setPreferredSize(new Dimension(100,20));
		westPanel.add(Botão6);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão7 = new JButton();
		Botão7.setText("Botão7");
		Botão7.setPreferredSize(new Dimension(100,20));
		westPanel.add(Botão7);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão8 = new JButton();
		Botão8.setText("Botão8");
		Botão8.setPreferredSize(new Dimension(100,20));
		westPanel.add(Botão8);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão9 = new JButton();
		Botão9.setText("Botão9");
		Botão9.setPreferredSize(new Dimension(100,20));
		westPanel.add(Botão9);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão10 = new JButton();
		Botão10.setText("Botão10");
		Botão10.setPreferredSize(new Dimension(100,20));
		westPanel.add(Botão10);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		
	}	
		
}	