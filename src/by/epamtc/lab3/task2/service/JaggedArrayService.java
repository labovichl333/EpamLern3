package by.epamtc.lab3.task2.service;

import by.epamtc.lab3.task2.property.SortType;

public class JaggedArrayService {
    public static void sort(int[][] jaggedArray, SortType sortType,boolean isIncrease){
        if(jaggedArray==null){
            //выбросить своё исключение
        }
        int value1=-1;
        int value2=-1;

        for (int i = 0; i < jaggedArray.length - 1; i++) {
            for (int j = 0; j < jaggedArray.length - 1; j++) {
                switch (sortType) {
                    case ELEMENTS_SUM:
                        value1 = sumOfLine(jaggedArray[j]);
                        value2 = sumOfLine(jaggedArray[j+1]);
                        break;
                    case MAX_LINE_ELEMENT:
                        value1 = findMaxValue(jaggedArray[j]);
                        value2 = findMaxValue(jaggedArray[j + 1]);
                        break;
                    case MIN_LINE_ELEMENT:
                        value1 = findMinValue(jaggedArray[j]);
                        value2 = findMinValue(jaggedArray[j + 1]);
                        break;
                }
                if (isSwap(value1, value2, isIncrease))
                {
                    swap(jaggedArray, j);
                }
            }
        }
    }

    public static boolean isSwap(int value1, int value2, boolean isIncrease) {
            boolean answer = false;
            if (value1 > value2 && isIncrease || value1 < value2 && !isIncrease){
                answer=true;
            }
            return answer;
    }

    public static void swap(int[][] jaggedArray, int index) {
        if(jaggedArray==null){
            //выбросить своё исключение
        }
        int[] temp;
        temp = jaggedArray[index];
        jaggedArray[index] = jaggedArray[index + 1];
        jaggedArray[index + 1] = temp;
    }

    public static int sumOfLine(int[] line)  {
        if (line == null){
            //выбросить своё исключение
        }
        int sum = 0;
        for (int i = 0; i < line.length; i++) {
            sum += line[i];
        }
        return sum;
    }

    public static int findMinValue(int[] line)  {
        if (line == null){
            //выбросить своё исключение
        }

        int minValue = line[0];
        for (int i = 1; i < line.length; i++) {
            if (line[i] < minValue){
                minValue = line[i];
            }
        }
        return minValue;
    }

    public static int findMaxValue(int[] line)  {
        if (line == null){
            //выбросить своё исключение
        }
        int maxValue = line[0];
        for (int i = 1; i < line.length; i++) {
            if (line[i] > maxValue) {
                maxValue = line[i];
            }
        }
        return maxValue;
    }

    public static void printJaggedArray(int[][] jaggedArray) {
        if(jaggedArray==null){
            //выбросить своё исключение
        }
        for(int i=0;i<jaggedArray.length;i++){
            for (int j = 0; j <jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println();
        }

    }

}
