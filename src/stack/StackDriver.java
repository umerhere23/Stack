package stack;

public class StackDriver {
 public static void main(String[] args) {
	 StackInterface<String> test;
	 test = new ArrayBoundedStack<String>();
	 
	 test.push("A");
	 test.push("B");
	 test.push("C");
	 
	 System.out.println(test.top());
 }
}
