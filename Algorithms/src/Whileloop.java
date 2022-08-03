public class Whileloop {
    public static void main(String[] args) {
        int k = 1;
        int i;
        for (i = 1; i < 10; i++){
           System.out.println("current: "+i);
           k = k + 1;
           System.out.println("next:"+i);
        }
        System.out.println(i);
    }
}