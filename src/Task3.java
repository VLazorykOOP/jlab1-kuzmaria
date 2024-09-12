import java.util.Scanner;

public class Task3 {
    public static void run(Scanner scanner) {
        // Введення розміру матриці
        System.out.print("Введіть розмір матриці (не більше 15): ");
        int n = scanner.nextInt();

        // Перевірка на допустимий розмір
        if (n > 15 || n <= 0) {
            System.out.println("Некоректний розмір матриці.");
            return;
        }

        // Введення матриці
        int[][] matrix = new int[n][n];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Знаходження рядка з максимальним елементом
        int maxRow = 0;
        int maxElement = matrix[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRow = i;
                }
            }
        }

        // Циклічний зсув рядків
        int[] tempRow = matrix[maxRow];
        for (int i = maxRow; i > 0; i--) {
            matrix[i] = matrix[i - 1];
        }
        matrix[0] = tempRow;

        // Виведення матриці після зсуву
        System.out.println("Матриця після циклічного зсуву:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}