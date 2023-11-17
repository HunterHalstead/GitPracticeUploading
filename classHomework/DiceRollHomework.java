import java.util.*;
import java.util.concurrent.TimeUnit;

public class DiceRollHomework {

	public static void main(String[] args) {
		int randomDiceRoll = 0;
		Scanner keyB = new Scanner(System.in);
		int usersGuess = 0;
		
		randomDiceRoll = (int) (10 * Math.random() + 1);
				
		System.out.println("Hello, let's roll a dice. Are you feeling lucky?");
		System.out.println("Enter a number between 1 and 6:");
		usersGuess = keyB.nextInt();
		keyB.nextLine();
		
		System.out.println("Rolling...");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.format("And the number was %d\n", randomDiceRoll);
		
		if (usersGuess == randomDiceRoll) {
			System.out.println("Congratulations!");
		}
		else {
			System.out.println("Better Luck next time.");
		}
		
		keyB.close();
	}

}
