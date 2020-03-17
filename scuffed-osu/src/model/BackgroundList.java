package model;

import java.util.ArrayList;

public class BackgroundList {
	
	//method for creating list, adding, and storing images 
	public static String getBg(int i) {
	
		ArrayList<String> bg_images = new ArrayList<String>();
		bg_images.add("images/bg1.jpg"); 					
		bg_images.add("images/song1Bg.png");
		bg_images.add("images/song2Bg.png");
		bg_images.add("images/song3Bg.png");
		bg_images.add("images/ssbg1.png");
		bg_images.add("images/ssbg2.jpg");
	
		return bg_images.get(i);
	}
}	
