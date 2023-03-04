import java.util.Scanner;

public class ConvertFeetToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число в футах: ");
        double feet = input.nextDouble();

        final double metersOfFeet = 0.305;
        double meters = feet * metersOfFeet;
        System.out.println("Метры: " + meters);
    }
}
