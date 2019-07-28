package exercise2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

	@Test
	void testDisplayDate() {
		Date date= new Date(12, 14, 2019);
		String result =date.displayDate();
		assertEquals("12/14/2019", result );
	}

}
