public class ClubBouncer {
	public static void main(String[] args) {
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";

		if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8 ) ) {
			System.out.println("You are allowed to enter the club.");
		}
		// System.out.println(); will not compile because the else must be
		// directly after the if statement
		else {
			System.out.println("You are not allowed to enter the club.");
		}
	}
}