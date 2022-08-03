public class test {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int x = 2;
        for (int i = 0; i < A.length; i++){
          if(x == A[i]){
            System.out.println("the index is "+i);
          }
        }
    }
}
