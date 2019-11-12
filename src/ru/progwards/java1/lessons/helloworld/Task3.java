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

        System.out.println(addition(89, 55));//3.1
        System.out.println(subtraction(89, 55));//3.2
        System.out.println(multiplication(89, 55));//3.3

    }

}