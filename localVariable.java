class Test2{
Test2(){
    var x=23;
    System.out.println("constructor value" + x);
}
void check(){
    var s= "hello";
    System.out.println(s);
}
}



public class localVariable {
    public static void main(String[] args){
        Test2 t=new Test2();
        t.check();

        for(var i=0; i<=4;i++){
            System.out.println(i);
        }
        String s= """
                11/2
                KIET, Muradnagar
                Gaziabad
                """;
                System.out.println(s);
    }
}
