package by.epamtc.lab3.task1.service;

public class IntService {
    public static boolean isPrimeNumber(int number){
        if (number<2){
            return false;
        }
        if(number==2){
            return true;
        }
        boolean ansver=true;
        if (number>=2){
            for (int i = 2; i <number; i++) {
                if(number%i==0){
                    ansver=false;
                    break;
                }
            }
        }
        return ansver;
    }

    public static boolean isFibonacciNumber(int number){
       boolean answer=false;
        int helpTool = 5 * number * number;
        if((Math.sqrt(helpTool + 4) % 1 == 0 || Math.sqrt(helpTool - 4) % 1 == 0) && number >= 0){
           answer=true;
        }
       return answer;
    }


    public static boolean isThreeDigitUniqueNumbers(int number){
        boolean answer=true;
        number=Math.abs(number);
        if(number<100 || number>999){
            answer=false;
        }
        int n1=number%10;
        int n2=number%100-n1*10;
        int n3=number%1000-n2*100-n1*10;
        if(n1==n2 || n2==n3 || n3==n1){
            answer=false;
        }
        return answer;
    }

}
