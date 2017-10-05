package br.edu.univas.exerc.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

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
		westPanel.setPreferredSize(new Dimension(120,0));
		contentPane.add(westPanel, BorderLayout.WEST);
 


		JButton Bot�o1 = new JButton();
		Bot�o1.setText("Bot�o1");
		Bot�o1.setPreferredSize(new Dimension(100,20));
		ButtonListener button1 = new ButtonListener();
		Bot�o1.addActionListener(button1);
		westPanel.add(Bot�o1);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o2 = new JButton();
		Bot�o2.setText("Bot�o2");
		Bot�o2.setPreferredSize(new Dimension(100,20));
		ButtonListener button2 = new ButtonListener();
		Bot�o2.addActionListener(button2);
		westPanel.add(Bot�o2);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o3 = new JButton();
		Bot�o3.setText("Bot�o3");
		Bot�o3.setPreferredSize(new Dimension(100,20));
		ButtonListener button3 = new ButtonListener();
		Bot�o3.addActionListener(button3);
		westPanel.add(Bot�o3);
		contentPane.add(westPanel, BorderLayout.WEST);
		 
		JButton Bot�o4 = new JButton();
		Bot�o4.setText("Bot�o4");
		Bot�o4.setPreferredSize(new Dimension(100,20));
		ButtonListener button4 = new ButtonListener();
		Bot�o4.addActionListener(button4);
		westPanel.add(Bot�o4);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o5 = new JButton();
		Bot�o5.setText("Bot�o5");
		Bot�o5.setPreferredSize(new Dimension(100,20));
		ButtonListener button5 = new ButtonListener();
		Bot�o5.addActionListener(button5);
		westPanel.add(Bot�o5);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o6 = new JButton();
		Bot�o6.setText("Bot�o6");
		Bot�o6.setPreferredSize(new Dimension(100,20));
		ButtonListener button6 = new ButtonListener();
		Bot�o6.addActionListener(button6);
		westPanel.add(Bot�o6);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o7 = new JButton();
		Bot�o7.setText("Bot�o7");
		Bot�o7.setPreferredSize(new Dimension(100,20));
		ButtonListener button7 = new ButtonListener();
		Bot�o7.addActionListener(button7);
		westPanel.add(Bot�o7);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o8 = new JButton();
		Bot�o8.setText("Bot�o8");
		Bot�o8.setPreferredSize(new Dimension(100,20));
		ButtonListener button8 = new ButtonListener();
		Bot�o8.addActionListener(button8);
		westPanel.add(Bot�o8);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o9 = new JButton();
		Bot�o9.setText("Bot�o9");
		Bot�o9.setPreferredSize(new Dimension(100,20));
		ButtonListener button9 = new ButtonListener();
		Bot�o9.addActionListener(button9);
		westPanel.add(Bot�o9);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Bot�o10 = new JButton();
		Bot�o10.setText("Bot�o10");
		Bot�o10.setPreferredSize(new Dimension(100,20));
		ButtonListener button10 = new ButtonListener();
		Bot�o10.addActionListener(button10);
		westPanel.add(Bot�o10);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		
		JPanel eastPanel = new JPanel();
		eastPanel.setPreferredSize(new Dimension(370,0));
		contentPane.add(eastPanel,BorderLayout.EAST);
		
		JLabel nameLabel =  new  JLabel ();
		nameLabel . setText ( " Nome: " );
		eastPanel.add(nameLabel);
		contentPane.add(eastPanel,BorderLayout.EAST);
		
		JTextField nameTextField =  new  JTextField ();
		nameTextField . setColumns ( 25 );
		eastPanel.add(nameTextField);
		contentPane.add(eastPanel,BorderLayout.EAST);
		
		JLabel emailLabel =  new  JLabel ();
		emailLabel . setText ( " E-mail: " );
		eastPanel.add(emailLabel);
		contentPane.add(eastPanel,BorderLayout.EAST);
		
		JTextField emailTextField =  new  JTextField ();
		emailTextField . setColumns ( 25 );
		eastPanel.add(emailTextField);
		contentPane.add(eastPanel,BorderLayout.EAST);
		
		JButton salva = new JButton();
		salva.setText("Salvar");
		salva.setPreferredSize(new Dimension(100,25));
		eastPanel.add(salva);
		contentPane.add(westPanel, BorderLayout.WEST);
		
        String [] columnNames = { " Nome " ," CPF " , " E-mail " };
  		
  		Object [] [] tableData = {
  				{ " Jo�o " , " 111.111.111-11 " , " joao@gmail.com " },
  				{ " Maria " , " 222.222.222-22 " , " maria@gmail.com " },
  				{ " Jos� " , " 333.333.333-33 " , " jose@gmail.com " },
  				
  		};
		
  		
  		JTable userTable =  new  JTable (tableData, columnNames);
  		
  	
  		userTable.setPreferredSize ( new Dimension( 300 , 130 ));
  		eastPanel.add(userTable);
  		
  		
		
		
	}	
		
}	