import java.util.*;

public class CountExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        int count = list.stream()
                        .reduce(0, (a, b) -> a + 1, Integer::sum);

        System.out.println("Total elements: " + count);
    }
}
