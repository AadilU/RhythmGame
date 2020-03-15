package view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BtnDefault {
	public static void appear(JButton btnSong, Image image) {
		btnSong.setIcon(new ImageIcon(image));
		btnSong.setOpaque(false);
		btnSong.setBorderPainted(false);
		btnSong.setContentAreaFilled(false);
			
	}
}
