/**
 * ClassController.java
 * @author carlosfmeneses
 * Created on 3/8/2019
 * Modified on 3/23/2019
 */
package classroomController;

/**
 * The Class ClassController.
 */
class ClassController {
	
	/** The students max. */
	
	/** The students quantity. */
	static int studentsQuantity = 0;
	
	/** The lights max. */
	
	/** The lights quantity. */
	static int lightsQuantity = 0;
	
	/** The user selection. */
	static String userSelection;
	
	/** The current classroom. */
	static Classroom currentClassroom = new Classroom(studentsQuantity, lightsQuantity);

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		while (true) {
			menu();
			commandSelection();
			Reader.clrScreen();
			
		}
	}

	/**
	 * Menu.
	 */
	private static void menu() {
		studentsQuantity = currentClassroom.getStudentsQuantity();
		lightsQuantity = currentClassroom.getLightsQuantity();
		
		System.out.print("Students: " + studentsQuantity  
				+ "\n"
				+ "Lights: " + lightsQuantity 
				+ "\n\n"
				+ "(A) Add students \n" 
				+ "(R) Remove students \n" 
				+ "(L) Lights on \n" 
				+ "(O) Lights off \n"
				+ "(Q) Quits program \n"
				+ "\n");
	}

	/**
	 * Command selection.
	 */
	private static void commandSelection() {
		String userCommand;
		boolean isValid;

		System.out.print("Enter command: ");

		do {
			isValid = true;
			userCommand = (Reader.getMyString()).toUpperCase();
			
			switch (userCommand) {
			case "A":
				Classroom.addStudents(true);
				break;

			case "R":
				Classroom.addStudents(false);
				break;

			case "L":
				Classroom.onLights(true);
				break;

			case "O":
				Classroom.onLights(false);
				break;

			case "Q":
				quit();
				break;

			default:
				isValid = false;
				System.out.print("Invalid command (" + userCommand + "). Please enter command: ");
			}

		} while (!isValid);

	}

	/*
	 * Used for debugging
	 * from Printing A Stack Trace Anywhere In Java 
	 * by Ben McCann
	 * http://www.benmccann.com/printing-a-stack-trace-anywhere-in-java/
	 */
	/**
	 * Quit.
	 */
	/*
	 * private static void outputStackTrace() {
	 * System.out.println("Printing stack trace:"); StackTraceElement[] elements =
	 * Thread.currentThread().getStackTrace(); for (int i = 1; i < elements.length;
	 * i++) { StackTraceElement s = elements[i]; System.out.println("\tat " +
	 * s.getClassName() + "." + s.getMethodName() + "(" + s.getFileName() + ":" +
	 * s.getLineNumber() + ")"); }
	 * 
	 * }
	 */
	private static void quit() {
		Reader.clrScreen();
		System.out.println("Goodbye.");
		//outputStackTrace();
		System.exit(0);
		return;

	}

}
