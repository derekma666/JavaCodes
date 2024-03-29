import java.util.Scanner;
/*
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
!          Queue              !
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

 */
public class Queue {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(3);
        char key = ' '; //accept user's input [s e a g h]
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        // output the message
        while(loop) {
            System.out.println("s(show): display");
            System.out.println("e(exit): exit");
            System.out.println("a(add): add data to the queue");
            System.out.println("g(get): get data from the queue");
            System.out.println("h(head): head data");

            key = scanner.next().charAt(0); // accept a char
            switch (key){
                case 's':
                    queue.showQueue();
                    break;

                case 'a':
                    System.out.println("Please enter a value");
                    int value = scanner.nextInt();
                    queue.addQueue(value);
                    break;

                case 'g':
                    try {
                        int res = queue.getQueue();
                        System.out.printf("take out %d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 'h':
                    try{
                        int res = queue.headQueue();
                        System.out.printf("the head is %d\n", res);
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 'e':
                    scanner.close();
                    loop = false;
                    break;

                default:
                    break;
            }
        }
        System.out.println("**** Exit ****");

    }

}

// ArrayQueue
class ArrayQueue {
    private int maxSize; // max size of queue
    private int front; // head of queue
    private int rear; // rear of queue
    private int[] arr; // save data in a array

    //constructor
    public ArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1; // point to the previous position of front
        rear = -1; // point to the rear (include the rear)
    }

    // check the queue is full
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    // check the queue is empty
    public boolean isEmpty() {
        return rear == front;
    }

    //add data to the queue
    public void addQueue(int n) {
        //check the queue is full
        if(isFull()) {
            System.out.println("-- Sorry, the queue is full.");
            return;// cannot add then return the function
        }
        rear++; // rear + 1
        arr[rear] = n;
    }

    //initial list of Queue
    public int getQueue(){
        //check empty
        if(isEmpty()){
            throw new RuntimeException("-- Empty, cannot display the data.");
        }
        front++;
        return arr[front];
    }

    //display the current list
    public void showQueue() {
        //transverse
        if (isEmpty()){
            System.out.println("Empty queue, no data");
            return;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }

    // display head
    public int headQueue(){
        //
        if (isEmpty()){
            throw new RuntimeException("Empty, cannot display the data.");
        }
        return arr[front+1];
    }
}