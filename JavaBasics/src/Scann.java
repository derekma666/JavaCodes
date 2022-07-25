import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Scann {

    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        String userName = scanner.nextLine();
        System.out.println("Hi. My name is " + userName);

        System.out.println("How old are you? " + userName + ".");
        int age = scanner.nextInt();
        System.out.println("I am " + age);
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("So, you born in "+year);

        if (age < 18) {
            System.out.println("and you are not an adult.");
        } else {
            System.out.println(" and you are adult :).");
        }

    }

}
