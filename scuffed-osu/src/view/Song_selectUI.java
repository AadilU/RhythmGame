package view;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;

public class Song_selectUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Song_selectUI() {
		//setBounds(500, 0, 405, 720); bounds of beatmap
		setBounds(0, 0, 1280, 720); 
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 1254, 729);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSongSelectrionScreen = new JLabel("song selection screen WIP lol :3 - cory");
		lblSongSelectrionScreen.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblSongSelectrionScreen.setBounds(21, 40, 633, 205);
		panel.add(lblSongSelectrionScreen);
	}
}
