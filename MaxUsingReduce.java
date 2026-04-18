import java.util.*;

public class MaxUsingReduce {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(10, 25, 5, 40, 15);

        int max = numbers.stream()
                         .reduce((a, b) -> a > b ? a : b)
                         .get();

        System.out.println("Maximum number is: " + max);
    }
} 
    
