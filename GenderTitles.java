import java.util.Scanner;

public class GenderTitles {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String title;

		System.out.print("First name: ");
		String first = keyboard.next();
		System.out.print("Last name: ");
		String last = keyboard.next();
		System.out.print("Gender (M/F): ");
		String gender = keyboard.next();
		System.out.print("Age: ");
		int age = keyboard.nextInt();

		if (age < 20) {
			title = first;
		}
		else {
			if ( gender.toLowerCase().equals("f") ) {
				System.out.print("Are you married, " + first + "? (Y/N): ");
				String married = keyboard.next();
				if (married.toLowerCase().equals("y")) {
					title = "Mrs.";
				}
				else {
					title = "Ms.";
				}	
			}
			else if ( gender.toLowerCase().equals("m") ) {
				title = "Mr.";
			}
			else {
				System.out.println("You seem unsure about your gender. Pick your title: ");
				title = keyboard.next();
			}
		}	
		System.out.println( "\n" + title + " " + last );
	}
}