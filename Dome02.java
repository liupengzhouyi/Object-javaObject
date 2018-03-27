package JDBC;

import java.sql.SQLException;

public class Dome02 {
    public static void main(String [] args) {
        linkToDatabase lp_domon = new linkToDatabase("com.mysql.jdbc.Driver",
                                                     "root",
                                                     "lp184126",
                                                     "jdbc:mysql://localhost:3306/tempfile"
        );

        String sql = new String("SHOW TABLES;") ;
                //createIntructions;
        lp_domon.setSqlIntructions(sql);

        lp_domon.settingDtabase();

        lp_domon.palySQLIntructions();

        try {
            lp_domon.paly();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        lp_domon.closeDatabaseFile();
    }
}


