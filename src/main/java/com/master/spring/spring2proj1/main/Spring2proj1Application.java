package com.master.spring.spring2proj1.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.master.spring.spring2proj1.res2.Driver;
import com.master.spring.spring2proj1.res3.Person;

@ComponentScan(basePackages = { "com.master.spring.spring2proj1.main", "com.master.spring.spring2proj1.res2",
		"com.master.spring.spring2proj1.res3" })
@SpringBootApplication
public class Spring2proj1Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Spring2proj1Application.class, args);

		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);

		int result1 = binarySearchImpl.binarySearch(new int[] { 1, 2, 3 }, 2);
		System.out.println(result1);

		Driver driver = applicationContext.getBean(Driver.class);

		int result2 = driver.drive(new int[] { 1, 2, 3 }, 2);
		System.out.println(result2);

		Person person = applicationContext.getBean(Person.class);

		int result3 = person.eat(new int[] { 1, 2, 3 }, 2);
		System.out.println(result3);
	}

}
