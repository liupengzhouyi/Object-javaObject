package JDBC;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class showAllInformation {
    private boolean keyOfTowWindow ;
    private Frame lpFrameForSelectObject ;
    private Button[] lpButtonForSelectObject ;
    private String[] lpStringFoeSelectObject ;
    private String[] lpTempStringForSaveSelectObject ;
    private String[] lpTrueString ;
    private TextArea lpTextForSelectObject ;
    private Panel lpPanelForButton111 ;
    private Panel lpPanelForTowButton;
    private Button lpButtonForSelectObjectOK ;
    private Button lpButtonForSelectObjectCanecl ;
    int numberOfAddObject ;
    private boolean[] lpKeyForIfTheObjectIsSelect ;
    private Frame lp_FrameShowAll ;
    private FlowLayout lp_FlowLayout ;
    private Panel[] lpPanelA ;
    private Label[] lpLabel ;
    private Panel[] lpPanelB ;
    private TextArea[] lp_Text ;
    private Panel lp_Panel;
    private Button lpButtonRefresh ;
    private Button lpButtonOut ;
    private Panel lpPanelForButton ;
    private Panel lpPanelForButtonRefresh ;
    private Panel lpPanelForButtonOut ;

    //定义数据库驱动程序
    private static final String DBDRIVER="com.mysql.jdbc.Driver";
    //数据库连接地址
    private static final String DBURL="jdbc:mysql://localhost:3306/tempfile";//school表示数据库
    //数据库用户名
    private static final String userName="root";
    //电脑上的数据库密码
    private static final String passWord="lp184126";

    public void selectObjectInShowAll() {
        numberOfAddObject = 0;
        lpTempStringForSaveSelectObject = new String[9] ;
        lpKeyForIfTheObjectIsSelect = new boolean[9] ;
        for (int i=0;i<9;i++) {
            lpKeyForIfTheObjectIsSelect[i] = false ;
        }
        lpFrameForSelectObject = new Frame("项目选择：") ;
        lpFrameForSelectObject.addWindowListener(new newWindow());
        lpFrameForSelectObject.setSize(800, 900);
        lpFrameForSelectObject.setLayout(new GridLayout(1, 2));
        lpTextForSelectObject = new TextArea(400, 900) ;
        lpFrameForSelectObject.add(lpTextForSelectObject) ;
        lpPanelForButton111 = new Panel() ;
        lpPanelForButton111.setLayout(new GridLayout(10, 1));
        lpFrameForSelectObject.add(lpPanelForButton111);
        lpButtonForSelectObjectOK = new Button("OK") ;
        lpButtonForSelectObjectOK.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String string  = new String();
                lpTrueString = new String[numberOfAddObject] ;
                for (int i= 0; i<numberOfAddObject; i++) {
                    lpTrueString[i] = lpTempStringForSaveSelectObject[i] ;
                    string = string + lpTrueString[i] + '\n' ;
                }
                lpTextForSelectObject.setText(
                        "您一共选择了" + numberOfAddObject + "项，分别是: " + '\n' +
                                "-----------------------------------------------" + '\n' +
                                string +
                                "-----------------------------------------------" + '\n'
                );
                keyOfTowWindow = true ;
                biudingWindow(numberOfAddObject, lpTrueString) ;
                setText(numberOfAddObject, lpTrueString);
                if (keyOfTowWindow) {
                    lp_FrameShowAll.setVisible(true);
                    closeSelectObjectWindow();
                }
                numberOfAddObject = 0 ;
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        lpButtonForSelectObjectCanecl = new Button("Canecl") ;
        lpButtonForSelectObjectCanecl.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lpTextForSelectObject.setText("");

                for (int i=0;i<9;i++) {
                    lpKeyForIfTheObjectIsSelect[i] = false ;
                }
                numberOfAddObject = 0;
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        lpPanelForTowButton = new Panel(new GridLayout(1, 2)) ;
        lpPanelForTowButton.add(new Panel(new FlowLayout()).add(lpButtonForSelectObjectCanecl)) ;
        lpPanelForTowButton.add(new Panel(new FlowLayout()).add(lpButtonForSelectObjectOK));

        lpStringFoeSelectObject = new String[9] ;
        lpStringFoeSelectObject[0] = "student_id" ;
        lpStringFoeSelectObject[1] = "studentName" ;
        lpStringFoeSelectObject[2] = "studentSchoolNumber" ;
        lpStringFoeSelectObject[3] = "studentID" ;
        lpStringFoeSelectObject[4] = "studentAge" ;
        lpStringFoeSelectObject[5] = "studentBrithday" ;
        lpStringFoeSelectObject[6] = "studentSex" ;
        lpStringFoeSelectObject[7] = "studentQQNumber" ;
        lpStringFoeSelectObject[8] = "studentEmail" ;
        lpButtonForSelectObject = new Button[9] ;
        for (int i=0;i<9;i++) {
            lpButtonForSelectObject[i] = new Button() ;
            lpButtonForSelectObject[i].setLabel(lpStringFoeSelectObject[i]);
            int j = i ;
            lpButtonForSelectObject[i].addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (lpKeyForIfTheObjectIsSelect[j] == false) {
                        lpTextForSelectObject.append(lpButtonForSelectObject[j].getLabel() + '\n');
                        lpTempStringForSaveSelectObject[numberOfAddObject] = new String();
                        lpTempStringForSaveSelectObject[numberOfAddObject] = lpButtonForSelectObject[j].getLabel();
                        numberOfAddObject = numberOfAddObject + 1;
                        lpKeyForIfTheObjectIsSelect[j] = true ;
                    } else {
                        lpTextForSelectObject.append("你已经选择" + lpButtonForSelectObject[j].getLabel() + ", 请选择其他选项！" + '\n');
                    }

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            lpPanelForButton111.add(lpButtonForSelectObject[i]) ;
        }
        lpPanelForButton111.add(lpPanelForTowButton) ;
        lpFrameForSelectObject.setVisible(true) ;
    }

    public showAllInformation() {
        lp_FrameShowAll = new Frame("Information") ;
        lp_FrameShowAll.addWindowListener(new newWindow());
        lp_FrameShowAll.setSize(1200, 800) ;
        lp_FrameShowAll.setLayout(new BorderLayout()) ;
        keyOfTowWindow = false ;
    }

    public void biudingWindow(int number, String[] strings) {
        lpPanelA = new Panel[number] ;
        lpPanelB = new Panel[number] ;
        lpLabel = new Label[number] ;
        lp_Text = new TextArea[number] ;
        lp_Panel = new Panel(new GridLayout(1, number)) ;
        //lp_Panel.setLayout(new BorderLayout());
        for (int i=0; i < number; i++) {
            //Label 部分
            lpPanelB[i] = new Panel() ;
            lpPanelB[i].setLayout(new FlowLayout());
            lpLabel[i] = new Label();
            lpLabel[i].setText(strings[i]);
            lpPanelB[i].add(lpLabel[i]);
            //Text
            lp_Text[i] = new TextArea((1200/number), 600 ) ;
            //一条
            lpPanelA[i] = new Panel() ;
            lpPanelA[i].setLayout(new BorderLayout());
            lpPanelA[i].add(lp_Text[i], BorderLayout.CENTER) ;
            lpPanelA[i].add(lpPanelB[i], BorderLayout.NORTH) ;

            lp_Panel.add(lpPanelA[i]) ;
        }
        lp_FrameShowAll.add(lp_Panel, BorderLayout.CENTER) ;
    }

    public void setText(int numberOfObject, String[] strings) {
        for (int i=0;i<numberOfObject;i++) {

        }
        try {
            //1.注册驱动
            Class.forName(DBDRIVER);
            //2.获取连接
            Connection conn = DriverManager.getConnection(DBURL,userName,passWord);
            //3.创建Statement对象
            Statement stmt = conn.createStatement();

            //执行查找操作
            String sql = "SELECT * FROM student";

            ResultSet rs = stmt.executeQuery(sql);
            //输出查找结果
            while(rs.next()){
                // 先获取数据

                int student_id = rs.getInt("student_id") ;
                String studenntName = rs.getString("studentName") ;
                String stiudentSchoolNumber = rs.getString("studentSchoolNumber");
                String studentID = rs.getString("studentID") ;
                int studentAge = rs.getInt("studentAge") ;
                String studentBrithday = rs.getString("studentBrithday") ;
                String studentSex = rs.getString("studentSex") ;
                String studentQQNumber = rs.getString("studentQQNumber") ;
                String studentPhoneNumber = rs.getString("studentPhoneNumber") ;
                String studentEmail = rs.getString("studentEmail") ;

                for (int i=0;i<numberOfObject;i++) {
                    if (strings[i] == "student_id") {
                        //lp_Text[i].setText(student_id);
                    } else if (strings[i] == "studentSchoolNumber"){
                        ;
                    } else {
                        lp_Text[i].append(rs.getString(strings[i]) + '\n');
                    }
                }
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

    public void setButton() {
        if (lp_FlowLayout == null) {
            lp_FlowLayout = new FlowLayout() ;
        }
        lpButtonOut = new Button("Out") ;
        lpButtonOut.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Window window = lp_FrameShowAll ;
                window.setVisible(false);
                window.dispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        lpButtonRefresh = new Button("Refresh") ;
        lpPanelForButtonOut = new Panel() ;
        lpPanelForButtonOut.setLayout(lp_FlowLayout);
        lpPanelForButtonRefresh = new Panel() ;
        lpPanelForButtonRefresh.setLayout(lp_FlowLayout);
        lpPanelForButtonRefresh.add(lpButtonRefresh) ;
        lpPanelForButtonOut.add(lpButtonOut) ;
        lpPanelForButton = new Panel(new GridLayout(1, 2)) ;
        lpPanelForButton.add(lpPanelForButtonRefresh) ;
        lpPanelForButton.add(lpPanelForButtonOut) ;
        lp_FrameShowAll.add(lpPanelForButton, BorderLayout.SOUTH) ;
    }

    public void visitWindow() {
        this.selectObjectInShowAll();
        if (keyOfTowWindow) {
            lp_FrameShowAll.setVisible(true);
        }
    }

    public void closeWindow() {
        lp_FrameShowAll.setVisible(false);
        lp_FrameShowAll.dispose();
    }

    public void closeSelectObjectWindow() {
        Window window = lpFrameForSelectObject ;
        window.setVisible(false);
        window.dispose();
    }

    public static void main(String[] args) {
        showAllInformation lp = new showAllInformation() ;
        lp.setButton() ;
        lp.visitWindow();


    }
}
