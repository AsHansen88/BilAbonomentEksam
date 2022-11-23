package com.example.bilabonomenteksam.Repository;

import com.example.bilabonomenteksam.Model.BilModel;

import java.util.List;

public interface IRepo<T> {

  List<T> getAllBil();


  BilModel getSinglebilId(int vognnummer);
}
