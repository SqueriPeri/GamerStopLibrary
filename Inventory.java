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
	
	
	/**
	 * loadMenu
	 * loads a menu of things for the user to choose; stuff like "Add game" or "Search library" then
	 * functions accordingly
	 */
	public void loadMenu() {
		System.out.print(admin);
	}
	
	/**
	 * YesOrNo
	 * Takes user input, looking for Yes, No, True, or false
	 * and returns a boolean from that; if yes or true, return true; vice versa
	 * This is to reduce clutter in code, as we can call the statement at any time
	 */
	public boolean yesOrNo() {
		Scanner kbReader = new Scanner(System.in);
		boolean r = false;
		do {
			
			String a = kbReader.next().toLowerCase(); //takes keyboard input and initiates it in lower case
			switch (a.charAt(0)) { //checks first character of user input
				
				//if user enters yes or true, calls the passCheck function
				//then sets repeat boolean to false
				case 'y':
				case 't':
					r = false;
					return true;
					
					//break;
				
				//if user says no or false, does not call passCheck
				//then sets repeat boolean to false
				case 'f':
				case 'n':
					r = false;
					break;
				
				//if user input is invalid, set repeat to true so user can try again
				default:
					System.out.println("Invalid. Please try again._ ");
					r = true;
					break;
			}
			
		} while(r);
		return false;
	}
	
	public boolean admin = false; //public boolean for all methods to see if user is admin and work accordingly
	public ArrayList<String> stock = new ArrayList<String>(); //variable list for game names
	
}
