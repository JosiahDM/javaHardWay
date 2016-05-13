import java.util.Scanner;

public class EnterPIN {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String password = "p@ssw0rd";
		String input;
		int tries = 0;

		pin = 12345;

		System.out.println("WELCOME TO THE BANK OF JAVA.");
		
		System.out.print("ENTER YOUR PASSWORD: ");
		input = keyboard.next();
		
		while (!input.equals(password)) {
			tries++;
			System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
			System.out.print("ENTER YOUR PASSWORD: ");
			input = keyboard.next();
			if (tries > 2) {
				System.out.println("TOO MANY ATTEMPTS. LOGIN FAILED.");
				System.exit(1);
			}
		}

		System.out.print("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();

		while (entry != pin) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nLOGIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
	}
}