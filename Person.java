/**
 * @Author 袁媛
 * @Date 2020/9/13
 * @Time 9:44
 */
public class Person{
    public static void main(String[] args){
        Object o=new Object(){
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("ed"));
    }
}
