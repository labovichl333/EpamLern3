package by.epamtc.lab3.task1.service;

import by.epamtc.lab3.task1.entity.Array;

public class SortArrayService {

    public static void shellSort(Array array){
        if(array==null){
            //выбросить своё исключение
        }
        int[] mas=array.getMas();

        for (int step = mas.length / 2; step > 0; step /= 2) {
            for (int i = step; i < mas.length; i++) {
                for (int j = i - step; j >= 0 && mas[j] > mas[j + step] ; j -= step) {
                    int x = mas[j];
                    mas[j] = mas[j + step];
                    mas[j + step] = x;
                }
            }
        }
    }

    public static void shakerSort(Array array) {
        if(array==null){
            //выбросить своё исключение
        }
        int[] mas=array.getMas();

        int buff;
        int left = 0;
        int right = mas.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (mas[i] > mas[i + 1]) {
                    buff = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buff;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (mas[i] < mas[i - 1]) {
                    buff = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = buff;
                }
            }
            left++;
        } while (left < right);
    }


    public static void quickSort(Array array){
        if(array==null){
            //выбросить своё исключение
        }
        int[] mas=array.getMas();
        quickSort(mas,0,mas.length-1);
    }
    private static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

}
