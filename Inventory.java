/**
 * 
 * Inventory
 * 		sort game library that can be accessed by user. 
 * need to save items entered to database
 */
import java.util.*;
import java.io.*;


public class Inventory {
	public Inventory () {
	
	}
	
	/*
	 * passCheck
	 * checks if what the user entered is correct
	 * if wrong, prompts if they want to try again
	 * goes again if answer is yes
	 */
	public void passCheck() {
		Scanner kbReader = new Scanner(System.in); //new scanner that reads kb
		System.out.print("Password? ");
		String user = kbReader.next(); //gets next user String
		
		//checks user to see if the password was correct
		if (user.equals("Hello")) { 
			System.out.println("Hello, Admin ");
			admin = true;
		}
		else {
			System.out.println("Wrong password. Try again? ");
			//working on calling another method
			boolean again = kbReader.nextBoolean();
			if (again) {
				passCheck();
			}
			else {
				admin = false;
			}
			
		}
	
	}
	
	public void passAgain(boolean b) {
		
	}

	public boolean admin = true;
	public ArrayList<String> stock = new ArrayList<String>(); //variable list for game names
	
}
