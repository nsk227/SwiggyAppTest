package com.jenkins.test;

import org.junit.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void TestPass() {
	  System.out.println("Hello There111");
	Assert.assertEquals(10, 10);
	
  }
	/*
	 * @Test public void TestFail() { System.out.println("Fail");
	 * Assert.assertEquals(10, 15); }
	 */
}
