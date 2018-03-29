package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class selectInformatinFromDataBase {
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

            //执行查找操作
            String sql = "SELECT student_id, studentName FROM student";

            ResultSet rs = stmt.executeQuery(sql);
            //输出查找结果
            while(rs.next()){
            // 先获取数据
            int s_id  = rs.getInt("student_id");
            String s_name = rs.getString("studentName") ;

            System.out.println(rs.toString());
            System.out.print("s_id: " + s_id);
            System.out.println("  s_name: " +s_name);
            }

            // sql = "SELECT s_name, s_age" + "FROM student01;";

            /*
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                String name = rs.getString("s_name");
                int age = rs.getInt("s_age");
                System.out.println("Name: " + name);
                System.out.println(" Age: " +  age);
                System.out.print('\n');
            }
            */

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
        selectInformatinFromDataBase  jdbcTest= new selectInformatinFromDataBase();
        jdbcTest.testDDL();
    }

}
