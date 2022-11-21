package com.example.bilabonomenteksam.Repository;

public class Main {

  public static void main(String[] args) {

    DBConnect.getConnection();

    LejeAftale LA = new LejeAftale();

    System.out.println(LA.getAllBil());
    System.out.println(LA.getBil(1));

  }

}
