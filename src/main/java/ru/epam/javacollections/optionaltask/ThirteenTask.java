package ru.epam.javacollections.optionaltask;

import java.util.*;
import java.util.Random;

public class ThirteenTask {

	public static void main(String[] args) {
		Random rand = new Random();
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 16; i++) {
			numbers.add(rand.nextInt(31) - 15);
		}
		Collections.sort(numbers, (n1, n2) -> (n2 - n1));
		System.out.println(numbers);
	}
}
