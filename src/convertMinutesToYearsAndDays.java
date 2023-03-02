import java.util.Scanner;

public class convertMinutesToYearsAndDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите минуты: ");
        int minutes = input.nextInt();

        int amountOfDays = minutes / 1440;
        int amountOfYears = amountOfDays / 365;
        System.out.println("Количество лет: " + amountOfYears + " Количество дней: " + amountOfDays);
    }
}
