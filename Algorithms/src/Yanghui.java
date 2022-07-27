public class Yanghui {

    public static void main(String[] args) {
        // step 1: create a 2-d array
        int[][] array = new int[13][];

        //
        for (int i = 0; i < array.length; i++){
            array[i] = new int[i+1];
            for (int j = 0; j < array[i].length; j++){
                if (j == 0 | i == j){
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i-1][j] + array[i-1][j-1];
                }
            }
        }

        //
        for (int[] row: array){
            for (int data: row){
                System.out.print(data);
            }
            System.out.println("");
        }
    }
}
