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
		
		boolean again = false;
		do{
			System.out.print("Password? ");
			String user = kbReader.next(); //gets next user String
			
			switch (user) { //switch to check user's attempt for password
			
				case "Hello":
					admin = true;
					System.out.println("Hello, Admin!");
					break;
					
				default:
					System.out.print("Invalid password. Try again? ");
					again = kbReader.nextBoolean();
					
					//checks if user wants to try password again;
					//if so, repeats passCheck (loop may be better solution)
					//if not, sets admin to false and carries on
					if (again) {
						break;
					}
					else {
						again = false;
					}	
					
			} 
		}while(again); //while loop checks the admin var, and if its still true, it repeats the password check
	}
	
	public void loadMenu() { //function that will display options
		
		System.out.print(admin);
	}
	public boolean admin = false; //public boolean for all methods to see if user is admin and work accordingly
	public ArrayList<String> stock = new ArrayList<String>(); //variable list for game names
	
}
