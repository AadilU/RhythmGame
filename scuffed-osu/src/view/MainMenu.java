package view;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import control.AudioStatus;
import control.BackgroundStatus;
import control.MouseStatus;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javazoom.jlgui.basicplayer.BasicPlayer;
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
		AudioStatus.songSet(player, 1);
		
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
		BtnDefault.appear(btnStart, image);
		btnStart.setBounds(395, 110, 480, 480);
		panel.add(btnStart);
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				MouseStatus.action(player, 0);
				dispose();
			}
		});
		
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 	{
				btnStart.setBounds(395, 110, 480, 480);
				btnStart.setIcon(new ImageIcon("images/logo.png"));
			}
			public void mouseExited(MouseEvent e) {
				
				btnStart.setBounds(420, 135, 430, 430);
				btnStart.setIcon(new ImageIcon("images/logo1.png"));
			}
		});

		//background image
		JLabel menuBg = new JLabel("");
		java.awt.Image image_bg = new ImageIcon("images/bg1.jpg").getImage(); //wallpaper at https://www.dropbox.com/sh/t0lw1xhmhqdrbmg/AAD-3ryQA2KhWcNga6JLCP4xa?dl=0
		menuBg.setIcon(new ImageIcon(image_bg));
		menuBg.setBounds(0, 0, 1294, 681);
		panel.add(menuBg);
		
	}
}

