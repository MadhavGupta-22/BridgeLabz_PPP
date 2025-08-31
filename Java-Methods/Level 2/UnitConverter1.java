package JavaMethod.Level2;
public class UnitConverter1 {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println("10 Km in Miles: " + convertKmToMiles(10));
        System.out.println("5 Miles in Km: " + convertMilesToKm(5));
        System.out.println("3 Meters in Feet: " + convertMetersToFeet(3));
        System.out.println("12 Feet in Meters: " + convertFeetToMeters(12));
    }
}
