package com.example.bilabonomenteksam.Repository;


import com.example.bilabonomenteksam.Model.DamageReportModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DamageReportRepo {

private Connection conn = DBConnect.getConnection();

public List<DamageReportModel> getAllDamageReports(){
  List<DamageReportModel> Damage = new ArrayList<>();
try {
  PreparedStatement psts = conn.prepareStatement("SELECT * FROM Car.DamageReports");
  ResultSet resultSet = psts.executeQuery();

  while(resultSet.next()){
    Damage.add(new DamageReportModel(
        resultSet.getInt("damageId"),
        resultSet.getString("damageReportDescription"),
        resultSet.getString("damageTitle"),
        resultSet.getDouble("damagePrice"),
        resultSet.getInt("vehicleNumber"),
        resultSet.getDouble("kmTraveledOverLimit"),
        resultSet.getDouble("totalDamageCost")));
  }

}catch (SQLException e){
  System.out.println("Error at getAllDamageReports");
  e.printStackTrace();
}
  return Damage;
}

public DamageReportModel getDamageReportModel (int damageId){
 try{
   PreparedStatement psts = conn.prepareStatement("SELECT * FROM Car.DamageReport WHERE damageId=?");
   psts.setInt(1,damageId);
   ResultSet resultSet = psts.executeQuery();
 }catch(SQLException e){
    System.out.println("Error at GetDamageReport");
    e.printStackTrace();
  }return null;
}


public void createDamageReport(DamageReportModel damageReportModel){
  try{
    PreparedStatement psts = conn.prepareStatement("INSERT INTO Car.DamageReports (damageReportDescription,damageTitle,damagePrice, vehicleNumber,kmTraveledOverLimit,totalDamageCost) VALUES (?,?,?,?,?,?)");
    psts.setString(1, damageReportModel.getDamageReportDescription());
    psts.setString(2, damageReportModel.getDamageTitle());
    psts.setDouble(3,damageReportModel.getDamagePrice());
    psts.setInt(4,damageReportModel.getVehicleNumber());
    psts.setDouble(5,damageReportModel.getKmTraveledOverLimit());
    psts.setDouble(6,damageReportModel.getTotalDamageCost());
    psts.executeUpdate();

  }catch (SQLException e){
    System.out.println("Error at createDamageReport");
    e.printStackTrace();
  }
  }
}
