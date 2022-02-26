package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class Handler {

	private final int MAX_TRUCKS = 5;
	private final String QUIT_STRING = "quit";
	private final String OUT_LEAD = "--> ";
	private final String PROMPT_LEAD = "  ??  ";
	private final FoodTruck[] TRUCK_ARRAY = new FoodTruck[5];
	private int numTrucks = 0;
	private static Scanner kb;

	public Handler() {
		kb = new Scanner(System.in);
		
		System.out.println("-- Welcome to Food Truck Emporium!");
		System.out.println("-- Please enter up to 5 food trucks.");
	}

	public void addTrucks() {
		while (numTrucks < (MAX_TRUCKS)) {
			System.out.println(PROMPT_LEAD + "TRUCK " + (numTrucks + 1));
			System.out.print(PROMPT_LEAD + "Name (or quit): ");
			String name = kb.next();
			if (!(name.toLowerCase().trim().equals(QUIT_STRING))) {
				FoodTruck newTruck = new FoodTruck();
				newTruck.setName(name);
				System.out.print(PROMPT_LEAD + "Food type: ");
				newTruck.setFoodType(kb.next());
				System.out.print(PROMPT_LEAD + "Rating (int): ");
				newTruck.setRating(kb.nextInt());
				TRUCK_ARRAY[numTrucks] = newTruck;
				numTrucks++;
			} else if (numTrucks < 1) {
				System.out.println("You must enter at least one food truck.");
			} else {
				break;
			}
		}
	}

	public void chooseOption() {
		int choice = 0;

		System.out.println("\n-- What would you like to do?");
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");

		while (choice < 1 || choice > 4) {
			System.out.print(PROMPT_LEAD + "Your choice: ");
			choice = kb.nextInt();

			switch (choice) {
			case 1:
				list();
				chooseOption();
				break;
			case 2:
				average();
				chooseOption();
				break;
			case 3:
				highest();
				chooseOption();
				break;
			case 4:
				break;
			default:
				System.out.println("-- INVALID ENTRY");
			}
		}

	}

	public void list() {
		System.out.println();
		
		for (FoodTruck truck : TRUCK_ARRAY) {
			if (truck != null) {
				System.out.println(OUT_LEAD + truck.toString());
			}
		}
	}

	public void average() {
		double avg = 0;
		double trucks = 0;
		
		for (FoodTruck truck : TRUCK_ARRAY) {
			if (truck != null) {
				avg += truck.getRating();
				trucks++;
			}
		}
		avg /= trucks;

		System.out.println("\n" + OUT_LEAD + "Average rating of " 
						 + trucks + " food trucks: " + avg);
	}

	public void highest() {
		FoodTruck highest = new FoodTruck();
		highest.setRating(0);
		
		for (FoodTruck truck : TRUCK_ARRAY) {
			if (truck != null) {
				if (highest.getRating() < truck.getRating()) {
					highest = truck;
				}
			}
		}

		System.out.println("\n" + OUT_LEAD + "Highest rated food truck:"
						 + OUT_LEAD + highest.toString());
	}

	public void quit() {
		System.out.println("\n-- Goodbye.");
		kb.close();
	}

}
