package control;

import java.net.MalformedURLException;


import java.net.URL;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import model.AudioList;

public class AudioStatus {
	
	//method for playing song according to index value 
	public static void songSet(BasicPlayer player, int i) {

		String pathToFile = System.getProperty("user.dir") +"/"+ AudioList.getSong(i);

			try {
			    player.open(new URL("file:///" + pathToFile));
			    player.play();
			} catch (BasicPlayerException | MalformedURLException e1) {
			    e1.printStackTrace();
			}
	}
	
	//method for stopping song
	public static void songStop(BasicPlayer player) {

			try {
				player.stop(); 
			} catch (BasicPlayerException e1) {
				e1.printStackTrace();
			}
	}
}
