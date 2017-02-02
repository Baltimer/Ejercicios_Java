package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.CountPositivesSumNegatives;
public class CountPositivesSumNegativesTest {

	@Test
    public void countPositivesSumNegatives_BasicTest() {
      int[] expectedResult = new int[] {10, -65};
      assertArrayEquals(expectedResult, CountPositivesSumNegatives.countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }
    
    @Test
    public void countPositivesSumNegatives_InputWithZeroes() {
      int[] expectedResult = new int[] {8, -50};
      assertArrayEquals(expectedResult, CountPositivesSumNegatives.countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }
    
    @Test
    public void countPositivesSumNegatives_EmptyArray() {
    	int[] expectedResult = new int[0];
    	assertArrayEquals(expectedResult, CountPositivesSumNegatives.countPositivesSumNegatives(new int[0]));
    }
    
    @Test
    public void countPositivesSumNegatives_EmptyArgs() {
    	int[] expectedResult = new int[0];
    	int[] nullArray = new int[0];
    	nullArray = null;
    	assertArrayEquals(expectedResult, CountPositivesSumNegatives.countPositivesSumNegatives(nullArray));
    }

}
