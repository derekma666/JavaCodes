
import java.util.Arrays;

public class ArraysPart {

    public static void main(String[] args) {
        //Arrays: one variable holds more than one value
        int n = 1;
        int zero = 0;
        int one = 1;

        // [0, 0, 0] initialisation
        /*
        int [] numbers = new int[3];// size is 3
        numbers[0] = 2;
        numbers[1] = 0;
        numbers[2] = 1;
        */

        // same as before
        int [] numbers = {2, 0, 1, 4, 100};
        String [] names = {"Anna", "Ali","Bob","Mike"};

        //String [] numbers = new String[3];
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

        //Arrays and Index
        // int [] numbers = {2, 0, 1, 4, 100};
        int oneHundred = numbers[4];
        int four = numbers[numbers.length - 1];
        System.out.println(oneHundred);
        System.out.println(four);

        // ++ & --
        int number = 0;
        number++; // number = number + 1;
        number--; // number = number - 1;
        int number2 = 3;
        number2 += 5;

        System.out.println(number);
        System.out.println(number2);

        System.out.println("********* For loop*************");
        //enhanced for loop

        String [] name_s = {"Anna", "Ali", "Derek"};

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for (int i = 0; i < name_s.length; i++){
            System.out.println(name_s[i]);
        }

        System.out.println("*********Enhanced for loop*************");
        for (int number_1: numbers){
            System.out.println(number_1);
        }

        for (String name_s2: name_s){
            System.out.println(name_s2);
        }

        // Bonus

        for (int i = 0; i < numbers.length; i++) {

        }

        for (int i = numbers.length - 1; i >= 0; i--) {

        }

        for (String name_ : name_s) {
            
        }

        Arrays.stream(numbers).forEach(System.out::println);
        Arrays.stream(names).forEach(System.out::println);

        //break and continue
        for (String name : names){
            System.out.println(name);
            break;//only show anna

        }

        System.out.println("XXXXXX");

        for (String name : names){
            if (name.equals("Bob")){
                break;//stop at bob
            }
            System.out.println(name);
        }

        System.out.println("XXXXXX");
        for (String name : names){
            if (name.startsWith("A")){
                continue;//skip something start with A
            }

            System.out.println(name);
        }

        //While loop
        //allows to evaluate boolean expression true or false
        int count = 21;

        while (count <= 20) {
            System.out.println("count " + count);
            count++;
        }

        //Do while loop
        do {
            System.out.println(count);
            count++;
        }//excute no matter what at least one time until the following condition is true.
        while (count <= 20) ;

    }
}
