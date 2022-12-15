package com.example.bilabonomenteksam.Service;

import com.example.bilabonomenteksam.Model.RentalAgreementsModel;

import java.util.List;

//Anders og Jon

public class CarPriceCalculator {

  public String calculatePrice(List<RentalAgreementsModel> c){
    var sum = 0;
    for(RentalAgreementsModel i: c){
      sum+= i.getPrice();
    }
    return Integer.toString(sum);
  }

}
