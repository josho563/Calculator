package Calculator;

import java.util.Scanner;

public class MenuCalc {
	Scanner scan = new Scanner(System.in);
	public void menu() {

		boolean on = true;
		String method = "";
		double numb1;
		double numb2;

		// step 1 Welcome
	
		while (on) {
			System.out.println("Hello Welcome to the Calculator");
			System.out.println("Please press enter to start");
			System.out.println("press 1 for addition");
			System.out.println("press 2 for subtraction");
			System.out.println("press 3 for multiplication");
			System.out.println("press 4 for division");
			method = this.scan.nextLine();
			switch (method) {
			
			case "1":
				// addition
				System.out.println("Please enter the first number");
				numb1 = scan.nextDouble();
				System.out.println("Please enter the second number");
				numb2 = scan.nextDouble();
				System.out.println("Your Answer is: ");
				System.out.println(CalculatorScan.addition(numb1, numb2));
				scan.nextLine();
				break;

			case "2":
				// subtraction
				System.out.println("Please enter the first number");
				numb1 = scan.nextDouble();
				System.out.println("Please enter the second number");
				numb2 = scan.nextDouble();
				System.out.println("Your Answer is: ");
				System.out.println(CalculatorScan.subtraction(numb1, numb2));
				scan.nextLine();
				break;

			case "3":
				// multiplication
				System.out.println("Please enter the first number");
				numb1 = scan.nextDouble();
				System.out.println("Please enter the second number");
				numb2 = scan.nextDouble();
				System.out.println("Your Answer is: ");
				System.out.println(CalculatorScan.multiplication(numb1, numb2));
				scan.nextLine();
				break;

			case "4":
				// division
				System.out.println("Please enter the first number");
				numb1 = scan.nextDouble();
				System.out.println("Please enter the second number");
				numb2 = scan.nextDouble();

				System.out.println("Your Answer is: ");
				System.out.println(CalculatorScan.division(numb1, numb2));
				scan.nextLine();
				break;

			case "0":
				on = false;
				System.out.println("Goodbye");
				break;
			default:
			System.out.println("Please Re-attempt");
			}
		}
	}
}
