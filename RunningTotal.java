import java.util.Scanner;

public class RunningTotal {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// must initialize current here in order to use a while loop rather than do-while
		int current = -1, total = 0;

		System.out.print("Type in a bunch of values and I'll add them up. ");
		System.out.println("I'll stop you when you type a 0.");

		while (current != 0) {
			System.out.print("Value: ");
			current = keyboard.nextInt();
			total += current;
			// fixed this so it's less awkward as program finishes
			if (current != 0) { 
				System.out.println("Total so far is: " + total);
			}
		}

		System.out.println("The final total is: " + total);
	}
}