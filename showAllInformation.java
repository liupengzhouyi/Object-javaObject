package JDBC;

import java.awt.*;

public class showAllInformation {
    private Frame lp_FrameShowAll ;
    private GridLayout lp_GriLayout ;
    private FlowLayout lp_FlowLayout ;

    public showAllInformation() {
        lp_FrameShowAll.setLayout(new BorderLayout()) ;
    }

    private Panel[] lpPanelA ;
    private Panel[] lpPanelB ;
    private Panel lp_Panel;

    public void biudingWindow(int number) {
        lp_Panel = new Panel(new GridLayout(1, number)) ;
        lp_Panel.setLayout(new BorderLayout());
        for (int i=0; i < number; i++) {
            lpPanelA[i] = new Panel() ;
            lpPanelB[i] = new Panel() ;

        }
        lp_FrameShowAll.add(lp_Panel, BorderLayout.CENTER) ;
    }













    private Button lpButtonRefresh ;
    private Button lpButtonOut ;
    private Panel lpPanelForButton ;
    private Panel lpPanelForButtonRefresh ;
    private Panel lpPanelForButtonOut ;

    public void setButton() {
        if (lp_FlowLayout == null) {
            lp_FlowLayout = new FlowLayout() ;
        }
        lpButtonOut = new Button("Out") ;
        lpButtonRefresh = new Button("Refresh") ;
        lpPanelForButtonOut = new Panel() ;
        lpPanelForButtonOut.setLayout(lp_FlowLayout);
        lpPanelForButtonRefresh = new Panel() ;
        lpPanelForButtonRefresh.setLayout(lp_FlowLayout);
        lpPanelForButtonRefresh.add(lpPanelForButtonRefresh) ;
        lpPanelForButtonOut.add(lpPanelForButtonOut) ;
        lpPanelForButton = new Panel(new GridLayout(2, 1)) ;
        lpPanelForButton.add(lpPanelForButtonRefresh) ;
        lpPanelForButton.add(lpPanelForButtonOut) ;
        lp_FrameShowAll.add(lpPanelForButton, BorderLayout.SOUTH) ;
    }


    public static void main(String [] args) {
        showAllInformation lp = new showAllInformation() ;
        lp.biudingWindow(1) ;
        lp.setButton() ;


    }
}
