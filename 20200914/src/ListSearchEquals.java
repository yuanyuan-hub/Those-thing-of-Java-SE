import java.util.ArrayList;
import java.util.List;

/**
 * @Author 袁媛
 * @Date 2020/9/14
 * @Time 20:08
 */
public class ListSearchEquals {
    static class Person {
        int id;
        String name;
        public Person(int id,String name) {
            this.id = id;
            this.name = name;
    }

        @Override
        public boolean equals(Object obj) {
            if(obj == null) {return false;}
            if(obj == this) {return true;}
            if(!(obj instanceof  Person)) {
                return false;
            }
            Person p = (Person)obj;
            return id == p.id;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person(1,"高博");
        Person p2 = new Person(1,"陈佩欣");
        List<Person>list = new ArrayList<>();
        list.add(p1);
        System.out.println(list.contains(p2));
        System.out.println(list.indexOf(p2));
    }
}
