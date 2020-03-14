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

public class Song_selectUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Song_selectUI() {
		String songName = "audio/carnation.mp3";
		String pathToMp3 = System.getProperty("user.dir") +"/"+ songName;
		BasicPlayer player = new BasicPlayer();
		
		setBounds(0, 0, 1270, 720); 
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1323, 702);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		//interface 
		JLabel menuBg1 = new JLabel("");
		java.awt.Image image1 = new ImageIcon("images/ssi_bot.png").getImage(); //osu skin: Cookiezi 29 2018-03-18
		menuBg1.setIcon(new ImageIcon(image1));
		menuBg1.setBounds(0, 0, 1294, 770);
		panel.add(menuBg1);
		
		JLabel menuBg2 = new JLabel("");
		java.awt.Image image2 = new ImageIcon("images/ssi_top1.png").getImage(); //osu skin: Cookiezi 29 2018-03-18
		menuBg2.setIcon(new ImageIcon(image2));
		menuBg2.setBounds(0, 0, 1294, 552);
		panel.add(menuBg2);
		
		
		JButton btnSong1 = new JButton("");
		btnSong1.setOpaque(false);
		btnSong1.setBorderPainted(false);
		btnSong1.setContentAreaFilled(false);
		btnSong1.setBounds(610, 100, 667, 96);
		panel.add(btnSong1);
		
		btnSong1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

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
				java.awt.Image image3 = new ImageIcon("images/ssbtn_hoverON.png").getImage(); //osu skin: Cookiezi 29 2018-03-18
				btnSong1.setIcon(new ImageIcon(image3));
				
				try {
				    player.open(new URL("file:///" + pathToMp3));
				    player.play();
				} catch (BasicPlayerException | MalformedURLException e1) {
				    e1.printStackTrace();
				}
			}
			public void mouseExited(MouseEvent e) 
			{
				java.awt.Image image3 = new ImageIcon("images/ssbtn_hoverOFF.png").getImage(); //logo at https://commons.wikimedia.org/wiki/File:Osu!Logo_(2015).png
				btnSong1.setIcon(new ImageIcon(image3));
				
				try {
					player.stop(); 
				} catch (BasicPlayerException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSong1.setBorder(null);
		
		

	
		
		
		//background image
		JLabel menuBg = new JLabel("");
		java.awt.Image image = new ImageIcon("images/ssbg.jpg").getImage(); //osu skin: Cookiezi 29 2018-03-18
		menuBg.setIcon(new ImageIcon(image));
		menuBg.setBounds(0, 0, 1294, 681);
		panel.add(menuBg);
		
		

	}
}
