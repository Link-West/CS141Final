public class Distance { //Link
    double value;
    String unit_of_measurement;
    //default constructor resulting in 0 meters
    public Distance(){
        value = 0.0;
        unit_of_measurement = "m";
    }
    //constructor that takes in value, unit of measurement, validates the unit of measurement, and creates a Distance object
    public Distance(double n, String u) throws Exception{
        value = n;
        unit_of_measurement = u;
        validateUnit();
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
        System.out.println("\"in\", for inches");
        System.out.println("\"ft\", for feet");
        System.out.println("\"yd\", for yards");
        System.out.println("\"mi\", for miles");
    }
    //create an exception to throw for invalid unit_of_measurement, create method to validate said unit
    Exception e = new Exception("Invalid unit type error. Use Distance.listUnits() to view valid unit_of_measurement values.");
    public void validateUnit() throws Exception{
        switch  (this.unit_of_measurement) {
            case "mm", "cm", "dm", "m", "dam", "hm", "km", "in", "ft", "yd", "mi":
                break;
            case "millimeters":
                this.unit_of_measurement = "mm";
                break;
            case "centimeters":
                this.unit_of_measurement = "cm";
                break;
            case "decimeters":
                this.unit_of_measurement = "dm";
                break;
            case "meters":
                this.unit_of_measurement = "m";
                break;
            case "dekameters":
                this.unit_of_measurement = "dam";
                break;
            case "hectometers":
                this.unit_of_measurement = "hm";
                break;
            case "kilometers":
                this.unit_of_measurement = "km";
                break;
            case "inches":
                this.unit_of_measurement = "in";
                break;
            case "feet":
                this.unit_of_measurement = "ft";
                break;
            case "yards":
                this.unit_of_measurement = "yd";
                break;
            case "miles":
                this.unit_of_measurement = "mi";
                break;
            default:
                throw e;
        }
    }
    //create static methods of conversion
    public static double mmtocm (double n){return n/10.0;}
    public static double mmtodm (double n){return n/100.0;}
    public static double mmtom (double n){return n/1000.0;}
    public static double mmtodam (double n){return n/10000.0;}
    public static double mmtohm (double n){return n/100000.0;}
    public static double mmtokm (double n){return n/1000000.0;}
    public static double mmtoin (double n){return n*.0393701;}
    public static double mmtoft (double n){return n*.00328084;}
    public static double mmtoyd (double n){return n*.00109361;}
    public static double mmtomi (double n){return n*.000001609;}
    public static double cmtomm (double n){return n*10.0;}
    public static double cmtodm (double n){return n/10.0;}
    public static double cmtom (double n){return n/100.0;}
    public static double cmtodam (double n){return n/1000.0;}
    public static double cmtohm (double n){return n/10000.0;}
    public static double cmtokm (double n){return n/100000.0;}
    public static double cmtoin (double n){return n*.393701;}
    public static double cmtoft (double n){return n*.0328084;}
    public static double cmtoyd (double n){return n*.0109361;}
    public static double cmtomi (double n){return n*.0000062137;}
    public static double dmtomm (double n){return n*100.0;}
    public static double dmtocm (double n){return n*10.0;}
    public static double dmtom (double n){return n/10.0;}
    public static double dmtodam (double n){return n/100.0;}
    public static double dmtohm (double n){return n/1000.0;}
    public static double dmtokm (double n){return n/10000.0;}
    public static double dmtoin (double n){return n*3.93701;}
    public static double dmtoft (double n){return n*.328084;}
    public static double dmtoyd (double n){return n*.109361;}
    public static double dmtomi (double n){return n*.000062137;}
    public static double mtomm (double n){return n*1000.0;}
    public static double mtocm (double n){return n*100.0;}
    public static double mtodm (double n){return n*10.0;}
    public static double mtodam (double n){return n/10.0;}
    public static double mtohm (double n){return n/100.0;}
    public static double mtokm (double n){return n/1000.0;}
    public static double mtoin (double n){return n*39.3701;}
    public static double mtoft (double n){return n*3.28084;}
    public static double mtoyd (double n){return n*1.09361;}
    public static double mtomi (double n){return n*.000621371;}
    public static double damtomm (double n){return n;}
    public static double damtocm (double n){return n;}
    public static double damtodm (double n){return n;}
    public static double damtom (double n){return n;}
    public static double damtohm (double n){return n;}
    public static double damtokm (double n){return n;}
    public static double damtoin (double n){return n;}
    public static double damtoft (double n){return n;}
    public static double damtoyd (double n){return n;}
    public static double damtomi (double n){return n;}
    public static double hmtomm (double n){return n;}
    public static double hmtocm (double n){return n;}
    public static double hmtodm (double n){return n;}
    public static double hmtom (double n){return n;}
    public static double hmtodam (double n){return n;}
    public static double hmtokm (double n){return n;}
    public static double hmtoin (double n){return n;}
    public static double hmtoft (double n){return n;}
    public static double hmtoyd (double n){return n;}
    public static double hmtomi (double n){return n;}
    public static double kmtomm (double n){return n;}
    public static double kmtocm (double n){return n;}
    public static double kmtodm (double n){return n;}
    public static double kmtom (double n){return n;}
    public static double kmtodam (double n){return n;}
    public static double kmtohm (double n){return n;}
    public static double kmtoin (double n){return n;}
    public static double kmtoft (double n){return n;}
    public static double kmtoyd (double n){return n;}
    public static double kmtomi (double n){return n;}
    public static double intomm (double n){return n;}
    public static double intocm (double n){return n;}
    public static double intodm (double n){return n;}
    public static double intom (double n){return n;}
    public static double intodam (double n){return n;}
    public static double intohm (double n){return n;}
    public static double intokm (double n){return n;}
    public static double intoin (double n){return n;}
    public static double intoft (double n){return n;}
    public static double intoyd (double n){return n;}
    public static double intomi (double n){return n;}
    public static double fttomm (double n){return n;}
    public static double fttocm (double n){return n;}
    public static double fttodm (double n){return n;}
    public static double fttom (double n){return n;}
    public static double fttodam (double n){return n;}
    public static double fttohm (double n){return n;}
    public static double fttokm (double n){return n;}
    public static double fttoin (double n){return n;}
    public static double fttoyd (double n){return n;}
    public static double fttomi (double n){return n;}
    public static double ydtomm (double n){return n;}
    public static double ydtocm (double n){return n;}
    public static double ydtodm (double n){return n;}
    public static double ydtom (double n){return n;}
    public static double ydtodam (double n){return n;}
    public static double ydtohm (double n){return n;}
    public static double ydtokm (double n){return n;}
    public static double ydtoin (double n){return n;}
    public static double ydtoft (double n){return n;}
    public static double ydtomi (double n){return n;}
    public static double mitomm (double n){return n;}
    public static double mitocm (double n){return n;}
    public static double mitodm (double n){return n;}
    public static double mitom (double n){return n;}
    public static double mitodam (double n){return n;}
    public static double mitohm (double n){return n;}
    public static double mitokm (double n){return n;}
    public static double mitoin (double n){return n;}
    public static double mitoft (double n){return n;}
    public static double mitoyd (double n){return n;}
    //create non-static conversions, which confirm their own unit type and process accordingly
}