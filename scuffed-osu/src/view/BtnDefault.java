package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BtnDefault {
	
	//method for setting default button properties
	public static void appear(JButton btnSong, String image) {
		btnSong.setIcon(new ImageIcon(image));
		btnSong.setOpaque(false);
		btnSong.setBorderPainted(false);
		btnSong.setContentAreaFilled(false);
			
	}
}
