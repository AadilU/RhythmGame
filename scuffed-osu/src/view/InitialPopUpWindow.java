package view;
import java.awt.EventQueue; 

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import control.AudioStatus;
import control.MouseStatus;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
public class InitialPopUpWindow extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitialPopUpWindow frame = new InitialPopUpWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public InitialPopUpWindow() {
		
		//setting up song and audio sound effect to play during menu
		BasicPlayer player = new BasicPlayer();
		AudioStatus.songSet(player, 0);
		
		//creating frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1270, 720);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 0, 1323, 702);
		getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnStart = new JButton("laggy version");
		btnStart.setBounds(243, 565, 233, 62);
		panel.add(btnStart);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				AudioStatus.songStop(player);
				MainMenu.main(null);
				dispose();
			}
		});
		
		JButton btnNotLaggyVersion = new JButton("not laggy version");
		btnNotLaggyVersion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AudioStatus.songStop(player);
				MainMenuNotLaggyVersionButHasNoAudio.main(null);
				dispose();
			}
		});
		btnNotLaggyVersion.setBounds(529, 565, 233, 62);
		panel.add(btnNotLaggyVersion);
		
		JTextPane txtpnBeforeAspectsOf = new JTextPane();
		txtpnBeforeAspectsOf.setText("testing note:\r\n\r\nbefore aspects of the code for visual effects that occur alongside code for changes in music can execute, the code that plays audio needs time to close a stream before opening a new one\r\nthe piece of code that plays and stops music is slow af (using basic player 3.0).\r\nthis results in a \"lagging\" effect, bc visual effects and starting/stoping music can't happen simultaneously as the code executes top to bottom, line by line. \r\n\r\nto reduce the lag, you can run a version without sound effects and music in the starting screen and song selection screen.\r\nmusic can resume once the beatmap is started as there wont be any sudden opening/closing of streams, but beatmaps are still WIP\r\n\r\nor you can run a version thats laggy but has sound effects and music in the starting screen and song selection screen.\r\n\r\n*if u are gonna edit code for the main project, do so in a class that is not \"...NotLaggyVersionButHasNoAudio\" bc those r only temporary rn\r\n\r\n- cory :3");
		txtpnBeforeAspectsOf.setBounds(0, 21, 975, 531);
		panel.add(txtpnBeforeAspectsOf);
		
		
		
	}
}

