package by.epamtc.lab3.task1.service;

import by.epamtc.lab3.task1.entity.Array;

public class FindArrayService {

    public static int findMax(Array array){
        if(array==null){
            //выбросить своё исключение
        }
        int[] mas=array.getMas();
        if(mas.length==0){
            //выбросить своё исключение
        }
        int max=mas[0];
        for (int i = 0; i <mas.length; i++) {
            if(mas[i]>max){
                max=mas[i];
            }
        }
        return max;
    }

    public static int findMin(Array array){
        if(array==null){
            //выбросить своё исключение
        }
        int[] mas=array.getMas();
        if(mas.length==0){
            //выбросить своё исключение
        }
        int min=mas[0];
        for (int i = 0; i <mas.length; i++) {
            if(mas[i]<min){
                min=mas[i];
            }
        }
        return min;
    }

    public static int binarySearch(Array array,int key) {
        if(array==null){
            //выбросить своё исключение
        }
        int[] mas=array.getMas();
        if (mas==null){
            //выбросить своё исключение
        }
        int index = -1;
        int low=0;
        int high=mas.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mas[mid] < key) {
                low = mid + 1;
            } else if (mas[mid] > key) {
                high = mid - 1;
            } else if (mas[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
