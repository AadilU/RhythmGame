package view;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Song_selectUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Song_selectUI() {
		//setBounds(500, 0, 405, 720); bounds of beatmap
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 424, 729);
		getContentPane().add(panel);
		panel.setLayout(null);
	}
}
