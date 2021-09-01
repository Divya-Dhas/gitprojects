package JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class lifeCycleMethod {
	
	private SumNUmbers obj;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		obj = new SumNUmbers();
		System.out.println("In the begining");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		obj = =null;
		System.out.println("At the end");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each test");
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
