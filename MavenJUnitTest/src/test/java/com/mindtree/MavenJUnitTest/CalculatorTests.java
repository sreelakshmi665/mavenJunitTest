package com.mindtree.MavenJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTests {
	private static Calculator cal;
	@Test
	public void addTest() {
		
		int result=cal.add(3,2);
		assertEquals(5,result);
		
	}
	@Test
	public void subTest() {
		
		int result=cal.sub(3,2);
		assertEquals(1,result);
		
	}
	@Test
	public void Test() {
		
		int result=cal.mul(3,2);
		assertEquals(6,result);
		
	}

}
