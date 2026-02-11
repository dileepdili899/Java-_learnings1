import java.util.Scanner;

class type_casting{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        float b=a;
        System.out.println("The value of a is" +a);
        System.out.println("The value of b is" +b);
    }
}

class type_casting2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        float a=9.99f;
        int b=(int ) a;
        System.out.println("The value of a is" +a);
        System.out.println("The value of b is" +b);
    }
}