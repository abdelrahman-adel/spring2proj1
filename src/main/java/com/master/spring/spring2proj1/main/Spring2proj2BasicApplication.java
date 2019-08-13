package com.master.spring.spring2proj1.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.master.spring.spring2proj1.basic.res1.BinarySearchImpl;
import com.master.spring.spring2proj1.basic.res2.Driver;
import com.master.spring.spring2proj1.basic.res3.Woman;

@ComponentScan(basePackages = { "com.master.spring.spring2proj1.basic.main",
		"com.master.spring.spring2proj1.basic.res1", "com.master.spring.spring2proj1.basic.res2",
		"com.master.spring.spring2proj1.basic.res3" })
@SpringBootApplication
public class Spring2proj2BasicApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Spring2proj2BasicApplication.class, args);

		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl2 = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl3 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println("Singleton bean: " + binarySearchImpl);
		System.out.println("Singleton bean: " + binarySearchImpl2);
		System.out.println("Singleton bean: " + binarySearchImpl3);

		int result1 = binarySearchImpl.binarySearch(new int[] { 1, 2, 3 }, 2);
		System.out.println(result1);

		// ====================================================================================================

		Driver driver = applicationContext.getBean(Driver.class);
		Driver driver2 = applicationContext.getBean(Driver.class);
		Driver driver3 = applicationContext.getBean(Driver.class);
		System.out.println("Prototype bean: " + driver);
		System.out.println("Prototype bean: " + driver2);
		System.out.println("Prototype bean: " + driver3);

		int result2 = driver.drive(new int[] { 1, 2, 3 }, 2);
		System.out.println(result2);

		Woman woman = applicationContext.getBean(Woman.class);

		int result3 = woman.eat(new int[] { 1, 2, 3 }, 2);
		System.out.println(result3);
	}

}
