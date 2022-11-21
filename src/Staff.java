public class Staff {

	enum employeeID {
		manager,
		employee,
		test
	}

	static boolean isEmployeeID(String idToValidate) {
		employeeID[] employees = employeeID.values();
		for (employeeID ID : employees) {
			if (ID.equals(idToValidate)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}