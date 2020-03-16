package control;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class AudioList {
	public static void songSet(BasicPlayer player, int i) {

		//arraylist of audio files
		ArrayList<String> songs = new ArrayList<String>();
		songs.add("no song"); 					
		songs.add("audio/carnation.mp3");
		songs.add("audio/armageddon.mp3");
		songs.add("audio/dualfractal.mp3");
		songs.add("audio/blendw.mp3");
		songs.add("audio/click2.wav");
		
		return songs.get(i);
	}
}
