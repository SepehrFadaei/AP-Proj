package org.example;

import java.util.List;
import java.util.Scanner;

import org.json.JSONObject;

public class OllamaClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter height (in meters): ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter weight (in kg): ");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter dietary restrictions: ");
        String dietaryRestrictions = scanner.nextLine();

        User user = new User(firstName, lastName, height, weight, dietaryRestrictions);

        double bmi = user.calculateBMI();
        System.out.println("Calculated BMI: " + bmi);

        System.out.println(user.toString());

        List<FoodItem> foodData = FoodDataReader.readFoodData();


        StringBuilder foodDataString = new StringBuilder();
        for (FoodItem food : foodData) {
            foodDataString.append(food.toString()).append("\n");
        }

        String prompt = "Given a BMI of " + bmi +
                " and dietary restrictions: " + user.getDietaryRestrictions() +
                ", suggest a daily diet and exercise plan for every day of the week. " +
                "Consider the following foods:\n" + foodDataString.toString();

        JSONObject json = new JSONObject();
        json.put("model", "llama3.2");
        json.put("prompt", prompt);

        LlamaService.sendRequestToLlama(json.toString());

        scanner.close();
    }
}
