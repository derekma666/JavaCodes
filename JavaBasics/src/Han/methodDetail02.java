package Han;

public class methodDetail02 {
    public static void main(String[] args) {
        A a = new A();
        a.print(5);
        a.sayOk();
        a.m1();


    }
}

class A {
    //同一个类中的方法调用：直接调用即可

    public void print(int n) {
        System.out.println("print () 方法中被调用的 n=" + n);
    }

    public void sayOk() {
        print(10);
        System.out.println("sayOK");
    }

    public void m1() {
        //先创建一个B，然后调用方法即可
        System.out.println("m1()方法被调用");
        B b = new B();
        b.hi();

        System.out.println("m1()继续执行");
    }
}

class B{
    public void hi(){
        System.out.println("B类中的hi()被执行");}
}

