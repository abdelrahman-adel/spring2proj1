package com.master.spring.spring2proj1.res2;

import org.springframework.stereotype.Component;

@Component
public class SportCar implements Car {

	@Override
	public int[] drive(int[] numbers) {
		return numbers;
	}
}
