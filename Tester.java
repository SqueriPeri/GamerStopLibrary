/**
 * tester
 * @author rb057954
 * tests inventory class
 */
import java.util.*;
import java.io.*;

public class Tester {
	public static void main(String[] args) {
		//initiates new store object
		Inventory store = new Inventory();
		Scanner kb = new Scanner(System.in);
		boolean r = false;
		
		//loop will repeat if user does not enter a valid input
		do {
			System.out.print("Admin? ");
			String a = kb.next().toLowerCase(); //takes keyboard input and initiates it in lower case
			
			switch (a.charAt(0)) { //checks first character of user input; i might move this to a separate fuction
					       //so it can be called any time, making code less clunky.	
				
				//if user enters yes or true, calls the passCheck function
				//then sets repeat boolean to false
				case 'y':
				case 't':
					r = false;
					store.passCheck();
					
					break;
				
				//if user says no or false, does not call passCheck
				//then sets repeat boolean to false
				case 'f':
				case 'n':
					r = false;
					break;
				
				//if user input is invalid, set repeat to true so user can try again
				default:
					System.out.println("Invalid.");
					r = true;
					break;
			}
			
		} while(r);
		store.loadMenu();
		
		
	}

}
