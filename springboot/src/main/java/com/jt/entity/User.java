package com.jt.entity;

import java.io.Serializable;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


//将User对象交给spring容器管理
//@Controller
//@Service	
//@Repository	//Dao
@Component
@ConfigurationProperties(prefix="user")
public class User implements Serializable{
	@Value("${dog.id}")
	private Integer id;
	@Value("${dog.name}")
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}
