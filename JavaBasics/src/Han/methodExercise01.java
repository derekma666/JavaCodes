package Han;

public class methodExercise01 {
    public static void main(String[] args) {
        //编写类AA，有一个方法：判断一个数是奇数还是偶数，返回boolean
        AA2 a = new AA2();
        if(a.isOdd(36)){
            System.out.println("是奇数");
        }else{
            System.out.println("是偶数");
        }
    }

}

class AA2 {
    //思路
    //1.方法返回的对象 boolean
    //2. 方法的名字 isOdd
    //3. 方法的形式参数 （int num）
    //4. 方法体， 判断
    public boolean isOdd(int num){
//        if(num % 2 != 0){
//            return true;
//        }else{
//            return false;
//        }
//        return num % 2 != 0 ? true; false;
        return num % 2 !=0;
    }
}
