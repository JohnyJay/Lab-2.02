import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TASK ONE
        System.out.println(Arrays.toString(arrayOfOddIntegers(0)));
        System.out.println(Arrays.toString(arrayOfOddIntegers(-5)));
        System.out.println(Arrays.toString(arrayOfOddIntegers(20)));
        System.out.println(Arrays.toString(arrayOfOddIntegers(33)));

        //TASK TWO
        String sentence1 ="I wish we could return to the past.";
        String sentence2 ="Can you break this wall?";
        String sentence3 ="I finally found what I was looking for.";
        String sentence4 ="Can I order a long drink?";
        String sentence5 ="Which way is the highway?";
        String sentence6 ="I like to go to the park";
        boolean s1;
        boolean s2;
        boolean s3;
        boolean s4;
        boolean s5;
        boolean s6;

        s1=containsJavaKeyWord(sentence1);
        s2=containsJavaKeyWord(sentence2);
        s3=containsJavaKeyWord(sentence3);
        s4=containsJavaKeyWord(sentence4);
        s5=containsJavaKeyWord(sentence5);
        s6=containsJavaKeyWord(sentence6);

        System.out.println("\nThe method will flag the following sentences if they contain java keyowrds:\n");
        System.out.println("The sentence: '"+sentence1+"' has been flagged as "+s1);
        System.out.println("The sentence: '"+sentence2+"' has been flagged as "+s2);
        System.out.println("The sentence: '"+sentence3+"' has been flagged as "+s3);
        System.out.println("The sentence: '"+sentence4+"' has been flagged as "+s4);
        System.out.println("The sentence: '"+sentence5+"' has been flagged as "+s5);
        System.out.println("The sentence: '"+sentence6+"' has been flagged as "+s6);


    }

    public static boolean containsJavaKeyWord(String sentence1) {
        String filePath = "keywords.txt";
        String line;
        List<String> keywords = new ArrayList<>();
        boolean flag = false;
        try{
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                line = scanner.nextLine();
                line.trim();
                keywords.add(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //System.out.println(keywords);


        String[] values = sentence1.split(" ");

        for(String value: values){
            if(keywords.contains(value)){
                //if we find the value in the keywords... flag!!!
                flag = true;
            }
        }

        return flag;

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
