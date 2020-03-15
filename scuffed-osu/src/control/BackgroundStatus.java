package control;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BackgroundStatus {
	
	public static String setBg(int i) {
	
	ArrayList<String> bg_images = new ArrayList<String>();
	bg_images.add("images/bg1.jpg"); 					
	bg_images.add("images/song1Bg.png");
	bg_images.add("images/song2Bg.png");
	bg_images.add("images/song3Bg.png");
	
	return bg_images.get(i);
	
	}
}
