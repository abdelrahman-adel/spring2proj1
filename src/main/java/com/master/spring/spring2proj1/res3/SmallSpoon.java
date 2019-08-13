package com.master.spring.spring2proj1.res3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("small")
public class SmallSpoon implements Spoon {

	@Override
	public int[] move(int[] numbers) {
		return numbers;
	}
}
