/**
 * 
 */
package classroomController;

/**
 * @author carlosfmeneses
 * ClassController.java 
 * created 3/8/2019 | updated 3/22/2019
 */

class ClassController {
	static int studentsMax = 10;
	static int studentsQuantity = 0;
	
	static int lightsMax = 3;
	static int lightsQuantity = 0;
	
	static String userSelection;
	
	/**
	 * @param args
	 */
	static Classroom currentClassroom = new Classroom(studentsMax, studentsQuantity, lightsMax, lightsQuantity);

	public static void main(String[] args) {
		while (true) {
			menu();
			commandSelection();
			Reader.clrScreen();
			
		}
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

	private static void commandSelection() {
		System.out.print("Enter command: ");
		String userCommand = (Reader.getMyString()).toUpperCase();
		
		boolean isValid = false;
		while (!isValid) {
			switch (userCommand) {
			case "A":
				isValid = true;
				Classroom.addStudents(true);
				break;

			case "R":
				isValid = true;
				Classroom.addStudents(false);
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
				System.out.print("Invalid command (" + userCommand + "). Please enter command: ");
				userCommand = (Reader.getMyString()).toUpperCase();
			}

		}

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

	private static void quit() {
		Reader.clrScreen();
		System.out.println("Goodbye.");
		outputStackTrace();
		System.exit(0);
		return;

	}

}
