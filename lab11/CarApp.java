package lab11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		List<Car> CarLot = new ArrayList<>();
		CarLot.add(new Car("Dodge", "Ram", 2019, 31795));
		CarLot.add(new Car("Honda", "Insight", 2019, 22830));
		CarLot.add(new Car("Jeep", "Wrangler", 2019, 28045));
		CarLot.add(new UsedCar("Dodge", "Ram", 2015, 11000, 100000));
		CarLot.add(new UsedCar("Honda", "Insight", 2015, 10000, 75000));
		CarLot.add(new UsedCar("Jeep", "Wrangler", 2015, 7500, 150000));
		
		System.out.println("Hello, here is a list of our cars:");
		System.out.println(CarLot);
		
		System.out.println("Would you like to add a car to the lot? (yes/no)");
		String userInput = scnr.nextLine();
		
		 if (userInput.equalsIgnoreCase("yes")) {
			
			System.out.println("New or used?");
			userInput = scnr.next();
			if (userInput.equalsIgnoreCase("new")) {
				System.out.println("Make?");
				String userMake = scnr.next();
				System.out.println("Model?");
				String userModel = scnr.next();
				System.out.println("Year?");
				int userYear = scnr.nextInt();
				System.out.println("Price?");
				double userPrice = scnr.nextDouble();
				
				CarLot.add(new Car(userMake, userModel, userYear, userPrice));
				System.out.println(CarLot);
				
			} else {
				System.out.println("Make?");
				String userMake = scnr.next();
				System.out.println("Model?");
				String userModel = scnr.next();
				System.out.println("Year?");
				int userYear = scnr.nextInt();
				System.out.println("Price?");
				double userPrice = scnr.nextDouble();
				System.out.println("Mileage?");
				int userMileage = scnr.nextInt();
				
				CarLot.add(new UsedCar(userMake, userModel, userYear, userPrice, userMileage));
				System.out.println(CarLot);
			}	
		}
		if (userInput.equalsIgnoreCase("no")) {
			System.out.println("Would you like to remove a car?");
			userInput = scnr.next();
			if (userInput.equalsIgnoreCase("yes")) {
				System.out.println(CarLot);
				System.out.println("Which car would you like to remove? (1-6)");
				int userRemove = scnr.nextInt();
				CarLot.remove(userRemove - 1);
				System.out.println(CarLot);	
				}
			}	
		}
	}


