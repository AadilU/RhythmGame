package model;

import java.util.ArrayList;

public class BackgroundList {
	
	//method for creating list, adding, storing song background images, and returning image 
	public static String getSongBg(int i) {
	
		ArrayList<String> songBg_images = new ArrayList<String>();		
		songBg_images.add("no bg");
		songBg_images.add("images/song1Bg.png");
		songBg_images.add("images/song2Bg.png");
		songBg_images.add("images/song3Bg.png");
	
		return songBg_images.get(i);
	}
	
	//method for creating list, adding, storing background images, and returning image 
	public static String getBg(int i) {
		
		ArrayList<String> bg_images = new ArrayList<String>();
		bg_images.add("images/bg1.jpg"); 					
		bg_images.add("images/ssbg.jpg");
		bg_images.add("images/ssbg1.png");
		bg_images.add("images/ssbg2.jpg");
	
		return bg_images.get(i);
	}
}	
