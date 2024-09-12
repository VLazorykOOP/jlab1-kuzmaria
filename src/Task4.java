import java.util.*;

public class Task4 {

    public static void run(Scanner scanner) {
        // Введення тексту
        System.out.println("Введіть текст:");
        String text = scanner.nextLine();
        
        // Розбиваємо текст на слова
        String[] words = text.split("\\W+"); // \\W+ розбиває по пробілах та розділових знаках
        
        // Мапа для зберігання кількості 'А'/'а' у кожному слові
        Map<String, Integer> wordCounts = new HashMap<>();
        
        // Знаходимо кількість букв 'А' та 'а' в кожному слові
        for (String word : words) {
            int count = countOccurrences(word, 'A') + countOccurrences(word, 'a');
            if (count > 0) { // лише слова з буквами 'А'/'а'
                wordCounts.put(word, count);
            }
        }
        
        // Перевірка, якщо є слова з буквами 'А'/'а'
        if (!wordCounts.isEmpty()) {
            // Знаходимо максимальну кількість повторень
            int maxCount = Collections.max(wordCounts.values());
            
            // Виводимо всі слова з максимальною кількістю повторень 'А'/'а'
            System.out.println("Слова з найбільшою кількістю 'А' або 'а':");
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                if (entry.getValue() == maxCount) {
                    System.out.println(entry.getKey());
                }
            }
        } else {
            System.out.println("Жодне слово не містить 'А' або 'а'.");
        }
    }
    
    // Метод для підрахунку кількості повторень символу в рядку
    private static int countOccurrences(String word, char ch) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }
}