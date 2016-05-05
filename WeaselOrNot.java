import java.util.Scanner;

public class WeaselOrNot {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String word;

		System.out.println( "Type the word \"weasel\" please." );
		word = keyboard.next();

		System.out.println( "Requested word typed: " +  word.equals("weasel") );
	}
}