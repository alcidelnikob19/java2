package ru.progwards.alex;

public class kk {
//    public static void reverseDigits(int number){
//        //int n=number*10;
//        int z= number % 10;
//        int z1= (number-z) / 10;
//        int z4= z1% 10;
//        int z2= z1/10;
//
//        //while (( number- z1*10)/ 10) != 0)
//
//
//        System.out.print(z);
//        System.out.print(z4);
//        System.out.print(z2);
//    }
//    public static void main (String[]args){
//        reverseDigits(321);
//
//
//    }

    static void addAsStrings(int n1, int n2){
        String str = Integer.toString(n1);
        String str1 = Integer.toString(n2);
        String s= str + str1;
//        return s;
    }

    public static void main(String[] args) {
        addAsStrings(2, 1);
    }
}