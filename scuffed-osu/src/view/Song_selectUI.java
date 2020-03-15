package view;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.List;

public class Song_selectUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Song_selectUI() {
		//setting up songs and audio sound effects to play in song selection menu
		BasicPlayer player = new BasicPlayer();
		
		String songName1 = "audio/armageddon.mp3";
		String pathToMp3_1 = System.getProperty("user.dir") +"/"+ songName1;
		
		String songName2 = "audio/dualfractal.mp3";
		String pathToMp3_2 = System.getProperty("user.dir") +"/"+ songName2;
		
		String songName3 = "audio/blendw.mp3";
		String pathToMp3_3 = System.getProperty("user.dir") +"/"+ songName3;
		
		String click = "audio/click2.wav";
		String pathToWav = System.getProperty("user.dir") +"/"+ click;

		//creating frame
		setBounds(0, 0, 1270, 720); 
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1323, 702);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		//creating interface 
		JLabel menuBg1 = new JLabel("");
		java.awt.Image image_bgbot = new ImageIcon("images/ssi_bot.png").getImage(); //osu skin: Cookiezi 29 2018-03-18
		
		
		JLabel lblLocalScores = new JLabel("LOCAL SCORES");
		lblLocalScores.setForeground(Color.WHITE);
		lblLocalScores.setBackground(Color.BLACK);
		lblLocalScores.setFont(new Font("SansSerif", Font.PLAIN, 32));
		
		lblLocalScores.setBounds(38, 102, 278, 50);
		panel.add(lblLocalScores);
		
		JLabel lblafterInformationStored = new JLabel("(after information stored in database, create label, get and display score to label)");
		lblafterInformationStored.setForeground(Color.WHITE);
		lblafterInformationStored.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblafterInformationStored.setBounds(38, 159, 530, 36);
		panel.add(lblafterInformationStored);
		menuBg1.setIcon(new ImageIcon(image_bgbot));
		menuBg1.setBounds(0, 0, 1294, 770);
		panel.add(menuBg1);
		
		JLabel menuBg2 = new JLabel("");
		java.awt.Image image_bgtop = new ImageIcon("images/ssi_top1.png").getImage(); 
		menuBg2.setIcon(new ImageIcon(image_bgtop));
		menuBg2.setBounds(0, 0, 1294, 552);
		panel.add(menuBg2);
		
		//creating original and alt image to display between mouse hovering on or off button
		java.awt.Image image0 = new ImageIcon("images/ssbtn_hoverOFF.png").getImage(); 
		java.awt.Image image1 = new ImageIcon("images/ssbtn_hoverON.png").getImage(); 

		//button for song 1
		JButton btnSong1 = new JButton("");
		btnSong1.setIcon(new ImageIcon(image0));
		btnSong1.setOpaque(false);
		btnSong1.setBorderPainted(false);
		btnSong1.setContentAreaFilled(false);
		btnSong1.setBounds(610, 100, 667, 96);
		panel.add(btnSong1);
		
		btnSong1.addActionListener(new ActionListener() {
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
				
				BeatmapUI frame = new BeatmapUI(); 
				frame.setVisible(true); 
				
				dispose();
			}
		});
		
		btnSong1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnSong1.setIcon(new ImageIcon(image1));
				
				try {
				    player.open(new URL("file:///" + pathToMp3_1));
				    player.play();
				} catch (BasicPlayerException | MalformedURLException e1) {
				    e1.printStackTrace();
				}
				
			}
			public void mouseExited(MouseEvent e) 
			{
				btnSong1.setIcon(new ImageIcon(image0));
				
				try {
					player.stop(); 
				} catch (BasicPlayerException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSong1.setBorder(null);
		
		//button for song 2
		JButton btnSong2 = new JButton("");
		btnSong2.setIcon(new ImageIcon(image0));
		btnSong2.setOpaque(false);
		btnSong2.setBorderPainted(false);
		btnSong2.setContentAreaFilled(false);
		btnSong2.setBounds(610, 200, 667, 96);
		panel.add(btnSong2);
		
		btnSong2.addActionListener(new ActionListener() {
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
				
				BeatmapUI frame = new BeatmapUI(); 
				frame.setVisible(true); 
				
				dispose();
			}
		});
		
		btnSong2.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnSong2.setIcon(new ImageIcon(image1));
				
				try {
				    player.open(new URL("file:///" + pathToMp3_2));
				    player.play();
				} catch (BasicPlayerException | MalformedURLException e1) {
				    e1.printStackTrace();
				}
			}
			public void mouseExited(MouseEvent e) 
			{
				btnSong2.setIcon(new ImageIcon(image0));
				
				try {
					player.stop(); 
				} catch (BasicPlayerException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSong2.setBorder(null);
	
		//button for song 3
		JButton btnSong3 = new JButton("");
		btnSong3.setIcon(new ImageIcon(image0));
		btnSong3.setOpaque(false);
		btnSong3.setBorderPainted(false);
		btnSong3.setContentAreaFilled(false);
		btnSong3.setBounds(610, 300, 667, 96);
		panel.add(btnSong3);
		
		btnSong3.addActionListener(new ActionListener() {
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
				
				BeatmapUI frame = new BeatmapUI(); 
				frame.setVisible(true); 
				
				dispose();
			}
		});
		
		btnSong3.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnSong3.setIcon(new ImageIcon(image1));

				try {
				    player.open(new URL("file:///" + pathToMp3_3));
				    player.play();
				} catch (BasicPlayerException | MalformedURLException e1) {
				    e1.printStackTrace();
				}
			}
			public void mouseExited(MouseEvent e) 
			{
				btnSong3.setIcon(new ImageIcon(image0));
				
				try {
					player.stop(); 
				} catch (BasicPlayerException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSong3.setBorder(null);
		
		//background image
		JLabel menuBg = new JLabel("");
		java.awt.Image imageBg = new ImageIcon("images/ssbg.jpg").getImage();
		menuBg.setIcon(new ImageIcon(imageBg));
		menuBg.setBounds(0, 0, 1294, 681);
		panel.add(menuBg);

		

		
		

	}
}
