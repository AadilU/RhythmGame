package view;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JFrame;

public class BeatmapUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BeatmapUI() {
		
		setBounds(500, 0, 405, 720); 
	
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 379, 649);
		getContentPane().add(panel);
		panel.setLayout(null);
		
	}
}
