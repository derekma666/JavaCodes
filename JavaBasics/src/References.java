import java.time.LocalDate;
import java.util.Locale;

public class References {
    public static void main(String[] args){
        // Non-primitive data types reference types
        //String name = new String("DerekCode");
        //System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getYear());
        int a = 1;
        int b = a;
        a = 100;
        System.out.println("a " + a + " -b " + b);

        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);

        mariam.name = "Mariam";

        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);
    }

    static class Person {
        String name;
        Person(String name){
            this.name = name;
        }



    }
}
