package berry.valerie;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		char dot = '\u272A';
		char emptySpace = '\u00B7';
		String choice;
		int x = 0;
		int y = 0;
		
		while(true) {
			
			System.out.println();
			
			for (int i = 9; i >= 0; i--) {
			
				for (int j = 0; j <= 9; j++) {
				//	System.out.print("* "); 
					
					if (i != y) {
						System.out.print(emptySpace + " ");
						
					} else {
						if (j == x) { System.out.print(dot + " "); }
						else { System.out.print(emptySpace + " "); }
					}
					
				}
				System.out.println();
			}
		
			System.out.println("Choose an option below");
			System.out.println("w) move up");
			System.out.println("a) move left");
			System.out.println("s) move down");
			System.out.println("d) move down");
			System.out.println("q) quit game");
			
			choice = sc.nextLine().toLowerCase();
			
			switch (choice) {
			case "w":
				if (y != 9) { y++; }
				else { System.out.println("Dot can't go any higher"); }
				break;
				
			case "a":
				if (x != 0) { x--; }
				else { System.out.println("Dot can't go left anymore"); }
				break;
			
			case "s":
				if (y != 0) { y--; }
				else { System.out.println("Dot can't go any lower"); }
				break;
				
			case "d":
				if (x != 9) { x++; }
				else { System.out.println("Dot can't go right anymore"); }
				break;
				
			case "q":
				System.out.println("Goodbye, thanks for playing!");
				System.exit(0);
				
			default:
				System.out.println("Please choose a valid option :)");
			
			}
			
		}
		
	}

}
