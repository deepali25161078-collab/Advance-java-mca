import java.util.*;

public class forEachmethod {
    public static void main(String[] args){
      List<Integer> l=new ArrayList<>();
      l.add(34);
        l.add(45);
        l.add(56);
        l.add(67);
        l.add(78);

        l.forEach(System.out::println);
        l.forEach(i->{
            if(i%2==0){
                System.out.println(i);
            }
        });
        List<String> l2=new ArrayList<>();
        l2.add("Deepali");
        l2.add("hii");
        l2.forEach(s->System.out.println(s+"!"));
}
}