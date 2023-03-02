import java.util.Scanner;

public class convertPoundsToKilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число в фунтах: ");
        double pounds = input.nextDouble();

        double kilograms = pounds * 0.454;
        System.out.println("Килограммы: " + kilograms);
    }
}
