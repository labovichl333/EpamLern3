package by.epamtc.lab3.task2.comparator;

public class MaxComparator implements Comparator {
    @Override
    public int compareArray(int[] line) {
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
}
