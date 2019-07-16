package ru.epam.javacollections.optionaltask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class SeventhTask {

	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack2.push(40);
		stack2.push(50);
		stack2.push(60);
		System.out.println("First stack before " + stack1);
		System.out.println("Second stack before " + stack2);
		Iterator<Integer> iterator1 = stack1.iterator();
		Iterator<Integer> iterator2 = stack2.iterator();
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		while (iterator1.hasNext()) {
			list1.add(iterator1.next());
		}
		while (iterator2.hasNext()) {
			list2.add(iterator2.next());
		}
		stack1.clear();
		stack2.clear();
		for (int i : list2) {
			stack1.push(i);
		}
		for (int i : list1) {
			stack2.push(i);
		}
		System.out.println("First stack after " + stack1);
		System.out.println("Second stack after " + stack2);
	}
}
