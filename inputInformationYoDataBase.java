package JDBC;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class inputInformationYoDataBase {
    public inputInformationYoDataBase(String studentName,
                                      String studentID,
                                      String studentSchoolNumber,
                                      String studentBrithday,
                                      String studentSex,
                                      String studentQQNumber,
                                      String student_eMail,
                                      String studentPhonrNumber,
                                      String studentPassWord) {


        //System.out.println(sqlString);
        int studentNumber = this.StringToInt(studentSchoolNumber) ;
        int studentAge = 0 ;
        try {
            studentAge = this.getNowAge(studentBrithday) ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        String sqlString = new String();
        sqlString = "INSERT INTO student (" +
                    "studentName, " +
                    "studentSchoolNumber, " +
                    "studentID, " +
                    "studentAge, " +
                    "studentBrithday, " +
                    "studentSex , " +
                    "studentQQNumber, " +
                    "studentPhoneNumber, " +
                    "studentEmail, " +
                    "studentPassWord)" +
                "VALUES(" +
                "'" + studentName + "', " +
                "'" + studentNumber + "', " +
                "'" + studentID + "', " +
                "'" + studentAge + "', " +
                "'" + studentBrithday + "', " +
                "'" + studentSex + "', " +
                "'" + studentQQNumber + "', " +
                "'" + studentPhonrNumber + "', " +
                "'" + student_eMail + "', " +
                "'" + studentPassWord + "' " +
                ");";

        insertIntoInformation lpInsert = new insertIntoInformation(sqlString) ;

//73
    }
    public int StringToInt(String studentSchoolNumber ) {
        int number = 0 ;
        if (studentSchoolNumber.length() >10) {
            number = 404 ;
        } else {
            String e = new String();
            e = studentSchoolNumber.substring(0, 1) ;
            if (e == "1" || e == "2") {
                String ee = new String();
                ee = studentSchoolNumber.substring(1, 2) ;
                if (e == "2" && ee != "0" ) {
                    number = 404 ;
                } else {
                    number = Integer.valueOf(studentSchoolNumber).intValue();
                }
            } else {
                number = 404 ;
            }
        }
        return number ;
    }

    public static int getAge(Date dateOfBirth) {
        int age = 0;
        Calendar born = Calendar.getInstance();
        Calendar now = Calendar.getInstance();
        if (dateOfBirth != null) {
            now.setTime(new Date());
            born.setTime(dateOfBirth);
            if (born.after(now)) {
                throw new IllegalArgumentException("年龄不能超过当前日期");
            }
            age = now.get(Calendar.YEAR) - born.get(Calendar.YEAR);
            int nowDayOfYear = now.get(Calendar.DAY_OF_YEAR);
            int bornDayOfYear = born.get(Calendar.DAY_OF_YEAR);
            System.out.println("nowDayOfYear:" + nowDayOfYear + " bornDayOfYear:" + bornDayOfYear);
            if (nowDayOfYear < bornDayOfYear) {
                age -= 1;
            }
        }
        return age;
    }

    public int getNowAge(String brithday) throws Exception {
        SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
        Date mydate = myFormatter.parse(brithday);
        System.out.println(getAge(mydate));
        int student_Age = 0;
        student_Age = getAge(mydate) ;
        return student_Age ;
    }
}

/*
        createDatabase lp = new createDatabase(sqlString);
        String sqlString  = "CREATE TABLE student("
                + "student_id     INT(10)         PRIMARY KEY     AUTO_INCREMENT, "
                + "studentName     VARCHAR(25)     NOT NULL, "
                + "studentSchoolNumber  INT(11)     NOT NULL, "
                + "studentID    VARCHAR(19)     NOT NULL, "
                + "studentAge      INT(3)   NOT NULL, "
                + "studentBrithday DATE NOT NULL, "
                + "studentSex   VARCHAR(4), "
                + "studentQQNumber  VARCHAR(12), "
                + "studentPhoneNumber   VARCHAR(12) NOT NULL, "
                + "studentEmail     VARCHAR(50) NOT NULL, "
                + "studentPassWord  VARCHAR(20)     NOT NULL"
                +
                ");";

*/
