 package JDBC;

import javax.swing.text.html.HTMLEditorKit;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

 public class studentWindow {
    private static Frame lp_frameForInputStudentInformation;
    private static BorderLayout lp_BorderLayoutForInputStudentInformation;
    private static Button lp_ButtonForinputStudentInformation01;
    private static Button lp_ButtonForinputStudentInformation02;
    private static GridLayout lp_GridLayoutForinputStudentInformation;
    private static Panel lp_PanelAddButtonForinputStudentInformation;
    private static FlowLayout lp_FlowLayoutForInputStudentInformatiom;
    private static Panel lp_PanelForTitleForInputStudentInformation;
    private static Label lp_LabelForTitleForInputStudentInformation;

    private static Label lp_LabelForTitleForInputStudentInformation01;
    private static TextField lp_TextForInputStudentInforMation01;
    private static Label lp_LabelForTitleForInputStudentInformation02;
    private static TextField lp_TextForInputStudentInforMation02;
    private static Label lp_LabelForTitleForInputStudentInformation03;
    private static TextField lp_TextForInputStudentInforMation03;
    private static Label lp_LabelForTitleForInputStudentInformation04;
    private static TextField lp_TextForInputStudentInforMation04;
    private static Label lp_LabelForTitleForInputStudentInformation05;
    private static TextField lp_TextForInputStudentInforMation05;
    private static Label lp_LabelForTitleForInputStudentInformation06;
    private static TextField lp_TextForInputStudentInforMation06;
    private static Label lp_LabelForTitleForInputStudentInformation07;
    private static TextField lp_TextForInputStudentInforMation07;
    private static Label lp_LabelForTitleForInputStudentInformation08;
    private static TextField lp_TextForInputStudentInforMation08;
    private static Label lp_LabelForTitleForInputStudentInformation09;
    private static TextField lp_TextForInputStudentInforMation09;

    private static Panel lp_Panel01ForInputStudentInformation;
    private static Panel lp_Panel02ForInputStudentInformation;
    private static Panel lp_Panel03ForInputStudentInformation;
    private static Panel lp_Panel04ForInputStudentInformation;
    private static Panel lp_Panel05ForInputStudentInformation;
    private static Panel lp_Panel06ForInputStudentInformation;
    private static Panel lp_Panel07ForInputStudentInformation;
    private static Panel lp_Panel08ForInputStudentInformation;
    private static Panel lp_Panel09ForInputStudentInformation;

    private static Panel lp_PanelForC;
    private static int lp_OJBK_key;
    private static String lp_password;


    public static void main(String[] args) {
        lp_frameForInputStudentInformation = new Frame("学生信息录入");
        lp_frameForInputStudentInformation.setSize(700, 1000);
        lp_frameForInputStudentInformation.addWindowListener(new newWindow());
        lp_BorderLayoutForInputStudentInformation = new BorderLayout();
        lp_frameForInputStudentInformation.setLayout(lp_BorderLayoutForInputStudentInformation);
        lp_PanelForTitleForInputStudentInformation = new Panel(new GridLayout());
        lp_LabelForTitleForInputStudentInformation = new Label("Pelse Input Your Information：");
        lp_LabelForTitleForInputStudentInformation.setBackground(Color.yellow);
        lp_PanelForTitleForInputStudentInformation.add(lp_LabelForTitleForInputStudentInformation);

        lp_frameForInputStudentInformation.add(lp_LabelForTitleForInputStudentInformation, BorderLayout.NORTH);


        lp_GridLayoutForinputStudentInformation = new GridLayout(9, 1);
        lp_PanelForC = new Panel(lp_GridLayoutForinputStudentInformation);

        lp_LabelForTitleForInputStudentInformation01 = new Label("name : ");
        lp_TextForInputStudentInforMation01 = new TextField(50);

        lp_LabelForTitleForInputStudentInformation02 = new Label("ID : ");
        lp_TextForInputStudentInforMation02 = new TextField(50);

        lp_LabelForTitleForInputStudentInformation03 = new Label("studentNumber : ");
        lp_TextForInputStudentInforMation03 = new TextField(50);

        lp_LabelForTitleForInputStudentInformation04 = new Label("brithday(xxxx-xx-xx) : ");
        lp_TextForInputStudentInforMation04 = new TextField(50);

        lp_LabelForTitleForInputStudentInformation05 = new Label("sex : ");
        lp_TextForInputStudentInforMation05 = new TextField(50);

        lp_LabelForTitleForInputStudentInformation06 = new Label("QQNumber : ");
        lp_TextForInputStudentInforMation06 = new TextField(50);

        lp_LabelForTitleForInputStudentInformation07 = new Label("eMail : ");
        lp_TextForInputStudentInforMation07 = new TextField(50);

        lp_LabelForTitleForInputStudentInformation08 = new Label("phoneNumber : ");
        lp_TextForInputStudentInforMation08 = new TextField(50);

        lp_LabelForTitleForInputStudentInformation09 = new Label("passWord[a`z&0`9] : ");
        lp_TextForInputStudentInforMation09 = new TextField(50);
        lp_password = new String("");

        lp_TextForInputStudentInforMation09.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }

            //65-90/49-57/10/8
            @Override
            public void keyPressed(KeyEvent e) {
                String tempPassWord = lp_TextForInputStudentInforMation09.getText();
                int longth = tempPassWord.length();
                int code = e.getKeyCode();
                if (code <= 90 && code >= 65) {
                    String string = KeyEvent.getKeyText(code);
                    lp_password = lp_password + string;
                    int length = tempPassWord.length();
                    tempPassWord = "";
                    String temp = new String("*");
                    for (int i = 0; i < length; i++) {
                        tempPassWord = tempPassWord + temp;
                    }
                } else if (code <= 57 && code >= 49) {
                    String string = KeyEvent.getKeyText(code) ;
                    lp_password = lp_password + string ;
                    int length = tempPassWord.length() ;
                    tempPassWord = "" ;
                    String temp = new String("*") ;
                    for (int i = 0; i < length; i++) {
                        tempPassWord = tempPassWord + temp ;
                    }
                } else if (code == 10) {
                    ;
                } else if (code == 8) {
                    //System.out.println(lp_password);
                    if (lp_password.length() > 0) {
                        lp_password = lp_password.substring(0, longth - 1);
                    } else {
                        ;
                    }
                    //System.out.println(lp_password);
                }
                /*
                //不支持小键盘
                else if (code <= 105 && code >= 95) {
                    String string = KeyEvent.getKeyText(code);
                    lp_password = lp_password + string;
                    int length = tempPassWord.length();
                    tempPassWord = "";
                    String temp = new String("*");
                    for (int i = 0; i < length; i++) {
                        tempPassWord = tempPassWord + temp;
                    }
                } e
                 */
                String string = KeyEvent.getKeyText(code);
                // System.out.print("string : " + string);
                // System.out.println(", KeyCode : " + code);

                String temp = new String("*");
                int length = tempPassWord.length();
                tempPassWord = "";
                for (int i = 0; i < length; i++) {
                    tempPassWord = tempPassWord + temp;
                }
                lp_TextForInputStudentInforMation09.setText(tempPassWord);

                //设置光标
                tempPassWord = lp_TextForInputStudentInforMation09.getText();
                lp_TextForInputStudentInforMation09.setCaretPosition(length);
                // System.out.println(lp_password);
                //super.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
            }
        });

        lp_FlowLayoutForInputStudentInformatiom = new FlowLayout();

        lp_Panel01ForInputStudentInformation = new Panel(lp_FlowLayoutForInputStudentInformatiom);
        lp_Panel02ForInputStudentInformation = new Panel(lp_FlowLayoutForInputStudentInformatiom);
        lp_Panel03ForInputStudentInformation = new Panel(lp_FlowLayoutForInputStudentInformatiom);
        lp_Panel04ForInputStudentInformation = new Panel(lp_FlowLayoutForInputStudentInformatiom);
        lp_Panel05ForInputStudentInformation = new Panel(lp_FlowLayoutForInputStudentInformatiom);
        lp_Panel06ForInputStudentInformation = new Panel(lp_FlowLayoutForInputStudentInformatiom);
        lp_Panel07ForInputStudentInformation = new Panel(lp_FlowLayoutForInputStudentInformatiom);
        lp_Panel08ForInputStudentInformation = new Panel(lp_FlowLayoutForInputStudentInformatiom);
        lp_Panel09ForInputStudentInformation = new Panel(lp_FlowLayoutForInputStudentInformatiom);

        lp_Panel01ForInputStudentInformation.add(lp_LabelForTitleForInputStudentInformation01);
        lp_Panel01ForInputStudentInformation.add(lp_TextForInputStudentInforMation01);

        lp_Panel02ForInputStudentInformation.add(lp_LabelForTitleForInputStudentInformation02);
        lp_Panel02ForInputStudentInformation.add(lp_TextForInputStudentInforMation02);

        lp_Panel03ForInputStudentInformation.add(lp_LabelForTitleForInputStudentInformation03);
        lp_Panel03ForInputStudentInformation.add(lp_TextForInputStudentInforMation03);

        lp_Panel04ForInputStudentInformation.add(lp_LabelForTitleForInputStudentInformation04);
        lp_Panel04ForInputStudentInformation.add(lp_TextForInputStudentInforMation04);

        lp_Panel05ForInputStudentInformation.add(lp_LabelForTitleForInputStudentInformation05);
        lp_Panel05ForInputStudentInformation.add(lp_TextForInputStudentInforMation05);

        lp_Panel06ForInputStudentInformation.add(lp_LabelForTitleForInputStudentInformation06);
        lp_Panel06ForInputStudentInformation.add(lp_TextForInputStudentInforMation06);

        lp_Panel07ForInputStudentInformation.add(lp_LabelForTitleForInputStudentInformation07);
        lp_Panel07ForInputStudentInformation.add(lp_TextForInputStudentInforMation07);

        lp_Panel08ForInputStudentInformation.add(lp_LabelForTitleForInputStudentInformation08);
        lp_Panel08ForInputStudentInformation.add(lp_TextForInputStudentInforMation08);

        lp_Panel09ForInputStudentInformation.add(lp_LabelForTitleForInputStudentInformation09);
        lp_Panel09ForInputStudentInformation.add(lp_TextForInputStudentInforMation09);

        lp_PanelForC.add(lp_Panel01ForInputStudentInformation);
        lp_PanelForC.add(lp_Panel02ForInputStudentInformation);
        lp_PanelForC.add(lp_Panel03ForInputStudentInformation);
        lp_PanelForC.add(lp_Panel04ForInputStudentInformation);
        lp_PanelForC.add(lp_Panel05ForInputStudentInformation);
        lp_PanelForC.add(lp_Panel06ForInputStudentInformation);
        lp_PanelForC.add(lp_Panel07ForInputStudentInformation);
        lp_PanelForC.add(lp_Panel08ForInputStudentInformation);
        lp_PanelForC.add(lp_Panel09ForInputStudentInformation);

        lp_frameForInputStudentInformation.add(lp_PanelForC, BorderLayout.CENTER);

        lp_PanelAddButtonForinputStudentInformation = new Panel();
        lp_GridLayoutForinputStudentInformation = new GridLayout();
        lp_PanelAddButtonForinputStudentInformation.setLayout(lp_GridLayoutForinputStudentInformation);
        lp_ButtonForinputStudentInformation02 = new Button("OK");
        lp_ButtonForinputStudentInformation01 = new Button("Cancel");


        lp_ButtonForinputStudentInformation01.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lp_TextForInputStudentInforMation01.setText("");
                lp_TextForInputStudentInforMation02.setText("");
                lp_TextForInputStudentInforMation03.setText("");
                lp_TextForInputStudentInforMation04.setText("");
                lp_TextForInputStudentInforMation05.setText("");
                lp_TextForInputStudentInforMation06.setText("");
                lp_TextForInputStudentInforMation07.setText("");
                lp_TextForInputStudentInforMation08.setText("");
                lp_TextForInputStudentInforMation09.setText("");
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

        lp_ButtonForinputStudentInformation02.addMouseListener(new MouseListener() {
            int i = 0;
            @Override
            public void mouseClicked(MouseEvent e) {
                String temp = lp_TextForInputStudentInforMation01.getText();
                if (temp.length() == 0) {
                    nullErrorTips("Name", 1);
                    //错误提示： 姓名不能为空
                } else {
                    i = i + 1;
                }

                temp = lp_TextForInputStudentInforMation02.getText();
                if (temp.length() != 18) {
                    //错误提示： ID
                    nullErrorTips("ID length is not error! ", 0);
                } else {
                    i = i + 1;
                }

                temp = lp_TextForInputStudentInforMation03.getText();
                if (temp.length() != 10) {
                    //错误提示： 学号
                    nullErrorTips("student number length is error! ", 0);
                } else {
                    i = i + 1;
                }
                temp = lp_TextForInputStudentInforMation04.getText();
                if (temp.length() != 10) {
                    //错误提示 ： Brithday
                    nullErrorTips("Brithday format is error! ", 0);
                } else {
                    i = i + 1;
                }

                temp = lp_TextForInputStudentInforMation08.getText();
                if (temp.length() != 11) {
                    //错误提示： 电话号
                    nullErrorTips("Phone Number's Length Is ERROR!", 0);
                } else {
                    i = i + 1;
                }

                temp = lp_TextForInputStudentInforMation02.getText();
                String temp1 = lp_TextForInputStudentInforMation04.getText();
                int keyOfBrithday = IsBrithdayFormatIsRight(temp1) ;
                if (keyOfBrithday != 1) {
                    nullErrorTips("E-mail Format is  Error !", 0);
                } else {
                    i = i + 1 ;
                }
                //152631199710070912
                if (temp.length() > 14) {
                    temp = temp.substring(6, 14);
                }
                temp1 = temp1.replace("-", "");
                //System.out.println(temp + "." + temp1);
                if (temp == temp1) {
                    //生日与ID的一致
                    nullErrorTips("ID'brithday isn't same as brithday!", 0);
                } else {
                    i = i + 1;
                }

                temp = lp_TextForInputStudentInforMation02.getText();
                int key = IDIsRight(temp);
                if (key != 1) {
                    //错误提示 身份证不合法
                    nullErrorTips("Your ID card number isn't legitimate!", 0);
                } else {
                    i = i + 1 ;
                }

                //检验电子邮件
                temp = lp_TextForInputStudentInforMation07.getText() ;
                key = IfEmailIsRight(temp) ;
                if (key != 1) {
                    nullErrorTips("E-mail address format error!", 0);
                } else {
                    i = i + 1;
                }
                System.out.println("i = " + i);
                if (i == 9) {
                    //data save into the database
                    String studentName = lp_TextForInputStudentInforMation01.getText() ;
                    String studentID = lp_TextForInputStudentInforMation02.getText() ;
                    String studentSchoolNumber = lp_TextForInputStudentInforMation03.getText() ;
                    String studentBrithday = lp_TextForInputStudentInforMation04.getText() ;
                    String studentSex = lp_TextForInputStudentInforMation05.getText() ;
                    String studentQQNumber = lp_TextForInputStudentInforMation06.getText() ;
                    String student_eMail = lp_TextForInputStudentInforMation07.getText() ;
                    String studentPhoneNumber = lp_TextForInputStudentInforMation08.getText() ;
                    String studentPassWord = lp_password ;
                    //222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222
                    inputInformationYoDataBase lpInputInformation = new inputInformationYoDataBase(studentName,
                            studentID, studentSchoolNumber, studentBrithday, studentSex, studentQQNumber, student_eMail,
                            studentPhoneNumber, studentPassWord);
                    i = 0 ;
                } else {
                    nullErrorTips("Have a bug, link to us!", 0) ;
                    i = 0 ;
                }
                lp_password = "";
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


        lp_PanelAddButtonForinputStudentInformation.add(lp_ButtonForinputStudentInformation01);
        lp_PanelAddButtonForinputStudentInformation.add(lp_ButtonForinputStudentInformation02);

        lp_frameForInputStudentInformation.add(lp_PanelAddButtonForinputStudentInformation, BorderLayout.SOUTH);

        lp_frameForInputStudentInformation.setVisible(true);
    }




    //1-> add
    //0-> new
    public static void nullErrorTips(String string, int key) {
        if (key == 1) {
            Frame lp_nullErrorTipsWindow = new Frame("错误提示");
            lp_nullErrorTipsWindow.addWindowListener(new newWindow());
            lp_nullErrorTipsWindow.setSize(300, 200);
            lp_nullErrorTipsWindow.setLayout(new GridLayout(2, 1));
            Label lp_nullErrorTipsLabel = new Label();
            String stringOfFrror = new String(string + " can't setting null!");
            lp_nullErrorTipsLabel.setText(stringOfFrror);
            Panel panelForLabel = new Panel();
            panelForLabel.setLayout(new FlowLayout());
            panelForLabel.add(lp_nullErrorTipsLabel);
            lp_nullErrorTipsWindow.add(panelForLabel);
            lp_nullErrorTipsWindow.setBackground(Color.BLUE);
            Panel panel = new Panel();
            panel.setLayout(new FlowLayout());
            Button lp_buttonforNullError = new Button("OK");
            lp_buttonforNullError.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Window window = lp_nullErrorTipsWindow;
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
            panel.add(lp_buttonforNullError);
            lp_nullErrorTipsWindow.add(panel);
            lp_nullErrorTipsWindow.setVisible(true);
        }
        if (key == 0) {
            Frame lp_nullErrorTipsWindow = new Frame("错误提示");
            lp_nullErrorTipsWindow.addWindowListener(new newWindow());
            lp_nullErrorTipsWindow.setSize(300, 200);
            lp_nullErrorTipsWindow.setLayout(new GridLayout(2, 1));
            Label lp_nullErrorTipsLabel = new Label();
            String stringOfFrror = new String(string);
            lp_nullErrorTipsLabel.setText(stringOfFrror);
            Panel panelForLabel = new Panel();
            panelForLabel.setLayout(new FlowLayout());
            panelForLabel.add(lp_nullErrorTipsLabel);
            lp_nullErrorTipsWindow.add(panelForLabel);
            lp_nullErrorTipsWindow.setBackground(Color.BLUE);
            Panel panel = new Panel();
            panel.setLayout(new FlowLayout());
            Button lp_buttonforNullError = new Button("OK");
            lp_buttonforNullError.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Window window = lp_nullErrorTipsWindow;
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
            panel.add(lp_buttonforNullError);
            lp_nullErrorTipsWindow.add(panel);
            lp_nullErrorTipsWindow.setVisible(true);
        }

    }

    public static void outputYoutInformation(String province, String sex, String brithday){
        Frame lp_nullErrorTipsWindow = new Frame("信息提示");
        lp_nullErrorTipsWindow.addWindowListener(new newWindow());
        lp_nullErrorTipsWindow.setSize(500, 300);
        lp_nullErrorTipsWindow.setLayout(new GridLayout(4, 1));

        Panel lpPanelForProvince = new Panel() ;
        lpPanelForProvince.setLayout(new FlowLayout()) ;
        Label lpLabelForProvince = new Label("Procince: ") ;
        TextField lpTextLForProvince = new TextField(20) ;
        lpTextLForProvince.setText(province);
        lpPanelForProvince.add(lpLabelForProvince);
        lpPanelForProvince.add(lpTextLForProvince);
        lp_nullErrorTipsWindow.add(lpPanelForProvince);

        Panel lpPanelForSex = new Panel() ;
        lpPanelForSex.setLayout(new FlowLayout()) ;
        Label lpLabelForSex = new Label("Sex: ") ;
        TextField lpTextLForSex = new TextField(20) ;
        lpTextLForSex.setText(sex);
        lpPanelForSex.add(lpLabelForSex);
        lpPanelForSex.add(lpTextLForSex);
        lp_nullErrorTipsWindow.add(lpPanelForSex);

        Panel lpPanelForBrithday = new Panel() ;
        lpPanelForBrithday.setLayout(new FlowLayout()) ;
        Label lpLabelForBrithday = new Label("Brithday: ") ;
        TextField lpTextLForBrithday = new TextField(30) ;
        lpTextLForBrithday.setText(brithday);
        lpPanelForBrithday.add(lpLabelForBrithday);
        lpPanelForBrithday.add(lpTextLForBrithday);
        lp_nullErrorTipsWindow.add(lpPanelForBrithday);

        Panel panel = new Panel();
        panel.setLayout(new FlowLayout());
        Button lp_buttonforNullError = new Button("OK");
        lp_buttonforNullError.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Window window = lp_nullErrorTipsWindow;
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
        panel.add(lp_buttonforNullError);

        lp_nullErrorTipsWindow.add(panel);
        lp_nullErrorTipsWindow.setVisible(true);
    }

    public static int IDIsRight(String ID) {
        int returnKey = 0;
        if (ID.length() != 18) {
            //错误提示：ID长度不够
            nullErrorTips("ID length is not error! ", 0);
        } else {
            IDcardIsRight  ie = new IDcardIsRight (ID);
            String IDInformation = ie.toString();
            boolean key = ie.ifRight();
            if (key == true) {
                //是真实的身份证
                String p = ie.getProvince() ;
                String s = ie.getGender();
                Date d = ie.getBirthday() ;
                String d1 = d.toString();
                System.out.println(d1);
                outputYoutInformation(p, s, d1);
                returnKey = 1;
            } else {
                //错误提示：身份证号码不合法
                returnKey = 0 ;
            }
        }
        return returnKey;
    }

    //检验邮件格式是否正确
    public static int IfEmailIsRight(String eMail) {
        int returnKey = 0 ;
        int length = eMail.length() ;
        boolean endWith = eMail.endsWith(".com") ;
        boolean haveAITA = eMail.contains("@") ;
        if (endWith) {
            if (haveAITA) {
                int a = eMail.lastIndexOf(".com") ;
                int b = eMail.lastIndexOf("@") ;
                if (a > b) {
                    returnKey = 1 ;
                }
            }
        }
        return returnKey ;
    }

    //判定生日格式
     public static int IsBrithdayFormatIsRight(String brithday) {
        int key =0;
        if (brithday.length() != 10) {
            key = 0;
        } else {
            if (brithday.indexOf("-") == 4) {
                if (brithday.lastIndexOf("-") == 7) {
                    key = 1;
                }
            }
        }
        return key;
     }

}
