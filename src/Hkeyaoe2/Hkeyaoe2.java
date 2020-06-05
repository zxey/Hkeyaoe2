package Hkeyaoe2;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Hkeyaoe2 {
	
	public static Boolean t = true;
	public static Random random = new Random();
	public static int rand = 0;
	public static Scanner sc = new Scanner(System.in);
	public static void isCorrect(int y) {
			
		int b = sc.nextInt();
		System.out.println("b");
		if (b == y ) {
						
		}
	}
	
	public static String [] building = {
			"Archery_range_aoe2DE.png",
	  		"Barracks_aoe2DE.png",
	  		"Blacksmith_aoe2de.png",
	  		"Bombard_tower_aoe2DE.png",
            "Castle_aoe2DE.png",
            "Dock_aoe2de.png",
            "FarmDE.png",
            "Feitoria_aoe2DE.png",
            "Gate_aoe2de.png",
            "GuardTowerDE.png",
            "House_aoe2DE.png",
            "Lumber_camp_aoe2de.png",
            "Market_aoe2DE.png",
            "Mill_aoe2de.png",
            "Mining_camp_aoe2de.png",
            "MonasteryAoe2DE.png",
            "Outpost_aoe2de.png",
            "Palisade_gate_aoe2DE.png",
            "Palisade_wall_aoe2de.png",
            "Siege_workshop_aoe2DE.png",
            "Stable_aoe2DE.png",
            "Stone_wall_aoe2de.png",
            "Towncenter_aoe2DE.png",
            "Universityicon.png",
            "Wonder_aoe2DE.png"
	}
//max index 26
			;
	
	public static int [] keys = {
			KeyEvent.VK_Q, // "Archery_range_aoe2DE.png",
			KeyEvent.VK_W, // "Barracks_aoe2DE.png",
			KeyEvent.VK_E, // "Blacksmith_aoe2de.png",
			/*
			 * "Bombard_tower_aoe2DE.png", "Castle_aoe2DE.png", "Dock_aoe2de.png",
			 * "FarmDE.png", "Feitoria_aoe2DE.png", "Gate_aoe2de.png", "GuardTowerDE.png",
			 * "House_aoe2DE.png", "Lumber_camp_aoe2de.png", "Market_aoe2DE.png",
			 * "Mill_aoe2de.png", "Mining_camp_aoe2de.png", "MonasteryAoe2DE.png",
			 * "Outpost_aoe2de.png", "Palisade_gate_aoe2DE.png", "Palisade_wall_aoe2de.png",
			 * "Siege_workshop_aoe2DE.png", "Stable_aoe2DE.png", "Stone_wall_aoe2de.png",
			 * "Towncenter_aoe2DE.png", "Universityicon.png", "Wonder_aoe2DE.png"
			 */
	};
	
	public String randBuilding() {
		int rand = random.nextInt(25);
		String b = building[rand];
		return b;
	}

	public Hkeyaoe2 () {
		

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				JFrame frame = new JFrame("Hkeyaoe2");
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				JLabel lbl = new JLabel();
				frame.getContentPane().add(lbl, BorderLayout.CENTER);
				frame.setLocationRelativeTo(null); 
				frame.setVisible(true);

				frame.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent arg0) {
						// TODO Auto-generated method stub
					}
					
					@Override
					public void keyReleased(KeyEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						BufferedImage img = null;
						String x = randBuilding();
						try {
							img = ImageIO.read(getClass().getResource ("/images/"+x)); 
						} catch (IOException ex) {
							ex.printStackTrace();
							System.exit(1);
						}
						ImageIcon imgIcon = new ImageIcon(img);
						lbl.setIcon(imgIcon);
						frame.pack();
						
						
						if ((e.getModifiers() & KeyEvent.CTRL_MASK) != 0) {
							/*
							if (e.getKeyCode() == KeyEvent.VK_Q) {
								System.out.println("Q pressed");
							}
							
							if (e.getKeyCode() == KeyEvent.VK_W) {
								System.out.println("W pressed");
							}
							
							if (e.getKeyCode() == KeyEvent.VK_E) {
								System.out.println("W pressed");
							}
							*/
							
							switch (e.getKeyCode())
							{
							case KeyEvent.VK_Q:
								System.out.println("Q pressed");
								break;
							case KeyEvent.VK_W:
								System.out.println("W pressed");
								break;
							case KeyEvent.VK_E:
								System.out.println("E pressed");
								break;
							}
						}
					}
				});
			}
		})
		
		;
	}
	public static void main(String[] args) throws Exception {
		new Hkeyaoe2();
	}      
}
