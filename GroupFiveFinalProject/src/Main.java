public class Main {
    public static void main(String[] args) {
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
        System.out.println(Temperature.KtoF(373));
        System.out.println(Temperature.CtoF(0));
        System.out.println(Temperature.CtoK(0));
        System.out.println(Temperature.FtoC(32));
        System.out.println(Temperature.FtoK(212));
    }
}