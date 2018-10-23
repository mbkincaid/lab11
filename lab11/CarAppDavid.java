package lab11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarAppDavid {
	
	private static List<Car> cars = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Nikolai", "Model S", 2017, 54999.9));
		cars.add(new UsedCar("Hyonda", "Prior", 2015, 14795.5, 35987));
		cars.add(new Car("Chewie", "Vette", 2017, 44989.95));
		cars.add(new UsedCar("GC", "Chirpus", 2013, 8500, 12345));
		
		
		boolean done = false;
		while (!done) {
			System.out.println("Select an option: (list, select, add, quit)");
			String option = scnr.nextLine();
			switch(option) {
			case "list":
				doListOption();
				break;
			case "select":
				doSelectOption();
				break;
			case "quit":
				done = true;
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		}
	}
	private static void doListOption() {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println((i + 1) + ". " + cars.get(i));
		}
		System.out.println();
	}
	private static void doSelectOption() {
		
	}
}
