package JDBC;

public class studentForDatabase {

    public studentForDatabase() {
        ;
    }

    public studentForDatabase(int student_BrithdayYear,
                              int studentBrithdayMonth,
                              int student___ButhdayDay,
                              int student___________ID,
                              int student__________Age,
                              String student_____IDNumber,
                              String student_SchoolNumber,
                              String student_________Name,
                              String student__PhoneNumber,
                              String student________Email,
                              String student_____QQNumber,
                              String student__________Sex,
                              String student_____PassWord) {
        this.student_BrithdayYear = student_BrithdayYear;
        this.studentBrithdayMonth = studentBrithdayMonth;
        this.student___ButhdayDay = student___ButhdayDay;
        this.student___________ID = student___________ID;
        this.student__________Age = student__________Age;
        this.student_____IDNumber = student_____IDNumber;
        this.student_SchoolNumber = student_SchoolNumber;
        this.student_________Name = student_________Name;
        this.student__PhoneNumber = student__PhoneNumber;
        this.student________Email = student________Email;
        this.student_____QQNumber = student_____QQNumber;
        this.student__________Sex = student__________Sex;
        this.student_____PassWord = student_____PassWord;

        String student______Brithday = new String(
                  this.number_____To_____String(this.getStudent_BrithdayYear()) +
                          this.number_____To_____String(this.getStudentBrithdayMonth()) +
                        this.number_____To_____String(this.getStudentBrithdayMonth()));
        this.setStudent_____Brithday(student______Brithday);
    }

    public int getStudent_BrithdayYear() {
        return student_BrithdayYear;
    }

    public void setStudent_BrithdayYear(int student_BrithdayYear) {
        this.student_BrithdayYear = student_BrithdayYear;
    }

    public int getStudentBrithdayMonth() {
        return studentBrithdayMonth;
    }

    public void setStudentBrithdayMonth(int studentBrithdayMonth) {
        this.studentBrithdayMonth = studentBrithdayMonth;
    }

    public int getStudent___ButhdayDay() {
        return student___ButhdayDay;
    }

    public void setStudent___ButhdayDay(int student___ButhdayDay) {
        this.student___ButhdayDay = student___ButhdayDay;
    }

    public int getStudent___________ID() {
        return student___________ID;
    }

    public void setStudent___________ID(int student___________ID) {
        this.student___________ID = student___________ID;
    }

    public int getStudent__________Age() {
        return student__________Age;
    }

    public void setStudent__________Age(int student__________Age) {
        this.student__________Age = student__________Age;
    }

    public String getStudent_____IDNumber() {
        return student_____IDNumber;
    }

    public void setStudent_____IDNumber(String student_____IDNumber) {
        this.student_____IDNumber = student_____IDNumber;
    }

    public String getStudent_SchoolNumber() {
        return student_SchoolNumber;
    }

    public void setStudent_SchoolNumber(String student_SchoolNumber) {
        this.student_SchoolNumber = student_SchoolNumber;
    }

    public String getStudent_________Name() {
        return student_________Name;
    }

    public void setStudent_________Name(String student_________Name) {
        this.student_________Name = student_________Name;
    }

    public String getStudent_____Brithday() {
        return student_____Brithday;
    }

    public void setStudent_____Brithday(String student_____Brithday) {
        this.student_____Brithday = student_____Brithday;
    }

    public String getStudent__PhoneNumber() {
        return student__PhoneNumber;
    }

    public void setStudent__PhoneNumber(String student__PhoneNumber) {
        this.student__PhoneNumber = student__PhoneNumber;
    }

    public String getStudent________Email() {
        return student________Email;
    }

    public void setStudent________Email(String student________Email) {
        this.student________Email = student________Email;
    }

    public String getStudent_____QQNumber() {
        return student_____QQNumber;
    }

    public void setStudent_____QQNumber(String student_____QQNumber) {
        this.student_____QQNumber = student_____QQNumber;
    }

    public String getStudent__________Sex() {
        return student__________Sex;
    }

    public void setStudent__________Sex(String student__________Sex) {
        this.student__________Sex = student__________Sex;
    }

    public String getStudent_____PassWord() {
        return student_____PassWord;
    }

    public void setStudent_____PassWord(String student_____PassWord) {
        this.student_____PassWord = student_____PassWord;
    }


    public String number_____To_____String(int number) {
        String string = new String("");
        while(number >= 10) {
            char charNumber ;
            ;;;;int singleDigit = number % 10 ;
            ;;;;;;;;;;;;;number = number / 10 ;
            charNumber=(char)('0'+singleDigit);
            ;;;;;string = charNumber + string ;
        }
        char charNumber = (char)('0'+ number) ;
        ;;;;;;;;;string = charNumber + string ;
        ;;;;;;;;;;;;;;;;;;;;;;;;return string ;
    }


    //元素
    private         int         student_BrithdayYear ;          // 学生生日-年
    private         int         studentBrithdayMonth ;          // 学生生日-月
    private         int         student___ButhdayDay ;          // 学生生日-天
    private         int         student___________ID ;          // 学生    ID
    private         int         student__________Age ;          // 学生   年龄
    private      String         student_____IDNumber ;          // 学生 身份证
    private      String         student_SchoolNumber ;          // 学生   学号
    private      String         student_________Name ;          // 学生   姓名
    private      String         student_____Brithday ;          // 学生   生日
    private      String         student__PhoneNumber ;          // 学生 电话号
    private      String         student________Email ;          // 学生电子邮件
    private      String         student_____QQNumber ;          // 学生   QQ号
    private      String         student__________Sex ;          // 学生   性别
    private      String         student_____PassWord ;          // 学生   密码
}
