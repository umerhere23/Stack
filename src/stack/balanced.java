package stack;

public class balanced {
	protected String openSet;
	protected String closeSet;
	
	public balanced(String openSet, String closeSet) {
		this.openSet=openSet;
		this.closeSet=closeSet;
	}
	public int test(String expression) {
		char currChar; //current Char
		int currCharIndex;
		int lastCharIndex;
		
		int openIndex;
		int closeIndex;
		
		boolean stillbalanced =true;
		
		StackInterface<Integer> stack;
		stack = new ArrayBoundedStack<Integer>(expression.length());
		
		currCharIndex=0;
		lastCharIndex= expression.length()-1;
		
		while(stillbalanced && (currCharIndex <= lastCharIndex)) {
			currChar = expression.charAt(currCharIndex);
			openIndex = openSet.indexOf(currChar);
			if(openIndex != -1) {
				stack.push(openIndex);
			}
			else {
				closeIndex = closeSet.indexOf(currChar);
				if(closeIndex != -1) {
					try {
					openIndex = stack.top();
					stack.pop();
					if(openIndex != closeIndex) {
						stillbalanced=false;
					}
					}
					catch(StackUnderflowException e) {
						stillbalanced=false;
					}
				}
			}
			currCharIndex++;
		}
		
		if(!stillbalanced) {
			return 1;
		}
		else {
			if(!stack.isEmpty()) {
				return 2;
			}
			else {
				return 0;
			}
		}
	}

}
