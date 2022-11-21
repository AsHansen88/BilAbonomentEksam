package com.example.bilabonomenteksam.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

  private static String hostname;
  private static String username;
  private static String password;
  private static Connection conn;


//Metoder

  public static Connection getConnection(){
    hostname = "jdbc:mysql://test2022.mysql.database.azure.com/kea";
    username = "AsHansen88";
    password = "191188Anders";

    try{

      conn = DriverManager.getConnection(hostname, username, password);
    }catch (SQLException e){
      System.out.println("Connection Error");
      e.printStackTrace();
    }
    System.out.println("Connected to Database");

    return conn;

  }
}

