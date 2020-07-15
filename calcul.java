package calculatrice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;



	public class calcul  extends JFrame implements ActionListener {
		private Button b;//bouton entrer
		private Button b_1;
		private Button b_2;
		private Button b_3;
		private Button b_4;
		private Button b_5;
		private Button b_6;
		private Button b_7;
		private Button b_8;
		private Button b_9;
		private Button b_10;
		private Button b_11;//+/-
		private Button b_12;//clear all
		private Button b_13;//+
		private Button b_14;//-
		private Button b_15;// *
		private Button b_16;// /
		private String s0, s1, s2; 
		
		private TextField tf;

	public calcul(){
		s0 = s1 = s2 = ""; 
		setLayout (new BorderLayout ());
		
		Panel p1 = new Panel ();
		Panel p2 = new Panel (); 
		Panel p3 = new Panel (); 
		Panel p4 = new Panel (); 
		
		add (p1, "North");
		add (p2, "South"); 
		add (p3, "Center"); 
		add (p4, "East"); 
		 tf = new TextField(8);
		 setSize(300,300);
	     setLocation(250,250);
	     setTitle("CALCULATRICE");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1.add (tf);
		Button b= new Button ("Enter");  b.addActionListener(this);
		b.setForeground(Color.GREEN);
		p2.add(b);
		p3.setLayout (new GridLayout(4, 3));
		b_1 = new Button ("7");  b_1.addActionListener(this);
		b_2 = new Button ("8"); b_2.addActionListener(this);
		b_3 = new Button ("9"); b_3.addActionListener(this);
		b_4 = new Button ("4"); b_4.addActionListener(this);
		b_5 = new Button ("5"); b_5.addActionListener(this);
		b_6 = new Button ("6"); b_6.addActionListener(this);
		b_7 = new Button ("1"); b_7.addActionListener(this);
		b_8 = new Button ("2"); b_8.addActionListener(this);
		b_9 = new Button ("3"); b_9.addActionListener(this);
		b_10 = new Button ("0"); b_10.addActionListener(this);
		b_11 = new Button ("+/-"); 
		b_12 = new Button ("ClearAll"); b_12.addActionListener(this);
	    p3.add(b_1);
	    p3.add(b_2);
	    p3.add(b_3);
	    p3.add(b_4);
	    p3.add(b_5);
	    p3.add(b_6);
	    p3.add(b_7);
	    p3.add(b_8);
	    p3.add(b_9);
	    p3.add(b_10);
	    p3.add(b_11);
	    p3.add(b_12);
	    b_1.setForeground(Color.BLUE);
	    b_2.setForeground(Color.BLUE);
	    b_3.setForeground(Color.BLUE);
	    b_4.setForeground(Color.BLUE);
	    b_5.setForeground(Color.BLUE);
	    b_6.setForeground(Color.BLUE);
	    b_7.setForeground(Color.BLUE);
	    b_8.setForeground(Color.BLUE);
	    b_9.setForeground(Color.BLUE);
	    b_10.setForeground(Color.BLUE);
	    b_11.setForeground(Color.BLUE);
	    b_12.setForeground(Color.PINK);

	    p4.setLayout (new GridLayout(4, 1));
	    b_13 = new Button ("+"); b_13.addActionListener(this);
	    b_14 = new Button ("-"); b_14.addActionListener(this);
	    b_15 = new Button ("*"); b_15.addActionListener(this);
	    b_16 = new Button ("/"); b_16.addActionListener(this);
	    p4.add(b_13);
	    p4.add(b_14);
	    p4.add(b_15);
	    p4.add(b_16);
		b_13.setForeground(Color.RED);
		b_14.setForeground(Color.RED);
		b_15.setForeground(Color.RED);
		b_16.setForeground(Color.RED);
		this.setSize(300,300);
		
		setVisible (true);
	}
		
		
		




	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand(); 
		

		
		
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9')) { 
			
			if (s1.equals("")) //récuperation du 1er operand
				s0 = s0 + s; 
			else//récuperation du 2eme operand
				s2 = s2 + s; 
				
			// afficher l'opération
			tf.setText(s0 + s1 + s2); 
		} 
		else if (s.equalsIgnoreCase("clearAll")) { 
			
			
			s0 = s1 = s2 = ""; 

			
			tf.setText(""); 
		} 
		else if (s.equalsIgnoreCase("enter")) { 

			int res; 

			// store the value in 1st 
			if (s1.equals("+")) 
				res = (Integer.parseInt(s0) + Integer.parseInt(s2)); 
			else if (s1.equals("-")) 
				res = (Integer.parseInt(s0) - Integer.parseInt(s2)); 
			else if (s1.equals("/")) 
				res = (Integer.parseInt(s0) / Integer.parseInt(s2)); 
			else
				res = (Integer.parseInt(s0) * Integer.parseInt(s2)); 

			// Résultat
			tf.setText(s0 + s1 + s2 + "="+res ); 

			

			s1 = s2 = ""; 
		} 
		else { 
			// L'opération : récupération du + - / * 
			if (s1.equals("")) 
				s1 = s; 
			
		

			//Afficher l'opération
			tf.setText(s0 + s1 + s2); 
		} 
	}



	public static void main (String args[ ]) { 
		calcul c = new calcul ( ); 
		}


	}