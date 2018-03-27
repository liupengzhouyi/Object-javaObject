package JDBC;


import java.sql.*;

public class Dome01 {
    //定义数据库驱动程序
    private static final String DBDRIVER="com.mysql.jdbc.Driver";
    //数据库连接地址
    private static final String DBURL="jdbc:mysql://localhost:3306/tempfile";//school表示数据库
    //数据库用户名
    private static final String userName="root";
    //电脑上的数据库密码
    private static final String passWord="lp184126";

    public void testDDL() {
        try {
            //1.注册驱动
            Class.forName(DBDRIVER);
            //2.获取连接
            Connection conn = DriverManager.getConnection(DBURL,userName,passWord);
            //3.创建Statement对象
            Statement stmt = conn.createStatement();
            //4.准备sql语句
            //String sql = "CREATE TABLE student02(s_id INT PRIMARY KEY,s_name VARCHAR(20),s_age INT)";
            // 5.通过statement对象发送sql语句,返回执行结果

            //int count = stmt.executeUpdate(sql) ;

            //String sql = new String() ;

            //System.out.println("CREATE TABLE student01......");
            //6.打印执行结果
            //System.out.println("影响了"+count+"条记录");

            //执行插入操作
            /*
            System.out.println("Inserting records into the table...");
             sql = "INSERT INTO student02 (s_id, s_name, s_age) " +
                      "VALUES (100, '小文', 18)";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO student02 (s_id, s_name, s_age)" +
                    "VALUES (101, '大林', 25)";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO student02 (s_id, s_name, s_age)" +
                    "VALUES (102, '阿白',  30)";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO student02 (s_id, s_name, s_age)" +
                    "VALUES(103, '小小', 28)";
            stmt.executeUpdate(sql);

            System.out.println("Inserted records into the table...");
            */

            //执行查找操作
            String sql = "SELECT s_name, s_age FROM student02";
            System.out.println("SELECT records FROM the table...");

            ResultSet rs = stmt.executeQuery(sql);
            //输出查找结果
            // while(rs.next()){
                //先获取数据
                // int s_id  = rs.getInt("s_id");
                // String s_name = rs.getString("s_name");
                // int s_age = rs.getInt("s_age");

                //打印结果
                // System.out.print("s_id: " + s_id);
                // System.out.print("  s_name: " +s_name);
                // System.out.println("  s_age: " + s_age);
            // }

            // sql = "SELECT s_name, s_age" + "FROM student01;";

            rs = stmt.executeQuery(sql);

            while(rs.next()) {
                String name = rs.getString("s_name");
                int age = rs.getInt("s_age");
                System.out.println("Name: " + name);
                System.out.println(" Age: " +  age);
                System.out.print('\n');
            }


            rs.close();
            //7.关闭资源
            try {
                if(stmt != null)
                {
                    stmt.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if(conn != null)
                {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        Dome01 jdbcTest= new Dome01();
        jdbcTest.testDDL();
    }

}
