import java.util.Scanner;

public class ConvertPoundsToKilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число в фунтах: ");
        double pounds = input.nextDouble();

        final double kilogramsOfPounds = 0.454;
        double kilograms = pounds * kilogramsOfPounds;
        System.out.println("Килограммы: " + kilograms);
    }
}
