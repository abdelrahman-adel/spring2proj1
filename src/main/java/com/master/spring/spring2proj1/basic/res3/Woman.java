package com.master.spring.spring2proj1.basic.res3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Woman {
	
	/*
	 * Autowiring can be determined using @Qualifier annotation
	 */
	@Autowired
	@Qualifier("small")
	private Spoon spoon;
	
	public int eat(int[] numbers, int numToSearchFor) {
		spoon.move(numbers);
		System.out.println(spoon);

		return 2;
	}
}
