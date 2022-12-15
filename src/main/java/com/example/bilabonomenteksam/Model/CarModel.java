package com.example.bilabonomenteksam.Model;

//Anders og Jon

public class CarModel {

  private int vehicleNumber;
  private int frameNumber; //frameNumber
  private String make; //make
  private String model;
  private int equipmentLevel; //equipmentLevel
  private double steelPrice; // steelPrice
  private double reg_Charge; //reg_Charge
  private double co2_Emmission; //co2_Emmission
  private String status;


    public CarModel(int vehicleNumber, int frameNumber, String make, String model, int equipmentLevel, double steelPrice, double reg_Charge, double co2_Emmission, String status) {
    this.vehicleNumber = vehicleNumber;
    this.frameNumber = frameNumber;
    this.make = make;
    this.model = model;
    this.equipmentLevel = equipmentLevel;
    this.steelPrice = steelPrice;
    this.reg_Charge = reg_Charge;
    this.co2_Emmission = co2_Emmission;
    this.status = status;
  }

  public int getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehiclenumber(int vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public int getFrameNumber() {
    return frameNumber;
  }

  public void setFrameNumber(int frameNumber) {
    this.frameNumber = frameNumber;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String mærke) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getEquipmentLevel() {
    return equipmentLevel;
  }

  public void setEquipmentLevel(int equipmentLevel) {
    this.equipmentLevel = equipmentLevel;
  }

  public double getSteelPrice() {
    return steelPrice;
  }

  public void setSteelPrice(double steelPrice) {
    steelPrice = steelPrice;
  }

  public double getReg_Charge() {
    return reg_Charge;
  }

  public void setReg_Charge(double reg_Charge) {
    this.reg_Charge = reg_Charge;
  }

  public double getCo2_Emmission() {
    return co2_Emmission;
  }

  public void setCo2_Emmission(double co2_Emmission) {
    this.co2_Emmission = co2_Emmission;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "BilModel{" +
        "vehicleNumber=" + vehicleNumber +
        ", stelnummer=" + frameNumber +
        ", mærke='" + make + '\'' +
        ", model='" + model + '\'' +
        ", udstyrsniveau=" + equipmentLevel +
        ", Stålpris=" + steelPrice +
        ", reg_afgift=" + reg_Charge +
        ", co2_udledning=" + co2_Emmission +
        ", status=" + status +
        '}';
  }
}
