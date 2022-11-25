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
            resultSet.getInt("frameNumber"),
            resultSet.getInt("id"),
            resultSet.getString("name"),
            resultSet.getString("address"),
            resultSet.getString("email"),
            resultSet.getInt("phonenumber"),
            resultSet.getString("Rentalagrement"),
            resultSet.getDouble("price")));
      }
    }catch (SQLException e){
      System.out.println("ERROR");
      e.printStackTrace();
    }
    return carrental;
}
  public void createRentalAgreement(RentalAgreementsModel rentalAgreementsModel) {

    try {
      PreparedStatement psts = conn.prepareStatement("INSERT INTO Car.RentalAgreements (framenumber,id,name,email,phonenumber,rentalPeriod,price) VALUES (?,?,?,?,?,?,?)");

      psts.setInt(1, rentalAgreementsModel.getFrameNumber());
      psts.setInt(2, rentalAgreementsModel.getId());
      psts.setString(3, rentalAgreementsModel.getName());
      psts.setString(4, rentalAgreementsModel.getEmail());
      psts.setInt(5, rentalAgreementsModel.getPhonenumber());
      psts.setString(6, rentalAgreementsModel.getRentalPeriod());
      psts.setDouble(7, rentalAgreementsModel.getPrice());
      psts.executeUpdate();

    }catch (SQLException e){
      System.out.println("Error at createRentalAgreement");
      e.printStackTrace();

    }

  }
}
