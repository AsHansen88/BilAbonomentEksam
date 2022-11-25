package com.example.bilabonomenteksam.Service;


import com.example.bilabonomenteksam.Model.CarModel;
import com.example.bilabonomenteksam.Repository.CarlistRepo;

import java.util.List;

public class CarService {

CarlistRepo carL = new CarlistRepo(); {

    }

  public List<CarModel> getallcar() {
    return carL.getAllCar();
  }

}



