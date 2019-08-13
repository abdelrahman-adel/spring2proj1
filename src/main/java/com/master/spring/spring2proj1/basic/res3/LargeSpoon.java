package com.master.spring.spring2proj1.basic.res3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("large")
public class LargeSpoon implements Spoon {

	@Override
	public int[] move(int[] numbers) {
		return numbers;
	}
}
