import java.lang.System;
import java.util.Scanner;

class user_input_int{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        System.out.println("The value of a is"+a); 
    }
}


class user_input_string{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String name = scn.nextLine();
        System.out.println("The value of a is"+name); 
    }
}


class user_input_float{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        float f=scn.nextfloat();
        System.out.println("The value of a is"+f); 
    }
}