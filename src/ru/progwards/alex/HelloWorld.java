package ru.progwards.alex;

public class HelloWorld {
    static void println(String str) {

        System.out.println(str);
    }
    static int addition(int x, int y) {
        //int z = x+y;
        return x+y;
    }
    public static void main(String[] args) {
        println("Привет, мир!");
        println("Мир, ты слышишь меня?!");
        System.out.print("Я знаю что 5+7 =");
        //int z = addition(5, 7);
        System.out.println(addition(5, 7));
      //  HelloWorld.helloWorld();
      //  ru.progwards.alex.HelloWorld.helloWorld();;
    }
}
