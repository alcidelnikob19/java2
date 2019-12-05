package ru.progwards.java1.lessons.bitsworld;

public class Binary {

    int num;

    Binary(int num){
        this.num = num;
    }

    // возвращает двоичное представление целого числа используя только битовые операции
    public String toString() {
        int n = num & 0x7F_FF_FF_FF;
        String r = num < 0 ? "1" : "0";
        for(int i = 1; i < 8; i++) {
            r += (n & 0x40_00_00_00) == 0x40_00_00_00 ? "1" : "0";
            //if(i % 4 == 3) r += " ";
            n <<= 1;
        }
        return r;
    }

    public static void main(String[] args) {
        int t = 0;
        System.out.println(Integer.toBinaryString(t) + "=" + new Binary(t));
        t = 1;
        System.out.println(Integer.toBinaryString(t) + "=" + new Binary(t));
        t = 127;
        System.out.println(Integer.toBinaryString(t) + "=" + new Binary(t));
        t = 128;
        System.out.println(Integer.toBinaryString(t) + "=" + new Binary(t));
        t = -1;
        System.out.println(Integer.toBinaryString(t) + "=" + new Binary(t));
    }

}
