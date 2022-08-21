public class HashTable {

    public static void main(String[] args) {


    }
}

class Employee{
    int id;
    String name;
    Employee next;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class EmployeeLinkedList{
    Employee head;

    public void add(Employee employee){
        // 1. check if the head is null
        if(head == null){
            head = employee;
            return;
        }
        // 2. search the last node and insert it
        Employee currentEmployee = head;
        while(true){
            // infinite loop for check the condition
            // note the condition must be achieved to break the loop
            if(currentEmployee.next == null){
                break;
            }
            else{
                currentEmployee = currentEmployee.next;
            }
        }
        currentEmployee.next = employee;
    }

    // show all the nodes of linkedlist based on id
    public void list(int no){
        //1. check
        if(head == null){
            System.out.println((no + 1)+" list is empty");
            return;
        }
        //2.
        System.out.println("information of the " + (no + 1) + "th list:");
        Employee currentEmployee = head;
        while(true){
            System.out.printf("=> id=%d name=%s\t",
                    currentEmployee.id, currentEmployee.name);
            if(currentEmployee.next == null){
                break;
            }
            currentEmployee = currentEmployee.next;
        }
        System.out.println(" ");
    }

    //3. search
    public Employee search(int id){
        if(head == null){
            System.out.println("Empty");
            return null;
        }
        Employee temp = head;
        while(true){
            if (temp.id == id){
                break;
            }
            if (temp.next == null){
                temp = null;
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
}

