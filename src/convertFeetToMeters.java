import java.util.Scanner;

public class convertFeetToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число в футах: ");
        double feet = input.nextDouble();

        double meters = feet * 0.305;
        System.out.println("Метры: " + meters);
    }
}
