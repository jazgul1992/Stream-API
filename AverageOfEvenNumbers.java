import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfEvenNumbers {
    public static void main(String[] args) {
        // Исходный список чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Использование Stream API для вычисления среднего значения четных чисел
        OptionalDouble average = numbers.stream()
                .filter(num -> num % 2 == 0) // Оставляем только четные числа
                .mapToInt(num -> num)       // Преобразуем в IntStream
                .average();                 // Вычисляем среднее значение

        // Вывод результата
        if (average.isPresent()) {
            System.out.println("Среднее значение четных чисел: " + average.getAsDouble());
        } else {
            System.out.println("Список не содержит четных чисел.");
        }
    }
}
