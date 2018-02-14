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
	
	/**
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
		Scanner kb = new Scanner(System.in);
		System.out.println(admin);
		
		boolean quit = false;
		do{
		
			System.out.println("What would you like to do today?\n"
						+ "A: Show Library");
			if (admin) {
				System.out.print("B: Add Item\n"
							+ "C: Remove Item\n");
			}
			System.out.print("D: Quit");
			char choice = kb.nextLine().charAt(0);
			switch(choice) {
			
				case 'A':
				case 'a':
					System.out.println("You said 'A' \n");//call showLibrary method
					showLibrary();
					break;
					
				case 'B':
				case 'b':
					//put lines 86-89 into separate method
					System.out.println("You said 'B' \n");
					addItem();
					break;
					
				case 'C':
				case 'c':
					System.out.println("You said 'C' \n");
					break;
					
				case 'D':
				case 'd':
					System.out.println("You said 'D'. Quitting.");
					quit = true;
					break;
					
				default:
					System.out.println("Please enter a valid choice(A, B, C, or D)");
			
			}
		}while(!quit);
	}
	
	public void showLibrary() {
		//display current library and ask if user wants to sort it
		for (int i = 0; i < quantity; i++) { //as long as index i is less than however many items
											 //are in the library, print out item at i
			System.out.println(stockNames.get(i) + ", " + stockCons.get(i));
		}
	
	}
	
	public void addItem() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Name?");
		String n = kb.nextLine();	//get name of game being added
		System.out.println("Console?");
		String c = kb.nextLine();	//get console of game being added
		Item nItem = new Item(n, c, 2);
		stockNames.add(nItem.reName()); //adds name of item to name array
		stockCons.add(nItem.reConsole()); //adds console to the same spot in console array
		quantity++;
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
	
 	 //number of items in inventory
	public boolean admin = false; //public boolean for all methods to see if user is admin and work accordingly
	public ArrayList<String> stockNames = new ArrayList<String>(); //variable list for game info
	public ArrayList<String> stockCons = new ArrayList<String>(); 
	public int quantity = stockNames.size();
}
