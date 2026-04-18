import java.util.*;
public class IntegerSetDuplicates {
    public static void main(String[] args){
        // create a set to store integers
        Set<Integer> numbers = new HashSet<>();

        // add elements to the set
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // duplicate element

        // display the set
        System.out.println("Set of numbers: " + numbers);

        // check if an element exists
        boolean contains20 = numbers.contains(20);
        System.out.println("Does the set contain 20? " + contains20);

        // remove an element
        numbers.remove(10);
        System.out.println("Set after removing 10: " + numbers);

        // iterate over the set
        System.out.println("Iterating over the set:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
