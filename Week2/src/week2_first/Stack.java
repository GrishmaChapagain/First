package week2_first;

public class Stack {

	
	int size;
	char stk[];
	int top=-1;
	
	Stack(int size){
		this.size=size;
		stk=new char[this.size];
	}
	
	void push(char data) {
		stk[++top]=data;
	}
	
	char pop() {
		
		return stk[top--];
	}
	
	int peak() {
		return top;
	}

}
