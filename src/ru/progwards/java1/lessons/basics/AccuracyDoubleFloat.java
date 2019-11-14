package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {

    public static double volumeBallDouble(double radius){
        Double pi=3.14;
        Double V = 4/3*pi*(radius*radius*radius);
        return V;
    }


    public static float volumeBallFloat(){
        float pi= (float) 3.14;
        return (float) volumeBallDouble(6371.2);
}

    public static double calculateAccuracy(double radius){
        float temp =volumeBallFloat();
        String str = Float.toString(temp);
        double str2 = Double.parseDouble(str);
        double raz=volumeBallDouble(6371.2)-str2;
        return raz;
    }
    public static void main (String[]args){

        System.out.println(volumeBallDouble( 6371.2));
        System.out.println(volumeBallFloat());
        System.out.println(calculateAccuracy(6371.2));
    }
}
