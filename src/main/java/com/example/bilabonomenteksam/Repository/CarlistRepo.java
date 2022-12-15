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
      PreparedStatement psts = conn.prepareStatement("SELECT * FROM Car.ListOfCars");
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
      System.out.println("Error at getAllCar");
      e.printStackTrace();
    }
    return listOfCars;
  }

  @Override
  public CarModel getSingleCar(int vehicleNumber) {
    return null;
  }


  }





