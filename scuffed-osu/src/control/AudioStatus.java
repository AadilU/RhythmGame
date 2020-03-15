package control;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class AudioStatus {
	public static void SongSet(BasicPlayer player, int i) {

		//arraylist of audio files
		ArrayList<String> songs = new ArrayList<String>();
		songs.add("no song"); 
		songs.add("audio/carnation.mp3");
		songs.add("audio/armageddon.mp3");
		songs.add("audio/dualfractal.mp3");
		songs.add("audio/blendw.mp3");
		songs.add("audio/click2.wav");
		
		String pathToFile = System.getProperty("user.dir") +"/"+ songs.get(i);

			try {
			    player.open(new URL("file:///" + pathToFile));
			    player.play();
			} catch (BasicPlayerException | MalformedURLException e1) {
			    e1.printStackTrace();
			}
	}
	
	public static void SongStop(BasicPlayer player) {
			try {
				player.stop(); 
			} catch (BasicPlayerException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
}
