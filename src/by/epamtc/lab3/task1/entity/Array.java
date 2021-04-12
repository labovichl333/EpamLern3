package by.epamtc.lab3.task1.entity;

import java.util.Arrays;

public class Array {
    public static final int DEFAULT_LENGTH = 15;
    private int[] mas;

    public Array() {
        this.mas =new int[DEFAULT_LENGTH];
    }

    public Array(int[] mas) {
        this.mas = mas.clone();
    }

    public Array(int length,int startValue) {
        if (length<0){
            //выбросить своё исключение
        }
        mas=new int[length];
        for (int i = 0; i <mas.length; i++) {
            this.mas[i]=startValue;
        }
    }

    public int[] getMas() {
        return mas;
    }

    public void setMas(int[] mas) {
        this.mas = mas;
    }

    public static int getDefaultLength() {
        return DEFAULT_LENGTH;
    }

    @Override
    public String toString() {
        return "Array{" +
                "mas=" + Arrays.toString(mas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        for (int i = 0; i < this.mas.length; i++) {
            if (this.mas[i] != array.mas[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        for (int value : this.mas) {
            result += value;
        }
        return result;
    }

    public  boolean isSorted(){
        if(this.mas==null){
            //выбросить своё исключение
        }
        boolean answer=true;
        for (int i = 0; i <mas.length-1; i++) {
            if (mas[i]>mas[i+1]){
                answer=false;
                break;
            }
        }
        return answer;
    }

    public void quickSort(){
        if(this.mas==null){
            //выбросить своё исключение
        }
        if(!isSorted()){
            //выбросить своё исключение
        }
        quickSort(this.mas,0,mas.length-1);
    }
    private  void quickSort(int[] array, int low, int high) {
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

    public  void shakerSort() {
        if(this.mas==null){
            //выбросить своё исключение
        }
        if(!isSorted()){
            //выбросить своё исключение
        }
        int buff;
        int left = 0;
        int right = this.mas.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (this.mas[i] > this.mas[i + 1]) {
                    buff = this.mas[i];
                    this.mas[i] = this.mas[i + 1];
                    this.mas[i + 1] = buff;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (this.mas[i] < this.mas[i - 1]) {
                    buff = this.mas[i];
                    this.mas[i] = this.mas[i - 1];
                    this.mas[i - 1] = buff;
                }
            }
            left++;
        } while (left < right);
    }

    public void shellSort(){
        if(this.mas==null){
            //выбросить своё исключение
        }
        if(!isSorted()){
            //выбросить своё исключение
        }
        for (int step = this.mas.length / 2; step > 0; step /= 2) {
            for (int i = step; i < this.mas.length; i++) {
                for (int j = i - step; j >= 0 && this.mas[j] > this.mas[j + step] ; j -= step) {
                    int x = this.mas[j];
                    this.mas[j] = this.mas[j + step];
                    this.mas[j + step] = x;
                }
            }
        }
    }

    public int findMax(){
        if(this.mas==null){
            //выбросить своё исключение
        }
        int max;
        if(mas.length==0){
            //выбросить своё исключение
        }
        max=this.mas[this.mas.length-1];
        if(!isSorted()){
            for (int i = 0; i <this.mas.length; i++) {
                if(this.mas[i]>max){
                    max=this.mas[i];
                }
            }
        }
        return max;
    }

    public int findMin(){
        if(this.mas==null){
            //выбросить своё исключение
        }
        int min;
        if(mas.length==0){
            //выбросить своё исключение
        }
        min=this.mas[0];
        if(!isSorted()){
            for (int i = 0; i <this.mas.length; i++) {
                if(this.mas[i]<min){
                    min=this.mas[i];
                }
            }
        }
        return min;
    }

    public int binarySearch(int key) {
        if (this.mas==null){
            //выбросить своё исключение
        }
        if(!isSorted()){
            //выбросить своё исключение
        }
        int index = -1;
        int low=0;
        int high=this.mas.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (this.mas[mid] < key) {
                low = mid + 1;
            } else if (this.mas[mid] > key) {
                high = mid - 1;
            } else if (this.mas[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

}
