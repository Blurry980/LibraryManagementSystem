package com.mycompany.librarymanagementsystem;

import java.sql.*;

public class conn {

   
    public conn() {
        //System.out.println("First this");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql:///library", "root", "!MySQL99");
            Statement st = c.createStatement();
            // System.out.println("This happened");

            //Used the block below to test connection to table in database
            /*  String query = "Select * from Account";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                String username = rs.getString("username");
                System.out.println(username);
            
            } 
            st.close(); */
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new conn();
        //new LoginFrame();

        LoginFrame login = new LoginFrame();
        login.setVisible(true);

        //System.out.println("Database Connected");
    }
}