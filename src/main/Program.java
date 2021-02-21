package main;

import java.util.Scanner;
import java.lang.Math;

public class Program {
	public static void main(String[] args) {
		System.out.println("This is stupid");
		System.out.println("Java sucks :/");
		@SuppressWarnings("resource")
		Scanner Input = new Scanner(System.in);
		boolean goAgain = true;
		while(goAgain) {
			String[] expression = Input.nextLine().split(" ");
			Calculate(expression);
			System.out.println("Go again? (true | false)");
			goAgain = Boolean.parseBoolean(Input.nextLine());			
		}
	}
	private static void Calculate(String[] expression) {
		double result = Double.parseDouble(expression[0]);
		for(int i = 0; i < expression.length; i++) {
			switch(expression[i]) {
			case "+":
				result = Add(result, expression[i+1]);
				break;
			case "-":
				result = Sub(result, expression[i+1]);
				break;
			case "*":
				result = Mul(result, expression[(int) (i+1)]);
				break;
			case "/":
				result = Div(result, expression[i+1]);
				break;
			case "(":
			case ")":
				throw new Error("Not added yet");
			case "^":
				result = Pow(result, expression[i+1]);
				break;
			default:
				break;
			}
		}
		System.out.println(result);
	}
	private static double Add(double a, String b) {
		return a + Double.parseDouble(b);
	}
	private static double Sub(double a, String b) {
		return a - Double.parseDouble(b);
	}
	private static double Mul(double a, String b) {
		return a * Double.parseDouble(b);
	}
	private static double Div(double a, String b) {
		return a / Double.parseDouble(b);
	}
	private static double Pow(double a, String b) {
		return (double) Math.pow(a, Double.parseDouble(b));
	}
}
