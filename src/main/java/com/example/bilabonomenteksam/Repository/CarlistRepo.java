package com.example.bilabonomenteksam.Repository;

import com.example.bilabonomenteksam.Model.CarModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarlistRepo implements IRepo<CarModel> {

  private Connection conn = DBConnect.getConnection();


  public List<CarModel> getAllCar() {

    List<CarModel> listOfCars = new ArrayList<>();

    try {
      PreparedStatement psts = conn.prepareStatement("SELECT * FROM Bil.ListAfBiler");
      ResultSet resultSet = psts.executeQuery();

      while (resultSet.next()) {
        CarModel tmp = new CarModel(resultSet.getInt(1),
            resultSet.getInt(2),
            resultSet.getString(3),
            resultSet.getString(4),
            resultSet.getInt(5),
            resultSet.getDouble(6),
            resultSet.getDouble(7),
            resultSet.getDouble(8),
            resultSet.getString(9));

        listOfCars.add(tmp);

      }

    } catch (SQLException e) {
      System.out.println("Error at getAllbil");
      e.printStackTrace();
    }
    return listOfCars;
  }

  @Override
  public CarModel getSingleCar(int vehicleNumber) {
    return null;
  }


  public void createDriver(CarModel bil) {

    try {
      PreparedStatement psts = conn.prepareStatement("INSERT INTO Bil.ListAfBiler (Vognnummer,Stelnummmer,Mærke,Model,udstyrsniveau,stålpris,reg_afgift,co2_udledning) VALUES (?,?,?,?,?,?,?,?,?)");

      psts.setInt(1,bil.getVehicleNumber());
      psts.setInt(2, bil.getFrameNumber());
      psts.setString(3, bil.getMake());
      psts.setString(4, bil.getModel());
      psts.setInt(5, bil.getEquipmentLevel());
      psts.setDouble(6, bil.getSteelPrice());
      psts.setDouble(7, bil.getReg_Charge());
      psts.setDouble(8, bil.getCo2_Emmission());
      psts.setString(9, bil.getStatus());
      psts.executeUpdate();
    }catch (SQLException e){
      System.out.println("Error at createBilList");
      e.printStackTrace();

    }

  }



    }

