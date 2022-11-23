/**
 * Identifies acceptable staff to access the system.
 */
public class Staff {

	private static final String[] employeeID = {
			"manager",
			"employee",
			"test"
	};

	/**
	 * Verifies ID.
	 * @param idToValidate ID from employee accessing the system
	 * @return valid entry to system if correct
	 */
	public static boolean isEmployeeID(String idToValidate) {
		for (String ID : employeeID) {
			if (ID.equals(idToValidate)) {
				return true;
			}
		}
		return false;
	}

}