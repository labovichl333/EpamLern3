package by.epamtc.lab3.scanner;

import java.util.Scanner;

public class DataScanner {
    public static int scanConsoleInt(){
        int number;

        Scanner scanner=new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        number = scanner.nextInt();

        return number;
    }
}
