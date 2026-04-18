import java.util.*;

public class MultiplyOddNumbers {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        int result = numbers.stream()
                .filter(n -> n % 2 != 0)
                .reduce(1, (a, b) -> a * b); 

        System.out.println("Product of odd numbers: " + result);
    }
}