import java.util.Scanner;

public class countingMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите денежную сумму в десятичном формате: ");
        double money = input.nextDouble();
        double cents = money * 100;
        int dollars = (int) cents / 100;
        cents = cents % 100;
        int quarter = (int) cents / 25;
        cents = cents % 25;
        int dime = (int) cents / 10;
        cents = cents % 10;
        int nickel = (int) cents / 5;
        cents = cents % 5;
        int penny = (int) cents;
        System.out.println("Доллары: " + dollars);
        System.out.println("Четвертаки: " + quarter);
        System.out.println("Десятицентники: " + dime);
        System.out.println("Никели: " + nickel);
        System.out.println("Пенни: " + penny);
    }
}
