import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class collection {
    public static void main(String[] args){
        List<Integer> l=new ArrayList<>();
        l.add(23);
        l.add(26);
        l.add(106);
        l.add(49);
        System.out.println("i");


        Iterator<Integer> list1=l.iterator();
        while(list1.hasNext()){
            int i = 0;
            if(i==26){
                list1.remove();
            }

        }
             System.out.println(l);
             List<String> l2=new ArrayList<>();
                l2.add("lion");
                l2.add("tiger");
                l2.add("cat");
                System.out.println(l2);


                ListIterator<String> list2=l2.listIterator(l2.size());
                while(list2.hasPrevious()) {
                    System.out.println(list2.previous());
                    String s=list2.previous();
                    if(s.equals("lion")) {
                        list2.add("dog");
                        list2.set("change");
                        list2.remove();
                    }
                }
                System.out.println(l2);
                
                
                System.out.println("min="+Collections.min(l));
                System.out.println("max="+Collections.max(l));
                Collections.sort(l);
                System.out.println(l);
                System.out.println(Collections.frequency(l,67));

            }
        }
        