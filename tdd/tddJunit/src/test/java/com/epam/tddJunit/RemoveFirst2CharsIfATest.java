package com.epam.tddJunit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveFirst2CharsIfATest {
	/*
	 * 1.ABCD -> BCD
	 * 2.AACD -> CD
	 * 3.BACD -> BCD
	 * 4.BBAA -> AA
	 * 5.AABAA -> BAA
	 */
	RemoveFirst2CharsIfA removeA;
	@Before
	public void before(){
		removeA = new RemoveFirst2CharsIfA();
	}
	
	@Test
	public void testFirstCharA() {
		assertEquals("BCD",removeA.removeFirst2A("ABCD"));
		
	}
	@Test
	public void testFirst2CharsA() {
		assertEquals("CD",removeA.removeFirst2A("AACD"));
		
	}
	@Test
	public void testSecondCharsA() {
		assertEquals("BCD",removeA.removeFirst2A("BACD"));
		
	}
	@Test
	public void testNotFirst2CharsA() {
		assertEquals("BAA",removeA.removeFirst2A("AABAA"));
		
	}
	@Test
	public void testFirstTwoCharsA() {
		assertEquals("BBAA",removeA.removeFirst2A("BBAA"));
		
	}

}
