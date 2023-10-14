package Han;
/*
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
完整的方法method定义：

public 返回数据类型 方法名（形式参数列表）{
//方法体语句
return返回值
}

1. 形式参数列表：表示成员方法输入 （int n）, (int num1, int num2)
2. 返回数据类型（返回类型）：表示成员方法输出，void表示没有返回值
3. 方法主体：表示某功能的代码块
4. return语句不是必须的

分析：
1. 访问修饰符（控制方法使用的范围）
如果不写就是默认访问 (public protected 默认 private)

2. 返回数据类型：
a. 一个方法最多只能有一个返回值 (可用返回数组)
b. 返回类型可以是任意类型， 包含基本类型或引用类型（数组，对象）
c. 如果方法要求返回数据类型， 则方法体中最后执行的语句必须为return值
而且返回的类型必须和return的类型一致或兼容
d. 如果方法是void，方法体中可以没有return，或者只写return

3. 形式参数列表
a. 一个方法可以有0个参数，也可以有多个参数，中间用逗号隔开
b. 参数类型可以为任意类型，包含基本类型和引用类型
c. 一定对应着参数列表传入相同类型或兼容类型的参数
d. 方法调用，实际传入的参数是实际参数，方法内的是形式参数，个数和顺序一致

*/

// main 方法
public class method01 {
    public static void main(String[] args) {
        //方法使用
        //1 方法写好后， 如果不去调用，不会输出
        //2 先创建对象，再调用方法
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