package JDBC;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class selectObject {
    private Frame lpFrameForSelectObject ;
    private Button[] lpButtonForSelectObject ;
    private String[] lpStringFoeSelectObject ;
    private String[] lpTempStringForSaveSelectObject ;
    private String[] lpTrueString ;
    private TextArea lpTextForSelectObject ;
    private Panel lpPanelForButton ;
    private Panel lpPanelForTowButton;
    private Button lpButtonForSelectObjectOK ;
    private Button lpButtonForSelectObjectCanecl ;
    int numberOfAddObject ;
    private boolean[] lpKeyForIfTheObjectIsSelect ;

    public selectObject() {
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
        lpPanelForButton = new Panel() ;
        lpPanelForButton.setLayout(new GridLayout(10, 1));
        lpFrameForSelectObject.add(lpPanelForButton);
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
            lpPanelForButton.add(lpButtonForSelectObject[i]) ;
        }
        lpPanelForButton.add(lpPanelForTowButton);
        lpFrameForSelectObject.setVisible(true);
    }

}

