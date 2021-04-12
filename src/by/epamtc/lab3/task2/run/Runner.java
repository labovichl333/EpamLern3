package by.epamtc.lab3.task2.run;

import by.epamtc.lab3.task2.property.SortType;
import by.epamtc.lab3.task2.service.JaggedArrayService;

public class Runner {
    public static void main(String[] args) {
        int[][] array={{9, -8}, {96, 315, 732, 6}, {-54, -12,  12}, {1, 2,6,78}};

        JaggedArrayService.sort(array, SortType.ELEMENTS_SUM,true);
        JaggedArrayService.printJaggedArray(array);
        System.out.println();

        JaggedArrayService.sort(array, SortType.ELEMENTS_SUM,false);
        JaggedArrayService.printJaggedArray(array);
        System.out.println();

        JaggedArrayService.sort(array, SortType.MAX_LINE_ELEMENT,true);
        JaggedArrayService.printJaggedArray(array);
        System.out.println();

        JaggedArrayService.sort(array, SortType.MAX_LINE_ELEMENT,false);
        JaggedArrayService.printJaggedArray(array);
        System.out.println();

        JaggedArrayService.sort(array, SortType.MIN_LINE_ELEMENT,true);
        JaggedArrayService.printJaggedArray(array);
        System.out.println();

        JaggedArrayService.sort(array, SortType.MIN_LINE_ELEMENT,false);
        JaggedArrayService.printJaggedArray(array);
    }
}
