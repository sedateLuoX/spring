package com.lx.spring;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public class Teach {

	public static void main(String[] args) {


		// 添加文件注释
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);

/*		System.out.println("============================");
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("classpath:spring.xml");
		AppConfig config = (AppConfig) context1.getBean("appConfig");
		config.getString();*/
//		ConfigurableListableBeanFactory beanFactory = context.getDefaultListableBeanFactory();
//
//		context.register(AppConfig.class);
//		context.refresh();


	}
}
