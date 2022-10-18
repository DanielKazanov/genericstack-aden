import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * @author Your name here
 *
 */
@TestMethodOrder(OrderAnnotation.class)
class GenericStackTest {
	
	/**
	 * Tests proper behavior of empty() and size() methods when the stack actually is empty.
	 */
	@Test
	@Order(1)
	void test_EmptyStack() {
		fail();
	}
	
	/**
	 * Test that stack exceptions are appropriately thrown by peek and pop methods.
	 */
	@Test
	@Order(2)
	void test_StackExceptions() {
		fail();
	}
	
	/**
	 * Test push and peek methods. Must actually check:
	 * a) size(), empty() behave correctly
	 * b) data is correctly stored in LIFO order.
	 */
	@Test
	void test_PushPeek() {	
		fail();
	}

	/**
	 * Test pop - tests that 
	 * a)  data is retrieved from the stack in LIFO order, and
	 * b)  that size(), empty() behave as expected.
	 */
	@Test
	void test_Pop() {
		fail();
	}

}
