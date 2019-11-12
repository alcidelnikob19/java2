package ru.progwards.java1.lessons.helloworld;

public class Task34 {
    public static int addition(int a, int b){
        int c = a + b;
        return c;
    }

    public static int subtraction(int a, int b){
        int c = a - b;
        return c;
    }
    public static int multiplication(int a, int b){
        int c = a * b;
        return c;
    }

    public static void main (String[]args){

        System.out.println(addition(34, 55));//3.41
        System.out.println(subtraction(34, 55));//3.42
        System.out.println(multiplication(34, 55));//3.43

    }

}