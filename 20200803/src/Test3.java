/**
 * @Author 袁媛
 * @Date 2020/8/3
 * @Time 16:47
 */



//class B {
//    public int Func() {
//        System.out.print("B");
//        return 0;
//    }
//}
//class D extends B {
//    @Override
//    public int Func() {
//        System.out.print("D");
//        return 0;
//    }
//}
//public class Test3 {
//    public static void main(String[] args) {
//        B a = new B();
//        B b = new D();
//        a.Func();
//        b.Func();
//    }
//}
//class X{
//    Y y=new Y();
//    public X(){
//        System.out.print("X");
//    }
//}
//class Y{
//    public Y(){
//        System.out.print("Y");
//    }
//}
//public class Test3 extends X{
//    Y y=new Y();
//    public Test3(){
//        System.out.print("Z");
//    }
//    public static void main(String[] args) {
//        new Test3();
//    }
//}
//class Base{
//
//    public Base(String s){
//
//        System.out.print("B");
//
//    }
//
//}
//
//public class Test3 extends Base{
//
//    public Test3 (String s) {
//super(s);
//        System.out.print("D");
//
//    }
//
//    public static void main(String[] args){
//
//        new Test3("C");
//
//    }
//
//}
//class Base {
//
//    Base() {
//
//        System.out.print("Base");
//
//    }
//
//}
//
//public class Test3 extends Base {
//
//    public static void main( String[] args ) {
//
//        new Test3();
//
//        //调用父类无参的构造方法
//
//        new Base();
//
//    }
//
//}

//class Animal {
//    protected String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//}
//
//interface IFlying {
//    void fly();
//}
//
//interface IRunning {
//    void run();
//}
//
//interface ISwimming {
//    void swim();
//}
//
//class Cat extends Animal implements IRunning {
//    public Cat(String name) {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        System.out.println(this.name + "正在跑");
//    }
//}
//
//public class Test3 {
//    public static void main(String[] args) {
//
//    }
//}
