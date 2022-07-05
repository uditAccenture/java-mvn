package hello_world;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class first_testcase {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before testcase!"); 
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after testcase!"); 
	}

	@Test
	void test() {
		System.out.println("testcase!"); 
//		fail("Not yet implemented");
	}

}
