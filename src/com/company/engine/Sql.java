package com.company.engine;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.*;


public class Sql {
    public void test(String[] args) {

        try {
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/dj&dragouns";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl , "root", "");

            String query = "SELECT * FROM 'hero'";

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                int id = rs.getInt("Id");
                String type = rs.getString("Type");
                String name = rs.getString("Name");
                int hp = rs.getInt("NiveauVie");
                int strength = rs.getInt("NiveauForce");
                String weapon = rs.getString("ArmeSort");
                String shield = rs.getString("Bouclier");

                System.out.format("%s, %s, %s, %s, %s, %s\n",  id, name);
            }
            st.close();
        }
        catch (Exception e) {
            System.err.println("Got an exception");
            System.err.println(e.getMessage());
        }
    }
}
