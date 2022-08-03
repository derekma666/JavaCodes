public class ForIteration {
    public static void main(String[] args) {

//        for(int i = 0 ; i < 3 ; i++){
//            System.out.print("当i=" + i + "时: ");
//             for(int j = 0 ; j < 6 ; j++){
//                 System.out.print("j=" + j + ", ");
//             }
//            System.out.println("换行");
//        }
        int j = 0;
        int i;
        for (i = 1; -2 < i & i < 3; i--) {
            System.out.print("i = " + i);
            for (j = 0; j < 3; j++) {
                System.out.print(" j = " + j);
            }
            System.out.println(" ");
        }
        System.out.println(j);
        System.out.println(i);
    }
    
}
