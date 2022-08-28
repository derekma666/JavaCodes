package Han;

public class method02 {
    public static void main(String[] args) {

        int [][] map = {{0,0,1},{1,1,1},{1,1,3}};

        for (int i = 0; i<map.length; i++){
            for (int j = 0; j<map[i].length; j++){
                System.out.print(map[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println("**************");

        // step 1: create
        myTools tools = new myTools();

        // step2: call method
        tools.printArr(map);

        tools.printArr(map);

        tools.printArr(map);

        System.out.println(6*0.75);
    }
}

class myTools {
    public void printArr(int[][] map){
        System.out.println("============");
        for (int i = 0; i<map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }

}
