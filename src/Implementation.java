class stackImplementUsingArray {

    int top;
    int arr[];
    int capacity;

    // Constructor to initialize the stack
    stackImplementUsingArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Method to add an element to the stack
    public void push(int x) {
        if (top >= capacity - 1) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            arr[top] = x;
            System.out.println("Inserted " + x);
        }
    }

    // Method to return the top element without removing it
    public int peek() {
        if (top == -1) {
            System.out.println("No Element");
            return -1;
        }
        return arr[top];
    }

    // Method to remove and return the top element
    public int pop() {
        if (top == -1) {
            System.out.println("No Element");
            return -1;
        } else {
            int result = arr[top];
            top = top - 1;
            return result;
        }
    }

    // Method to return the current size of the stack
    public int size() {
        return top + 1;
    }
}

public class Implementation {

    public static void main(String[] args) {
        stackImplementUsingArray stack = new stackImplementUsingArray(5);

        // Push elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek the top element
        System.out.println("Top element is: " + stack.peek());

        // Pop the top element
        System.out.println("Popped element is: " + stack.pop());

        // Size of the stack
        System.out.println("Current stack size is: " + stack.size());
    }
}
