import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class GenericStack.
 *
 * @param <E> the element type
 */

/**
 * @author Your name here
 *
 */
public class GenericStack<E> {

	/** Using an ArrayList as the data structure for the stack */
	private ArrayList<E> stack;
	
	/**
	 * Instantiates a new generic stack.
	 */
	public GenericStack() {
		stack = new ArrayList<E>();
	}
	
	/**
	 * You need to implement the following functions
	 * a) empty() - returns true if the element is empty
	 * b) size() - returns the size of the Stack
	 * c) peek() - returns the object that is at the top of the stack. Must throw
	 *             appropriate exception if attempt to peek empty stack
	 * d) pop() - gets the object at the top of stack, then removes it from 
	 *            the stack and returns the object. Must throw appropriate exception if
	 *            attempt to pop from empty stack.
	 * e) push(o) - adds the object to the top of stack/
	 * 
	 */
	
	/**
	 * 	 * To string
	 * 	 	 *
	 * 	 	 	 * @return the string
	 * 	 	 	 	 */
	@Override
   	public String toString() {
	   return("stack: "+stack.toString());
	}
}
