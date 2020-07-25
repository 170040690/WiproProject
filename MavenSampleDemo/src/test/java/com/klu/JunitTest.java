package com.klu;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class JunitTest {

	@Test
	public void test() {
		//int[] expected = {1,2,3,4,5};
		JunitDemo j = new JunitDemo();
		String expected ="RadhaKrishna";
		//assertNull(j.input);
		assertFalse(320<30);
		assertThat("abc",CoreMatchers.is("abc"));
	}

}
