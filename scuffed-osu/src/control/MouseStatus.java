package control;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javazoom.jlgui.basicplayer.BasicPlayer;

public class MouseStatus {
	public static void state(JButton btnSong1, Image image0, Image image1, BasicPlayer player, int i) {
				
		btnSong1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) 	{
				btnSong1.setIcon(new ImageIcon(image1));
				AudioStatus.songSet(player, 2);
			}
			public void mouseExited(MouseEvent e) {
				btnSong1.setIcon(new ImageIcon(image0));
				AudioStatus.songStop(player);	
			}
		});
	}
}
