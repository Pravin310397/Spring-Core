package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Product;

public class ProductMain {
	public static void main(String[] args) {
		System.out.println("MAin Starts");
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Application context created");
		Product product= applicationContext.getBean("product", Product.class);
		System.out.println(product);
		System.out.println(product.hashCode());
		System.out.println("-".repeat(50));
		
		Product product2= applicationContext.getBean("product", Product.class);
		System.out.println(product2.hashCode());
		System.out.println("Project Object Created");
		System.out.println(product2);
		System.out.println("Main Ends");
	}

}
