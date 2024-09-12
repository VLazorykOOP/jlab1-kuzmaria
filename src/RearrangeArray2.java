import java.util.Scanner;

public class RearrangeArray2 {
    public static void run(Scanner scanner) {
        // Введення розміру масиву
        System.out.print("Введіть кількість елементів масиву (не більше 400): ");
        int n = scanner.nextInt();

        // Перевірка на допустимий розмір
        if (n > 400 || n <= 0) {
            System.out.println("Некоректний розмір масиву.");
            return;
        }

        // Введення масиву
        int[] A = new int[n];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        // Алгоритм для перестановки масиву без використання додаткового масиву
        int left = 0;
        int right = n - 1;

        while (left < right) {
            // Знайти перший додатний елемент зліва
            while (left < right && A[left] < 0) {
                left++;
            }

            // Знайти перший від'ємний елемент справа
            while (left < right && A[right] >= 0) {
                right--;
            }

            // Поміняти місцями, якщо такі елементи знайдено
            if (left < right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
        }

        // Виведення масиву по 10 елементів у рядку
        System.out.println("Перетворений масив:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println(); // Перехід на новий рядок після кожних 10 елементів
            }
        }
    }
}