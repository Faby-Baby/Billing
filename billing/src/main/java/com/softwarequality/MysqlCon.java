package com.softwarequality;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlCon {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://164.92.87.80:3306/software_quality", "softwarequality", "SoftwareQuality_375");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(null);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
