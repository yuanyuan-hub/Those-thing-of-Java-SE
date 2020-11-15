package frank.jdbc.test;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // JDBC操作的第一步：创建连接
            // 加载JDBC驱动程序：反射，这样调用初始化com.mysql.jdbc.Driver类，即将该类加载到JVM方法区，并执行该类的静态方法块、静态属性。
            Class.forName("com.mysql.jdbc.Driver");

            // 创建数据库连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=&useUnicode=true&characterEncoding=UTF-8&useSSL=false");
            System.out.println(connection);

            //第二步：创建操作命令对象Statement
            statement = connection.createStatement();

            //第三步：执行sql
            String sql = "select id,name,role,salary from emp";
            resultSet = statement.executeQuery(sql);

            List<Emp> empList = new ArrayList<>();
            //第四步：处理结果集（查询操作）
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String role = resultSet.getString("role");
                BigDecimal salary = resultSet.getBigDecimal("salary");
                System.out.printf("id=%s,name=%s,role=%s,salary=%s%n",
                        id, name, role, salary);
                Emp emp = new Emp();
                emp.setId(id);
                emp.setName(name);
                emp.setRole(role);
                emp.setSalary(salary);
                empList.add(emp);
            }
            System.out.println(empList);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //第五步：无论如何，都需要释放资源
            try {
                if(resultSet != null)
                    resultSet.close();
                if(statement != null)
                    statement.close();
                if(connection != null)
                    connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    /**
     * 一般来说，对象中属性不提供对外直接修改
     * 1. Getter/Setter方法
     * 2. 构造方法来设置
     */
    private static class Emp{
        private Integer id;
        private String name;
        private String role;
        private BigDecimal salary;

        @Override
        public String toString() {
            return "Emp{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", role='" + role + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public BigDecimal getSalary() {
            return salary;
        }

        public void setSalary(BigDecimal salary) {
            this.salary = salary;
        }
    }
}
