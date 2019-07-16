package ru.epam.javacollections.optionaltask;

import java.util.*;

public class EleventhTask {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter polynomial degree: ");
		int polynomialDegree = scanner.nextInt();
		printPolynomialFormula("f(x)", polynomialDegree);
		Map<Integer, Integer> firstPolynomialCoefficients = getPolynomialCoefficients(polynomialDegree);
		printPolynomialWithCoefficients(firstPolynomialCoefficients, "f(x)", polynomialDegree);
		printPolynomialFormula("g(x)", polynomialDegree);
		Map<Integer, Integer> secondPolynomialCoefficients = getPolynomialCoefficients(polynomialDegree);
		printPolynomialWithCoefficients(secondPolynomialCoefficients, "g(x)", polynomialDegree);
		printPolynomialsSum(polynomialDegree, firstPolynomialCoefficients, secondPolynomialCoefficients);
	}

	private static Map<Integer, Integer> getPolynomialCoefficients(int polynomialDegree) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Integer> polynomialCoefficients = new HashMap<>();
		for (int i = 0; i <= polynomialDegree; i++) {
			System.out.print("c" + i + " = ");
			polynomialCoefficients.put(i, scanner.nextInt());
		}
		return polynomialCoefficients;
	}

	private static void printPolynomialFormula(String polynomialName, int polynomialDegree) {
		System.out.print(polynomialName + " = c0");
		for (int i = 1; i <= polynomialDegree; i++) {
			System.out.print(" + c" + i + "*x^" + i);
		}
		System.out.println();
	}

	private static void printPolynomialWithCoefficients(Map<Integer, Integer> polynomialCoefficients,
			String polynomialName, int polynomialDegree) {
		System.out.print(polynomialName + " = " + polynomialCoefficients.get(0));
		for (int i = 1; i <= polynomialDegree; i++) {
			System.out.print(" + " + polynomialCoefficients.get(i) + "x^" + i);
		}
		System.out.println();
	}

	private static void printPolynomialsSum(int polynomialDegree, Map<Integer, Integer> firstPolynomialCoefficients,
			Map<Integer, Integer> secondPolynomialCoefficients) {
		System.out.print(
				"Polynomials sum = " + (firstPolynomialCoefficients.get(0) + secondPolynomialCoefficients.get(0)));
		for (int i = 1; i <= polynomialDegree; i++) {
			System.out.print(
					" + " + (firstPolynomialCoefficients.get(i) + secondPolynomialCoefficients.get(i)) + "x^" + i);
		}
	}
}
