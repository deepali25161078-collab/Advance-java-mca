import java.util.*;

public class ConcatenateExample {
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Hi", "Java", "Code", "AI", "ChatGPT", "Sun");

        String result = list.stream()
                            .filter(s -> s.length() > 3)
                            .reduce("", (a, b) -> a + b);

        System.out.println("Concatenated String: " + result);
    }
}