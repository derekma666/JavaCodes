import java.util.Scanner;
/*
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
!          STACK              !
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

 */
public class Stack {
    // First in Last out (FILO)
    public static void main(String[] args) {
        // test the ArrayStack
        // create an ArrayStack object -> stack
        ArrayStack stack = new ArrayStack(4);
        // create an empty string
        String key = "";
        // control exit the manu or not
        boolean loop = true;

        Scanner scanner = new Scanner(System.in);

        while(loop) {
            System.out.println("show: show the stack");
            System.out.println("exit: exit the stack");
            System.out.println("push: push a data into stack");
            System.out.println("pop: pop a data from the stack");

            System.out.println("Please input your option: ");

            key = scanner.next();
            switch (key) {
                case "show":
                    stack.list();
                    break;

                case "push":
                    System.out.println("Please enter a value:");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;

                case "pop":
                    try {
                        int res = stack.pop();
                        System.out.printf("pop the data: %d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "exit":
                    scanner.close();
                    loop = false;

                default:
                    break;
            }
        }
        System.out.println("...........program exit.........");
    }
}

// define a class to represent stack
class ArrayStack {
    private int maxSize; //1. size of stack
    private int[] stack; //2. arrays, data in the array
    private int top = -1; //3. top, initialisation: -1, no data status

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
    public void push(int value){
        // step 1: check the stack is full or not?
        if(isFull()){
            System.out.println("Full");
            return;
        }
        // step 2: top + 1, and assign the value to the top position
        top++;
        stack[top] = value;
    }

    // pop: return the data of the top position
    public int pop() {
        // step 1: check the stack is empty or not?
        if(isEmpty()){
            //throw a message
            throw new RuntimeException("** Empty, no data **");
        }
        int value = stack[top];
        top--;
        return value;
    }

    //traverse, needs to start from the stack top
    public void list(){
        // step 1: check the stack is empty or not?
        if (isEmpty()){
            System.out.println("Empty stack, no data");
            return;
        }
        // display data
        for (int i = top; i >= 0; i--){
            System.out.printf("stack[%d] = %d\n", i, stack[i]);
        }
    }


}
