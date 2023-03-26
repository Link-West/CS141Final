import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class Weight {
    private double pounds;
    private double kilograms;
    private double grams;
    private double ounces;
    private double tons;
    private double milligrams;
    private double micrograms;
    private double nanograms;

    // Constructor that takes in the weight in pounds
    public Weight(double pounds) {
        this.pounds = pounds;
        convertToKilograms();
        convertToGrams();
        convertToOunces();
        convertToTons();
        convertToMilligrams();
        convertToMicrograms();
        convertToNanograms();
    }

    // Method to convert pounds to kilograms
    private void convertToKilograms() {
        kilograms = pounds * 0.453592;
    }

    // Method to convert pounds to grams
    private void convertToGrams() {
        grams = pounds * 453.592;
    }

    // Method to convert pounds to ounces
    private void convertToOunces() {
        ounces = pounds * 16;
    }

    // Method to convert pounds to tons
    private void convertToTons() {
        tons = pounds / 2000;
    }

    // Method to convert pounds to milligrams
    private void convertToMilligrams() {
        milligrams = pounds * 453592.37;
    }

    // Method to convert pounds to micrograms
    private void convertToMicrograms() {
        micrograms = pounds * 4.5359237E+8;
    }

    // Method to convert pounds to nanograms
    private void convertToNanograms() {
        nanograms = pounds * 4.5359237E+11;
    }

    // Method to generate a random weight in pounds
    public static double generateRandomWeight() {
        Random rand = new Random();
        double weight = rand.nextDouble() * 100;
        return weight;
    }

    // Method to read weights from a file and convert them
    public static void convertWeightsFromFile(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                double pounds = Double.parseDouble(scanner.nextLine());
                Weight converter = new Weight(pounds);
                System.out.println(converter.toString());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

    // toString method to display the weights in different units
    public String toString() {
        return "Pounds: " + pounds + "\nKilograms: " + kilograms + "\nGrams: " + grams + "\nOunces: " + ounces
                + "\nTons: " + tons + "\nMilligrams: " + milligrams + "\nMicrograms: " + micrograms + "\nNanograms: " + nanograms;
    }

    //L: moved to Main
/*    public static void main(String[] args) {
        // Generate a random weight and convert it
        double randomWeight = generateRandomWeight();
        Weight converter1 = new Weight(randomWeight);
        System.out.println("Random Weight Conversion:");
        System.out.println(converter1.toString());

        // Convert weights from a file
        System.out.println("\nFile Input Conversion:");
        convertWeightsFromFile("weights.txt");
    }*/
}