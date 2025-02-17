import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private int[] list1;
    private int[] list2;
    private int[] list3;
    private int[] list4;
    private int number1;
    private int number2;
    private int number3;
    private int number4;

    @BeforeEach
    void setUp(){
        number1 = 0;
        list1 = new int[]{0};
        number2 = 20;
        list2 = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        number3 = -5;
        list3 = new int[]{0};
        number4 = 33;
        list4 = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33};

    }

    @org.junit.jupiter.api.Test
    void testarrayOfOddIntegers() {
        //assertEquals(list1,Main.arrayOfOddIntegers(number1));
        //assertTrue(list1.equals(Main.arrayOfOddIntegers(number1)));
        assertEquals(Arrays.toString(list1),Arrays.toString(Main.arrayOfOddIntegers(number1)));
        //assertTrue(list2.equals(Main.arrayOfOddIntegers(number2)));
        assertEquals(Arrays.toString(list2),Arrays.toString(Main.arrayOfOddIntegers(number2)));
        //assertTrue(list3.equals(Main.arrayOfOddIntegers(number3)));
        assertEquals(Arrays.toString(list3),Arrays.toString(Main.arrayOfOddIntegers(number3)));
        //assertTrue(list4.equals(Main.arrayOfOddIntegers(number4)));
        assertEquals(Arrays.toString(list4),Arrays.toString(Main.arrayOfOddIntegers(number4)));


    }
}