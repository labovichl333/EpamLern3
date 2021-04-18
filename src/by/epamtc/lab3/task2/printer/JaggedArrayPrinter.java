package by.epamtc.lab3.task2.printer;

public class JaggedArrayPrinter {
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
