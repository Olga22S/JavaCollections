package ru.epam.javacollections.maintask.thirdtask;

import static java.util.Objects.isNull;
import java.util.*;

public class Main {

	public static void main(String[] args) throws ParkingBusyException {
		List<Car> parking = new ArrayList<>(10);
		for (int i = 0; i < 10; i++) {
			parking.add(null);
		}
		Scanner scanner = new Scanner(System.in);
		for (;;) {
			System.out.println(
					"Choose action:\n1. Add car in parking\n2. Remove car from parking\n3. Show parking\n4. Exit");
			int userChoice = scanner.nextInt();
			switch (userChoice) {
			case 1:
				System.out.println("Enter car number:");
				addCarInParking(new Car(scanner.nextInt()), parking);
				break;
			case 2:
				System.out.println("Enter car number:");
				removeCarFromParking(new Car(scanner.nextInt()), parking);
				break;
			case 3:
				System.out.println(parking);
				break;
			case 4:
				System.out.println("Exit!");
				break;
			default:
				System.out.println("Command is not found!");
				break;
			}
			if (userChoice == 4) {
				break;
			}
		}
	}

	private static void addCarInParking(Car car, List parking) throws ParkingBusyException {
		if (parking.stream().allMatch((c) -> !isNull(c))) {
			throw new ParkingBusyException();
		}
		for (int i = 0; i < parking.size(); i++) {
			if (isNull(parking.get(i))) {
				parking.set(i, car);
				break;
			}
		}
	}

	private static void removeCarFromParking(Car car, List parking) {
		for (int i = 0; i < parking.size(); i++) {
			if (parking.get(i).equals(car)) {
				parking.set(i, null);
				break;
			}
		}
	}
}
