import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int l = input.nextInt();

        System.out.println("Введите значения элементов массива:");

        int[] a = new int[l];
        for(int i = 0; i < l; ++i) a[i] = input.nextInt();

        System.out.printf("Наибольший элемент массива: %d\n",findmax(a));
    }

    public static int findmax(int[] array){
        int max=array[0];
        for(int i = 0; i < array.length; max=(array[i]>max ? array[i] : max), i++);
        return max;
    }
}