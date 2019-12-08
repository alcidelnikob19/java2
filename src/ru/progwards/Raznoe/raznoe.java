package ru.progwards.Raznoe;

import java.util.Arrays;

public class raznoe {
    public static void main(String[] args) {
        int[] unsortedArray = {2,1,45,7};

        System.out.println(Arrays.toString(unsortedArray));

        choiceSort(unsortedArray);
    }

    public static void choiceSort(int[] arrayToSort){


        //проходим по массиву
        //Найти минимальный элемент
        //меняем местами 1 и минимальный элемент

        //повторяем пока не пройхоме по всему массиву
        int indexMin;
        for (int index = 0; index < arrayToSort.length ; index++){
            indexMin = index;
            for (int indexToScan = index; indexToScan < arrayToSort.length; indexToScan++) {
                if (arrayToSort[indexMin] > arrayToSort[indexToScan]) {
                    indexMin = indexToScan;
                }
            }
            int temp = arrayToSort[index];
            arrayToSort[index] = arrayToSort[indexMin];
            arrayToSort[indexMin]=temp;

            }
        System.out.println(Arrays.toString(arrayToSort));
        }

    }

