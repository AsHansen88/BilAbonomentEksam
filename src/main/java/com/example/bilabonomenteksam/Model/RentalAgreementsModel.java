package com.example.bilabonomenteksam.Model;

import java.sql.Date;

//Anders og Jon

public class RentalAgreementsModel {

  private int vehicleNumber;
  private int id;
  private String name;
  private String email;
  private int phonenumber;
  private String address;
  private String rentalPeriod;
  private double price;
  private Date startDate;
  private Date endDate;


  public RentalAgreementsModel(Date startDate, Date endDate, int vehicleNumber, String name, String address, String email, int phonenumber, String rentalPeriod, double price) {
    this.startDate = startDate;
    this.endDate = endDate;
    this.vehicleNumber = vehicleNumber;
    this.name = name;
    this.email = email;
    this.phonenumber = phonenumber;
    this.address = address;
    this.rentalPeriod = rentalPeriod;
    this.price = price;

  }

  public int getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehicleNumber(int frameNumber) {
    this.vehicleNumber = frameNumber;
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

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  @Override
  public String toString() {
    return "startDate" + startDate +
        "endDate" + endDate +
        "RentalAgreementsModel{" +
        "frameNumber=" + vehicleNumber +
        ", id=" + id +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", phonenumber=" + phonenumber +
        ", address=" + address +
        ", rentalPeriod='" + rentalPeriod + '\'' +
        ", price=" + price +
        '}';
  }
}
