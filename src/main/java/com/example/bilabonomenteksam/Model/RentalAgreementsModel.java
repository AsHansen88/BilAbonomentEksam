package com.example.bilabonomenteksam.Model;

public class RentalAgreementsModel {

  private int frameNumber;

  private int id;
  private String name;
  private String email;
  private int phonenumber;
  private String rentalPeriod;
  private int price;

  public RentalAgreementsModel(int frameNumber, int id, String name, String email, int phonenumber, String rentalPeriod, int price) {
    this.frameNumber = frameNumber;
    this.id = id;
    this.name = name;
    this.email = email;
    this.phonenumber = phonenumber;
    this.rentalPeriod = rentalPeriod;
    this.price = price;
  }

  public RentalAgreementsModel(int frameNumber, int id, String name, String address, String email, int phonenumber, String rentalagrement, double price) {
  }

  public int getFrameNumber() {
    return frameNumber;
  }

  public void setFrameNumber(int frameNumber) {
    this.frameNumber = frameNumber;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getPhonenumber() {
    return phonenumber;
  }

  public void setPhonenumber(int phonenumber) {
    this.phonenumber = phonenumber;
  }

  public String getRentalPeriod() {
    return rentalPeriod;
  }

  public void setRentalPeriod(String rentalPeriod) {
    this.rentalPeriod = rentalPeriod;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "RentalAgreementsModel{" +
        "frameNumber=" + frameNumber +
        ", id=" + id +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", phonenumber=" + phonenumber +
        ", rentalPeriod='" + rentalPeriod + '\'' +
        ", price=" + price +
        '}';
  }
}
