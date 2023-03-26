import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class WeightConverter { //Zion
    private double pounds; // stores the weight in pounds
    
    // Constructor that takes a weight in pounds as input
    public WeightConverter(double pounds) {
        this.pounds = pounds;
    }
    
    // Method that converts pounds to kilograms
    public double toKilograms() {
        return pounds * 0.453592;
    }
    
    // Method that converts pounds to grams
    public double toGrams() {
        return pounds * 453.592;
    }
    
    // Method that converts pounds to ounces
    public double toOunces() {
        return pounds * 16.0;
    }
    
    // toString method that returns a string representation of the weight in all three mass types
    public String toString() {
        return String.format("%.2f pounds = %.2f kilograms = %.2f grams = %.2f ounces", 
                pounds, toKilograms(), toGrams(), toOunces());
    }
    
    public static void main(String[] args) {
        // Create a new WeightConverter object with a random weight between 1 and 100 pounds
        Random rand = new Random();
        double weight = rand.nextDouble() * 99.0 + 1.0;
        WeightConverter wc = new WeightConverter(weight);
        System.out.println("Random weight: " + wc.pounds + " pounds");
        
        // Read a file containing a list of weights in pounds, and convert each weight to all three mass types
        try (BufferedReader br = new BufferedReader(new FileReader("weights.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                double pounds = Double.parseDouble(line);
                WeightConverter wc2 = new WeightConverter(pounds);
                System.out.println(wc2.toString());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
