package stack.arrayimpl;

public class Stack {
    int top = -1;
    int [] stack;
    Stack(int i){
        stack = new int[i];
    }

    public boolean push(int item) {
        if (top >= stack.length - 1) {
            System.out.println("Stack Overflow");
            return false;
        }
        stack[++top] = item;
        return true;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(10);
        stack.push(20);
        System.out.println("Top element is " + stack.peek());
        stack.push(30);
        System.out.println("Top element is " + stack.peek());
        stack.pop();
        System.out.println("Top element is " + stack.peek());
        stack.pop();
        System.out.println("Top element is " + stack.peek());
        stack.pop();
        System.out.println("Stack is empty? " + stack.isEmpty());
        stack.push(40);
        while (!stack.isEmpty()) {
            System.out.println("Popped element is " + stack.pop());
        }
        
        stack.push(50);
        System.out.println("Stack is empty? " + stack.isEmpty());

        }
}
