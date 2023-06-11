package App._02_app_end;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter for base converting");
        System.out.println("Version 1.0");
        double kilometer = 55.7;
        double mille = 78.2;
        double d = convertKilometerToMille(kilometer);
        System.out.println(kilometer + " kilometer = " + d + " mille");
        double c = convertMilleToKilometer(mille);
        System.out.println(mille + " mille = " + c + " kilometer");
    }
    private static double convertMilleToKilometer(double mille){
        return mille * 1.60934;
    }
    private static double convertKilometerToMille(double kilometer){
        return kilometer / 1.60934;
    }
}
