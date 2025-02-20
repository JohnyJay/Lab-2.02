import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    String sentence1;
    String sentence2;
    String sentence3;
    String sentence4;
    String sentence5;
    String sentence6;
    Player player1;
    Player player2;


    @BeforeEach
    void setUp() {
        number1 = 0;
        list1 = new int[]{0};
        number2 = 20;
        list2 = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        number3 = -5;
        list3 = new int[]{0};
        number4 = 33;
        list4 = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33};
        sentence1 = "I wish we could return to the past.";
        sentence2 = "Can you break this wall?";
        sentence3 = "I finally found what I was looking for.";
        sentence4 = "Can I order a long drink?";
        sentence5 = "Which way is the highway?";
        sentence6 = "I like to go to the park";
        player1 = new Warrior(100, 3, 5, 5);
        player2 = new Wizard(4, 1, 50, 10);
    }


    @org.junit.jupiter.api.Test
    void testArrayOfOddIntegers_differentInts_correctList() {
        //assertEquals(list1,Main.arrayOfOddIntegers(number1));
        //assertTrue(list1.equals(Main.arrayOfOddIntegers(number1)));
        assertEquals(Arrays.toString(list1), Arrays.toString(Main.arrayOfOddIntegers(number1)));
        //assertTrue(list2.equals(Main.arrayOfOddIntegers(number2)));
        assertEquals(Arrays.toString(list2), Arrays.toString(Main.arrayOfOddIntegers(number2)));
        //assertTrue(list3.equals(Main.arrayOfOddIntegers(number3)));
        assertEquals(Arrays.toString(list3), Arrays.toString(Main.arrayOfOddIntegers(number3)));
        //assertTrue(list4.equals(Main.arrayOfOddIntegers(number4)));
        assertEquals(Arrays.toString(list4), Arrays.toString(Main.arrayOfOddIntegers(number4)));
    }

    @Test
    void containsJavaKeyWord_stringSentences_result() {
        assertTrue(Main.containsJavaKeyWord(sentence1));
        assertTrue(Main.containsJavaKeyWord(sentence2));
        assertTrue(Main.containsJavaKeyWord(sentence3));
        assertTrue(Main.containsJavaKeyWord(sentence4));
        assertFalse(Main.containsJavaKeyWord(sentence5));
        assertFalse(Main.containsJavaKeyWord(sentence6));
    }

    @Test
    void decrementLives_player_works() {
        int t = player1.original_health;
        int l = player1.lives;
        player1.decrementLive();
        assertEquals(t,player1.health);
        assertEquals(l,player1.getLives()+1);
    }

    @Test
    void decrementLives_player_dies() {
        player1.setLives(1);
        player1.decrementLive();
        assertEquals(0,player1.getLives());
        player1.decrementLive();
        assertEquals(0,player1.getLives());
    }

    @Test
    void attack_player_works() {
        int t = player1.health;
        player2.attack(player1);
        assertEquals(t-player2.strength,player1.getHealth());
    }

    @Test
    void checkHealth_player_works() {
        player1.setLives(2);
        player1.setHealth(10);
        player1.checkHealth();
        assertEquals(2,player1.getLives());
        player1.setHealth(0);
        player1.checkHealth();
        assertEquals(1,player1.getLives());
        player1.setHealth(-10);
        player1.checkHealth();
        assertEquals(0,player1.getLives());
    }

    @Test
    void convertToElf_warrior_works() {
        if(player1 instanceof Warrior wa){
            player2 = wa.convertToElf();
        }
        assertInstanceOf(Elf.class, player2);
    }

    @Test
    void convertToElf_wizard_works() {
        if (player2 instanceof Wizard wi) {
            player1 = wi.convertToElf();
        }
        assertInstanceOf(Elf.class, player1);
    }

}

