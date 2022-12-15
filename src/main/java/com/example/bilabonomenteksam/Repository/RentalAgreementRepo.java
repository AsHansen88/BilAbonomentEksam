package com.example.bilabonomenteksam.Repository;

import com.example.bilabonomenteksam.Model.RentalAgreementsModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RentalAgreementRepo {

  private Connection conn = DBConnect.getConnection();

  public List<RentalAgreementsModel> getallCaragreements(){
    List<RentalAgreementsModel> carrental = new ArrayList<>();

    try{
      PreparedStatement psts = conn.prepareStatement("SELECT * FROM Car.RentalAgreements");
      ResultSet resultSet = psts.executeQuery();

      while(resultSet.next()){
        carrental.add(new RentalAgreementsModel(
            resultSet.getDate("startDate"),
            resultSet.getDate("endDate"),
            resultSet.getInt("vehicleNumber"),
            resultSet.getString("name"),
            resultSet.getString("address"),
            resultSet.getString("email"),
            resultSet.getInt("phonenumber"),
            resultSet.getString("rentalPeriod"),
            resultSet.getDouble("price")));
      }
    }catch (SQLException e){
      System.out.println("ERROR");
      e.printStackTrace();
    }
    return carrental;
}

public RentalAgreementsModel GetRentalAgreementsModel(int vehicleNumber){
    try{
      PreparedStatement psts = conn.prepareStatement("SELECT * FROM Car.RentalAgreements WHERE id=?");
          psts.setInt(1,vehicleNumber);
      ResultSet resultSet = psts.executeQuery();
    }catch(SQLException e){
      System.out.println("Error getRentalAgreementsModel");
      e.printStackTrace();
    }return null;
}

  public void createRentalAgreement(RentalAgreementsModel rentalAgreementsModel) {

    try {
      PreparedStatement psts = conn.prepareStatement("INSERT INTO Car.RentalAgreements (startDate,endDate,vehicleNumber,name,email,phonenumber,address,rentalPeriod,price) VALUES (?,?,?,?,?,?,?,?,?)");

      psts.setDate(1,rentalAgreementsModel.getStartDate());
      psts.setDate(2,rentalAgreementsModel.getEndDate());
      psts.setInt(3, rentalAgreementsModel.getVehicleNumber());
      psts.setString(4, rentalAgreementsModel.getName());
      psts.setString(5, rentalAgreementsModel.getEmail());
      psts.setInt(6, rentalAgreementsModel.getPhonenumber());
      psts.setString(7, rentalAgreementsModel.getAddress());
      psts.setString(8, rentalAgreementsModel.getRentalPeriod());
      psts.setDouble(9, rentalAgreementsModel.getPrice());
      psts.executeUpdate();

    }catch (SQLException e){
      System.out.println("Error at createRentalAgreement");
      e.printStackTrace();

    }

  }
}
