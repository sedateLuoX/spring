package com.lx.spring;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Teach {

	public static void main(String[] args) {


		// 添加文件注释
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
//		ConfigurableListableBeanFactory beanFactory = context.getDefaultListableBeanFactory();
//
//		context.register(AppConfig.class);
//		context.refresh();


	}
}
