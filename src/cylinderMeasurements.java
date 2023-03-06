import java.util.Scanner;

public class CylinderMeasurements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите радиус: ");
        double radius = input.nextDouble();
        System.out.println("Введите длину: ");
        double length = input.nextDouble();

        double area = (radius * radius) * Math.PI;
        double volume = area * length;
        System.out.println("Площадь цилиндра: " + area + " Объем цилиндра: " + volume);
    }
}
