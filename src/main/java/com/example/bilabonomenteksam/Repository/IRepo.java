package com.example.bilabonomenteksam.Repository;

import com.example.bilabonomenteksam.Model.CarModel;

import java.util.List;

//Anders og Jon

public interface IRepo<T> {

  List<T> getAllCar();


  CarModel getSingleCar(int vognnummer);
}
