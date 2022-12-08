package com.nmjava.chatapp.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class getConnection {



    public static  Connection connection() {
        Connection c = null;
          String url = "jdbc:postgresql://localhost:5432/chatApp";
          String user = "postgres";
          String pass="123456";
        try {
//
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(url,user, pass);
            System.out.println("success");
            return c;

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
            return null;
        }

    }


}
