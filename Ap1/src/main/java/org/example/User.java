package org.example;

public class User {
    private String firstName;
    private String lastName;
    private double height;
    private double weight;
    private String dietaryRestrictions;

    public User(String firstName, String lastName, double height, double weight, String dietaryRestrictions) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Height: " + height + ", Weight: " + weight
                + ", Dietary Restrictions: " + dietaryRestrictions;
    }
}