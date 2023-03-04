import java.util.Scanner;

public class ConvertMinutesToYearsAndDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите минуты: ");
        int minutes = input.nextInt();

        final int daysOfMinutes = 1440;
        int amountOfDays = minutes / daysOfMinutes;
        final int yearsOfDays = 365;
        int amountOfYears = amountOfDays / yearsOfDays;
        System.out.println("Количество лет: " + amountOfYears + " Количество дней: " + amountOfDays);
    }
}
