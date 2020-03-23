package model;

import java.util.ArrayList;

public class AudioList {
	
	//method for creating list, adding, storing audio, and returning audio
	public static String getSong(int i) {

		ArrayList<String> songs = new ArrayList<String>();				
		songs.add("audio/osu.mp3");
		songs.add("audio/adrenaline.mp3");
		songs.add("audio/trueblue.mp3");
		songs.add("audio/dream.mp3");
		songs.add("audio/click2.wav");
		
		return songs.get(i);
	}
}
