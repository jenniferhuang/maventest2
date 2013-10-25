package com.jennifer.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class HelloMavenTest {
	//测试HelloMaven类里面的sayHello方法
	@Test
	public void testSayHello(){
		assertEquals("Hello Maven!", new HelloMaven().sayHello());
	}
}
