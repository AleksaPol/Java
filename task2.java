import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        // Вывести все простые числа от 1 до 1000
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                numbers.add(i);
            }
        }
        System.out.println("Простые числа: " + numbers);
} 
}
