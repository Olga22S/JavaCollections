package ru.epam.javacollections.maintask.firstask;

public class Person {

	private int number;

	public Person(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (number != other.number) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Person number: " + number;
	}
}
