///**
// * @Author 袁媛
// * @Date 2020/9/11
// * @Time 20:01
// */
//
//
//class Teacher2 implements Comparable<Teacher2> {
//    String name;
//    int age;
//    int height;
//    int weight;
//
//    public Teacher2(String name, int age, int height, int weight) {
//        this.name = name;
//        this.age = age;
//        this.height = height;
//        this.weight = weight;
//    }
//
//    // natural ordering
//    // “大小”关系如何决定，留给开发者自己决定
//    // 目前的实现，是按照年龄进行比较
//    @Override
//    public int compareTo(Teacher2 o) {
//        if (this.age < o.age) {
//            // this 指向的对象“小于” o 指向的对象
//            return -1;  // 任意负数都可以
//        } else if (this.age == o.age) {
//            // this 指向的对象 “等于” o 指向的对象
//            return 0;
//        } else {
//            // this 指向的对象 “大于” o 指向的对象
//            return 1;   // 任意整数都可以
//        }
//    }
//}
//public class ComparableDemo {
//    public static void main(String[] args) {
//        Teacher2 t1 = new Teacher2("hah",13,190,80);
//        Teacher2 t2 = new Teacher2("hah",13,190,80);
//        int r = t1.compareTo(t2);
//        if (t1 > t2) {
//
//        }
//    }
//}
