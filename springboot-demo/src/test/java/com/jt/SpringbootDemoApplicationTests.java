package com.jt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jt.pojo.Dog;
import com.jt.pojo.Shiro;
import com.jt.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest //动态加载spring容器,springboot启动加载对象
public class SpringbootDemoApplicationTests {
	@Autowired
	private User user;
	@Autowired
	private Dog dog;
	@Autowired
	Shiro shiro;
	
	@Test
	public void testUser() {
		System.out.println(user);
	}
	@Test
	public void testDog() {
		System.out.println(dog);
	}
	
	@Test
	public void testShiro() {
		shiro.pri();
	}
}
