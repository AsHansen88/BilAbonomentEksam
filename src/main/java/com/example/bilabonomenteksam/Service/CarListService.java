package com.example.bilabonomenteksam.Service;

import com.example.bilabonomenteksam.Model.BilModel;
import com.example.bilabonomenteksam.Repository.Carliste;

import java.util.List;

public class CarListService {
  Carliste carliste = new Carliste();

public List<BilModel> getAllBil(){
  return carliste.getAllBil();
}
}
