package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest22 {
	@Test
	public void add() {
		System.out.println("add method get called");
		int a = 20;
		int b = 10;

		Assert.assertEquals(30, a + b);
	}

	@Test
	public void sub() {
		System.out.println("sub method get called");
		int a = 20;
		int b = 10;

		Assert.assertEquals(10, a - b);
	}

	@Test
	public void div() {
		System.out.println("div method get called");
		int a = 20;
		int b = 10;

		Assert.assertEquals(2, a / b);

	}
}
