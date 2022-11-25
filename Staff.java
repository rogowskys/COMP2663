/**
 * (Write a succinct description of this class here. You should avoid
 * wordiness and redundancy. )
 *
 * Bugs: (a list of bugs and other problems)
 * 
 * @author Kylie DeViller (162298d) <162298d@ACADIAU.CA>; and Sean Rogowsky (134715r) 134715r@ACADIAU.CA> 
 */

public class Staff {

	private static final String[] employeeID = {
			"manager",
			"employee",
			"test"
	};

	/**
	 * Verifies ID.
	 *
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