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
	
	/**
	 * @param args
	 */
	static Classroom currentClassroom = new Classroom(studentsMax, studentsQuantity, lightsMax, lightsQuantity);

	public static void main(String[] args) {
		menu();
		Reader.clrScreen();
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
		commandSelection();
	}

	private static void commandSelection() {
		System.out.print("Enter command: ");
		String userCommand = Reader.getMyString();
		System.out.println("Your command: " + userCommand + "\n");
		commandInteger();
	}

	private static void commandInteger() {
		System.out.print("Enter quantity: ");
		int userQuantity = Reader.getMyInt();
		System.out.println("Your quantity: " + userQuantity);
	}

}
