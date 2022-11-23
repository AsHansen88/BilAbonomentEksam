package com.example.bilabonomenteksam.Service;

import com.example.bilabonomenteksam.Model.BilModel;
import com.example.bilabonomenteksam.Repository.Carliste;
import com.example.bilabonomenteksam.Repository.IRepo;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

public class BilService {

  private final IRepo<BilModel> repo;

  public BilService(IRepo<BilModel> repo){
    this.repo = repo;
  }

  Carliste carliste = new Carliste();

  public List<BilModel> getAllBil() {

    return carliste.getAllBil();
  }

/*
  public BilModel getBil (int id){
    return carliste.getBil(id);
*/

/*
public void bilListe(WebRequest req){

BilModel bilModel2 = new BilModel(req.getParameter());

carliste.createBilList(bilModel2);
*/
}






