import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите свой рост в дюймах: ");
        double heightInInches = input.nextDouble();
        System.out.println("Введите свой вес в фунтах: ");
        double weightInPounds = input.nextDouble();

        double heightInMeters = heightInInches * 0.0254;
        double weightInKilograms = weightInPounds * 0.45359237;
        double bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("Индекс массы тела: " + bodyMassIndex);
    }
}
