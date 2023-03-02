import java.util.Scanner;

public class hexagonMeasurements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите сторону шестиугольника: ");
        double side = input.nextDouble();

        double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);
        System.out.println("Площадь шестиугольника: " + area);
    }
}
