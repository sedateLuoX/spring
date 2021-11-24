package com.lx.spring;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
@Configuration
@ComponentScan("com.lx.spring")
public class AppConfig {

	public  void  getString(){
		System.out.println("-----------------------");
	}
}
