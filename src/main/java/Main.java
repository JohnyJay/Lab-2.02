import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOfOddIntegers(0)));
        System.out.println(Arrays.toString(arrayOfOddIntegers(-5)));
        System.out.println(Arrays.toString(arrayOfOddIntegers(20)));
        System.out.println(Arrays.toString(arrayOfOddIntegers(33)));
    }
    
    public static int[] arrayOfOddIntegers(int n){
        int[] array = {0};
        int length = 0;
        if(n>0){
            if(n%2==0){
                length = n/2;
            }else{
                length = (n/2)+1;
            }
            array = new int[length];
            for (int i = 0; i < array.length; i++) {
                array[i]=i*2+1;
            }

        }// ELSE DO NOTHING AND RETURN ZERO STRING

        return array;
    }
}
