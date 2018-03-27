package JDBC;

public class test01 {
    public static void main(String [] args) {

        String sqlString  = "CREATE TABLE student ("
                + "student_id     INT(10)         PRIMARY KEY     AUTO_INCREMENT, "
                + "studentName     VARCHAR(25)     NOT NULL, "
                + "studentSchoolNumber  INT(11)     NOT NULL, "
                + "studentID    VARCHAR(19)     NOT NULL, "
                + "studentAge      INT(3)   NOT NULL, "
                + "studentBrithday DATE NOT NULL, "
                + "studentSex   VARCHAR(4), "
                + "studentQQNumber  VARCHAR(12), "
                + "studentPhoneNumber   VARCHAR(12) NOT NULL, "
                + "studentEmail     VARCHAR(50) NOT NULL"
                + "studentPassWord  VARCHAR(20)     NOT NULL"
                +
                ");";

        createDatabase lp = new createDatabase(sqlString);
    }
}
