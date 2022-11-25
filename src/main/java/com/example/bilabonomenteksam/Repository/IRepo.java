package com.example.bilabonomenteksam.Repository;

import com.example.bilabonomenteksam.Model.CarModel;

import java.util.List;

public interface IRepo<T> {

  List<T> getAllCar();


  CarModel getSingleCar(int vognnummer);
}
