package com.jt.config;
//加了注释
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jt.pojo.Shiro;

//该类中标识就是xml中的数据 <id="方法名" class="方法返回值类型">
@Configuration
public class ShiroConfig {
	
	@Bean
	public Shiro shiro() {
		return new Shiro(); 
	}
	
	
}
