package App._02_app_end;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter for base converting");
        System.out.println("Version 1.0");
    }
    private static double convertMilleToKilometer(double mille){
        return mille * 1.60934;
    }
    private static double convertKilometerToMille(double kilometer){
        return kilometer / 1.60934;
    }
}
