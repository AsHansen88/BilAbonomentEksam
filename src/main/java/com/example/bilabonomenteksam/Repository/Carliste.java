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

  List<Carliste> ListOfCars = new ArrayList<>();



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


}
