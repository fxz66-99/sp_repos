package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//1.标识主启动类  ,入口方法,包含了包扫描 ,主启动类的包路径就 是包扫描的路径
@SpringBootApplication
public class SpringbootDemoApplication {
	
	//2.编辑main方法,实现类加载
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}
