import java.util.Scanner;

/**
 * @Author 袁媛
 * @Date 2020/8/6
 * @Time 22:29
 */


    public class Test2 {

       private static String userName = "admin";
       private static String password = "123456";
       public static void main(String[] args) {
        try {
            login("admin", "123456");
        } catch (UserError userError) {
            userError.printStackTrace();
        } catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        }
    }
    public static void login(String userName, String password) throws UserError,
            PasswordError {
        if (!Test2.userName.equals(userName)) {
            throw new UserError("用户名错误");
        }
        if (!Test2.password.equals(password)) {
            throw new PasswordError("密码错误");
        }
        System.out.println("登陆成功");
    }
    class UserError extends Exception {
        public UserError(String message) {
            super(message);
        }
    }
    class PasswordError extends Exception {
        public PasswordError(String message) {
            super(message);
        }
    }


//    public static void main(String[] args) {
//        try {
//            //有可能出现异常的语句；
//        } catch (/*异常类型 异常对象*/) {
//
//        } finally {
//            //异常的出口
//        }
    }

//        private static String name1 = "袁媛";
//        private static String password1 = "123456";
//
//        public static void main(String[] args) throws PasswordException, NameException {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("请输入用户名: ");
//            String name = scanner.next();
//            System.out.println("请输入密码: ");
//            String password = scanner.next();
//            login(name,password);
//        }
//
//        public static void login(String name,String password) throws PasswordException, NameException {
//            if (!password1.equals(password)) {
//                throw new PasswordException("密码错误");
//            }
//
//            if (!name1.equals(name)) {
//                throw new NameException("用户名错误");
//            }
//
//            System.out.println("登陆成功!");
//        }
//
//        public class PasswordException extends Exception {
//            public PasswordException(String message) {
//                super(message);
//            }
//        }
//
//        public class NameException extends Exception {
//            public NameException(String message) {
//                super(message);
//            }
//        }

    }


