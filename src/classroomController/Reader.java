/**
 * Reader.java
 * @author carlosfmeneses
 * Created on 3/11/2019
 * Modified on 3/23/2019
 */
package classroomController;

import java.util.Scanner;

/**
 * The Class Reader.
 */
class Reader {
	
	/** The my scanner. */
	static private Scanner myScanner = new Scanner(System.in);
	
	/** The my string. */
	static private String myString;
	
	/** The my int. */
	static private int myInt;

	/**
	 * Instantiates a new reader.
	 */
	Reader() {
	}

	/**
	 * Gets the my string.
	 *
	 * @return the my string
	 */
	static public String getMyString() {
		myString = myScanner.nextLine();
		return myString;
	}

	/**
	 * Gets the my int.
	 *
	 * @return the my int
	 */
	static public int getMyInt() {
		while (!myScanner.hasNextInt()) {
			System.out.print("Invalid quantity. Please enter a number: ");
			myString = myScanner.nextLine();
		}
		myInt = Integer.parseInt(myScanner.nextLine());
		return myInt;
	}

	/**
	 * Clr screen.
	 */
	static public void clrScreen() {
		for (int clr = 0; clr < 20; clr++) {
			System.out.println("\b");
		}
	}

}