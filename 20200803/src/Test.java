import com.sun.org.apache.regexp.internal.RE;

/**
 * @Author 袁媛
 * @Date 2020/8/3
 * @Time 8:48
 */


//class Animal {
//    public String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//
//    public void eat(String food) {
//        System.out.println(this.name + "正在吃" + food);
//    }
//}
//
//class Cat extends Animal {
//    public Cat(String name) {
//        super(name);
//    }
//}
//
//class Bird extends Animal {
//    public Bird(String name) {
//        super(name);
//    }
//    public void fly() {
//        System.out.println(this.name + "正在飞");
//    }
//}

////抽象类
//abstract class Shape {
//    //抽象方法
//    abstract public void draw() ;
//}

class Animal {
        protected String name;

    public Animal(String name) {
        this.name = name;
    }
}

interface IFlying {
    void fly();
}

interface IRuning {
    void run();
}

interface ISwimming {
    void swim();
}

class Cat extends Animal implements IRuning {
    public Cat (String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "用腿跑");
    }
}

class Duck extends Animal implements IRuning,ISwimming,IFlying {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + "正在飞");
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在游");
    }
}
public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat("小黑");

//        Animal animal = new Cat("小猫");
//        animal.eat("猫粮");
//        //如果要向下转型，一定要判断
//        if(animal instanceof Bird) {
//            Bird bird = (Bird) animal;
//            bird.eat("虫子");
//            bird.fly();
//        }
    }
}
//class Shape {
//    public void draw() {
//
//    }
//}
//
//class Cycle extends Shape {
//    @Override
//    public void draw() {
//        System.out.println("○");
//    }
//}
//
//class Rect extends Shape {
//    @Override
//    public void draw() {
//        System.out.println("♦");
//    }
//}
//
//class Flowers extends Shape {
//    @Override
//    public void draw() {
//        System.out.println("❀");
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Shape shape1 = new Cycle();
//        Shape shape2 = new Rect();
//        Shape shape3 = new Flowers();
//        drawMap(shape1);
//        drawMap(shape2);
//        drawMap(shape3);
//    }
//    public static void drawMap(Shape shape) {
//        shape.draw();
//    }
//}
//class Shape {
//
//    public void draw() {
//
//    }
//}
//
//class Cycle extends Shape {
//    @Override
//    public void draw() {
//        System.out.println("○");
//    }
//}
//
//class Rent extends Shape {
//    @Override
//    public void draw() {
//        System.out.println("♦");
//    }
//}
//
//class Flowers extends Shape {
//    @Override
//    public void draw() {
//        System.out.println("❀");
//    }
//}
//public class Test {
//    public static void main1(String[] args) {
//        Shape shape1 = new Cycle();
//        Shape shape2 = new Rent();
//        Shape shape3 = new Flowers();
////        drawShape(shape1) ;
////        drawShape(shape2) ;
////        drawShape(shape3) ;
//    }
//
//    public static void drawShape() {
//     Shape[] shapes = {new Cycle(),new Rent(),new Cycle(),new Rent(),new Flowers()};
//     for(Shape shape : shapes) {
//         shape.draw();
//     }
//    }
//
////    public static void drawShape(Shape shape) {
////        shape.draw();
////    }
//}
