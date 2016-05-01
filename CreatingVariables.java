public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, days;
		double seconds, e, checking, pi;
		String firstName, lastName, title, city, state;

		x = 10;
		y = 400;
		age = 39;
		days = 31;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		pi = 3.14159265359;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		city = "Lahaina";
		state = "Hawaii";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );

		// My additions for study drills
		System.out.println( "There are " + days + " in the month of May." );
		System.out.println( "I live in " + city + ", " + state + "." );
	}
}