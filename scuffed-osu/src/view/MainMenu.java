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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;


import java.net.MalformedURLException;
import java.net.URL;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import java.awt.Font;
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
		
		//setting up song and audio sound effect to play during menu
		BasicPlayer player = new BasicPlayer();

		String songName = "audio/carnation.mp3";
		String pathToMp3 = System.getProperty("user.dir") +"/"+ songName;
		
		String click = "audio/click2.wav";
		String pathToWav = System.getProperty("user.dir") +"/"+ click;
	
		try {
		    player.open(new URL("file:///" + pathToMp3));
		    player.play();
		} catch (BasicPlayerException | MalformedURLException e) {
		    e.printStackTrace();
		}
		
		//creating frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1270, 720);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1323, 702);
		getContentPane().add(panel);
		panel.setLayout(null);
		


		/*
		 *creates start button
		 *stops music of main menu when pressed
		 *closes previous frame
		 * 
		 */
		JButton btnStart = new JButton("");
		java.awt.Image image = new ImageIcon("images/logo.png").getImage(); //logo at https://commons.wikimedia.org/wiki/File:Osu!Logo_(2015).png
		btnStart.setIcon(new ImageIcon(image));
		btnStart.setOpaque(false);
		btnStart.setBorderPainted(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setBounds(395, 110, 480, 480);
		panel.add(btnStart);
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					player.stop(); 
				} catch (BasicPlayerException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
				    player.open(new URL("file:///" + pathToWav));
				    player.play();
				} catch (BasicPlayerException | MalformedURLException e1) {
				    e1.printStackTrace();
				}
				
				Song_selectUI frame = new Song_selectUI(); 
				frame.setVisible(true); 
				
				dispose();
			}
		});
		
		//experimental (change image to display alternate when mouse hovers over bounded area, otherwise displays original image)
		//doesn't do anything rn, both images r the same
		btnStart.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnStart.setIcon(new ImageIcon(image));
			}
			public void mouseExited(MouseEvent e) 
			{
				btnStart.setIcon(new ImageIcon(image));
			}
		});
		btnStart.setBorder(null);
		
		//background image
		JLabel menuBg = new JLabel("");
		java.awt.Image image_bg = new ImageIcon("images/bg1.jpg").getImage(); //wallpaper at https://www.dropbox.com/sh/t0lw1xhmhqdrbmg/AAD-3ryQA2KhWcNga6JLCP4xa?dl=0
		menuBg.setIcon(new ImageIcon(image_bg));
		menuBg.setBounds(0, 0, 1294, 681);
		panel.add(menuBg);
		
	

	}
}

