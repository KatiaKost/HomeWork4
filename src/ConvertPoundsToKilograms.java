import java.util.Scanner;

public class ConvertPoundsToKilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число в фунтах: ");
        double pounds = input.nextDouble();

        final double KILOGRAMS_OF_POUNDS = 0.454;
        double kilograms = pounds * KILOGRAMS_OF_POUNDS;
        System.out.println("Килограммы: " + kilograms);
    }
}
