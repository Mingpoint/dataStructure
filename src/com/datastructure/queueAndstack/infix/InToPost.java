package com.datastructure.queueAndstack.infix;

public class InToPost {
	private MyStack myStack;
	private String input = "";
	private String output = "";
	//6754-*+
//	{6,7,5,4,-,*,+}
//	6+7*(5-4)
	public InToPost(String input){
		myStack  = new MyStack(input.length());
		this.input = input;
	}

	public String in() {
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			myStack.displayStack("For "+ch+" ");
			switch (ch) {
				case '+':
					getOpertin(ch, 1);
					break;
				case '-':
					getOpertin(ch, 1);
					break;
				case '*':
					getOpertin(ch, 2);
					break;
				case '/':
					getOpertin(ch, 2);
					break;
				case '(':
					myStack.push(ch);
					break;
				case ')':
					getParent(ch);
					break;
	
				default:
					output = output + ch;
					break;
			}

		}
		
		while(!myStack.isEmpty()){
			myStack.displayStack(null);
			output = output + myStack.pop();
		}
		return output;
	}
	public void getOpertin(char thisOper,int pres){
		while(!myStack.isEmpty()){
			char ch = myStack.pop();
			if(ch == '('){
				myStack.push(ch);
				break;
			}else{
				int pre = 0;
				if(ch == '+' || ch == '-'){
					pre = 1; 
				}else{
					pre = 2; 
				}
				
				if(pre < pres){
					myStack.push(ch);
					break;
				}else{
					output = output + ch;
				}
				
			}
		}
		myStack.push(thisOper);
	}
	public void getParent(char ch){
		while(!myStack.isEmpty()){
			char pop = myStack.pop();
			if(pop == '('){
				break;
			}else{
				output = output + pop;
			}
		}
		
	}
}
