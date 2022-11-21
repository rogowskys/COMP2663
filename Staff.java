public class Staff {

	private static final String[] employeeID = {
			"manager",
			"employee",
			"test"
	};

	/**
	 * @param idToValidate
	 * @return
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