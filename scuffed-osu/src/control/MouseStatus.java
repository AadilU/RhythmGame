package control;

import java.awt.Image;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javazoom.jlgui.basicplayer.BasicPlayer;
import model.BackgroundList;
import model.InterfaceList;
import view.BeatmapUI;
import view.BeatmapUI2;
import view.BeatmapUI3;
import view.SongSelectUI;
import view.SongSelectUI2;
import view.SongSelectUI3;

public class MouseStatus {
	
	//method for: stopping current song, playing click sound, and setting visibility to true for ui of song selection or beatmap
	public static void action(BasicPlayer player, int i) {

		AudioStatus.songStop(player); //stops current audio
		AudioStatus.songSet(player, 5); //plays click sound

		switch(i) {
			case 0:
				BeatmapUI frame = new BeatmapUI(); //beatmap for song 1
			    frame.setVisible(true);
			    break;
			
			case 1:
				SongSelectUI frame1 = new SongSelectUI(); //song selection interface and background skin 1
			    frame1.setVisible(true);
			    break;
			    
			case 2:
				SongSelectUI2 frame2 = new SongSelectUI2(); //song selection interface and background skin 2
			    frame2.setVisible(true);
			    break;
			    
			case 3:
				SongSelectUI3 frame3 = new SongSelectUI3(); //song selection interface and background skin 3
				frame3.setVisible(true);
				break;
				
			case 4:
				BeatmapUI2 frame4 = new BeatmapUI2(); //beatmap for song 2
				frame4.setVisible(true);
			    break;
			    
			case 5:
				BeatmapUI3 frame5 = new BeatmapUI3(); //beatmap for song 3
				frame5.setVisible(true);
			    break;
		}
	}
	
	
	//method for: (depending on if mouse is in or out of bounds of button) switches between original and alt image, plays song according to selection, and sets background according to song
	public static void state(JPanel panel, JLabel menuBg, JButton btnSong, int j, BasicPlayer player, int i) {	
		
		java.awt.Image image0 = new ImageIcon(InterfaceList.getHoverOff(i)).getImage(); 	//creating original and alt image object to display between mouse hovering on or off button
		java.awt.Image image1 = new ImageIcon(InterfaceList.getHoverOn(i)).getImage(); 
		
		btnSong.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) 	{
				btnSong.setIcon(new ImageIcon(image1));
				SongSelectUI.setSSBg(panel, menuBg, BackgroundList.getSongBg(j)); //check SongSelectUI class in view package for comments of this method
				AudioStatus.songSet(player, j); //check AudioStatus class in control package for comments of this method
			}
			
			public void mouseExited(MouseEvent e) {
				btnSong.setIcon(new ImageIcon(image0));
				SongSelectUI.setSSBg(panel, menuBg, BackgroundList.getBg(i)); //check SongSelectUI class in view package for comments of this method
				AudioStatus.songStop(player); //check AudioStatus class in control package for comments of this method
			}
		});
	}
}
