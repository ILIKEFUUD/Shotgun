import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Runs the Game
 */
public class PlayGame {
	private static JFrame fightWindow;
	private static JFrame playerInfo = new JFrame("Player Info");
	private static JFrame dialogue = new JFrame("Dialogue");
	private static String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name = "Player";
		//System.out.println("Enter your name: ");
		//Scanner scan = new Scanner(System.in);
		//String name = scan.nextLine();
		shotgunFrame();
		playerInfoFrame(name);
		dialogueFrame();

	}

	private static void shotgunFrame() {
		fightWindow = new JFrame("Shotgun");
		JPanel fightPanel = new JPanel();
		fightWindow.setPreferredSize(new Dimension(1000, 500));
		fightPanel.setBackground(Color.BLACK);

		// Shotgun buttons
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.BLACK);

		JButton shoot = new JButton("Shoot");
		shoot.setSize(new Dimension(10, 10));
		shoot.setBackground(Color.BLACK);
		shoot.setForeground(Color.GREEN);

		JButton reload = new JButton("Reload");
		reload.setSize(new Dimension(10, 10));
		reload.setBackground(Color.BLACK);
		reload.setForeground(Color.GREEN);

		JButton shield = new JButton("Shield");
		shield.setSize(new Dimension(10, 10));
		shield.setBackground(Color.BLACK);
		shield.setForeground(Color.GREEN);
		// add buttons
		buttonPanel.add(shoot);
		buttonPanel.add(reload);
		buttonPanel.add(shield);

		fightWindow.setLayout(new BorderLayout());
		fightWindow.add(fightPanel);
		fightWindow.add(buttonPanel, BorderLayout.SOUTH);
		fightWindow.pack();
		fightWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fightWindow.setVisible(true);
	}

	private static void playerInfoFrame(String name) {
		playerInfo.setTitle(name + " info");
		playerInfo.setPreferredSize(new Dimension(1000, 225));
		playerInfo.setBackground(Color.BLACK);
		JPanel infoPanel = new JPanel();
		infoPanel.setBackground(Color.BLACK);
		
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.BLACK);

		// PlayerInfo buttons
		JButton addShoot = new JButton("+Attack");
		addShoot.setSize(new Dimension(10, 10));
		addShoot.setBackground(Color.BLACK);
		addShoot.setForeground(Color.GREEN);

		JButton addReload = new JButton("+Reloads");
		addReload.setSize(new Dimension(10, 10));
		addReload.setBackground(Color.BLACK);
		addReload.setForeground(Color.GREEN);

		JButton addShield = new JButton("+Defense");
		addShield.setSize(new Dimension(10, 10));
		addShield.setBackground(Color.BLACK);
		addShield.setForeground(Color.GREEN);
		
		buttonPanel.add(addShoot);
		buttonPanel.add(addReload);
		buttonPanel.add(addShield);
		
		fightWindow.setLayout(new BorderLayout());

		playerInfo.add(infoPanel);
		playerInfo.add(buttonPanel, BorderLayout.SOUTH);
		playerInfo.pack();
		playerInfo.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		playerInfo.setLocation(0, 500);
		playerInfo.setVisible(true);
	}
	
	private static void dialogueFrame(){
		dialogue.setPreferredSize(new Dimension(350,725));
		JPanel dialoguePanel = new JPanel();
		dialoguePanel.setBackground(Color.BLACK);
		dialoguePanel.setLayout(new BorderLayout());
		
		JLabel wordLabel = new JLabel();
		
		dialogue.add(dialoguePanel);
		dialogue.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		dialogue.setLocation(1000,0);
		dialogue.pack();
		dialogue.setVisible(true);
		
	}
	
	

}
