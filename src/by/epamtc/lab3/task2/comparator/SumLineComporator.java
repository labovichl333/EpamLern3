package by.epamtc.lab3.task2.comparator;

public class SumLineComporator implements Comparator {
    @Override
    public int compareArray(int[] line) {
        if (line == null){
            //выбросить своё исключение
        }
        int sum = 0;
        for (int i = 0; i < line.length; i++) {
            sum += line[i];
        }
        return sum;
    }
}
