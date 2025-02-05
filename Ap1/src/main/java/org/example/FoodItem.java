package org.example;

public class FoodItem {
    private String category;
    private String description;
    private int nutrientDataBankNumber;
    private double alphaCarotene;
    private double betaCarotene;
    private double betaCryptoxanthin;
    private double carbohydrate;
    private double cholesterol;
    private double choline;
    private double fiber;
    private double luteinAndZeaxanthin;
    private double lycopene;
    private double niacin;
    private double protein;
    private double retinol;
    private double riboflavin;
    private double selenium;
    private double sugarTotal;
    private double thiamin;
    private double water;
    private double monounsaturatedFat;
    private double polyunsaturatedFat;
    private double saturatedFat;
    private double totalLipid;
    private double calcium;
    private double copper;
    private double iron;
    private double magnesium;
    private double phosphorus;
    private double potassium;
    private double sodium;
    private double zinc;
    private double vitaminA_RAE;
    private double vitaminB12;
    private double vitaminB6;
    private double vitaminC;
    private double vitaminE;
    private double vitaminK;

    // سازنده

    public FoodItem(String category, String description, int nutrientDataBankNumber,
                    double alphaCarotene, double betaCarotene, double betaCryptoxanthin,
                    double carbohydrate, double cholesterol, double choline, double fiber,
                    double luteinAndZeaxanthin, double lycopene, double niacin, double protein,
                    double retinol, double riboflavin, double selenium, double sugarTotal,
                    double thiamin, double water, double monounsaturatedFat, double polyunsaturatedFat,
                    double saturatedFat, double totalLipid, double calcium, double copper, double iron,
                    double magnesium, double phosphorus, double potassium, double sodium, double zinc,
                    double vitaminA_RAE, double vitaminB12, double vitaminB6, double vitaminC,
                    double vitaminE, double vitaminK) {
        this.category = category;
        this.description = description;
        this.nutrientDataBankNumber = nutrientDataBankNumber;
        this.alphaCarotene = alphaCarotene;
        this.betaCarotene = betaCarotene;
        this.betaCryptoxanthin = betaCryptoxanthin;
        this.carbohydrate = carbohydrate;
        this.cholesterol = cholesterol;
        this.choline = choline;
        this.fiber = fiber;
        this.luteinAndZeaxanthin = luteinAndZeaxanthin;
        this.lycopene = lycopene;
        this.niacin = niacin;
        this.protein = protein;
        this.retinol = retinol;
        this.riboflavin = riboflavin;
        this.selenium = selenium;
        this.sugarTotal = sugarTotal;
        this.thiamin = thiamin;
        this.water = water;
        this.monounsaturatedFat = monounsaturatedFat;
        this.polyunsaturatedFat = polyunsaturatedFat;
        this.saturatedFat = saturatedFat;
        this.totalLipid = totalLipid;
        this.calcium = calcium;
        this.copper = copper;
        this.iron = iron;
        this.magnesium = magnesium;
        this.phosphorus = phosphorus;
        this.potassium = potassium;
        this.sodium = sodium;
        this.zinc = zinc;
        this.vitaminA_RAE = vitaminA_RAE;
        this.vitaminB12 = vitaminB12;
        this.vitaminB6 = vitaminB6;
        this.vitaminC = vitaminC;
        this.vitaminE = vitaminE;
        this.vitaminK = vitaminK;
    }


    @Override
    public String toString() {
        return description + " (Category: " + category + ", Protein: " + protein +
                "g, Carbs: " + carbohydrate + "g, Fat: " + totalLipid + "g)";
    }
}
