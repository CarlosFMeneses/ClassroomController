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
				+ "\n");
	}

	private static String commandSelection() {
		System.out.print("Enter command: ");
		String userCommand = Reader.getMyString();
		return userCommand;
	}

	private static int commandInteger() {
		System.out.print("Enter quantity: ");
		int userQuantity = Reader.getMyInt();
		return userQuantity;
	}

}
