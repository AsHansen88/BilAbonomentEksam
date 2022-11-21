package com.example.bilabonomenteksam.Service;

import com.example.bilabonomenteksam.Model.BilModel;
import com.example.bilabonomenteksam.Repository.LejeAftale;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

public class BilService {

  LejeAftale repo = new LejeAftale();

  public List<BilModel> getAllBil() {

    return repo.getAllBil();
  }

  public BilModel getBil (int id){
    return repo.getBil(id);

  }


  }



