package com.jt.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
//前缀为属性赋值, 用前先引入jar包(spring-boot-configuration-processor)
@ConfigurationProperties(prefix="user")  
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4718945441755990260L;
	//@Value("${user.id}") //从容器中取值之后赋值
	private Integer id;
	//@Value("${user.username}")
	private String username;
	//@Value("${user.age}")
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + "]";
	}
	
}
