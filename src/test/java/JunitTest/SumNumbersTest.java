package JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnitTest.SumNUmbers;

class SumNumbersTest {
   private final SumNUmbers obj = new SumNUmbers();
   
	@Test
	void testSum() {
		assertEquals(5,obj.sum(2, 3));
	}
    @Test
    void testSumNegative() {
    	assertNotEquals(7,obj.sum(3, 3));
    }
    void testError() {
    	Exception exception = assertThrows(IllegalArgumentException.class, ()-> obj.sum(12, 3));
    	assertEquals("Value should be less than 10", exception.getMessage());
    }
}
