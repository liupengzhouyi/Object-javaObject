package JDBC;

import java.sql.SQLException;

public class createDatabase {
    public createDatabase(String createIntructions) {
        linkToDatabase lp_domon = new linkToDatabase("com.mysql.jdbc.Driver",
                "root",
                "lp184126",
                "jdbc:mysql://localhost:3306/tempfile");

        lp_domon.setSqlIntructions(createIntructions);

        lp_domon.settingDtabase();

        lp_domon.palySQLIntructions();

        lp_domon.closeDatabaseFile();
    }
}
