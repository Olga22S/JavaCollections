package ru.epam.javacollections.optionaltask;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class SecondTask {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		System.out.println("Enter number: ");
		try {
			number = scanner.nextInt();
		} catch (InputMismatchException exception) {
			System.out.println("It isn't a number! Try again!");
		}
		int[] numbers = Integer.toString(number).chars().map(c -> c - '0').toArray();
		Stack<Integer> stack = new Stack<>();
		for (int i : numbers) {
			stack.push(i);
		}
		while (!stack.empty()) {
			System.out.print(stack.pop());
		}
	}
}
