package control;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javazoom.jlgui.basicplayer.BasicPlayer;
import view.BeatmapUI;
import view.MainMenu;
import view.SongSelectUI;

public class MouseStatus {
	
	public static void action(BasicPlayer player) {
		AudioStatus.songStop(player);
		AudioStatus.songSet(player, 5);
				
		BeatmapUI frame = new BeatmapUI(); 
		frame.setVisible(true); 
		
		}
	
	public static void state(JButton btnSong, Image image0, Image image1, BasicPlayer player, int i) {	
		btnSong.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) 	{
				btnSong.setIcon(new ImageIcon(image1));
				AudioStatus.songSet(player, i);
			}
			public void mouseExited(MouseEvent e) {
				btnSong.setIcon(new ImageIcon(image0));
				AudioStatus.songStop(player);	
			}
		});
	}
}
