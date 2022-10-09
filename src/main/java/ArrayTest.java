import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class ArrayTest {

    private HelloWorld hw;
    private CodeSignal cs;

    private int[][] array = {
            {1, 3, 2, 1},							// 1 false
            {1, 3, 2},								// 2 true
            {1, 2, 1, 2},							// 3 false
            {3, 6, 5, 8, 10, 20, 15},				// 4 false
            {1, 1, 2, 3, 4, 4},						// 5 false
            {1, 4, 10, 4, 2},						// 6 false
            {10, 1, 2, 3, 4, 5},					// 7 true
            {1, 1, 1, 2, 3},						// 8 false
            {0, -2, 5, 6},							// 9 true
            {1, 2, 3, 4, 5, 3, 5, 6},				//10 false
            {40, 50, 60, 10, 20, 30},				//11 false
            {1, 1},									//12 true
            {1, 2, 5, 3, 5},						//13 true   !!!!!!!!!!!!!!!
            {1, 2, 5, 5, 5},						//14 false
            {10, 1, 2, 3, 4, 5, 6, 1},				//15 false
            {1, 2, 3, 4, 3, 6},						//16 true   !!!!!!!!!!!!!!!
            {1, 2, 3, 4, 99, 5, 6},					//17 true   !!!!!!!!!!!!!!!
            {123, -17, -5, 1, 2, 3, 12, 43, 45},	//18 true
            {3, 5, 67, 98, 3},                      //19 true
    };

    private int[][] arr1 = {    {0, 1, 1, 2},
                                {0, 5, 0, 0},
                                {2, 0, 3, 3}
    };

    private int[][] arr2 = {    {1, 1, 1, 0},
                                {0, 5, 0, 1},
                                {2, 1, 3, 10}
    };

    private String[] stringArray = {"aba", "aa", "ad", "vcd", "aba"};
    private String[] resultArray = {"aba", "vcd", "aba"};

    @Before
    public void setUp() {
        hw = new HelloWorld();
        cs = new CodeSignal();

        //		int[] array01 = {1, 3, 2, 1};							// false
        //		int[] array02 = {1, 3, 2};								// true
        //		int[] array03 = {1, 2, 1, 2};							// false
        //		int[] array04 = {3, 6, 5, 8, 10, 20, 15};				// false
        //		int[] array05 = {1, 1, 2, 3, 4, 4};						// false
        //		int[] array06 = {1, 4, 10, 4, 2};						// false
        //		int[] array07 = {10, 1, 2, 3, 4, 5};					// true
        //		int[] array08 = {1, 1, 1, 2, 3};						// false
        //		int[] array09 = {0, -2, 5, 6};							// true
        //		int[] array10 = {1, 2, 3, 4, 5, 3, 5, 6};				// false
        //		int[] array11 = {40, 50, 60, 10, 20, 30};				// false
        //		int[] array12 = {1, 1};									// true
        //		int[] array13 = {1, 2, 5, 3, 5};						// true
        //		int[] array14 = {1, 2, 5, 5, 5};						// false
        //		int[] array15 = {10, 1, 2, 3, 4, 5, 6, 1};				// false
        //		int[] array16 = {1, 2, 3, 4, 3, 6};						// true
        //		int[] array17 = {1, 2, 3, 4, 99, 5, 6};					// true
        //		int[] array18 = {123, -17, -5, 1, 2, 3, 12, 43, 45};	// true
        //		int[] array19 = {3, 5, 67, 98, 3};						// true
    }

    @Ignore
    @Test
    public void testArrayNew01() {
        assertEquals(9, cs.matrixElementsSum(arr1));
    }

    @Ignore
    @Test
    public void testArrayNew02() {
        assertEquals(9, cs.matrixElementsSum(arr2));
    }

    @Test
    public void testStringArray() {
        assertArrayEquals(stringArray, cs.allLongestStrings(stringArray));
    }

    @Test
    public void testMax() {
        assertEquals(14, cs.max(14, 6));

        Person person = new Person("Bob", true);
        System.out.println(person.getName());
        System.out.println(person.isMarried());

        Rectangle rect = new Rectangle(33, 33);
        System.out.println(rect.isSquare());
    }


    /*
    @Test
    public void testArray01() {
        assertFalse(hw.almostIncreasingSequence3(array[0]));
    }

    @Test
    public void testArray02() {
        assertTrue(hw.almostIncreasingSequence3(array[1]));
    }

    @Test
    public void testArray03() {
        assertFalse(hw.almostIncreasingSequence3(array[2]));
    }

    @Test
    public void testArray04() {
        assertFalse(hw.almostIncreasingSequence3(array[3]));
    }

    @Test
    public void testArray05() { assertFalse(hw.almostIncreasingSequence3(array[4])); }

    @Test
    public void testArray06() {
        assertFalse(hw.almostIncreasingSequence3(array[5]));
    }

    @Test
    public void testArray07() {
        assertTrue(hw.almostIncreasingSequence3(array[6]));
    }

    @Test
    public void testArray08() {
        assertFalse(hw.almostIncreasingSequence3(array[7]));
    }

    @Test
    public void testArray09() {
        assertTrue(hw.almostIncreasingSequence3(array[8]));
    }

    @Test
    public void testArray10() {
        assertFalse(hw.almostIncreasingSequence3(array[9]));
    }

    @Test
    public void testArray11() {
        assertFalse(hw.almostIncreasingSequence3(array[10]));
    }

    @Test
    public void testArray12() {
        assertTrue(hw.almostIncreasingSequence3(array[11]));
    }

    @Test
    public void testArray13() {
        assertTrue(hw.almostIncreasingSequence3(array[12]));
    }

    @Test
    public void testArray14() {
        assertFalse(hw.almostIncreasingSequence3(array[13]));
    }

    @Test
    public void testArray15() {
        assertFalse(hw.almostIncreasingSequence3(array[14]));
    }

    @Test
    public void testArray16() {
        assertTrue(hw.almostIncreasingSequence3(array[15]));
    }

    @Test
    public void testArray17() {
        assertTrue(hw.almostIncreasingSequence3(array[16]));
    }

    @Test
    public void testArray18() {
        assertTrue(hw.almostIncreasingSequence3(array[17]));
    }

    @Test
    public void testArray19() {
        assertTrue(hw.almostIncreasingSequence3(array[18]));
    }
    */

}
