package by.epamtc.lab3.task1.service;

public class IntArrayService {

    public static int[] cutArray(int[] array,int from,int to){
        if(array==null){
            //выбросить своё исключение
        }
        if(to<0 || from<0){
            //выбросить своё исключение
        }
        if(to-from<0){
            //выбросить своё исключение
        }
        int[] answer=new int[to-from];
        int counter=0;
        for (int i = from; i <to; i++,counter++) {
            answer[counter]=array[i];
        }
        return answer;
    }

    public static int[] findPrimeNumbers(int[] array){
        if(array==null){
            //выбросить своё исключение
        }
        int[] answer=new int[array.length];
        int counter=0;
        for (int i = 0; i <array.length; i++) {
            if(IntService.isPrimeNumber(array[i])){
                answer[i]=array[i];
                counter++;
            }
        }
        return cutArray(answer,0,counter);

    }

    public static int[] findFibonacciNumbers(int[] array){
        if(array==null){
            //выбросить своё исключение
        }
        int[] answer=new int[array.length];
        int counter=0;
        for (int i = 0; i <array.length; i++) {
            if(IntService.isFibonacciNumber(array[i])){
                answer[i]=array[i];
                counter++;
            }
        }
        return cutArray(answer,0,counter);

    }
    public static int[] findThreeDigitUniqueNumbers(int[] array){
        if(array==null){
            //выбросить своё исключение
        }
        int[] answer=new int[array.length];
        int counter=0;
        for (int i = 0; i <array.length; i++) {
            if(IntService.isThreeDigitUniqueNumbers(array[i])){
                answer[i]=array[i];
                counter++;
            }
        }
        return cutArray(answer,0,counter);
    }
}
