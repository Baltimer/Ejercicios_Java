package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.JadenCase;

public class JadenCaseTest {

	JadenCase jadenCase = new JadenCase();
	
	@Test
	public void test() {
		assertEquals("Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
	}
	
	@Test
	public void testNullArg() {
		assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
	}
	
	@Test
	public void testEmptyArg() {
		assertNull("Must return null when the arg is null", jadenCase.toJadenCase(""));
	}

}
