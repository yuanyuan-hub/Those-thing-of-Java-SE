package com.bit;

import java.util.regex.MatchResult;

/**
 * @Author 袁媛
 * @Date 2020/8/2
 * @Time 12:16
 */

class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println("父类");
        System.out.println(this.name + "正在吃" + food);
    }
}

class Bird extends Animal {
    public Bird (String name) {
        super(name);
    }
    public void eat(String food) {
        System.out.println("子类");
        System.out.println(this.name + "正在吃" + food);
    }
    public void fly() {
        System.out.println(this.name + "正在飞");
    }
}
public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Bird("hahh");
        animal1.eat("谷子");
        Animal animal2 = new Animal("fej");
        animal2.eat("guzi");

    }
//
//    public static void feed(Animal animal) {
//        animal.eat("谷子");
//    }
}
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
//
//public class Test {
//    public static void main(String[] args) {
//        Cat cat = new Cat("小黑");
//        cat.eat("猫粮");
//        Bird bird = new Bird("袁媛");
//        bird.eat("虫子");
//        bird.fly();
//    }
//}
