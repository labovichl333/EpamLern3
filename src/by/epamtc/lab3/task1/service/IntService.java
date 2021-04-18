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
        for (int i = 2; i <number; i++) {
            if(number%i==0){
                ansver=false;
                break;
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
            return false;
        }
        boolean[] hasNumber=new boolean[10];
        String numStr=String.valueOf(number);
        for (int i = 0; i <numStr.length(); i++) {
            String activeNum=""+numStr.charAt(i);
            int num=Integer.parseInt(activeNum);
            if(hasNumber[num]){
                answer=false;
                break;
            }
            if(!hasNumber[num]){
                hasNumber[num]=true;
            }
        }
        return answer;
    }

}
