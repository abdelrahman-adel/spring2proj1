package com.master.spring.spring2proj1.res3;

import org.springframework.stereotype.Component;

@Component
public class SedanCar implements Car {

	@Override
	public int[] drive(int[] numbers) {
		return numbers;
	}
}
