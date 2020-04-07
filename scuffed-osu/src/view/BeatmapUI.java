package view;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BeatmapUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * 
	 */
	public BeatmapUI() {
		
		setBounds(0, 0, 1270, 720); 
	
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 1323, 702);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("beatmap ui WIP lol :3 - cory   NEO WAS HERE");
		lblNewLabel.setBounds(85, 68, 317, 104);
		panel.add(lblNewLabel);
		
	}
}
