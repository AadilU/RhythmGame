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
import view.BeatmapUI;
import view.SongSelectUI;

public class MouseStatus {
	
	//method for: stopping current song, playing click sound, and setting visibility to true for ui of song selection or beatmap
	public static void action(BasicPlayer player, int i) {
		AudioStatus.songStop(player);
		AudioStatus.songSet(player, 5);
		
			if(i == 0) {
				SongSelectUI frame = new SongSelectUI(); 
				frame.setVisible(true); 
			}
			if(i == 1) {
				BeatmapUI frame = new BeatmapUI(); 
				frame.setVisible(true); 
				}
		}
	
	//method for: (depending on if mouse is in or out of bounds of button) switches between original and alt image, plays song according to selection, and sets background according to song
	public static void state(JPanel panel, JLabel menuBg, JButton btnSong, Image image0, Image image1, int i, BasicPlayer player, int j) {	
		btnSong.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) 	{
				btnSong.setIcon(new ImageIcon(image1));
				AudioStatus.songSet(player, j); //check AudioStatus class in control package for comments of this method
				SongSelectUI.setSSBg(panel, menuBg, BackgroundList.getBg(i));
			}
			public void mouseExited(MouseEvent e) {
				btnSong.setIcon(new ImageIcon(image0));
				AudioStatus.songStop(player); //check AudioStatus class in control package for comments of this method
				SongSelectUI.setSSBg(panel, menuBg, BackgroundList.getBg(0)); //check SongSelectUI class in view package for comments of this method
			}
		});
	}
}
