package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        if (a > c || a > b) {
            System.out.println(a);
            return a;

        }
        if (b > c || b > c) {
            System.out.println(b);
            return b;
        } else {
            System.out.println(c);
            return c;
        }


    }

    public static int minSide(int a, int b, int c) {
        if (a < c && a < c) {
            System.out.println(b);
            return a;
        }

        if (b < c && b < c) {
            System.out.println(b);
            return b;
        } else {
            System.out.println(c);
            return c;
        }

    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        if (a == (c = b)) {
            System.out.println("True");

        } else {
            System.out.println("false");

        }
        return false;
    }
        public static void main(String[]args){
            maxSide(1, 2, 3);
            minSide(2, 4, 5);
          isEquilateralTriangle(1, 2, 2);
        }
    }