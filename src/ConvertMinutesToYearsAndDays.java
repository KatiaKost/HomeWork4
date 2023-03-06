import java.util.Scanner;

public class ConvertMinutesToYearsAndDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите минуты: ");
        int minutes = input.nextInt();

        final int DAYS_OF_MINUTES = 1440;
        int amountOfDays = minutes / DAYS_OF_MINUTES;
        final int YEARS_OF_DAYS = 365;
        int amountOfYears = amountOfDays / YEARS_OF_DAYS;
        System.out.println("Количество лет: " + amountOfYears + " Количество дней: " + amountOfDays);
    }
}
