package ru.progwards.java1.lessons.helloworld;

public class Task3 {
    public static int addition(int x, int y){
        int z = x + y;


        return z;
    }

    public static int subtraction(int x, int y){
        int z = x - y;

        return z;

    }
    public static int multiplication(int x, int y){
        int z = x * y;

        return z;
    }

    public static void main (String[]args){

        System.out.println("Вызвана функция addition()");
        System.out.println(addition(89, 55));//3.1
        System.out.println("Вызвана функция subtraction()");
        System.out.println(subtraction(89, 55));//3.2
        System.out.println("Вызвана функция multiplication()");
        System.out.println(multiplication(89, 55));//3.3
        int a,b,c;
        a=34;
        b=55;
        System.out.println("a="+a);
        System.out.println("b="+b);
        c=addition(a, b);
        System.out.println("a + b = "+c);//3.4
        c=subtraction(a, b);
        System.out.println("a - b = "+c);//3.4
        c= multiplication(a, b);
        System.out.println("a * b = "+c);//3.4

         }
}