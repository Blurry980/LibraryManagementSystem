package com.mycompany.librarymanagementsystem;

import java.sql.*;

public class conn {
    //Connection c;
    // Statement s;
    public conn() { 
        System.out.println("First this");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql:///library", "root", "!MySQL99");
            Statement s = c.createStatement();
            System.out.println("This happened");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new conn();
        System.out.println("Database Connected");
    }
}
