import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вибір завдання
        System.out.println("Choose task:");
        System.out.println("1 - Task 1");
        System.out.println("2 - Task 2");
        System.out.println("3 - Task 3");
        System.out.println("4 - Task 4");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Очистити буфер після nextInt()

        if (choice == 1) {
            Task1.run(scanner);
        } else if (choice == 2) {
            RearrangeArray2.run(scanner);
        } else if (choice == 3) {
            Task3.run(scanner);
        } else if (choice == 4) {
            Task4.run(scanner);
        } else {
            System.out.println("Невірний вибір!");
        }

        scanner.close();
    }
}