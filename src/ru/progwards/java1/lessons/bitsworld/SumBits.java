package ru.progwards.java1.lessons.bitsworld;

public class SumBits {

    public static int sumBits(byte value) {
        int i = 0;
        int sum = 0;
        if (value > 0) {
            while (i < 9) {


                int b0 = value >> i & 1;


                sum = b0 + sum;

                i++;
            }

            return sum;
        }
        return sum;
    }

        public static void main (String[]args){
            System.out.println(sumBits((byte) 0b0100101));
        }
    }
// 1%2=1
// 1/2=0
//0%2=0
//10/2=1
//10%2=0

