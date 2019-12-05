package ru.progwards.java1.lessons.bitsworld;

public class SumBits {

//    public static int sumBits(byte value) {
////        int b0=value%2;
//        int b0=value&1;
//        return b0;
////    }
//    public static int sumBits1(byte value, int num) {
//        value = (byte) (value>>num);
//        int b1=value%2;
//
//        return b1;
//    }
    public static int sumBits1(byte value) {
        value = (byte) (value>>1);
        int b0=value%2;

        return b0;
    }
    public static int sumBits(byte value) {
        value = (byte) (value>>2);
        int b1=value%2;

        return b1;
    }
    public static int sumBits2(byte value) {
        value = (byte) (value>>3);
        int b2=value%2;

        return b2;
    }

    public static int sumBits3(byte value) {
        value = (byte) (value>>4);
        int b3=value%2;

        return b3;
    }

    public static int sumBits4(byte value) {
        value = (byte) (value>>5);
        int b4=value%2;

        return b4;
    }

    public static int sumBits5(byte value) {
        value = (byte) (value>>6);
        int b5=value%2;

        return b5;
    }

    public static int sumBits6(byte value) {
        value = (byte) (value>>7);
        int b6=value%2;

        return b6;
    }

    public static int sumBits7(byte value) {
        value = (byte) (value>>8);
        int b7=value%2;

        return b7;
    }

//    public static int sumBits8(byte value) {
//        Object sumBits;
//        Object sumBits1;
//        Object sumBits2;
//        Object sumBits3;
//        Object sumBits4;
//        Object sumBits5;
//        Object sumBits6;
//        Object sumBits7;
//
//        int b8=sumBits+sumBits1+sumBits2+sumBits3+sumBits4+sumBits5+sumBits6+sumBits7;
//
//        return b8;
//    }
    public static void main(String[] args) {
        System.out.println(sumBits((byte)0b0)+sumBits1((byte)0b0)+sumBits2((byte)0b0)+sumBits3((byte)0b0)+sumBits4((byte)0b0)+sumBits5((byte)0b0)+sumBits4((byte)0b0)+sumBits5((byte)0b0)+sumBits6((byte)0b0)+sumBits7((byte)0b01));


    }
}
// 1%2=1
// 1/2=0
//0%2=0
//10/2=1
//10%2=0

