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
 


		JButton Botão1 = new JButton();
		Botão1.setText("Botão1");
		Botão1.setPreferredSize(new Dimension(100,20));
		ButtonListener button1 = new ButtonListener();
		Botão1.addActionListener(button1);
		westPanel.add(Botão1);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão2 = new JButton();
		Botão2.setText("Botão2");
		Botão2.setPreferredSize(new Dimension(100,20));
		ButtonListener button2 = new ButtonListener();
		Botão2.addActionListener(button2);
		westPanel.add(Botão2);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão3 = new JButton();
		Botão3.setText("Botão3");
		Botão3.setPreferredSize(new Dimension(100,20));
		ButtonListener button3 = new ButtonListener();
		Botão3.addActionListener(button3);
		westPanel.add(Botão3);
		contentPane.add(westPanel, BorderLayout.WEST);
		 
		JButton Botão4 = new JButton();
		Botão4.setText("Botão4");
		Botão4.setPreferredSize(new Dimension(100,20));
		ButtonListener button4 = new ButtonListener();
		Botão4.addActionListener(button4);
		westPanel.add(Botão4);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão5 = new JButton();
		Botão5.setText("Botão5");
		Botão5.setPreferredSize(new Dimension(100,20));
		ButtonListener button5 = new ButtonListener();
		Botão5.addActionListener(button5);
		westPanel.add(Botão5);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão6 = new JButton();
		Botão6.setText("Botão6");
		Botão6.setPreferredSize(new Dimension(100,20));
		ButtonListener button6 = new ButtonListener();
		Botão6.addActionListener(button6);
		westPanel.add(Botão6);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão7 = new JButton();
		Botão7.setText("Botão7");
		Botão7.setPreferredSize(new Dimension(100,20));
		ButtonListener button7 = new ButtonListener();
		Botão7.addActionListener(button7);
		westPanel.add(Botão7);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão8 = new JButton();
		Botão8.setText("Botão8");
		Botão8.setPreferredSize(new Dimension(100,20));
		ButtonListener button8 = new ButtonListener();
		Botão8.addActionListener(button8);
		westPanel.add(Botão8);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão9 = new JButton();
		Botão9.setText("Botão9");
		Botão9.setPreferredSize(new Dimension(100,20));
		ButtonListener button9 = new ButtonListener();
		Botão9.addActionListener(button9);
		westPanel.add(Botão9);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JButton Botão10 = new JButton();
		Botão10.setText("Botão10");
		Botão10.setPreferredSize(new Dimension(100,20));
		ButtonListener button10 = new ButtonListener();
		Botão10.addActionListener(button10);
		westPanel.add(Botão10);
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
  				{ " João " , " 111.111.111-11 " , " joao@gmail.com " },
  				{ " Maria " , " 222.222.222-22 " , " maria@gmail.com " },
  				{ " José " , " 333.333.333-33 " , " jose@gmail.com " },
  				
  		};
		
  		
  		JTable userTable =  new  JTable (tableData, columnNames);
  		
  	
  		userTable.setPreferredSize ( new Dimension( 300 , 130 ));
  		eastPanel.add(userTable);
  		
  		
		
		
	}	
		
}	