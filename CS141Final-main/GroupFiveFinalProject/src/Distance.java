public class Distance { //Link
    double value;
    String unit_of_measurement;

    //default constructor resulting in 0 meters
    public Distance() {
        value = 0.0;
        unit_of_measurement = "m";
    }

    //constructor that takes in value, unit of measurement, validates the unit of measurement, and creates a Distance object
    public Distance(double n, String u) throws Exception {
        value = n;
        unit_of_measurement = u;
        validateUnit();
    }

    ;

    public static void listUnits() {
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
    //compare unit of measurement value to a list of acceptable values. accommodate some values, throw exception otherwise
    public void validateUnit() throws Exception {
        String[] valid_unit_values = new String[]{
                "mm", "cm", "dm", "m", "dam", "hm", "km", "in", "ft", "yd", "mi"
        };
        String[] near_miss = new String[]{
                "millimeters", "centimeters", "decimeters", "meters", "dekameters", "hectometers",
                "kilometers", "inches", "feet", "yards", "miles"
        };
        boolean invalid = true;
        for(int i = 0; i<near_miss.length; i++){
            if(this.unit_of_measurement.equalsIgnoreCase(near_miss[i])){
                this.unit_of_measurement = valid_unit_values[i];
                invalid = false;
                break;
            }
            else if (this.unit_of_measurement.equalsIgnoreCase(valid_unit_values[i])){
                this.unit_of_measurement = valid_unit_values[i];
                invalid = false;
                break;
            }
        }
        if(invalid){
            throw e;
        }
    }

    //create static methods of conversion for every included unit of distance
    public static double mmtocm(double n) {
        return n / 10.0;
    }

    public static double mmtodm(double n) {
        return n / 100.0;
    }

    public static double mmtom(double n) {
        return n / 1000.0;
    }

    public static double mmtodam(double n) {
        return n / 10000.0;
    }

    public static double mmtohm(double n) {
        return n / 100000.0;
    }

    public static double mmtokm(double n) {
        return n / 1000000.0;
    }

    public static double mmtoin(double n) {
        return n * .0393701;
    }

    public static double mmtoft(double n) {
        return n * .00328084;
    }

    public static double mmtoyd(double n) {
        return n * .00109361;
    }

    public static double mmtomi(double n) {
        return n * .000001609;
    }

    public static double cmtomm(double n) {
        return n * 10.0;
    }

    public static double cmtodm(double n) {
        return n / 10.0;
    }

    public static double cmtom(double n) {
        return n / 100.0;
    }

    public static double cmtodam(double n) {
        return n / 1000.0;
    }

    public static double cmtohm(double n) {
        return n / 10000.0;
    }

    public static double cmtokm(double n) {
        return n / 100000.0;
    }

    public static double cmtoin(double n) {
        return n * .393701;
    }

    public static double cmtoft(double n) {
        return n * .0328084;
    }

    public static double cmtoyd(double n) {
        return n * .0109361;
    }

    public static double cmtomi(double n) {
        return n * .0000062137;
    }

    public static double dmtomm(double n) {
        return n * 100.0;
    }

    public static double dmtocm(double n) {
        return n * 10.0;
    }

    public static double dmtom(double n) {
        return n / 10.0;
    }

    public static double dmtodam(double n) {
        return n / 100.0;
    }

    public static double dmtohm(double n) {
        return n / 1000.0;
    }

    public static double dmtokm(double n) {
        return n / 10000.0;
    }

    public static double dmtoin(double n) {
        return n * 3.93701;
    }

    public static double dmtoft(double n) {
        return n * .328084;
    }

    public static double dmtoyd(double n) {
        return n * .109361;
    }

    public static double dmtomi(double n) {
        return n * .000062137;
    }

    public static double mtomm(double n) {
        return n * 1000.0;
    }

    public static double mtocm(double n) {
        return n * 100.0;
    }

    public static double mtodm(double n) {
        return n * 10.0;
    }

    public static double mtodam(double n) {
        return n / 10.0;
    }

    public static double mtohm(double n) {
        return n / 100.0;
    }

    public static double mtokm(double n) {
        return n / 1000.0;
    }

    public static double mtoin(double n) {
        return n * 39.3701;
    }

    public static double mtoft(double n) {
        return n * 3.28084;
    }

    public static double mtoyd(double n) {
        return n * 1.09361;
    }

    public static double mtomi(double n) {
        return n * .000621371;
    }

    public static double damtomm(double n) {
        return n * 10000.0;
    }

    public static double damtocm(double n) {
        return n * 1000.0;
    }

    public static double damtodm(double n) {
        return n * 100.0;
    }

    public static double damtom(double n) {
        return n * 10.0;
    }

    public static double damtohm(double n) {
        return n / 10.0;
    }

    public static double damtokm(double n) {
        return n / 100.0;
    }

    public static double damtoin(double n) {
        return n * 393.701;
    }

    public static double damtoft(double n) {
        return n * .328084;
    }

    public static double damtoyd(double n) {
        return n * .109361;
    }

    public static double damtomi(double n) {
        return n * .00621371;
    }

    //started coding at 3:30am, double-check work
    public static double hmtomm(double n) {
        return n * 100000.0;
    }

    public static double hmtocm(double n) {
        return n * 10000.0;
    }

    public static double hmtodm(double n) {
        return n * 1000.0;
    }

    public static double hmtom(double n) {
        return n * 100.0;
    }

    public static double hmtodam(double n) {
        return n * 10.0;
    }

    public static double hmtokm(double n) {
        return n / 10.0;
    }

    public static double hmtoin(double n) {
        return n * 3937.01;
    }

    public static double hmtoft(double n) {
        return n * 328.084;
    }

    public static double hmtoyd(double n) {
        return n * 109.361;
    }

    public static double hmtomi(double n) {
        return n * .0621371;
    }

    public static double kmtomm(double n) {
        return n * 1000000.0;
    }

    public static double kmtocm(double n) {
        return n * 100000.0;
    }

    public static double kmtodm(double n) {
        return n * 10000.0;
    }

    public static double kmtom(double n) {
        return n * 1000.0;
    }

    public static double kmtodam(double n) {
        return n * 100.0;
    }

    public static double kmtohm(double n) {
        return n * 10.0;
    }

    public static double kmtoin(double n) {
        return n * 39370.1;
    }

    public static double kmtoft(double n) {
        return n * 3280.84;
    }

    public static double kmtoyd(double n) {
        return n * 1093.61;
    }

    public static double kmtomi(double n) {
        return n * .621371;
    }

    public static double intomm(double n) {
        return n * 25.4;
    }

    public static double intocm(double n) {
        return n * 2.54;
    }

    public static double intodm(double n) {
        return n * .254;
    }

    public static double intom(double n) {
        return n * .0254;
    }

    public static double intodam(double n) {
        return n * .00254;
    }

    public static double intohm(double n) {
        return n * .000254;
    }

    public static double intokm(double n) {
        return n * .0000254;
    }

    public static double intoft(double n) {
        return n / 12.0;
    }

    public static double intoyd(double n) {
        return n / 36.0;
    }

    public static double intomi(double n) {
        return n * .000015783;
    }

    public static double fttomm(double n) {
        return n * 304.8;
    }

    public static double fttocm(double n) {
        return n * 30.48;
    }

    public static double fttodm(double n) {
        return n * 3.048;
    }

    public static double fttom(double n) {
        return n * .3048;
    }

    public static double fttodam(double n) {
        return n * .03048;
    }

    public static double fttohm(double n) {
        return n * .003048;
    }

    public static double fttokm(double n) {
        return n * .0003048;
    }

    public static double fttoin(double n) {
        return n * 12.0;
    }

    public static double fttoyd(double n) {
        return n / 3.0;
    }

    public static double fttomi(double n) {
        return n * .000189394;
    }

    public static double ydtomm(double n) {
        return n * 914.4;
    }

    public static double ydtocm(double n) {
        return n * 91.44;
    }

    public static double ydtodm(double n) {
        return n * 9.144;
    }

    public static double ydtom(double n) {
        return n * .9144;
    }

    public static double ydtodam(double n) {
        return n * .09144;
    }

    public static double ydtohm(double n) {
        return n * .009144;
    }

    public static double ydtokm(double n) {
        return n * .0009144;
    }

    public static double ydtoin(double n) {
        return n * 36.0;
    }

    public static double ydtoft(double n) {
        return n * 3.0;
    }

    public static double ydtomi(double n) {
        return n * .000568182;
    }

    public static double mitomm(double n) {
        return n * 1609340.0;
    }

    public static double mitocm(double n) {
        return n * 160934.0;
    }

    public static double mitodm(double n) {
        return n * 16093.4;
    }

    public static double mitom(double n) {
        return n * 1609.34;
    }

    public static double mitodam(double n) {
        return n * 160.934;
    }

    public static double mitohm(double n) {
        return n * 16.0934;
    }

    public static double mitokm(double n) {
        return n * 1.60934;
    }

    public static double mitoin(double n) {
        return n * 63360.0;
    }

    public static double mitoft(double n) {
        return n * 5280.0;
    }

    public static double mitoyd(double n) {
        return n * 1760;
    }

    //create non-static conversions, which confirm their own unit type and process accordingly,  for every included unit of distance
    public double toMM() {
        if (this.unit_of_measurement == "mm") {
            return this.value;
        } else if (this.unit_of_measurement == "cm") {
            return cmtomm(this.value);
        } else if (this.unit_of_measurement == "dm") {
            return dmtomm(this.value);
        } else if (this.unit_of_measurement == "m") {
            return mtomm(this.value);
        } else if (this.unit_of_measurement == "dam") {
            return damtomm(this.value);
        } else if (this.unit_of_measurement == "hm") {
            return hmtomm(this.value);
        } else if (this.unit_of_measurement == "km") {
            return kmtomm(this.value);
        } else if (this.unit_of_measurement == "in") {
            return intomm(this.value);
        } else if (this.unit_of_measurement == "ft") {
            return fttomm(this.value);
        } else if (this.unit_of_measurement == "yd") {
            return ydtomm(this.value);
        } else if (this.unit_of_measurement == "mi") {
            return mitomm(this.value);
        } else System.out.println("This unit of measurement is not recognized.");
        return -1.0;
    }

    public double toCM() {
        if (this.unit_of_measurement == "mm") {
            return mmtocm(this.value);
        } else if (this.unit_of_measurement == "cm") {
            return this.value;
        } else if (this.unit_of_measurement == "dm") {
            return dmtocm(this.value);
        } else if (this.unit_of_measurement == "m") {
            return mtocm(this.value);
        } else if (this.unit_of_measurement == "dam") {
            return damtocm(this.value);
        } else if (this.unit_of_measurement == "hm") {
            return hmtocm(this.value);
        } else if (this.unit_of_measurement == "km") {
            return kmtocm(this.value);
        } else if (this.unit_of_measurement == "in") {
            return intocm(this.value);
        } else if (this.unit_of_measurement == "ft") {
            return fttocm(this.value);
        } else if (this.unit_of_measurement == "yd") {
            return ydtocm(this.value);
        } else if (this.unit_of_measurement == "mi") {
            return mitocm(this.value);
        } else System.out.println("This unit of measurement is not recognized.");
        return 0.0;
    }
    public double toDM() {
        if (this.unit_of_measurement == "mm") {
            return mmtodm(this.value);
        } else if (this.unit_of_measurement == "cm") {
            return cmtodm(this.value);
        } else if (this.unit_of_measurement == "dm") {
            return this.value;
        } else if (this.unit_of_measurement == "m") {
            return mtodm(this.value);
        } else if (this.unit_of_measurement == "dam") {
            return damtodm(this.value);
        } else if (this.unit_of_measurement == "hm") {
            return hmtodm(this.value);
        } else if (this.unit_of_measurement == "km") {
            return kmtodm(this.value);
        } else if (this.unit_of_measurement == "in") {
            return intodm(this.value);
        } else if (this.unit_of_measurement == "ft") {
            return fttodm(this.value);
        } else if (this.unit_of_measurement == "yd") {
            return ydtodm(this.value);
        } else if (this.unit_of_measurement == "mi") {
            return mitodm(this.value);
        } else System.out.println("This unit of measurement is not recognized.");
        return 0.0;
    }
    public double toM() {
        if (this.unit_of_measurement == "mm") {
            return mmtom(this.value);
        } else if (this.unit_of_measurement == "cm") {
            return cmtom(this.value);
        } else if (this.unit_of_measurement == "dm") {
            return dmtom(this.value);
        } else if (this.unit_of_measurement == "m") {
            return this.value;
        } else if (this.unit_of_measurement == "dam") {
            return damtom(this.value);
        } else if (this.unit_of_measurement == "hm") {
            return hmtom(this.value);
        } else if (this.unit_of_measurement == "km") {
            return kmtom(this.value);
        } else if (this.unit_of_measurement == "in") {
            return intom(this.value);
        } else if (this.unit_of_measurement == "ft") {
            return fttom(this.value);
        } else if (this.unit_of_measurement == "yd") {
            return ydtom(this.value);
        } else if (this.unit_of_measurement == "mi") {
            return mitom(this.value);
        } else System.out.println("This unit of measurement is not recognized.");
        return 0.0;
    }
    public double toDAM() {
        if (this.unit_of_measurement == "mm") {
            return mmtodam(this.value);
        } else if (this.unit_of_measurement == "cm") {
            return cmtodam(this.value);
        } else if (this.unit_of_measurement == "dm") {
            return dmtodam(this.value);
        } else if (this.unit_of_measurement == "m") {
            return mtodam(this.value);
        } else if (this.unit_of_measurement == "dam") {
            return this.value;
        } else if (this.unit_of_measurement == "hm") {
            return hmtodam(this.value);
        } else if (this.unit_of_measurement == "km") {
            return kmtodam(this.value);
        } else if (this.unit_of_measurement == "in") {
            return intodam(this.value);
        } else if (this.unit_of_measurement == "ft") {
            return fttodam(this.value);
        } else if (this.unit_of_measurement == "yd") {
            return ydtodam(this.value);
        } else if (this.unit_of_measurement == "mi") {
            return mitodam(this.value);
        } else System.out.println("This unit of measurement is not recognized.");
        return 0.0;
    }
    public double toHM() {
        if (this.unit_of_measurement == "mm") {
            return mmtohm(this.value);
        } else if (this.unit_of_measurement == "cm") {
            return cmtohm(this.value);
        } else if (this.unit_of_measurement == "dm") {
            return dmtohm(this.value);
        } else if (this.unit_of_measurement == "m") {
            return mtohm(this.value);
        } else if (this.unit_of_measurement == "dam") {
            return damtohm(this.value);
        } else if (this.unit_of_measurement == "hm") {
            return this.value;
        } else if (this.unit_of_measurement == "km") {
            return kmtohm(this.value);
        } else if (this.unit_of_measurement == "in") {
            return intohm(this.value);
        } else if (this.unit_of_measurement == "ft") {
            return fttohm(this.value);
        } else if (this.unit_of_measurement == "yd") {
            return ydtohm(this.value);
        } else if (this.unit_of_measurement == "mi") {
            return mitohm(this.value);
        } else System.out.println("This unit of measurement is not recognized.");
        return 0.0;
    }
    public double toKM() {
        if (this.unit_of_measurement == "mm") {
            return mmtokm(this.value);
        } else if (this.unit_of_measurement == "cm") {
            return cmtokm(this.value);
        } else if (this.unit_of_measurement == "dm") {
            return dmtokm(this.value);
        } else if (this.unit_of_measurement == "m") {
            return mtokm(this.value);
        } else if (this.unit_of_measurement == "dam") {
            return damtokm(this.value);
        } else if (this.unit_of_measurement == "hm") {
            return hmtokm(this.value);
        } else if (this.unit_of_measurement == "km") {
            return this.value;
        } else if (this.unit_of_measurement == "in") {
            return intokm(this.value);
        } else if (this.unit_of_measurement == "ft") {
            return fttokm(this.value);
        } else if (this.unit_of_measurement == "yd") {
            return ydtokm(this.value);
        } else if (this.unit_of_measurement == "mi") {
            return mitokm(this.value);
        } else System.out.println("This unit of measurement is not recognized.");
        return 0.0;
    }
    public double toIN() {
        if (this.unit_of_measurement == "mm") {
            return mmtoin(this.value);
        } else if (this.unit_of_measurement == "cm") {
            return cmtoin(this.value);
        } else if (this.unit_of_measurement == "dm") {
            return dmtoin(this.value);
        } else if (this.unit_of_measurement == "m") {
            return mtoin(this.value);
        } else if (this.unit_of_measurement == "dam") {
            return damtoin(this.value);
        } else if (this.unit_of_measurement == "hm") {
            return hmtoin(this.value);
        } else if (this.unit_of_measurement == "km") {
            return kmtoin(this.value);
        } else if (this.unit_of_measurement == "in") {
            return this.value;
        } else if (this.unit_of_measurement == "ft") {
            return fttoin(this.value);
        } else if (this.unit_of_measurement == "yd") {
            return ydtoin(this.value);
        } else if (this.unit_of_measurement == "mi") {
            return mitoin(this.value);
        } else System.out.println("This unit of measurement is not recognized.");
        return 0.0;
    }
    public double toFT() {
        if (this.unit_of_measurement == "mm") {
            return mmtoft(this.value);
        } else if (this.unit_of_measurement == "cm") {
            return cmtoft(this.value);
        } else if (this.unit_of_measurement == "dm") {
            return dmtoft(this.value);
        } else if (this.unit_of_measurement == "m") {
            return mtoft(this.value);
        } else if (this.unit_of_measurement == "dam") {
            return damtoft(this.value);
        } else if (this.unit_of_measurement == "hm") {
            return hmtoft(this.value);
        } else if (this.unit_of_measurement == "km") {
            return kmtoft(this.value);
        } else if (this.unit_of_measurement == "in") {
            return intoft(this.value);
        } else if (this.unit_of_measurement == "ft") {
            return this.value;
        } else if (this.unit_of_measurement == "yd") {
            return ydtoft(this.value);
        } else if (this.unit_of_measurement == "mi") {
            return mitoft(this.value);
        } else System.out.println("This unit of measurement is not recognized.");
        return 0.0;
    }
    public double toYD() {
        if (this.unit_of_measurement == "mm") {
            return mmtoyd(this.value);
        } else if (this.unit_of_measurement == "cm") {
            return cmtoyd(this.value);
        } else if (this.unit_of_measurement == "dm") {
            return dmtoyd(this.value);
        } else if (this.unit_of_measurement == "m") {
            return mtoyd(this.value);
        } else if (this.unit_of_measurement == "dam") {
            return damtoyd(this.value);
        } else if (this.unit_of_measurement == "hm") {
            return hmtoyd(this.value);
        } else if (this.unit_of_measurement == "km") {
            return kmtoyd(this.value);
        } else if (this.unit_of_measurement == "in") {
            return intoyd(this.value);
        } else if (this.unit_of_measurement == "ft") {
            return fttoyd(this.value);
        } else if (this.unit_of_measurement == "yd") {
            return this.value;
        } else if (this.unit_of_measurement == "mi") {
            return mitoyd(this.value);
        } else System.out.println("This unit of measurement is not recognized.");
        return 0.0;
    }
    public double toMI() {
        if (this.unit_of_measurement == "mm") {
            return mmtomi(this.value);
        } else if (this.unit_of_measurement == "cm") {
            return cmtomi(this.value);
        } else if (this.unit_of_measurement == "dm") {
            return dmtomi(this.value);
        } else if (this.unit_of_measurement == "m") {
            return mtomi(this.value);
        } else if (this.unit_of_measurement == "dam") {
            return damtomi(this.value);
        } else if (this.unit_of_measurement == "hm") {
            return hmtomi(this.value);
        } else if (this.unit_of_measurement == "km") {
            return kmtomi(this.value);
        } else if (this.unit_of_measurement == "in") {
            return intomi(this.value);
        } else if (this.unit_of_measurement == "ft") {
            return fttomi(this.value);
        } else if (this.unit_of_measurement == "yd") {
            return ydtomi(this.value);
        } else if (this.unit_of_measurement == "mi") {
            return this.value;
        } else System.out.println("This unit of measurement is not recognized.");
        return 0.0;
    }
}