package com.example.bilabonomenteksam.Repository;

import com.example.bilabonomenteksam.Model.BilModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Carliste {

  private Connection conn = DBConnect.getConnection();


  public List<BilModel> getAllBil(){

    List<BilModel> listeAfBiler = new ArrayList<>();

    try{
      PreparedStatement psts = conn.prepareStatement("SELECT * FROM Bil.ListeAfBiler");
      ResultSet resultSet = psts.executeQuery();

      while(resultSet.next()){
        listeAfBiler.add(new BilModel(
            resultSet.getInt("Vognnummer"),
            resultSet.getInt("Stelnummer"),
            resultSet.getString("Mærke"),
            resultSet.getString("Model"),
            resultSet.getInt("Udstyrsniveau"),
            resultSet.getDouble("stålpris"),
            resultSet.getDouble("reg_afgift"),
            resultSet.getDouble("co2_udledning")
        ));

      }

    }catch (SQLException e){
      System.out.println("Error at getAllbil");
      e.printStackTrace();
    }
    return listeAfBiler;
  }

  public void createBilList(BilModel bil){

    try{
      PreparedStatement psts = conn.prepareStatement("INSERT INTO Bil.ListeAfBiler (Vognnummer,Stelnummmer,Mærke,Model,Udstyrsniveau,stålpris,reg_afgift,co2_udledning) VALUES (?,?,?,?,?,?,?,?)");
      psts.setInt(1,bil.getVognnummer());
      psts.setInt(2, bil.getStelnummer());
      psts.setString(3, bil.getMærke());
      psts.setString(4, bil.getModel());
      psts.setInt(5, bil.getUdstyrsniveau());
      psts.setDouble(6, bil.getStålpris());
      psts.setDouble(7, bil.getReg_afgift());
      psts.setDouble(8, bil.getCo2_udledning());
      psts.executeUpdate();
    }catch (SQLException e){
      System.out.println("Error at createBilList");
      e.printStackTrace();

    }

  }


}
