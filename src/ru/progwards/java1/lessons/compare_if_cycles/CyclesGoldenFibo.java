package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit){
        boolean f = (number == digit);
        System.out.println(f);
        return f;
    }

    public static void main(String[] args) {
        containsDigit(1,10);
    }
}
