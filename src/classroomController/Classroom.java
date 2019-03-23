/**
 * 
 */
package classroomController;

/**
 * @author carlosfmeneses
 * ClassController.java 
 * created 3/10/2019 | updated 3/22/2019
 */

class Classroom {
	private static int studentsMax;
	private static int studentQuantity;

	private int lightsMax;
	private int lightsQuantity;
	
	static int userInterger;

	Classroom(int studentsMaxInitiate, int studentInitiate, int lightsMaxInitiate, int lightInitiate) {
		studentsMax = studentsMaxInitiate;
		studentQuantity = studentInitiate;
		lightsMax = lightsMaxInitiate;
		lightsQuantity = lightInitiate;
	}

	/**
	 * @param modifyStudents
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
	 * @return the studentQuantity
	 */
	public int getStudentsQuantity() {
		return studentQuantity;
	}

	/**
	 * @param studentQuantity the studentQuantity to set
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
	 * @return the lightQuantity
	 */
	public int getLightsQuantity() {
		return lightsQuantity;
	}

	/**
	 * @param lightQuantity the lightQuantity to set
	 */
	public void setLightsQuantity(int lightsQuantity) {
		if (lightsQuantity < 0) {
			this.lightsQuantity = 0;
		} else if (lightsQuantity > lightsMax) {
			this.lightsQuantity = lightsMax;
		} else {
			this.lightsQuantity = lightsQuantity;
		}
	}

}
