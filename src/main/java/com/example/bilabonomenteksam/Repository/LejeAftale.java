package com.example.bilabonomenteksam.Repository;

import com.example.bilabonomenteksam.Model.BilModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LejeAftale {

  private Connection conn = DBConnect.getConnection();

  public List<BilModel> getAllBil(){

    List<BilModel> bil = new ArrayList<>();

    try{
      PreparedStatement psts = conn.prepareStatement("SELECT * FROM Bil");
      ResultSet resultSet = psts.executeQuery();

      while(resultSet.next()){
        bil.add(new BilModel(
            resultSet.getInt("id"),
            resultSet.getString("Indregistrering")));
      }

    }catch (SQLException e){
      System.out.println("Error at getAllbil");
      e.printStackTrace();
    }
    return bil;
  }

  public BilModel getBil(int id){
    try {
      PreparedStatement psts = conn.prepareStatement("SELECT * FROM Bil WHERE id =?");
      psts.setInt(1,id);
      ResultSet resultSet = psts.executeQuery();
    }catch (SQLException e){
      System.out.println("Error at getBil");
      e.printStackTrace();
    }
    return null;
  }

  public void createBil(BilModel bil){
    try{
      PreparedStatement psts = conn.prepareStatement("INSERT INTO Bil (id,name) VALUES (?,?)");
      psts.setInt(1,bil.getVognnummer());
      psts.setInt(2, bil.getStelnummer());
      psts.executeUpdate();
    }catch (SQLException e){
      System.out.println("Error at createBil");
      e.printStackTrace();

    }

  }

}







