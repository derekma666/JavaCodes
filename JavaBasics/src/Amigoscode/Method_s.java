package Amigoscode;

public class Method_s {

    public static void main(String[] args) {
        //Methods
        System.out.println("hello");

        String brand = "Samsung";
        System.out.println(brand.toUpperCase());

        System.out.println(brand.startsWith("s"));
        System.out.println(brand.endsWith("s"));

        //Understanding methods
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};

        int count = countOccurences(letters, 'D');
        System.out.println(count);

    }

    public static int countOccurences(
            char [] letters, char searchLetter){
        int count = 0;
        for (char letter: letters){
            if (letter == searchLetter){
                count++;
            }
        }
        return count;
    }

}
