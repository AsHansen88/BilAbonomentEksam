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
        resultSet.getDate("startDate"),
        resultSet.getDate("endDate"),
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
    PreparedStatement psts = conn.prepareStatement("INSERT INTO Car.DamageReports (startDate,endDate,damageReportDescription,damageTitle,damagePrice, vehicleNumber,kmTraveledOverLimit,totalDamageCost) VALUES (?,?,?,?,?,?,?,?)");
    psts.setDate(1,damageReportModel.getStartDate());
    psts.setDate(2,damageReportModel.getEndDate());
    psts.setString(3, damageReportModel.getDamageReportDescription());
    psts.setString(4, damageReportModel.getDamageTitle());
    psts.setDouble(5,damageReportModel.getDamagePrice());
    psts.setInt(6,damageReportModel.getVehicleNumber());
    psts.setDouble(7,damageReportModel.getKmTraveledOverLimit());
    psts.setDouble(8,damageReportModel.getTotalDamageCost());
    psts.executeUpdate();

  }catch (SQLException e){
    System.out.println("Error at createDamageReport");
    e.printStackTrace();
  }
  }
}
