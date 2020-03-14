package view;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;


import java.net.MalformedURLException;
import java.net.URL;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
public class MainMenu extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * creates the frame (view as main menu)
	 * plays mp3 audio file located in audio folder
	 * 
	 */
	public MainMenu() {
		String songName = "audio//carnation.mp3";
		String pathToMp3 = System.getProperty("user.dir") +"/"+ songName;
		BasicPlayer player = new BasicPlayer();
		try {
		    player.open(new URL("file:///" + pathToMp3));
		    player.play();
		} catch (BasicPlayerException | MalformedURLException e) {
		    e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 720);
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 1254, 729);
		getContentPane().add(panel);
		panel.setLayout(null);
		

		/*
		 *creates start button
		 *stops music of main menu when pressed
		 *closes previous frame
		 * 
		 */
		
		JButton btnStart = new JButton("start"); 
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					player.stop(); 
				} catch (BasicPlayerException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Song_selectUI frame = new Song_selectUI(); 
				frame.setVisible(true); 
				
				dispose();
			}
		});
		btnStart.setBounds(112, 350, 200, 50);
		panel.add(btnStart);
	}
}

