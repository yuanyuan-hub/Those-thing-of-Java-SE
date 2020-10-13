import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author 袁媛
 * @Date 2020/10/9
 * @Time 18:51
 */
class Test {
    public boolean compareBracket(char left,char right) {
        if(left == '(' &&right == ')')  {
            return true;
        }
        if(left == '[' &&right == ']')  {
            return true;
        }
        if(left == '{' &&right == '}')  {
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        //1.准备好一个栈
        Deque<Character> stack = new LinkedList<>();

        //遍历1
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//        }
        //遍历2
        char[] charArray = s.toCharArray();
        for(char c : charArray) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                default:{
                    if(stack.isEmpty()) {
                        return false;
                    }
                    char left = stack.pop();
                    if(!compareBracket(left,c)) {
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
