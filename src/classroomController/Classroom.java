/**
 * Classroom.java
 * @author carlosfmeneses
 * Created on 3/10/2019
 * Modified on 3/23/2019
 */
package classroomController;

/**
 * The Class Classroom.
 */
class Classroom {
	
	/** The students max. */
	private static int studentsMax;
	
	/** The student quantity. */
	private static int studentQuantity;

	/** The lights max. */
	private static int lightsMax;
	
	/** The lights quantity. */
	private static int lightsQuantity;
	
	/** The user interger. */
	static int userInterger;

	/**
	 * Instantiates a new classroom.
	 *
	 * @param studentsMaxInitiate the students max initiate
	 * @param studentInitiate the student initiate
	 * @param lightsMaxInitiate the lights max initiate
	 * @param lightInitiate the light initiate
	 */
	Classroom(int studentsMaxInitiate, int studentInitiate, int lightsMaxInitiate, int lightInitiate) {
		studentsMax = studentsMaxInitiate;
		studentQuantity = studentInitiate;
		lightsMax = lightsMaxInitiate;
		lightsQuantity = lightInitiate;
	}

	/**
	 * Adds the students.
	 *
	 * @param isTrue the is true
	 */
	public static void addStudents(boolean isTrue) {
		System.out.print("Enter quantity: ");
		int userQuantity = Reader.getMyInt();
		if (isTrue) {
			setStudentsQuantity(studentQuantity + userQuantity);
		} else {
			setStudentsQuantity(studentQuantity - userQuantity);
		}

	}

	/**
	 * On lights.
	 *
	 * @param isTrue the is true
	 */
	public static void onLights(boolean isTrue) {
		System.out.print("Enter quantity: ");
		int userQuantity = Reader.getMyInt();
		if (isTrue) {
			setLightsQuantity(lightsQuantity + userQuantity);
		} else {
			setLightsQuantity(lightsQuantity - userQuantity);
		}

	}

	/**
	 * Gets the students quantity.
	 *
	 * @return the students quantity
	 */
	public int getStudentsQuantity() {
		return studentQuantity;
	}

	/**
	 * Sets the students quantity.
	 *
	 * @param quantity the new students quantity
	 */
	public static void setStudentsQuantity(int quantity) {
		if (quantity < 0) {
			studentQuantity = 0;
		} else if (quantity > studentsMax) {
			studentQuantity = studentsMax;
		} else {
			studentQuantity = quantity;
		}
	}

	/**
	 * Gets the lights quantity.
	 *
	 * @return the lights quantity
	 */
	public int getLightsQuantity() {
		return lightsQuantity;
	}

	/**
	 * Sets the lights quantity.
	 *
	 * @param quantity the new lights quantity
	 */
	public static void setLightsQuantity(int quantity) {
		if (quantity < 0) {
			lightsQuantity = 0;
		} else if (quantity > lightsMax) {
			lightsQuantity = lightsMax;
		} else {
			lightsQuantity = quantity;
		}
	}

}
