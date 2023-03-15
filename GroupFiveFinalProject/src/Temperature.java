public class Temperature {
    double value;
    public String unit_of_measurement;
//    public String abbreviated_units;
    public Temperature(){
        value = 0;
        unit_of_measurement = "C";
    }
    public Temperature(double v, String u){
        value = v;
        unit_of_measurement = u;
    }

    public static void listUnits(){
        System.out.println("Valid temperature measurement systems include:");
        System.out.println("\"C\", for Centigrade");
        System.out.println("\"F\", for Fahrenheit");
        System.out.println("\"K\", for Kelvin");
    }

    public static double FtoC(double F){
        return (F-32)*5.0/9.0;
    }
    public static double FtoK(double F){
        return ((F-32)*5.0/9.0)+273.0;
    }
    public static double CtoF(double C){
        return C*(9.0/5.0)+32.0;
    }
    public static double CtoK(double C){
        return C+273.0;
    }
    public static double KtoF(double K){
        return ((K-273.0)*9.0/5.0)+32.0;
    }
    public static double KtoC(double K){
        return K-273.0;
    }
    public double toCelsius(){
        if(this.unit_of_measurement == "C"){
            return this.value; //C is already in C
        }
        else if(this.unit_of_measurement == "F"){
            return (this.value-32)*5.0/9.0; //212-32=180, *5/9 = 100; F to C
        }
        else{
            return this.value-273.0; //K - 273 = K to C
        }
    }
    public double toFahrenheit(){
        if(this.unit_of_measurement == "C"){
            return (this.value*(9.0/5.0))+32.0; //100*9/5 = 180, +32 = 212; C to F
        }
        else if(this.unit_of_measurement == "F"){
            return this.value; //F is already in F
        }
        else{
            return ((this.value-273.0)*9.0/5.0)+32.0; //K-273 to be C; C*9/5, +32 = F
        }
    }
    public double toKelvin(){
        if(this.unit_of_measurement == "C"){
            return this.value+273.0; //C+273 = K
        }
        else if(this.unit_of_measurement == "F"){
            return ((this.value-32.0)*5.0/9.0)+273.0; //F to C, +273 = K
        }
        else{
            return this.value; //K is already in K
        }
    }
}
