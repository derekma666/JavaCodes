public class NamingVariables {
    public static void main(String[] args) {
        int zero = 0;
        int one = 1;
        double pi = 3.1415;
        int subscriberCount = 1_000_000;//Camel case to remember

        // String Class
        char a = 'A';
        char b = 'B';

        // Name : object invoke method inside of class
        String name = "DerekCode123";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));//the 0 is character index

        String code = new String("code");
        System.out.println(name.contains(code));
        System.out.println(name.equals(code));
    }
}
