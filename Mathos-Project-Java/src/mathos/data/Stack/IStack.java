package mathos.data.stack;

import mathos.exceptions.StackEmptyException;

/**
 * A stack data structure that has O(1) time complexity on all methods.
 *
 * @param <T> The type to be stored in the stack.
 * @author Artem Los (arteml@kth.se), Mathos Project.
 * @version 2015.02.06
 */
public interface IStack<T> {
	
	/**
	 * Adds the object "o" on top of stack.
	 * @param o The object to add on top of the stack.
	 */
	void push(T o);
	
	/**
	 * Removes and returns the the top element in the stack.
	 * @return Top element in the stack.
	 * @throws StackEmptyException.
	 */
	T pop() throws StackEmptyException;
	
	/**
	 * Returns the top element in the stack without removing it.
	 * @return Top element in the stack.
	 * @throws StackEmptyException.
	 */
	T top() throws StackEmptyException;
	
	/**
	 * The number of items in the stack (i.e. the size).
	 * @return size.
	 */
	int size();
	
	/**
	 * If the stack is empty, this will return true and false otherwise.
	 * @return True or false.
	 */
	boolean isEmpty();
}
