public class Main{

    public static void main(String[] args){
        int[] a = {5,6,7,8,1,3};
        System.out.println(findmax(a));
    }

    public static int findmax(int[] array){
        int max=array[0];
        for(int i = 0; i < array.length; max=(array[i]>max ? array[i] : max), i++);
        return max;
    }
}