package Calculator;

import java.util.Scanner;

public class CalculatorScan {
	public static double result;

	public static double addition(double numb1, double numb2) {
		result = numb1 + numb2;
		return result;
	}
	public static double subtraction(double numb1, double numb2) {
		result = numb1 - numb2;
		return result;
	}
	public static double multiplication(double numb1, double numb2) {
		result = numb1 * numb2;
		return result;
	}
	public static double division(double numb1, double numb2) {
		result = numb1 / numb2;
		return result;
	}
}