package com.example.bilabonomenteksam.Service;


import com.example.bilabonomenteksam.Model.BilModel;
import com.example.bilabonomenteksam.Repository.Carliste;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

public class BilService {



Carliste carL = new Carliste(); {


    }

  public List<BilModel> getallcar() {
    return carL.getAllBil();
  }

}



