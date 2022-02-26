package com.skilldistillery.foodtruck;

public class FoodTruck {
	
	private static int nextTruckId = 0;
	private String name;
	private String type;
	private int rating;
	private int id;
	
	public FoodTruck() {
		setId();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFoodType() {
		return type;
	}
	
	public void setFoodType(String foodType) {
		this.type = type;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void setId() {
		nextTruckId++;
		this.id = nextTruckId;
	}
	
	public String toString() {
		return "ID: " + id + " | Name: " + name + " Type: " + type + " | " + rating;
	}

}
