package model;

import java.util.ArrayList;

public class InterfaceList {
	
	//method for creating list, adding, storing song selection background images, and returning image
	public static String getSSBG(int i) {
	
		ArrayList<String> ssbg_images = new ArrayList<String>();
		ssbg_images.add("no skin");
		ssbg_images.add("images/ssbg.jpg");
		ssbg_images.add("images/ssbg1.png");
		ssbg_images.add("images/ssbg2.jpg"); 
		
		return ssbg_images.get(i);
	}
	
	//method for creating list, adding, storing song selection button (hover off) images, and returning image
	public static String getHoverOff(int i) {
		
		ArrayList<String> hoverOFF_images = new ArrayList<String>();
		hoverOFF_images.add("no skin");
		hoverOFF_images.add("images/ssbtn_hoverOFF.png"); 
		hoverOFF_images.add("images/ssbtn_hoverOFF1.png");
		hoverOFF_images.add("images/ssbtn_hoverOFF2.png"); 
		
		return hoverOFF_images.get(i);
	}
	
	//method for creating list, adding, storing song selection button (hover on) images, and returning image
	public static String getHoverOn(int i) {
		
		ArrayList<String> hoverON_images = new ArrayList<String>();
		hoverON_images.add("no skin");
		hoverON_images.add("images/ssbtn_hoverON.png"); 
		hoverON_images.add("images/ssbtn_hoverON1.png"); 
		hoverON_images.add("images/ssbtn_hoverON2.png"); 
		
		return hoverON_images.get(i);
	}
	
	//method for creating list, adding, storing song selection interface bottom panel images, and returning image
	public static String getSSIbot(int i) {
		
		ArrayList<String> SSIbot_images = new ArrayList<String>();
		SSIbot_images.add("no skin");
		SSIbot_images.add("images/ssi_bot.png");
		SSIbot_images.add("images/ssi_bot1.png"); 
		SSIbot_images.add("images/ssi_bot2.png"); 
		
		return SSIbot_images.get(i);
	}
	
	//method for creating list, adding, storing song selection interface top panel images, and returning image
	public static String getSSItop(int i) {
		
		ArrayList<String> SSItop_images = new ArrayList<String>();
		SSItop_images.add("no skin");
		SSItop_images.add("images/ssi_top.png"); 
		SSItop_images.add("images/ssi_top1.png"); 
		SSItop_images.add("images/ssi_top2.png"); 
		
		return SSItop_images.get(i);
	}
	
	//method for creating list, adding, storing skin selection interface images, and returning image
	public static String getCS(int i) {
		
		ArrayList<String> CS_images = new ArrayList<String>();
		CS_images.add("no skin");
		CS_images.add("images/ssbtn_cs.png"); 
		CS_images.add("images/ssbtn_cs1.png"); 
		CS_images.add("images/ssbtn_cs2.png"); 
		
		return CS_images.get(i);
	}
	
	//method for creating list, adding, storing song titles
	public static String getSongTitle(int i) {
		
		ArrayList<String> songTitle = new ArrayList<String>();
		songTitle.add(""); //blank (no title)
		songTitle.add("adrenaline!!! - TrySail"); 
		songTitle.add("True Blue - dj TAKA"); 
		songTitle.add("Dream - Radpit"); 
		
		return songTitle.get(i);
	}
	
	
}
