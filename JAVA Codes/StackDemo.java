class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow - Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow - Cannot pop");
            return -1;
        } else {
            return stackArray[top--];
        }
    }


    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top];
        }
    }


    public boolean isEmpty() {
        return (top == -1);
    }


    public int size() {
        return top + 1;
    }
}


public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element (peek): " + stack.peek());

        System.out.println("Stack size: " + stack.size());

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack size after pop: " + stack.size());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
