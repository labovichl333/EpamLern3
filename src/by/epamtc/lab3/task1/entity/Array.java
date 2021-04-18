package by.epamtc.lab3.task1.entity;


public class Array {
    public static final int DEFAULT_LENGTH = 15;
    private int[] mas;

    public Array() {
        this.mas =new int[DEFAULT_LENGTH];
    }

    public Array(int[] mas) {
        this.mas =new int[mas.length];
        for (int i = 0; i <mas.length; i++) {
            this.mas[i]=mas[i];
        }
    }

    public Array(int length,int startValue) {
        if (length<0){
            //выбросить своё исключение
        }
        mas=new int[length];
        for (int i = 0; i <mas.length; i++) {
            this.mas[i]=startValue;
        }
    }

    public int[] getMas() {
        return mas;
    }

    public void setMas(int[] mas) {
        this.mas = mas;
    }

    public static int getDefaultLength() {
        return DEFAULT_LENGTH;
    }

    @Override
    public String toString() {
        StringBuilder answer = new StringBuilder();
        answer.append(getClass().getSimpleName());
        answer.append("@");
        answer.append(" [");
        for (int i = 0; i < mas.length; i++) {
            answer.append(mas[i]);
            answer.append(", ");
        }
        if(answer.lastIndexOf(", ")!=-1){
            answer.deleteCharAt(answer.lastIndexOf(", "));
            answer.deleteCharAt(answer.lastIndexOf(" "));
        }
        answer.append(']');
        return answer.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        for (int i = 0; i < this.mas.length; i++) {
            if (this.mas[i] != array.mas[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        if(mas==null){
            //выбросить своё исключение
        }
        int result = 0;
        for (int value : this.mas) {
            result += value;
        }
        return result;
    }

}
