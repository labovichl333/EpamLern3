package by.epamtc.lab3.task2.service;

import by.epamtc.lab3.task2.comparator.Comparator;


public class JaggedArrayService {
    public static void sort(int[][] jaggedArray, Comparator comparator){
        if(jaggedArray==null){
            //выбросить своё исключение
        }
        int value1=-1;
        int value2=-1;

        for (int i = 0; i < jaggedArray.length - 1; i++) {
            for (int j = 0; j < jaggedArray.length - 1; j++) {

                value1 = comparator.compareArray(jaggedArray[j]);
                value2 = comparator.compareArray(jaggedArray[j+1]);

                if (isSwap(value1, value2))
                {
                    swap(jaggedArray, j);
                }
            }
        }
    }

    private static boolean isSwap(int value1, int value2) {
            boolean answer = false;
            if (value1 > value2 ){
                answer=true;
            }
            return answer;
    }

    private static void swap(int[][] jaggedArray, int index) {
        if(jaggedArray==null){
            //выбросить своё исключение
        }
        int[] temp;
        temp = jaggedArray[index];
        jaggedArray[index] = jaggedArray[index + 1];
        jaggedArray[index + 1] = temp;
    }

    public static void reverseLines(int[][] jaggedArray){
        if(jaggedArray==null){
            //выбросить своё исключение
        }
        for (int i = 0; i <jaggedArray.length/2; i++) {
           int[] line=jaggedArray[jaggedArray.length-i-1];
            jaggedArray[jaggedArray.length-i-1]=jaggedArray[i];
            jaggedArray[i]=line;
        }
    }

}
