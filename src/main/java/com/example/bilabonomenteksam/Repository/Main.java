package com.example.bilabonomenteksam.Repository;

import com.example.bilabonomenteksam.Model.BilModel;


public class Main {

  public static void main(String[] args) {

    DBConnect.getConnection();

    Carliste billiste = new Carliste();

    System.out.println(billiste.getAllBil());

  }

}
