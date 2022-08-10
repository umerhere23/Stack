package stack;

public interface StackInterface<T> {
	void pop() throws StackUnderflowException;
	void push(T element) throws StackOverflowException;
	
	T top();
	boolean isEmpty();
	boolean isFull();

}
