package view;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

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
		panel.setBounds(-11, -30, 1323, 702);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("beatmap ui WIP lol :3 - cory   NEO WAS HERE");
		lblNewLabel.setBounds(85, 68, 317, 104);
		panel.add(lblNewLabel);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(838, 586, 105, 35);
		panel.add(button_1);
		
		JButton button = new JButton("New button");
		button.setBounds(733, 586, 105, 35);
		panel.add(button);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(627, 586, 105, 35);
		panel.add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(521, 586, 105, 35);
		panel.add(button_3);
		
	}
}
