package com.mycompany.librarymanagementsystem;

import java.sql.*;

public class conn {

    Connection c;
    Statement st;

    public conn() {

        //System.out.println("First this");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///library?allowMultiQueries=true", "root", "!MySQL99");
            st = c.createStatement();
            // System.out.println("This happened");

            //Used the block below to test connection to table in database
            /* String query = "Select * from Librarians";
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
        login.setResizable(false);

        //System.out.println("Database Connected");
    }
}
