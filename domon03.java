package JDBC;

import java.awt.*;

public class domon03 {


    public static void main(String [] arga) {
       test lp =new test();
       lp.setWindfow();


    }



}


class test {
    private     Frame           lp_MainWindowForDatabas ;
    private     Panel           lp______________Panel01 ;
    private     Panel           lp______________Panel02 ;
    private     Button          lp_____________Button01 ;
    private     Button          lp_____________Button02 ;
    private     BorderLayout    lp_________BorderLayout ;
    private     TextField       lp____________TextFiled ;
    private     TextArea        lp_____________TextArea ;
    //private

    public void setWindfow() {
        lp_MainWindowForDatabas = new Frame("ForDtabases") ;
        lp_MainWindowForDatabas.setSize(800, 600) ;
        lp_MainWindowForDatabas.addWindowListener(new newWindow()) ;

        lp_________BorderLayout = new BorderLayout() ;
        lp_MainWindowForDatabas.setLayout(lp_________BorderLayout) ;
        lp_____________Button01 = new Button("OK") ;
        lp_____________Button02 = new Button("Cancel") ;

        lp______________Panel02 = new Panel() ;
        lp______________Panel02.add(lp_____________Button02) ;
        lp______________Panel02.add(lp_____________Button01) ;
        lp_MainWindowForDatabas.add(lp______________Panel02, BorderLayout.SOUTH) ;

        lp____________TextFiled = new TextField(100) ;
        lp______________Panel01 = new Panel();
        lp______________Panel01.add(lp____________TextFiled);
        lp_MainWindowForDatabas.add(lp______________Panel01, BorderLayout.NORTH) ;

        lp_____________TextArea = new TextArea(700,450) ;
        lp_MainWindowForDatabas.add(lp_____________TextArea, BorderLayout.CENTER) ;


        lp_MainWindowForDatabas.setVisible(true);
    }


}