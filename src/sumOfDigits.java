import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println("Введите натуральное целочисленное цисло от 0 до 1000");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int firstDigital = number / 1000;
        int secondDigital = (number % 1000) / 100;
        int thirdDigital = ((number % 1000) % 100) / 10;
        int fourthDigital = ((number % 1000) % 100) % 10;
        int sumDigital = firstDigital + secondDigital + thirdDigital + fourthDigital;
        System.out.println("Сумма цифр числа = " + sumDigital);

    }
}
