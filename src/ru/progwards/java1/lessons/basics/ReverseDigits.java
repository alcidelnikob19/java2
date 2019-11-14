package ru.progwards.java1.lessons.basics;

public class ReverseDigits {

    public static int reverseDigits(int number) {
        int leftover = 0;
        while (number > 0) {
            if (number > 9) {
                leftover = number % 10;
                number = number / 10;
                System.out.print(leftover);
            } else {
                leftover = number % 10;
                number = number / 10;
                System.out.print(leftover);
                break;
            }
        }
        return leftover;
    }
        public static void main (String[]args){
            reverseDigits(321);

        }
    }