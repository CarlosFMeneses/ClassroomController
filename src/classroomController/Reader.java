/**
 * 
 */
package classroomController;

import java.util.Scanner;

/**
 * @author carlosfmeneses
 * ClassController.java 
 * created 3/11/2019 | updated 3/22/2019
 */

class Reader {
	static private Scanner myScanner = new Scanner(System.in);
	static private String myString;
	static private int myInt;

	/**
	 * @param args
	 */
	Reader() {
	}

	/**
	 * @return the myString
	 */
	static public String getMyString() {
		myString = myScanner.nextLine();
		return myString;
	}

	/**
	 * @return the myInt
	 */
	static public int getMyInt() {
		while (!myScanner.hasNextInt()) {
			System.out.print("Invalid quantity. Please enter a number: ");
			myString = myScanner.nextLine();
		}
		myInt = Integer.parseInt(myScanner.nextLine());
		return myInt;
	}

	static public void clrScreen() {
		for (int clr = 0; clr < 20; clr++) {
			System.out.println("\b");
		}
	}

}