import java.util.Scanner;

public class HashTable {

    public static void main(String[] args) {

        // Create a HashTable
        HashTab hashTab = new HashTab(7);

        // Menu
        String key = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("add: add employee");
            System.out.println("list: show employee");
            System.out.println("exit: exit system");

            key = scanner.next();
            switch (key){
                case "add":
                    System.out.println("Please type the ID");
                    int id = scanner.nextInt();
                    System.out.println("Please type the name");
                    String name = scanner.next();

                    Emp emp = new Emp(id, name);
                    hashTab.add(emp);
                    break;
                case "list":
                    hashTab.list();
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    break;
            }

        }


    }
}

// Create a HashTab for managing the multi-LinkedList
class HashTab {
    private EmpLinkedList[] empLinkedListArray;
    private int size; // How many LinkedList

    //Constructor
    public HashTab(int size){
        this.size = size;
        //initialisation of empLinkedListArray
        empLinkedListArray = new EmpLinkedList[size];
        //??
        for (int i = 0; i < size; i++){
            empLinkedListArray[i] = new EmpLinkedList();
        }

    }

    // Add the Employees
    public void add(Emp emp){
        // 1. Based on Employee's ID, add to the LinkedList
        int empLinkedListNo = hashFun(emp.id);
        // 2. Put the emp to corresponding linkedList
        empLinkedListArray[empLinkedListNo].add(emp);
    }

    // Show all the LinkedList of HashTab
    public void list(){
        for (int i = 0; i < size; i++){
            empLinkedListArray[i].list(i);
        }
    }

    // Hash function
    public int hashFun(int id){
        return id % size;
    }
}


// Employee {id, name}
class Emp{
    public int id;
    public String name;
    public Emp next; // next default is null
    public Emp(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}

class  EmpLinkedList{
    private Emp head; // head pointer, head is point to the first Emp

    // add Employees
    // Notes: 1. assume when adding Employees, the id is increasing,
    // the associated id is from small to large, therefore, the Emp is
    // directly added to the last.
    public void add(Emp emp) {
        // 1. check if the head is null or not
        if (head == null) {
            head = emp;
            return;
        }
        // 2. if not, search the last node and insert
        Emp curEmp = head;
        while (true) {
            // * infinite loop for check the condition
            // note the condition must be achieved to break the loop
            if (curEmp.next == null) {
                break;
            }
            curEmp = curEmp.next; // => next
        }
        curEmp.next = emp;
    }

    // show all the nodes of linkedlist based on id
    public void list(int no){
        //1. check
        if(head == null){
            System.out.println((no + 1)+" list is empty");
            return;
        }
        //2.
        System.out.println((no + 1) + "th list"+"information is: ");
        Emp curEmp = head;
        while(true){
            System.out.printf("=> id=%d name=%s\t",
                    curEmp.id, curEmp.name);
            if(curEmp.next == null){
                break;
            }
            curEmp = curEmp.next;
        }
        System.out.println("");
    }

    //3. search based on ID
    // if found, then return Employee
    // if not, return null
    public Emp fingEmpById() {
        // LinkedList
        if (head == null){
            System.out.println("the LinkedList is null.");
            return null;
        }
        Emp curEmp = head;
        while (true){
            if (curEmp.id == id){

            }
        }

    }

}

