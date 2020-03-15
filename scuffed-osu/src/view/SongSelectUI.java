package view;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import control.BackgroundStatus;
import control.MouseStatus;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javax.swing.JLabel;
import java.awt.Font;

public class SongSelectUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SongSelectUI() {
		//creating frame
		setBounds(0, 0, 1270, 720); 
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1323, 702);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		//creating menu background object
		JLabel menuBg = new JLabel("");
		
		//song header
		JLabel lblgetSongName = new JLabel("(get song info)");
		lblgetSongName.setForeground(Color.WHITE);
		lblgetSongName.setFont(new Font("SansSerif", Font.PLAIN, 32));
		lblgetSongName.setBackground(Color.BLACK);
		lblgetSongName.setBounds(38, 21, 481, 50);
		panel.add(lblgetSongName);
		
		//creating interface 
		
		//scoreboard
		JLabel lblLocalScores = new JLabel("LOCAL SCORES");
		lblLocalScores.setForeground(Color.WHITE);
		lblLocalScores.setBackground(Color.BLACK);
		lblLocalScores.setFont(new Font("SansSerif", Font.PLAIN, 32));
		lblLocalScores.setBounds(38, 102, 278, 50);
		panel.add(lblLocalScores);
		
	
		// idea: display by most recent score (replace lower text with upper text for each Jlabel,
		//       as a result, lowest text is no longer displayed after next game during maximum Jlabels occupied, 
		//       creates room for new score (text) at top of scoreboard) 
		JLabel lblscore1 = new JLabel("(pending)");
		lblscore1.setForeground(Color.WHITE);
		lblscore1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblscore1.setBounds(38, 159, 530, 36);
		panel.add(lblscore1);
		
		JLabel lblscore2 = new JLabel("(pending)");
		lblscore2.setForeground(Color.WHITE);
		lblscore2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblscore2.setBounds(38, 200, 530, 36);
		panel.add(lblscore2);
		
		JLabel lblscore3 = new JLabel("(pending)");
		lblscore3.setForeground(Color.WHITE);
		lblscore3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblscore3.setBounds(38, 241, 530, 36);
		panel.add(lblscore3);
		
		JLabel lblscore4 = new JLabel("(pending)");
		lblscore4.setForeground(Color.WHITE);
		lblscore4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblscore4.setBounds(38, 282, 530, 36);
		panel.add(lblscore4);
		
		JLabel lblscore5 = new JLabel("(pending)");
		lblscore5.setForeground(Color.WHITE);
		lblscore5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblscore5.setBounds(38, 323, 530, 36);
		panel.add(lblscore5);
	
		//interface bottom panel
		JLabel menuBg1 = new JLabel("");
		java.awt.Image image_bgbot = new ImageIcon("images/ssi_bot.png").getImage(); //osu skin: Cookiezi 29 2018-03-18
		menuBg1.setIcon(new ImageIcon(image_bgbot));
		menuBg1.setBounds(0, 0, 1294, 770);
		panel.add(menuBg1);
		
		//interface top panel
		JLabel menuBg2 = new JLabel("");
		java.awt.Image image_bgtop = new ImageIcon("images/ssi_top1.png").getImage(); 
		menuBg2.setIcon(new ImageIcon(image_bgtop));
		menuBg2.setBounds(0, 0, 1294, 552);
		panel.add(menuBg2);
		
		//creating player object
		BasicPlayer player = new BasicPlayer();
		
		//creating original and alt image to display between mouse hovering on or off button
		java.awt.Image image0 = new ImageIcon("images/ssbtn_hoverOFF.png").getImage(); 
		java.awt.Image image1 = new ImageIcon("images/ssbtn_hoverON.png").getImage(); 

		//label song 1
		JLabel lblSong1 = new JLabel("(get song info)");
		lblSong1.setForeground(Color.WHITE);
		lblSong1.setFont(new Font("SansSerif", Font.PLAIN, 26));
		lblSong1.setBackground(Color.BLACK);
		lblSong1.setBounds(756, 100, 667, 96);
		panel.add(lblSong1);
		
		//button song 1
		JButton btnSong1 = new JButton("");
		BtnDefault.appear(btnSong1, image0);
		btnSong1.setBounds(610, 100, 667, 101);
		panel.add(btnSong1);
		
		btnSong1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MouseStatus.action(player, 1);
				dispose();
			}
		});
		MouseStatus.state(panel, menuBg, btnSong1, image0, image1, 1, player, 2);	

		//label song 2
		JLabel lblSong2 = new JLabel("(get song info)");
		lblSong2.setForeground(Color.WHITE);
		lblSong2.setFont(new Font("SansSerif", Font.PLAIN, 26));
		lblSong2.setBackground(Color.BLACK);
		lblSong2.setBounds(756, 200, 667, 96);
		panel.add(lblSong2);
		
		//button song 2
		JButton btnSong2 = new JButton("");
		BtnDefault.appear(btnSong2, image0);
		btnSong2.setBounds(610, 200, 667, 101);
		panel.add(btnSong2);
	
		btnSong2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MouseStatus.action(player, 1);
				dispose();
			}
		});	
		MouseStatus.state(panel, menuBg, btnSong2, image0, image1, 2, player, 3);	
		
		//label song 3
		JLabel lblSong3 = new JLabel("(get song info)");
		lblSong3.setForeground(Color.WHITE);
		lblSong3.setFont(new Font("SansSerif", Font.PLAIN, 26));
		lblSong3.setBackground(Color.BLACK);
		lblSong3.setBounds(756, 300, 667, 96);
		panel.add(lblSong3);
		
		//button song  3
		JButton btnSong3 = new JButton("");
		BtnDefault.appear(btnSong3, image0);
		btnSong3.setBounds(610, 300, 667, 96);
		panel.add(btnSong3);
		
		btnSong3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MouseStatus.action(player, 1);
				dispose();
			}
		});
		MouseStatus.state(panel, menuBg, btnSong3, image0, image1, 3, player, 4);	
		
	}
	
	public static void setSSBg(JPanel panel, JLabel menuBg, String image_bg) {
		menuBg.setIcon(new ImageIcon(image_bg));
		menuBg.setBounds(0, 0, 1294, 681);
		panel.add(menuBg);
	}

	
}