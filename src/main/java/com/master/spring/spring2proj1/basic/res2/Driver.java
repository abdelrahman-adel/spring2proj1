package com.master.spring.spring2proj1.basic.res2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
