import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        //int [] A = {1,2,3,4,5};
        //int x = 2;
        //for (int i = 0; i < A.length; i++){
          //if(x == A[i]){
            //System.out.println("the index is "+i);
          //}
        // }
        int [] scores = {99,98,97,99};
        int[] count = new int [4];
        System.out.println(Arrays.toString(count));
        for (int score: scores) {
            count[score]++;
        }
        System.out.println(Arrays.toString(count));
    }
}
