package ru.epam.javacollections.maintask.secondtask;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 15; i++) {
			list.add((int) (Math.random() * (200 + 1)) - 100);
		}
		System.out.println("List before sorting: " + list);
		for (int a = 1; a < list.size(); a++)
			for (int b = list.size() - 1; b >= a; b--) {
				if (list.get(b - 1) > list.get(b)) {
					list.set(b - 1, list.get(b - 1) + list.get(b));
					list.set(b, list.get(b - 1) - list.get(b));
					list.set(b - 1, list.get(b - 1) - list.get(b));
				}
			}
		System.out.println("List after sorting: " + list);
	}
}
