package by.epamtc.lab3.task1.run;

import by.epamtc.lab3.task1.entity.Array;
import by.epamtc.lab3.task1.service.FillIntArrayService;
import by.epamtc.lab3.task1.service.FindArrayService;
import by.epamtc.lab3.task1.service.IntArrayService;
import by.epamtc.lab3.task1.service.SortArrayService;

public class Runner {
    public static void main(String[] args) {
        Array array=new Array(11,9);

        FillIntArrayService.fillArrayRandom(array.getMas(),10,1065);
        System.out.println("Исходный массив");
        System.out.println(array.toString());
        System.out.println("Числ фибоначи");
        System.out.println(new Array(IntArrayService.findFibonacciNumbers(array)));
        System.out.println("Простые числа");
        System.out.println(new Array(IntArrayService.findPrimeNumbers(array)));
        System.out.println("Трёхзначные числа с неповторяющимися цифрами");
        System.out.println(new Array(IntArrayService.findThreeDigitUniqueNumbers(array)));
        SortArrayService.shellSort(array);
        System.out.println("отсортированный масив");
        System.out.println(array.toString());
        System.out.println("максимальное значение");
        System.out.println(FindArrayService.findMax(array));
        System.out.println("минимальное значение");
        System.out.println(FindArrayService.findMin(array));
        System.out.println();

    }
}
