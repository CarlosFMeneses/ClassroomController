/**
 * 
 */
package classroomController;

/**
 * @author carlosfmeneses
 * ClassController.java 
 * created 3/8/2019 | updated 3/21/2019
 */

class ClassController {
	static int studentsMax = 10;
	static int studentsQuantity = 0;
	
	static int lightsMax = 3;
	static int lightsQuantity = 0;
	
	static String userSelection;
	static int userInterger;
	
	/**
	 * @param args
	 */
	static Classroom currentClassroom = new Classroom(studentsMax, studentsQuantity, lightsMax, lightsQuantity);

	public static void main(String[] args) {
		menu();
		userSelection = commandSelection();
		userInterger = commandInteger();
		Reader.clrScreen();
		System.out.println("Your command: " + userSelection);
		System.out.println("Your quantity: " + userInterger);
		quit();
		return;
	}

	private static void menu() {
		studentsQuantity = currentClassroom.getStudentsQuantity();
		lightsQuantity = currentClassroom.getLightsQuantity();
		
		System.out.print("Students: " + studentsQuantity + "/" + studentsMax 
				+ "\n"
				+ "Lights: " + lightsQuantity + "/" + lightsMax
				+ "\n\n"
				+ "(A) Add students \n" 
				+ "(R) Remove students \n" 
				+ "(L) Lights on \n" 
				+ "(O) Lights off \n"
				+ "(Q) Quits program \n"
				+ "\n");
	}

	private static String commandSelection() {
		System.out.print("Enter command: ");
		String userCommand = (Reader.getMyString()).toUpperCase();
		
		boolean isValid = false;
		while (!isValid) {
			switch (userCommand) {
			case "A":
			case "R":
				isValid = true;
				break;

			case "L":
			case "O":
				isValid = true;
				break;

			case "Q":
				isValid = true;
				quit();
				break;

			default:
				System.out.print("Invalid command. Please enter command: ");
				userCommand = (Reader.getMyString()).toUpperCase();
			}

		}
		return userCommand;
	}

	private static void quit() {
		Reader.clrScreen();
		System.out.println("Goodbye.");
		outputStackTrace();
		System.exit(0);
		return;

	}

	/**
	 * from Printing A Stack Trace Anywhere In Java 
	 * by Ben McCann
	 * http://www.benmccann.com/printing-a-stack-trace-anywhere-in-java/
	 */
	private static void outputStackTrace() {
		System.out.println("Printing stack trace:");
		StackTraceElement[] elements = Thread.currentThread().getStackTrace();
		for (int i = 1; i < elements.length; i++) {
			StackTraceElement s = elements[i];
			System.out.println("\tat " + s.getClassName() + "." + s.getMethodName() + "(" + s.getFileName() + ":"
					+ s.getLineNumber() + ")");
		}

	}

	private static int commandInteger() {
		System.out.print("Enter quantity: ");
		int userQuantity = Reader.getMyInt();
		return userQuantity;
	}

}
