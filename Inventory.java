/**
 * 
 * Inventory
 * 		Timpview Gamer Stop will have windows computers being accessed by 
 * employees and customers. Will be written in Java. Computers won’t 
 * be the greatest, but they will be enough. Program will be class based.
 * Client needs a way to organize inventory by price of games 
 * (client’s selling price and what he bought it for), platforms, used games, 
 * and by where it is in the store. Needs to have Admin (client or employee) 
 * and Guest access, where guest shows limited data. When Admin access is requested, 
 * require password. Program will allow user to search for a game and
 * choose how they want to sort the list, then display all items of the apply 
 * to the criteria. Admin user can enter new sold or bought games if needed. 
 * 
 * We will also need to store items entered into a database for later.
 * https://sites.google.com/view/timpview-computer-science
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
		}
	}


	public boolean admin = true;
	public ArrayList<String> stock = new ArrayList<String>(); //variable list for game names
	
}
