package Han;

// main 方法
public class method01 {
    public static void main(String[] args) {
        //方法使用
        //1 方法写好后， 如果不去调用，不会输出
        //2 先创建对象，然后调用方法即可
        Person p1 = new Person();

        p1.speak();
        p1.cal01();
        p1.cal02(5);//调用cal02,同时传入n=5
        p1.cal02(100);//调用cal02,同时传入n=100

        //调用getSum 同时赋值returnRes
        int returnRes = p1.getSum(35, 5);
        System.out.println("getSum return value = "+returnRes);
    }
}

class Person{
    String name;
    int age;
    //方法 成员方法
    //1. public 表示方法公开
    //2. void 没有返回值
    //3. speak() speak是方法名，（）形参列表
    public void speak(){
        System.out.println("Hi. I am goodman.");
    }

    //calculate 1+---+1000
    public void cal01() {
        // 可以有循环
        int res = 0;
        for (int i = 1; i <= 1000; i++){
            res += i;
        }
        System.out.println("cal01计算结果="+res);
    }


    // 该方法接收n，计算1+。。。+n的结果
    // 形式参数列表 n
    // （int n）当前一个形式参数n，可以接收用户的输入n
    public void cal02(int n){
        int res = 0;
        for (int i = 1; i <= n; i++){
            res += i;
        }
        System.out.println("cal02计算结果="+res);
    }

    // getSum 计算两个数的和
    // 1. public 公开的
    // 2. int：表示方法执行后，返回一个int值
    // 3. return res: 表示把res的值返回
    public int getSum(int num01, int num02){
        int res = num01+num02;
        return res;
    }
}