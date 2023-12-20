import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int l = input.nextInt();

        System.out.println("Введите значения элементов массива:");

        int[] a = new int[l];
        for(int i = 0; i < l; ++i) a[i] = input.nextInt();

        System.out.printf("Наименьший элемент массива: %d\n",findmin(a));
    }

    public static int findmin(int[] array){
        int min=array[0];
        for(int i = 0; i < array.length; min=(array[i]<min ? array[i] : min), i++);
        return min;
    }
}