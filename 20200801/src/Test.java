/**
 * @Author 袁媛
 * @Date 2020/8/1
 * @Time 8:50
 */


class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }
}

class Bird extends Animal{
    public Bird (String name) {
        //使用super调用父类的构造方法，必须放在第一行。
        super(name);
    }
    public void fly() {
        System.out.println(this.name + "正在飞");
    }
}
public class Test {
    public static void main(String[] args) {
        Animal animal = findMyAnimal();
    }
//        Bird bird = new Bird("hah");
//        Animal bird2 = bird;
//        bird2.eat("虫子");
//        feed(bird);
        public static Animal findMyAnimal() {
        Bird bird = new Bird("hah");
        bird.eat("虫子");
        bird.fly();
        return bird;
        }
//    public static void feed(Animal animal) {
//        animal.eat("虫子");
//    }
}
