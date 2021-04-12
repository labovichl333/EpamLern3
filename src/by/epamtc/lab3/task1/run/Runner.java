package by.epamtc.lab3.task1.run;

import by.epamtc.lab3.task1.entity.Array;
import by.epamtc.lab3.task1.service.FillIntArrayService;
import by.epamtc.lab3.task1.service.IntArrayService;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Array array=new Array(11,9);

        FillIntArrayService.fillArrayRandom(array.getMas(),10,1065);
        System.out.println(array.toString());
        System.out.println(Arrays.toString(IntArrayService.findFibonacciNumbers(array.getMas())));
        System.out.println(Arrays.toString(IntArrayService.findPrimeNumbers(array.getMas())));
        System.out.println(Arrays.toString(IntArrayService.findThreeDigitUniqueNumbers(array.getMas())));
        array.shakerSort();
        System.out.println(array.toString());
        System.out.println(array.findMax());
        System.out.println(array.findMin());

    }
}
