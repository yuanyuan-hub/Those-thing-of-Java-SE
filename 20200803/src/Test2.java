///**
// * @Author 袁媛
// * @Date 2020/8/3
// * @Time 15:29
// */
//
////count和func方法在接口中怎么使用？
//
//interface  Shape3 {
//    public static final int count = 10;
//    public abstract void draw();
//    //新特性
//    default void func() {
//        System.out.println("default:func");
//    }
//}
//
//class Cycle3 implements Shape3 {
//    @Override
//    public void draw() {
//        System.out.println("Cycle3::○");
//    }
//}
//
//interface IA {
//    void funcA() ;
//}
//interface IB{
//    void funcB();
//}
//interface ID extends IA,IB {
//    void funcD() ;
//}
//class Test2 implements IA,IB {
//    @Override
//    public void funcA() {
//
//    }
//}
////public class Test2 {
////    public static void drawMap(Shape3 shape3) {
////        shape3.draw();
////    }
////    public static void main(String[] args) {
////        Shape3 shape3 = new Cycle3();
////        drawMap(shape3);
////    }
////}
////抽象类：包含抽象方法
////abstract class Shape2 {
////    //抽象方法：被abstract所修饰的方法。抽象方法没有具体的实现
////    public abstract void draw();
//////    public int a;
//////    public void func(){
//////    }
////}
////
////class Cycle2 extends Shape2 {
////    @Override
////    //重写抽象类当中的抽象方法
////    public void draw() {
////        System.out.println("Cycle2::○");
////    }
////}
////
////abstract class A extends Shape2 {
////
////}
////class B extends A {
////    @Override
////    public void draw() {
////        System.out.println("B");
////    }
////}
//////public class Test2 {
////    public static void main1(String[] args) {
////       // Shape2 shape2 = new Shape2();error
////        Cycle2 cycle2 = new Cycle2();
////        drawMap(cycle2);
////    }
////    public static void drawMap(Shape2 shape2) {
////        shape2.draw();
////    }
////}
