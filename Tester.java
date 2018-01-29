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
		System.out.print("Admin? ");
		boolean a = kb.nextBoolean();
		if (a == true) {
			store.passCheck();
		}
		
		
		

	}

}
