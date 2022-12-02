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
            resultSet.getInt("vehicleNumber"),
            //resultSet.getInt("id"),
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
      System.out.println("Error getrentalagreementsmodel");
      e.printStackTrace();
    }return null;
}

  public void createRentalAgreement(RentalAgreementsModel rentalAgreementsModel) {

    try {
      PreparedStatement psts = conn.prepareStatement("INSERT INTO Car.RentalAgreements (vehicleNumber,name,email,phonenumber,address,rentalPeriod,price) VALUES (?,?,?,?,?,?,?)");

      psts.setInt(1, rentalAgreementsModel.getVehicleNumber());
      //psts.setInt(2, rentalAgreementsModel.getId());
      psts.setString(2, rentalAgreementsModel.getName());
      psts.setString(3, rentalAgreementsModel.getEmail());
      psts.setInt(4, rentalAgreementsModel.getPhonenumber());
      psts.setString(5, rentalAgreementsModel.getAddress());
      psts.setString(6, rentalAgreementsModel.getRentalPeriod());
      psts.setDouble(7, rentalAgreementsModel.getPrice());
      psts.executeUpdate();

    }catch (SQLException e){
      System.out.println("Error at createRentalAgreement");
      e.printStackTrace();

    }

  }
}
