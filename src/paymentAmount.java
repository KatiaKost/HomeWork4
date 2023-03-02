import java.util.Scanner;

public class paymentAmount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите промежуточную сумму: ");
        double interimAmount = input.nextDouble();
        System.out.println("Введите процент чаевых");
        int tipPercentage = input.nextInt();

        double percentageOfTipsInDollars = (interimAmount * tipPercentage) / 100;
        double totalAmount = interimAmount + percentageOfTipsInDollars;
        System.out.println( "Сумма к оплате: " + totalAmount + " Долларов");
    }
}
