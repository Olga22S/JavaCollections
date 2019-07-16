package ru.epam.javacollections.maintask.firstask;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int peopleNumber;
		System.out.println("How many people are in the circle?");
		peopleNumber = scanner.nextInt();
		List<Person> personsAsArrayList = new ArrayList<>();
		for (int i = 0; i < peopleNumber; i++) {
			personsAsArrayList.add(new Person(i + 1));
		}
		long startTimeForArrayList = System.nanoTime();
		removeElementsFromList(personsAsArrayList);
		long stopTimeForArrayList = System.nanoTime();
		System.out.println("Method execution time for ArrayList: " + (stopTimeForArrayList - startTimeForArrayList) + " nanosec");
		List<Person> personsAsLinkedList = new LinkedList<>();
		for (int i = 0; i < peopleNumber; i++) {
			personsAsLinkedList.add(new Person(i + 1));
		}
		long startTimeForLinkedList = System.nanoTime();
		removeElementsFromList(personsAsLinkedList);
		long stopTimeForLinkedList = System.nanoTime();
		System.out.println("Method execution time for LinkedList: " + (stopTimeForLinkedList - startTimeForLinkedList) + " nanosec");
	}

	private static void removeElementsFromList(List list) {
		while (list.size() != 1) {
			int i = 0;
			for (Iterator it = list.iterator(); it.hasNext();) {
				it.next();
				if (i % 2 != 0) {
					it.remove();
				}
				i++;
			}
		}		
	}
}
