package com.skilldistillery.foodtruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		Handler handler = new Handler();
		handler.addTrucks();
		handler.chooseOption();
		handler.quit();
	}

}
