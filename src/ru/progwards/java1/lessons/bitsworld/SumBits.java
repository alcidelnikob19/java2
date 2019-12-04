package ru.progwards.java1.lessons.bitsworld;

public class SumBits {

    public static int sumBits(byte value) {
        byte r = 0;
        if (value < 0) {
            r++;
            value &= 0b1111_1111;
        }
        while (value != 0) {
            r += value & 0b1;
            value >>= 1;
        }

        return r;
    }
    public static void main(String[] args) {
        System.out.println("Сумма битов=" + sumBits((byte)0b0110_0110));

    }
}
