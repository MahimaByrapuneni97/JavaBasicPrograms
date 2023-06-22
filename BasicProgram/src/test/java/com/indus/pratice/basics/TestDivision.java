package com.indus.pratice.basics;

import junit.framework.TestCase;

public class TestDivision extends TestCase {
	Calc calObj = null;

	protected void setUp() throws Exception {
		 calObj = new Calc();
		super.setUp();
	}

	protected void tearDown() throws Exception {
		calObj = null;
		super.tearDown();
	}

	public void testDivisionSer1() {
		// 1.input
		double parmeter1 = 20.0;
		double parmeter2 = 10.0;
		// 2.Expected Output
		double expectedOutput = 2.0;
		// 3.Actual Output
		double actualOutput = calObj.division(parmeter1, parmeter2);
		// 4.Asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}

	public void testDivisionSer2() {
		// 1.input
		double parmeter1 = 200.0;
		double parmeter2 = 10.0;
		// 2.Expected Output
		double expectedOutput = 20.0;
		// 3.Actual Output
		double actualOutput = calObj.division(parmeter1, parmeter2);
		// 4.Asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}

}
