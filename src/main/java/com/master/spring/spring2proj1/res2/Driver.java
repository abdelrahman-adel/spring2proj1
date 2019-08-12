package com.master.spring.spring2proj1.res2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Driver {
	
	/*
	 * Autowiring can be determined upon variable name, however @Primary annotation
	 * still gets higher priority.
	 */
	@Autowired
	private Car sedanCar;
	
	public int drive(int[] numbers, int numToSearchFor) {
		sedanCar.drive(numbers);
		System.out.println(sedanCar);

		return 2;
	}
}
