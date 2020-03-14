package view;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JPanel;

public class Song_selectUI extends Main{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Song_selectUI() {
		setBounds(100, 100, 450, 800);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 424, 729);
		getContentPane().add(panel);
		panel.setLayout(null);
	}

}
