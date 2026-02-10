import java.util.Scanner;


class Example1{
    void hello(){
        System.out.println("Hello");
    }
    public static void main(String[] args){
        Example1 obj =new Example1();
        obj.hello();
    }
}

class Example2
{
    void add(int a,int b){
        System.out.println(a + b);
   }
   public static void main(String[] args){
   Example2 obj=new Example2();
   obj.add(10,20);
}
}