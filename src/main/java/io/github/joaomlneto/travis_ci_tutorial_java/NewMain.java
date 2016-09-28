package io.github.joaomlneto.travis_ci_tutorial_java;

public class NewMain {

	public static void main(String[] args) {
		int number = 2;
		
		number = SimpleCalculator.mul(number, 3);
		number = SimpleCalculator.mul(number, 7);
		number = SimpleCalculator.mul(number, 13);
		number = SimpleCalculator.mul(number, 37);
		
		System.out.println("The final number is " + number);
	}

}
