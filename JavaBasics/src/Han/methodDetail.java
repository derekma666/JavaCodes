package Han;

public class methodDetail {

    public static void main(String[] args) {
        AA a = new AA();
        int[] res = a.getSumAndSub(1,4);
        System.out.println("sum = " + res[0]);
        System.out.println("difference = "+res[1]);
    }
}

class AA {
    //一个方法返回多个结果，用数组
    public int[] getSumAndSub(int n1, int n2){

        int[] resArr = new int[2];//创建一个数组
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }


}
