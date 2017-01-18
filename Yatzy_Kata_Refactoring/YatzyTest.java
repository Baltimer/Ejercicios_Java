package org.foogbarspam.Yatzy.tirada;
//Imports
import static org.junit.Assert.*;
import org.junit.*;

public class YatzyTest {

	@Test
	public void chanceTest(){
		assertEquals(15, Yatzy.chance(1, 2, 3, 4, 5));
	}
	
	@Test
	public void yatzyScoreTest(){
		assertEquals(50, Yatzy.YatzyScore(5,5,5,5,5));
	}
	
	@Test
	public void onesTest(){
		assertEquals(2, Yatzy.ones(1,2,3,1,2));
	}
	
	@Test
	public void twosTest(){
		assertEquals(4, Yatzy.twos(1,2,3,4,2));
	}
	
	@Test
	public void threesTest(){
		assertEquals(9, Yatzy.threes(1,3,3,5,3));
	}
	
	@Test
	public void foursTest(){
		Yatzy inyector = new Yatzy(1,4,2,4,4);
		assertEquals(12, inyector.fours());
	}
	
	@Test
	public void fivesTest(){
		Yatzy inyector = new Yatzy(1,3,5,2,5);
		assertEquals(10, inyector.fives());
	}
	
	@Test
	public void sixsTest(){
		Yatzy inyector = new Yatzy(1,6,2,6,6);
		assertEquals(18, inyector.sixs());
	}
}