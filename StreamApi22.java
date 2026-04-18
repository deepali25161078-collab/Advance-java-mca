import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}


public class StreamApi22 {
    public static void main(String[] args){
        List<Student> student =Arrays.asList(
            new Student("Alice", 20),
            new Student("Bob", 22)
        );

        List<String> nameStudent = student.stream()
            .map(s -> s.getName())
            .collect(Collectors.toList());
        
        System.out.println(nameStudent);
        
    }
    
}
