package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {

    public static double volumeBallDouble(double radius){
        Double pi=3.14;
        Double V = 4/3*pi*radius*radius*radius;


        return V;
    }
    public static void main (String[]args){

        System.out.println(volumeBallDouble( 210.1));



    }
}
