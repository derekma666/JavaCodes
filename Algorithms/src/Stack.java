public class Stack {

    // First in Last out (FILO)
}

class ArrayStack {
    private int maxSize; //size of stack
    private int[] stack; //arrays, for simulate the stack, data in arrays
    private int top = -1; // top, initialisation: -1


    // constructor/methods
    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    // full stack
    public boolean isFull() {
        return top == maxSize -1 ;
    }

    // empty stack
    public boolean isEmpty() {
        return top == -1;
    }

    // push
    public

}
