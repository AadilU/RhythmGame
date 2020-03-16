package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Background extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Background() {
		//creating frame
		setBounds(0, 0, 1270, 720); 
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1323, 702);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Bg = new JLabel(""); //creating menu background object
		SongSelectUI.setSSBg(panel, Bg, "images/bg1.jpg"); //sets default background
	}
}
