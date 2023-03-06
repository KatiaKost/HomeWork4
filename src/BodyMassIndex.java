import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите свой рост в дюймах: ");
        double heightInInches = input.nextDouble();
        System.out.println("Введите свой вес в фунтах: ");
        double weightInPounds = input.nextDouble();

        final double METERS_OF_INCHES = 0.0254;
        double heightInMeters = heightInInches * METERS_OF_INCHES;
        final double KILOGRAMS_OF_POUNDS = 0.45359237;
        double weightInKilograms = weightInPounds * KILOGRAMS_OF_POUNDS;
        double bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("Индекс массы тела: " + bodyMassIndex);
    }
}
