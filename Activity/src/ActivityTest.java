import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ActivityTest {

	@Test
	void test() {
		Activity i = new Activity();
		int[] arr= {10,20};
		Assertions.assertEquals(20, i.SI(10, 10, 10));
		Assertions.assertEquals(10, i.Discount(10,10));
		Assertions.assertEquals(10, i.minArray(arr));
	}

}
