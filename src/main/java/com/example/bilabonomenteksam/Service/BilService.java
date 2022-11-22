package com.example.bilabonomenteksam.Service;

import com.example.bilabonomenteksam.Model.BilModel;
import com.example.bilabonomenteksam.Repository.Carliste;
import com.example.bilabonomenteksam.Repository.LejeAftale;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

public class BilService {

  Carliste carliste = new Carliste();

  LejeAftale repo = new LejeAftale();

  public List<BilModel> getAllBil() {

    return carliste.getAllBil();
  }

  /*
  public BilModel getBil (int id){
    return carliste.getBil(id);

  }
  */


public void bilListe(WebRequest req){

BilModel bilModel2 = new BilModel(req.getParameter("vognnummer"));

carliste.createBilList(bilModel2);

}


  }



