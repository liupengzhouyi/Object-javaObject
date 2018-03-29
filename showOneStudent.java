package JDBC;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class showOneStudent {
    public showOneStudent() {
        ;
    }

    public void setWindowVisit(String student_ID, String studentName,
                               String studentID, String studentAge,
                               String studentBrithday, String studentSex,
                               String studentSchoolNumber, String studentE_mail,
                               String studentPhoneNumber, String studentQQNumber) {
        lp_TextFieldForShowStudentStudent_ID.setText(student_ID);
        lp_TextFieldForShowStudentStudentName.setText(studentName) ;
        lp_TextFieldForShowStudentStudentID.setText(studentID);
        lp_TextFieldForShowStudentStudentAge.setText(studentAge);
        lp_TextFieldForShowStudentStudentBrithday.setText(studentBrithday);
        lp_TextFieldForShowStudentStudentSex.setText(studentSex);
        lp_TextFieldForShowStudentStudentSchoolNumber.setText(studentSchoolNumber);
        lp_TextFieldForShowStudentStudentE_mail.setText(studentE_mail);
        lp_TextFieldForShowStudentStudentPhoneNumber.setText(studentPhoneNumber);
        lp_TextFieldForShowStudentStudentQQNumber.setText(studentQQNumber);
        lp_FrameForShowStudent.setVisible(true);
    }

    public void setWindowVisit() {
        lp_FrameForShowStudent.setVisible(true);
    }

    public static void main(String [] args) {
        showOneStudent p = new showOneStudent() ;
        p.buidingWindow();
        p.setWindowVisit();
    }

    public void buidingWindow() {
        lp_FrameForShowStudent = new Frame("你的个人信息！") ;
        lp_FrameForShowStudent.addWindowListener(new newWindow());
        lp_FrameForShowStudent.setSize(500, 900) ;
        lp_GridLayoutForWindow = new GridLayout(11,1) ;
        lp_FrameForShowStudent.setLayout(lp_GridLayoutForWindow);
        lp_FlowLayoutForButtonPanel = new FlowLayout() ;

        lp_PanFOrShowStudentStudent_ID = new Panel() ;
        lp_LabelForShowStudentStudent_ID  = new Label("Your Database ID : ") ;
        lp_TextFieldForShowStudentStudent_ID =new TextField(30)  ;
        lp_PanFOrShowStudentStudent_ID.setLayout(lp_FlowLayoutForButtonPanel);
        lp_PanFOrShowStudentStudent_ID.add(lp_LabelForShowStudentStudent_ID);
        lp_PanFOrShowStudentStudent_ID.add(lp_TextFieldForShowStudentStudent_ID) ;
        lp_FrameForShowStudent.add(lp_PanFOrShowStudentStudent_ID);

        lp_PanFOrShowStudentStudentName = new Panel() ;
        lp_TextFieldForShowStudentStudentName = new TextField(30) ;
        lp_LabelForShowStudentName = new Label("Your Name : ") ;
        lp_PanFOrShowStudentStudentName.setLayout(lp_FlowLayoutForButtonPanel) ;
        lp_PanFOrShowStudentStudentName.add(lp_LabelForShowStudentName) ;
        lp_PanFOrShowStudentStudentName.add(lp_TextFieldForShowStudentStudentName) ;
        lp_FrameForShowStudent.add(lp_PanFOrShowStudentStudentName) ;

        lp_PanFOrShowStudentStudentID = new Panel() ;
        lp_PanFOrShowStudentStudentID.setLayout(lp_FlowLayoutForButtonPanel);
        lp_LabelForShowStudentID = new Label("Your ID : ") ;
        lp_TextFieldForShowStudentStudentID = new TextField(30) ;
        lp_PanFOrShowStudentStudentID.add(lp_LabelForShowStudentID) ;
        lp_PanFOrShowStudentStudentID.add(lp_TextFieldForShowStudentStudentID) ;
        lp_FrameForShowStudent.add(lp_PanFOrShowStudentStudentID) ;

        lp_PanFOrShowStudentStudentAge = new Panel() ;
        lp_PanFOrShowStudentStudentAge.setLayout(lp_FlowLayoutForButtonPanel);
        lp_LabelForShowStudentAge = new Label("Your Age : ") ;
        lp_TextFieldForShowStudentStudentAge = new TextField(30) ;
        lp_PanFOrShowStudentStudentAge.add(lp_LabelForShowStudentAge) ;
        lp_PanFOrShowStudentStudentAge.add(lp_TextFieldForShowStudentStudentAge) ;
        lp_FrameForShowStudent.add(lp_PanFOrShowStudentStudentAge) ;

        lp_PanFOrShowStudentStudentBrithday = new Panel() ;
        lp_PanFOrShowStudentStudentBrithday.setLayout(lp_FlowLayoutForButtonPanel);
        lp_LabelForShowStudentBrithday = new Label("Your Brithday : ") ;
        lp_TextFieldForShowStudentStudentBrithday = new TextField(30) ;
        lp_PanFOrShowStudentStudentBrithday.add(lp_LabelForShowStudentBrithday) ;
        lp_PanFOrShowStudentStudentBrithday.add(lp_TextFieldForShowStudentStudentBrithday) ;
        lp_FrameForShowStudent.add(lp_PanFOrShowStudentStudentBrithday);

        lp_PanFOrShowStudentStudentSex = new Panel() ;
        lp_PanFOrShowStudentStudentSex.setLayout(lp_FlowLayoutForButtonPanel);
        lp_LabelForShowStudentSex = new Label("Your Sex : ") ;
        lp_TextFieldForShowStudentStudentSex = new TextField(30) ;
        lp_PanFOrShowStudentStudentSex.add(lp_LabelForShowStudentSex) ;
        lp_PanFOrShowStudentStudentSex.add(lp_TextFieldForShowStudentStudentSex) ;
        lp_FrameForShowStudent.add(lp_PanFOrShowStudentStudentSex);

        lp_PanFOrShowStudentStudentSchoolNumber = new Panel () ;
        lp_PanFOrShowStudentStudentSchoolNumber.setLayout(lp_FlowLayoutForButtonPanel);
        lp_LabelForShowStudentSchoolNumber = new Label("Your School Number : ") ;
        lp_TextFieldForShowStudentStudentSchoolNumber = new TextField(30) ;
        lp_PanFOrShowStudentStudentSchoolNumber.add(lp_LabelForShowStudentSchoolNumber) ;
        lp_PanFOrShowStudentStudentSchoolNumber.add(lp_TextFieldForShowStudentStudentSchoolNumber) ;
        lp_FrameForShowStudent.add(lp_PanFOrShowStudentStudentSchoolNumber);

        lp_PanFOrShowStudentStudentE_mail = new Panel() ;
        lp_PanFOrShowStudentStudentE_mail.setLayout(lp_FlowLayoutForButtonPanel);
        lp_LabelForShowStudentE_mail = new Label("Your E-mail : ") ;
        lp_TextFieldForShowStudentStudentE_mail = new TextField(30) ;
        lp_PanFOrShowStudentStudentE_mail.add(lp_LabelForShowStudentE_mail);
        lp_PanFOrShowStudentStudentE_mail.add(lp_TextFieldForShowStudentStudentE_mail) ;
        lp_FrameForShowStudent.add(lp_PanFOrShowStudentStudentE_mail);

        lp_PanFOrShowStudentStudentPhoneNumber = new Panel() ;
        lp_PanFOrShowStudentStudentPhoneNumber.setLayout(lp_FlowLayoutForButtonPanel);
        lp_LabelForShowStudentPhoneNumber = new Label("Your Phone Number :") ;
        lp_TextFieldForShowStudentStudentPhoneNumber = new TextField(30) ;
        lp_PanFOrShowStudentStudentPhoneNumber.add(lp_LabelForShowStudentPhoneNumber) ;
        lp_PanFOrShowStudentStudentPhoneNumber.add(lp_TextFieldForShowStudentStudentPhoneNumber) ;
        lp_FrameForShowStudent.add(lp_PanFOrShowStudentStudentPhoneNumber) ;

        lp_PanFOrShowStudentStudentQQNumber = new Panel() ;
        lp_PanFOrShowStudentStudentQQNumber.setLayout(lp_FlowLayoutForButtonPanel);
        lp_LabelForShowStudentQQNumber = new Label("Your QQ Number : ") ;
        lp_TextFieldForShowStudentStudentQQNumber = new TextField(30) ;
        lp_PanFOrShowStudentStudentQQNumber.add(lp_LabelForShowStudentQQNumber) ;
        lp_PanFOrShowStudentStudentQQNumber.add(lp_TextFieldForShowStudentStudentQQNumber);
        lp_FrameForShowStudent.add(lp_PanFOrShowStudentStudentQQNumber) ;

        lp_ButtonForShowStudentOK = new Button("OK") ;
        lp_ButtonForShowStudentOK.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Window window = lp_FrameForShowStudent ;
                window.setVisible(false) ;
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

        lp_ButtonForShowStudentOK.setSize(50,50) ;
        lp_ButtonForShowStudentOK.setBackground(Color.RED);
        lp_PanelForButton = new Panel() ;

        lp_PanelForButton.setLayout(lp_FlowLayoutForButtonPanel) ;
        lp_PanelForButton.add(lp_ButtonForShowStudentOK) ;

        lp_FrameForShowStudent.add(lp_PanelForButton) ;
    }

    public void combinationPanel(Panel panel, Label label, String string, TextField textField) {
        panel.setLayout(lp_FlowLayoutForButtonPanel) ;
        label = new Label(string) ;
        panel.add(label) ;
        panel.add(textField) ;
        lp_FrameForShowStudent.add(panel) ;
    }

    public void closeindow() {
        Window window = lp_FrameForShowStudent ;
        window.setVisible(false) ;
        window.dispose();
    }

    private Frame       lp_FrameForShowStudent ;
    private Button      lp_ButtonForShowStudentOK ;
    private FlowLayout  lp_FlowLayoutForButtonPanel ;
    private Panel       lp_PanelForButton ;
    private GridLayout  lp_GridLayoutForWindow ;

    private Label lp_LabelForShowStudentStudent_ID ;
    private Label lp_LabelForShowStudentName  ;
    private Label lp_LabelForShowStudentID  ;
    private Label lp_LabelForShowStudentAge  ;
    private Label lp_LabelForShowStudentBrithday   ;
    private Label lp_LabelForShowStudentSex  ;
    private Label lp_LabelForShowStudentSchoolNumber  ;
    private Label lp_LabelForShowStudentE_mail  ;
    private Label lp_LabelForShowStudentPhoneNumber   ;
    private Label lp_LabelForShowStudentQQNumber   ;

    private TextField lp_TextFieldForShowStudentStudent_ID  ;
    private TextField lp_TextFieldForShowStudentStudentName  ;
    private TextField lp_TextFieldForShowStudentStudentID  ;
    private TextField lp_TextFieldForShowStudentStudentAge ;
    private TextField lp_TextFieldForShowStudentStudentBrithday  ;
    private TextField lp_TextFieldForShowStudentStudentSex  ;
    private TextField lp_TextFieldForShowStudentStudentSchoolNumber  ;
    private TextField lp_TextFieldForShowStudentStudentE_mail  ;
    private TextField lp_TextFieldForShowStudentStudentPhoneNumber  ;
    private TextField lp_TextFieldForShowStudentStudentQQNumber  ;

    private Panel lp_PanFOrShowStudentStudent_ID ;
    private Panel lp_PanFOrShowStudentStudentName  ;
    private Panel lp_PanFOrShowStudentStudentID   ;
    private Panel lp_PanFOrShowStudentStudentAge ;
    private Panel lp_PanFOrShowStudentStudentBrithday  ;
    private Panel lp_PanFOrShowStudentStudentSex  ;
    private Panel lp_PanFOrShowStudentStudentSchoolNumber  ;
    private Panel lp_PanFOrShowStudentStudentE_mail ;
    private Panel lp_PanFOrShowStudentStudentPhoneNumber ;
    private Panel lp_PanFOrShowStudentStudentQQNumber  ;

}


/*
        this.combinationPanel(lp_PanFOrShowStudentStudent_ID, lp_LabelForShowStudentStudent_ID,
                "Your Database ID : ", lp_TextFieldForShowStudentStudent_ID) ;
        this.combinationPanel(lp_PanFOrShowStudentStudentName, lp_LabelForShowStudentName,
                "Your Name : ", lp_TextFieldForShowStudentStudentName) ;
        this.combinationPanel(lp_PanFOrShowStudentStudentID, lp_LabelForShowStudentID,
                "Your ID : ", lp_TextFieldForShowStudentStudentID) ;
        this.combinationPanel(lp_PanFOrShowStudentStudentAge, lp_LabelForShowStudentAge,
                "Your Age : ", lp_TextFieldForShowStudentStudentAge) ;
        this.combinationPanel(lp_PanFOrShowStudentStudentBrithday, lp_LabelForShowStudentBrithday,
                "Your Brithday : ", lp_TextFieldForShowStudentStudentBrithday) ;
        this.combinationPanel(lp_PanFOrShowStudentStudentSex, lp_LabelForShowStudentSex,
                "Your Sex : ", lp_TextFieldForShowStudentStudentSex) ;
        this.combinationPanel(lp_PanFOrShowStudentStudentSchoolNumber, lp_LabelForShowStudentSchoolNumber,
                "Your School Number : ", lp_TextFieldForShowStudentStudentSchoolNumber) ;
        this.combinationPanel(lp_PanFOrShowStudentStudentE_mail, lp_LabelForShowStudentE_mail,
                "Your E-mail : ", lp_TextFieldForShowStudentStudentE_mail) ;
        this.combinationPanel(lp_PanFOrShowStudentStudentPhoneNumber, lp_LabelForShowStudentPhoneNumber,
                "Your Phone Number : ", lp_TextFieldForShowStudentStudentPhoneNumber) ;
        this.combinationPanel(lp_PanFOrShowStudentStudentQQNumber, lp_LabelForShowStudentQQNumber,
                "Your QQ Number : ", lp_TextFieldForShowStudentStudentQQNumber) ;
 */