package classWork;

import java.util.Scanner;
//	ctrl + shift + f, auto formats code

public class IfElseExamples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		System.out.println("Are you over 21?");
//		String response = "no";
//		response = scanner.nextLine();
//		if (response.equals("yes")) {
//			System.out.println("Here's your drink");
//		}

		System.out.println("Enter Age?");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Do you live in the US?");
		String livesInTheUS = "no";
		livesInTheUS = scanner.nextLine();
		
//		boolean humid;
//		boolean isHumid;
		
//		if (!livesInTheUS.toLowerCase().contains("y")) {
//			 if (age >= 18) {
//				 System.out.println("Here drink");
//			 }
//			 else {
//				 System.out.println("no");
//			 }
//		
//		}
//		else {
//			if (age >= 21) {
//				System.out.println("drnk");
//			}
//			else {
//				System.out.println("n");
//			}
//		}
		
		if ((age >= 21) || ( (!livesInTheUS.toLowerCase().contains("y") && (age >= 18)))) {
			System.out.println("drnk");
		}
		else {
			System.out.println("no drnk");
		}
		
		scanner.close();
	}

}
