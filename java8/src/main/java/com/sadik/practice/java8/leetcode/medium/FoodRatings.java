package com.sadik.practice.java8.leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class FoodRatings {

    private Map<String, Food> foodMap;
    private Map<String, PriorityQueue<Food>> cuisineMap;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodMap = new HashMap<>();
        cuisineMap = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            Food foodObj = new Food(food, cuisine, rating);
            foodMap.put(food, foodObj);

            cuisineMap.putIfAbsent(cuisine, new PriorityQueue<>());
            cuisineMap.get(cuisine).offer(foodObj);
        }
    }

    public void changeRating(String food, int newRating) {
        Food oldFood = foodMap.get(food);
        String cuisine = oldFood.cuisine;

        // Create new object with updated rating
        Food newFood = new Food(food, cuisine, newRating);

        // Update the map and heap
        foodMap.put(food, newFood);
        cuisineMap.get(cuisine).offer(newFood);
    }

    public String highestRated(String cuisine) {
        PriorityQueue<Food> heap = cuisineMap.get(cuisine);
        while (!heap.isEmpty()) {
            Food top = heap.peek();
            if (top.rating == foodMap.get(top.name).rating) {
                return top.name;
            } else {
                heap.poll(); // Remove outdated entry
            }
        }
        return "";
    }

    private static class Food implements Comparable<Food> {
        String name;
        String cuisine;
        int rating;

        public Food(String name, String cuisine, int rating) {
            this.name = name;
            this.cuisine = cuisine;
            this.rating = rating;
        }

        @Override
        public int compareTo(Food other) {
            if (this.rating != other.rating) {
                return other.rating - this.rating;
            } else {
                return this.name.compareTo(other.name);
            }
        }
    }
}
