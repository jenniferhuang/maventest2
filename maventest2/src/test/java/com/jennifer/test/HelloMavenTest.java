package com.jennifer.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class HelloMavenTest {
	//����HelloMaven�������sayHello����
	@Test
	public void testSayHello(){
		assertEquals("Hello Maven!", new HelloMaven().sayHello());
	}
}
