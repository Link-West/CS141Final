import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
        Basic: Create a program that does conversions between Standard (metric)
        and Imperial (US/UK) units of measurement.

        Extended: Create classes for Distance/Length (Link), Weight/Mass (Zion),
        Temperature (Link), and Volume (Fernando) units of measurement.
        Classes will have the fields of:
        double value
        String unit_of_measurement

        Classes will have constructors so people can create and alter data
        objects.

        Classes will have non-static methods so the objects can output their
        value in other units of measurement

        Classes will have static methods so the Class can conduct conversions,
        when first given a value.

        */
        //L: Testing temperature
        Temperature errTest = new Temperature(51, "Centigrade");
        System.out.println(errTest.unit_of_measurement);
        Temperature aZero = new Temperature(0,"K");
        Temperature sBoil = new Temperature(100, "C");
        Temperature iFreeze = new Temperature(32, "F");
        System.out.println("Non-static");
        System.out.println(aZero.toCelsius());
        System.out.println(aZero.toFahrenheit());
        System.out.println(sBoil.toKelvin());
        System.out.println(sBoil.toFahrenheit());
        System.out.println(iFreeze.toCelsius());
        System.out.println(iFreeze.toKelvin());
        System.out.println("Static");
        System.out.println(Temperature.KtoC(0));
        System.out.println(Temperature.KtoF(373.15));
        System.out.println(Temperature.CtoF(0));
        System.out.println(Temperature.CtoK(0));
        System.out.println(Temperature.FtoC(32));
        System.out.println(Temperature.FtoK(212));


        //L: Testing distance
        System.out.println("Testing Distance.");
        System.out.println(Distance.cmtoin(22.4));
        Distance marathon = new Distance(26.2, "mi");
        System.out.println(marathon.toKM());

        //Testing Volume + Randomizer
        //L: creates an object, randomizedVol, from 0.0-9.99 liters, to play with

        System.out.println("Testing Volume.");
        Volume randomizedVol = new Volume ((randDouble()+randInt()), "l");
        randomizedVol.toC();
        randomizedVol.toTBS();

        //Testing Weight + File Reading
        // Generate a random weight and convert it
        double randomWeight = Weight.generateRandomWeight();
        Weight converter1 = new Weight(randomWeight);
        System.out.println("Random Weight Conversion:");
        System.out.println(converter1.toString());

        // Convert weights from a file
        System.out.println("\nFile Input Conversion:");
        Weight.convertWeightsFromFile("weights.txt");

    }
    /*L: had Fernando build a randomizer to create an object to manipulate. apparently main won't accept an object
    created by a method to work with. moved his randomizer out here, and stripped it of its inherent volume class.
    rand() will now just assign a random values
     */
    public static double randDouble(){
        Random y = new Random();
        return y.nextDouble(); //L: changed value into a double
    }
    public static int randInt(){
        Random y = new Random();
        return y.nextInt(10); //L: changed value into a double
    }
}