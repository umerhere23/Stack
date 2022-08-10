package stack;

public class ArrayBoundedStack<T> implements StackInterface<T> {
 protected final int DEFCAP=100;
 protected T[] elements;
 protected int topIndex=-1;
 
 public ArrayBoundedStack() {
	 elements=(T[]) new Object[DEFCAP];
 }
 public ArrayBoundedStack(int maxValue) {
	 elements=(T[]) new Object[maxValue];
 }
 public boolean isEmpty() {
	 return (topIndex == -1);
 }
 public boolean isFull() {
	 return(topIndex == (elements.length-1));
 }
 public void pop() {
	 if(isEmpty()) {
		 throw new StackUnderflowException("Stack is Empty");
	 }
	 else {
		 elements[topIndex]=null;
		 topIndex--;
	 }
 }
 public void push(T element) {
	 if(isFull()) {
		 throw new StackOverflowException("Stack is Full");
	 }
	 else {
		 topIndex++;
		 elements[topIndex]=element;
	 }
 }
 public T top() {
	 T topOfStack =null;
	 if(isEmpty()) {
		 throw new StackUnderflowException("Empty stack");
	 }
	 else {
		 topOfStack= elements[topIndex];
		 return topOfStack;
	 }
 }
}
