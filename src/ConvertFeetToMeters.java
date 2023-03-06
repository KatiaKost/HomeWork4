import java.util.Scanner;

public class ConvertFeetToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число в футах: ");
        double feet = input.nextDouble();

        final double METERS_OF_FEET = 0.305;
        double meters = feet * METERS_OF_FEET;
        System.out.println("Метры: " + meters);
    }
}
