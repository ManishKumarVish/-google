package com.google.GitBasic;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {

	int a;
	int b;
	int expectedSum;
	static int count =0;
	Calculator calculator=null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println(" inside the before class  "+count++);
	}


	@Before
	public void setUp() throws Exception {
		System.out.println(" inside the before"+count++);
		a=100;
		b=200;
		expectedSum=300;
		calculator= new Calculator();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testAdd() {
		System.out.println(" inside the TEST"+count++);
		int actualSum=calculator.add(a, b);
		Assert.assertEquals(expectedSum, actualSum);
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println(" inside the after "+count++);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println(" inside the After class  "+count++);
	}


}
