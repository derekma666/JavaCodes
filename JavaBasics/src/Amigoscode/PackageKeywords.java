package Amigoscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class PackageKeywords {
    public static void main(String[] args) {

        Date date = new Date();
        java.sql.Date dateSql = new java.sql.Date(1);
        String s = new String();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime
                = LocalDateTime.now();

        // Arithmetic Operations
        System.out.println(10 + 2 + 2 + 90);
        System.out.println(10 - 2);
        // Bodmas body orders division multiplication addition subtraction
        System.out.println(10 * (2 + 7) - 4.5);
        System.out.println(10 % 3);

        // Math Class
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(3.6, 10.11));
        System.out.println(Math.min(3.6, 10.11));
        System.out.println(Math.pow(5.2, 3));
        System.out.println((int) Math.pow(5.2, 3));  //casting the integer
        System.out.println(Math.sqrt(25));
        System.out.println(Math.PI);

        // Comparison Operators
        int khalidAge = 18;        int mariamAge = 20;
        boolean isKahlidOlderThanMariam = khalidAge > mariamAge;
        System.out.println(isKahlidOlderThanMariam);
        System.out.println(khalidAge < mariamAge);
        System.out.println(khalidAge == mariamAge);
        System.out.println(khalidAge != mariamAge); // not equal to
        System.out.println(khalidAge <= mariamAge);

        boolean isAdult = false;
        boolean isStudent = false;
        boolean isAmigoscodeMember = true;

        System.out.println(isAdult && isStudent);   // &&: and , check each component
        System.out.println(isAdult || isStudent);   // &&: or , check each component

        System.out.println((isAdult || isStudent) && isAmigoscodeMember);   // &&: or , check each component
        System.out.println((!isAdult || isStudent) && !isAmigoscodeMember);   // &&: or , check each component
        System.out.println(isAdult == false);
        System.out.println(!isAdult);

        String name = "Mark";

        System.out.println(
                (10 > 8 || 2 <= 2) &&
                   !isAdult     &&
                   name.contains("M"));

        // If statements
        int age = 18;
        if (age >= 18){
            System.out.println("Hooray.. I am an adult");
        } else if (age >= 16 && age < 18) {
            System.out.println("I am almost an adult.");
        } else {
            System.out.println("I am not an adult.");
        }

        // Ternary operator
        String message = age >= 18 ?   // use for only one boolean expression
                "***Hooray --- I am an adult":
                "***I am not an adult.";
        System.out.println(message);

        //Switch statement: when you are switching, performing
        // an if condition only on one value
        String gender = "male";
        if (gender.equals("FEMALE")){

        }   else if (gender.equals("PREFER_NOT_SAY")){

        }   else {

        }
                      
        switch (gender.toUpperCase()) {
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("I am a male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("prefer not to say");
                break;
            default:
                System.out.println("Unkown gender");
        }

        }
}

