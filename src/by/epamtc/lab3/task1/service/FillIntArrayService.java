package by.epamtc.lab3.task1.service;

import by.epamtc.lab3.scanner.DataScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FillIntArrayService {
    public static void fillArrayRandom(int[] array,int from,int to){
        if(array==null){
            //выбросить своё исключение
        }
        if(to-from<0){
            //выбросить своё исключение
        }
        for (int i = 0; i <array.length; i++) {
            array[i]=(int)(Math.random()*(to-from))+from;
        }
    }
    public static void fillArrayFromConsole(int[] array){
        if(array==null){
            //выбросить своё исключение
        }
        for (int i = 0; i <array.length; i++) {
            array[i]= DataScanner.scanConsoleInt();
        }
    }
    public static void fillArrayFromFile(int[] array,String path) throws FileNotFoundException {
        if(array==null){
            //выбросить своё исключение
        }
        Scanner scanner = new Scanner(new File(path));
        int counter = 0;
        while (scanner.hasNextInt() && counter < array.length) {
            array[counter] = scanner.nextInt();
            counter++;
        }
        scanner.close();
    }
}
