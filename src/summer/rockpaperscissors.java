package summer;

import java.util.Scanner;

public class rockpaperscissors {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Player One, pick rock, paper, or scissors: ");
		String one = input.next();
		System.out.print("Player Two, pick rock, paper, or scissors: ");
		String two = input.next();
		if (one.equals(two)) {
			System.out.print("It's a tie!");
		}
		else if (one == "rock" && two == "scissors") {
			System.out.print("Rock smashes scissors. Player one wins!");
		}
		else if (one == "scissors" && two == "paper") {
			System.out.print("Rock smashes scissors. Player two wins!");
		}
		else if (one == "scissors" && two == "paper") {
			System.out.print("Scissors cuts paper. Player one wins!");
		}
		else if (one == "paper" && two == "scissors") {
			System.out.print("Scissors cuts paper. Player two wins!");
		}
		else if (one == "paper" && two == "rock") {
			System.out.print("Paper covers rock. Player one wins!");
		}
		else if (one == "rock" && two == "paper") {
			System.out.print("Paper covers rock. Player two wins!");
		}
		else {
			System.out.print("That is not a valid choice.");
		}
	}
}
