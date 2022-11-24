package com.example.bilabonomenteksam.Model;

public class BilModel {

  private int vehicleNumber;
  private int frameNumber; //frameNumber
  private String make; //make
  private String model;
  private int udstyrsniveau;
  private double Stålpris;
  private double reg_afgift;
  private double co2_udledning;


    public BilModel(int vehicleNumber, int frameNumber, String make, String model, int equipmentLevel, double steelPrice, double reg_Charge, double co2_Emmission) {
    this.vehicleNumber = vehicleNumber;
    this.frameNumber = frameNumber;
    this.make = make;
    this.model = model;
    this.udstyrsniveau = udstyrsniveau;
    this.Stålpris = stålpris;
    this.reg_afgift = reg_afgift;
    this.co2_udledning = co2_udledning;
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

  public double getStålpris() {
    return Stålpris;
  }

  public void setStålpris(double stålpris) {
    Stålpris = stålpris;
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

  @Override
  public String toString() {
    return "BilModel{" +
        "vehicleNumber=" + vehicleNumber +
        ", stelnummer=" + frameNumber +
        ", mærke='" + make + '\'' +
        ", model='" + model + '\'' +
        ", udstyrsniveau=" + udstyrsniveau +
        ", Stålpris=" + Stålpris +
        ", reg_afgift=" + reg_afgift +
        ", co2_udledning=" + co2_udledning +
        '}';
  }
}
