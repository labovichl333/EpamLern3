package by.epamtc.lab3.task2.run;

import by.epamtc.lab3.task2.comparator.MaxComparator;
import by.epamtc.lab3.task2.comparator.MinComparator;
import by.epamtc.lab3.task2.comparator.SumLineComporator;
import by.epamtc.lab3.task2.printer.JaggedArrayPrinter;
import by.epamtc.lab3.task2.service.JaggedArrayService;

public class Runner {
    public static void main(String[] args) {
        int[][] array={{9, -8}, {96, 315, 732, 6}, {-54, -12,  12}, {1, 2,6,78}};

        JaggedArrayService.sort(array, new MinComparator());
        JaggedArrayPrinter.printJaggedArray(array);
        System.out.println();

        JaggedArrayService.reverseLines(array);
        JaggedArrayPrinter.printJaggedArray(array);
        System.out.println();

        JaggedArrayService.sort(array,new MaxComparator());
        JaggedArrayPrinter.printJaggedArray(array);
        System.out.println();

        JaggedArrayService.reverseLines(array);
        JaggedArrayPrinter.printJaggedArray(array);
        System.out.println();

        JaggedArrayService.sort(array, new SumLineComporator());
        JaggedArrayPrinter.printJaggedArray(array);
        System.out.println();

        JaggedArrayService.reverseLines(array);
        JaggedArrayPrinter.printJaggedArray(array);
        System.out.println();
    }
}
