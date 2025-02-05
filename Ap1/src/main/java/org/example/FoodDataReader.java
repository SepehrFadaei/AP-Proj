package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FoodDataReader {

    public static List<FoodItem> readFoodData() {
        List<FoodItem> foodData = new ArrayList<>();
        try {
            InputStream inputStream = FoodDataReader.class.getResourceAsStream("/food.csv");
            CSVReader reader = new CSVReader(new InputStreamReader(inputStream));

            String[] headers = reader.readNext();

            String[] tokens;
            while ((tokens = reader.readNext()) != null) {
                if (tokens.length < 39) {
                    continue;
                }

                String category = tokens[0];
                String description = tokens[1];
                int nutrientDataBankNumber = parseInt(tokens[2]);

                double alphaCarotene = parseDouble(tokens[3]);
                double betaCarotene = parseDouble(tokens[4]);
                double betaCryptoxanthin = parseDouble(tokens[5]);
                double carbohydrate = parseDouble(tokens[6]);
                double cholesterol = parseDouble(tokens[7]);
                double choline = parseDouble(tokens[8]);
                double fiber = parseDouble(tokens[9]);
                double luteinAndZeaxanthin = parseDouble(tokens[10]);
                double lycopene = parseDouble(tokens[11]);
                double niacin = parseDouble(tokens[12]);
                double protein = parseDouble(tokens[13]);
                double retinol = parseDouble(tokens[14]);
                double riboflavin = parseDouble(tokens[15]);
                double selenium = parseDouble(tokens[16]);
                double sugarTotal = parseDouble(tokens[17]);
                double thiamin = parseDouble(tokens[18]);
                double water = parseDouble(tokens[19]);
                double monounsaturatedFat = parseDouble(tokens[20]);
                double polyunsaturatedFat = parseDouble(tokens[21]);
                double saturatedFat = parseDouble(tokens[22]);
                double totalLipid = parseDouble(tokens[23]);
                double calcium = parseDouble(tokens[24]);
                double copper = parseDouble(tokens[25]);
                double iron = parseDouble(tokens[26]);
                double magnesium = parseDouble(tokens[27]);
                double phosphorus = parseDouble(tokens[28]);
                double potassium = parseDouble(tokens[29]);
                double sodium = parseDouble(tokens[30]);
                double zinc = parseDouble(tokens[31]);
                double vitaminA_RAE = parseDouble(tokens[32]);
                double vitaminB12 = parseDouble(tokens[33]);
                double vitaminB6 = parseDouble(tokens[34]);
                double vitaminC = parseDouble(tokens[35]);
                double vitaminE = parseDouble(tokens[36]);
                double vitaminK = parseDouble(tokens[37]);

                FoodItem foodItem = new FoodItem(
                        category, description, nutrientDataBankNumber,
                        alphaCarotene, betaCarotene, betaCryptoxanthin,
                        carbohydrate, cholesterol, choline, fiber,
                        luteinAndZeaxanthin, lycopene, niacin, protein,
                        retinol, riboflavin, selenium, sugarTotal,
                        thiamin, water, monounsaturatedFat, polyunsaturatedFat,
                        saturatedFat, totalLipid, calcium, copper, iron,
                        magnesium, phosphorus, potassium, sodium, zinc,
                        vitaminA_RAE, vitaminB12, vitaminB6, vitaminC,
                        vitaminE, vitaminK
                );
                foodData.add(foodItem);
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return foodData;
    }
    private static int parseInt(String value) {
        try {
            return Integer.parseInt(value.trim());
        } catch (Exception e) {
            return 0;
        }
    }

    private static double parseDouble(String value) {
        try {
            return Double.parseDouble(value.trim());
        } catch (Exception e) {
            return 0;
        }
    }
}
