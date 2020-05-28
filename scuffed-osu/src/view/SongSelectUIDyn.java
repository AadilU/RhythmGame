package view;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import control.MouseStatus;
import javazoom.jlgui.basicplayer.BasicPlayer;
import model.BackgroundList;
import model.InterfaceList;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class SongSelectUIDyn extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//int i = 1; //declaring and initializing skin value 
	
	public SongSelectUIDyn(int skin) {
		int i = skin;
		//creating frame
		setBounds(0, 0, 1270, 720); 
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1323, 702);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel menuBg = new JLabel(""); //creating menu background object
		
		BasicPlayer player = new BasicPlayer(); //creating audio player object
		
		//song header on interface top panel
		JLabel lblgetSongName = new JLabel("(get song info)");
		lblgetSongName.setForeground(Color.WHITE);
		lblgetSongName.setFont(new Font("SansSerif", Font.PLAIN, 32));
		lblgetSongName.setBackground(Color.BLACK);
		lblgetSongName.setBounds(38, 21, 481, 50);
		panel.add(lblgetSongName);

		//scoreboard
		JLabel lblLocalScores = new JLabel("LOCAL SCORES");
		lblLocalScores.setForeground(Color.WHITE);
		lblLocalScores.setBackground(Color.BLACK);
		lblLocalScores.setFont(new Font("SansSerif", Font.PLAIN, 32));
		lblLocalScores.setBounds(38, 102, 278, 50);
		panel.add(lblLocalScores);
		
	
		// idea: display by most recent score (logic code that replaces lower text with upper text for each Jlabel,
		//       as a result, lowest text is no longer displayed after next game during maximum Jlabels occupied, 
		//       creates room for new score (text) at top of scoreboard) 
		JLabel lblscore1 = new JLabel("(pending)");
		lblscore1.setForeground(Color.WHITE);
		lblscore1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblscore1.setBounds(38, 159, 530, 46);
		panel.add(lblscore1);
		
		JLabel lblscore2 = new JLabel("(pending)");
		lblscore2.setForeground(Color.WHITE);
		lblscore2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblscore2.setBounds(38, 205, 530, 46);
		panel.add(lblscore2);
		
		JLabel lblscore3 = new JLabel("(pending)");
		lblscore3.setForeground(Color.WHITE);
		lblscore3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblscore3.setBounds(38, 251, 530, 46);
		panel.add(lblscore3);
		
		JLabel lblscore4 = new JLabel("(pending)");
		lblscore4.setForeground(Color.WHITE);
		lblscore4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblscore4.setBounds(38, 297, 530, 46);
		panel.add(lblscore4);
		
		JLabel lblscore5 = new JLabel("(pending)");
		lblscore5.setForeground(Color.WHITE);
		lblscore5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblscore5.setBounds(38, 343, 530, 46);
		panel.add(lblscore5);
		
		//buttons and labels for changing skin
		JLabel lblSkin1 = new JLabel("skin 1");
		lblSkin1.setFont(new Font("SansSerif", Font.PLAIN, 21));
		lblSkin1.setForeground(Color.WHITE);
		lblSkin1.setBounds(45, 589, 103, 35);
		panel.add(lblSkin1);
		
		JButton btnSkin1 = new JButton("");
		BtnDefault.appear(btnSkin1, InterfaceList.getCS(i));
		btnSkin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MouseStatus.action(player, 1);
				dispose();
			}
		});
		btnSkin1.setBounds(21, 589, 103, 35);
		panel.add(btnSkin1);
		
		JLabel lblskin2 = new JLabel("skin 2");
		lblskin2.setForeground(Color.WHITE);
		lblskin2.setFont(new Font("SansSerif", Font.PLAIN, 21));
		lblskin2.setBounds(162, 589, 103, 35);
		panel.add(lblskin2);
		
		JButton btnSkin2 = new JButton("");
		BtnDefault.appear(btnSkin2, InterfaceList.getCS(i));
		btnSkin2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MouseStatus.action(player, 2);
				dispose();
			}
		});
		btnSkin2.setBounds(137, 589, 103, 35);
		panel.add(btnSkin2);
	
		JLabel lblskin3 = new JLabel("skin 3");
		lblskin3.setForeground(Color.WHITE);
		lblskin3.setFont(new Font("SansSerif", Font.PLAIN, 21));
		lblskin3.setBounds(278, 589, 103, 35);
		panel.add(lblskin3);
		
		JButton btnSkin3 = new JButton("");
		BtnDefault.appear(btnSkin3, InterfaceList.getCS(i));
		btnSkin3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MouseStatus.action(player, 3);
				dispose();
			}
		});
		btnSkin3.setBounds(253, 589, 103, 35);
		panel.add(btnSkin3);
		
		java.awt.Image image_bgtop = null;
		java.awt.Image image_bgbot = null;
		switch(skin)
		{
			case 1:
				image_bgtop = new ImageIcon(InterfaceList.getSSItop(i)).getImage();
				image_bgbot = new ImageIcon(InterfaceList.getSSIbot(i)).getImage();
			case 2:
				image_bgtop = new ImageIcon(InterfaceList.getSSItop(1)).getImage();
				image_bgbot = new ImageIcon(InterfaceList.getSSIbot(i)).getImage();
			case 3:
				image_bgtop = new ImageIcon(InterfaceList.getSSItop(i)).getImage();
				image_bgbot = new ImageIcon(InterfaceList.getSSIbot(i)).getImage();
		}
		
		//interface top panel
		JLabel menuBg2 = new JLabel("");
		menuBg2.setIcon(new ImageIcon(image_bgtop));
		menuBg2.setBounds(0, 0, 1294, 552);
		panel.add(menuBg2);
		
		//interface bottom panel
		JLabel menuBg1 = new JLabel("");
		menuBg1.setIcon(new ImageIcon(image_bgbot));
		menuBg1.setBounds(0, 0, 1331, 772);
		panel.add(menuBg1);
		
		//label song 1
		JLabel lblSong1 = new JLabel("(get song info)");
		lblSong1.setVerticalAlignment(SwingConstants.TOP);
		lblSong1.setForeground(Color.WHITE);
		lblSong1.setFont(new Font("SansSerif", Font.PLAIN, 26));
		lblSong1.setBackground(Color.BLACK);
		lblSong1.setBounds(756, 100, 667, 101);
		panel.add(lblSong1);
		
		//button song 1
		JButton btnSong1 = new JButton("");
		BtnDefault.appear(btnSong1, InterfaceList.getHoverOff(i));
		btnSong1.setBounds(610, 102, 670, 102);
		panel.add(btnSong1);
		
		btnSong1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MouseStatus.action(player, 0); //check MouseStatus class in control package for comments of this method
			}
		});
		MouseStatus.state(panel, menuBg, btnSong1, 1, player, i); //check MouseStatus class in control package for comments of this method
		
		//label song 2
		JLabel lblSong2 = new JLabel("(get song info)");
		lblSong2.setVerticalAlignment(SwingConstants.TOP);
		lblSong2.setForeground(Color.WHITE);
		lblSong2.setFont(new Font("SansSerif", Font.PLAIN, 26));
		lblSong2.setBackground(Color.BLACK);
		lblSong2.setBounds(756, 200, 667, 96);
		panel.add(lblSong2);
		
		//button song 2
		JButton btnSong2 = new JButton("");
		BtnDefault.appear(btnSong2, InterfaceList.getHoverOff(i));
		btnSong2.setBounds(610, 204, 670, 102);
		panel.add(btnSong2);
		
		btnSong2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MouseStatus.action(player, 0); 	//check MouseStatus class in control package for comments of this method
			}
		});	
		MouseStatus.state(panel, menuBg, btnSong2, 2, player, i); //check MouseStatus class in control package for comments of this method
		
		//label song 3
		JLabel lblSong3 = new JLabel("(get song info)");
		lblSong3.setVerticalAlignment(SwingConstants.TOP);
		lblSong3.setForeground(Color.WHITE);
		lblSong3.setFont(new Font("SansSerif", Font.PLAIN, 26));
		lblSong3.setBackground(Color.BLACK);
		lblSong3.setBounds(756, 302, 667, 96);
		panel.add(lblSong3);
	
		//button song  3
		JButton btnSong3 = new JButton("");
		BtnDefault.appear(btnSong3, InterfaceList.getHoverOff(i));
		btnSong3.setBounds(610, 306, 670, 102);
		panel.add(btnSong3);
		
		btnSong3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MouseStatus.action(player, 0); //check MouseStatus class in control package for comments of this method
			}
		});
		MouseStatus.state(panel, menuBg, btnSong3, 3, player, i); //check MouseStatus class in control package for comments of this method

		setSSBg(panel, menuBg, BackgroundList.getBg(i)); //sets default background
	}
	
	//method for setting background according to song cover/no song cover
	public static void setSSBg(JPanel panel, JLabel menuBg, String image_bg) {
		menuBg.setIcon(new ImageIcon(image_bg));
		menuBg.setBounds(0, 0, 1294, 681);
		panel.add(menuBg);
	}
}
