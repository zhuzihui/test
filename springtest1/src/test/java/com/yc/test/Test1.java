package com.yc.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)//这种写法是为了让测试在Spring容器环境下执行
@ContextConfiguration(locations={"classpath:beans.xml"})	
public class Test1 {

	@Test
	public void test() {
		  System.out.println("spring框架测试成功");
	}

}
