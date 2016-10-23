package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String ask = JOptionPane.showInputDialog("do you like Iron man?");

		// 2. If they say "yes", tell them they will rule the world.
				if(ask.equals("yes")){
					System.out.println("you will rule the world");
					
				}
				
				
	

		// 3. Otherwise, wish them good luck washing dishes.
	else {
		
		System.out.println("Sorry you will be a servant");
	}
	}
}


