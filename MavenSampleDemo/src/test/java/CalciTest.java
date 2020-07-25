import static org.junit.Assert.*;

import org.junit.Test;

public class CalciTest {

	@Test
	public void test() {
		Calci c = new Calci();
		assertEquals(5,c.add(2, 3));
		
	}

}
