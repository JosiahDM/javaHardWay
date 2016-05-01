import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();

		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();

		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();

		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );

		String color;
		System.out.print( "Just kidding, one more question.\n" );
		System.out.print( "What is your favorite color? " );
		color = keyboard.next();
		System.out.println( "Cool, your favorite color is " + color + "!" );


		/* Study drills
		1. No the program does not blow up when you put an integer into a double variable.
		This is because an integer is a more general version of a double. You can assign
		a more general value into a more specific typed variable. But trying to go the
		other way, taking a more specific value like 1.5 and assigning that to an integer,
		won't work.

		2. No it doesn't blow up if you enter a numberic value when it expects a string.
		This is because a string can be a set of numbers. For instance a phone number,
		808-555-5555 might need to be viewed as a string so that math isn't done on the
		values.

		3. Can't get it to blow up for Strings, unless maybe I put in 2147483647 characters
		which is the maximum size an array can be, according to stackoverflow!
		Question 2 can blow up with a double. I did 26.1.
		Blew up question 3 with a string: b.
		Blew up question 4 with the string b also. 

		*/
	}
}