package by.epamtc.lab3.task2.comparator;

public class MinComparator implements Comparator {
    @Override
    public int compareArray(int[] line) {
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
}
