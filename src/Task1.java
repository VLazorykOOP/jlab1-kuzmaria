import java.util.Scanner;

public class Task1 {
    
    // Функція для обчислення виразу
    public static double calculateExpression(double x, double y) {
        return (1 / (x * y)) + (1 / (Math.pow(x, 2) + Math.pow(y, 2))) * (x - y);
    }

    public static void run(Scanner scanner) {
        // Введення значень
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();
        System.out.print("Введіть значення y: ");
        double y = scanner.nextDouble();

        // 1. Дійсні числа, дійсний результат
        double resultFloat = calculateExpression(x, y);
        System.out.println("Результат (дійсний тип): " + resultFloat);

        // 2. Цілі числа, дійсний результат
        int xInt = (int) x;
        int yInt = (int) y;
        double resultFromInts = calculateExpression(xInt, yInt);
        System.out.println("Результат з цілими числами (дійсний тип результату): " + resultFromInts);

        // 3. Дійсні числа, цілий результат
        int resultInt = (int) resultFloat;
        System.out.println("Результат (цілий тип): " + resultInt);
    }
}