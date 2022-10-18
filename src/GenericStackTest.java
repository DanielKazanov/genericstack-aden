import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.EmptyStackException;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * @author Daniel Kazanov
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
		GenericStack<Integer> stack = new GenericStack<>();
		boolean empty = stack.empty();
		assertEquals(true, empty);
	}
	
	/**
	 * Test that stack exceptions are appropriately thrown by peek and pop methods.
	 */
	@Test
	@Order(2)
	void test_StackExceptions() {
		GenericStack<Integer> stack = new GenericStack<>();
		assertThrows(EmptyStackException.class,() -> stack.peek());
		assertThrows(EmptyStackException.class,() -> stack.pop());
	}
	
	/**
	 * Test push and peek methods. Must actually check:
	 * a) size(), empty() behave correctly
	 * b) data is correctly stored in LIFO order.
	 */
	@Test
	void test_PushPeek() {	
		GenericStack<Integer> stack = new GenericStack<>();
		boolean empty = stack.empty();
		assertEquals(true, empty);
		stack.push(1);
		int size = stack.size();
		assertEquals(1, size);
	}

	/**
	 * Test pop - tests that 
	 * a)  data is retrieved from the stack in LIFO order, and
	 * b)  that size(), empty() behave as expected.
	 */
	@Test
	void test_Pop() {
		GenericStack<Integer> stack = new GenericStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		int num = stack.pop();
		int size = stack.size();
		assertEquals(3, num);
		assertEquals(2, size);
		int num1 = stack.pop();
		int size1 = stack.size();
		assertEquals(2, num1);
		assertEquals(1, size1);
		int num2 = stack.pop();
		boolean empty = stack.empty();
		assertEquals(1, num2);
		assertEquals(true, empty);
//		fail();
	}
}