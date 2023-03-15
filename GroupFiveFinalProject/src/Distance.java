public class Distance {
    double value;
    String unit_of_measurement;
//    public String abbreviated_units;
    public Distance(){
        value = 0.0;
        unit_of_measurement = "m";
    }
    public Distance(double n, String u){
        value = n;
        unit_of_measurement = u;
    };
    public static void listUnits(){
        System.out.println("Metric Units of Distance");
        System.out.println("\"mm\", for millimeters");
        System.out.println("\"cm\", for centimeters");
        System.out.println("\"dm\", for decimeters");
        System.out.println("\"m\", for meters");
        System.out.println("\"dam\", for dekameters");
        System.out.println("\"hm\", for hectometers");
        System.out.println("\"km\", for kilometers");
        System.out.println("Imperial Units of Distance");
        System.out.println("\"ft\", for feet");
        System.out.println("\"in\", for inches");
        System.out.println("\"yd\", for yards");
        System.out.println("\"mi\", for miles");
    }
}