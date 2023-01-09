package selenium;

import org.junit.Assert;
import org.junit.Test;

public class Testing3 {

	@Test
	public void test6() {
		String actual = "abc";
		String expected = "abc1";
		System.out.println("before 1st assert");
		
		Assert.assertEquals(expected , actual);
		
		System.out.println("after test 1");
		
		
		Assert.assertTrue("verify 4>3" , 4>3);
		
		System.out.println("after second assert");
		
		
	}
}
