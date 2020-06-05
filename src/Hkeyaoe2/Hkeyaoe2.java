package Hkeyaoe2;

import java.awt.BorderLayout;
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
	public Hkeyaoe2 (String x) {
		

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				JFrame frame = new JFrame("Hkeyaoe2");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				BufferedImage img = null;
				try {
					img = ImageIO.read(getClass().getResource ("/images/"+x)); 
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(1);
				}
				ImageIcon imgIcon = new ImageIcon(img);
				JLabel lbl = new JLabel();
				lbl.setIcon(imgIcon);
				frame.getContentPane().add(lbl, BorderLayout.CENTER);
				frame.pack();
				frame.setLocationRelativeTo(null); 
				frame.setVisible(true);
				
			}
		})
		
		;
	}
	public static void main(String[] args) throws Exception {
		if (t = true) {
			while (true){
			rand = random.nextInt(25);
			if(rand !=0) break;   
			}  
			
			new Hkeyaoe2(building [rand]);
			isCorrect(5);
		}
	}      
}
