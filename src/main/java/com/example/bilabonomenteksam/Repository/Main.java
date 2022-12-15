package com.example.bilabonomenteksam.Repository;


public class Main {

  //Anders og Jon

  public static void main(String[] args) {

    DBConnect.getConnection();

    CarlistRepo billiste = new CarlistRepo();

    System.out.println(billiste.getAllCar());


  }

}
