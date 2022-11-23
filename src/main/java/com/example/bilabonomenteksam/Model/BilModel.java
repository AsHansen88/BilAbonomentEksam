package com.example.bilabonomenteksam.Model;

public class BilModel {

  private int vognnummer;
  private int stelnummer;
  private String mærke;
  private String model;
  private int udstyrsniveau;
  private double Stålpris;
  private double reg_afgift;
  private double co2_udledning;


    public BilModel(int vognnummer, int stelnummer, String mærke, String model, int udstyrsniveau, double stålpris, double reg_afgift, double co2_udledning) {
    this.vognnummer = vognnummer;
    this.stelnummer = stelnummer;
    this.mærke = mærke;
    this.model = model;
    this.udstyrsniveau = udstyrsniveau;
    this.Stålpris = stålpris;
    this.reg_afgift = reg_afgift;
    this.co2_udledning = co2_udledning;
  }


  public int getVognnummer() {
    return vognnummer;
  }

  public void setVognnummer(int vognnummer) {
    this.vognnummer = vognnummer;
  }

  public int getStelnummer() {
    return stelnummer;
  }

  public void setStelnummer(int stelnummer) {
    this.stelnummer = stelnummer;
  }

  public String getMærke() {
    return mærke;
  }

  public void setMærke(String mærke) {
    this.mærke = mærke;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getUdstyrsniveau() {
    return udstyrsniveau;
  }

  public void setUdstyrsniveau(int udstyrsniveau) {
    this.udstyrsniveau = udstyrsniveau;
  }

  public double getStålpris() {
    return Stålpris;
  }

  public void setStålpris(double stålpris) {
    Stålpris = stålpris;
  }

  public double getReg_afgift() {
    return reg_afgift;
  }

  public void setReg_afgift(double reg_afgift) {
    this.reg_afgift = reg_afgift;
  }

  public double getCo2_udledning() {
    return co2_udledning;
  }

  public void setCo2_udledning(double co2_udledning) {
    this.co2_udledning = co2_udledning;
  }

  @Override
  public String toString() {
    return "BilModel{" +
        "vognnummer=" + vognnummer +
        ", stelnummer=" + stelnummer +
        ", mærke='" + mærke + '\'' +
        ", model='" + model + '\'' +
        ", udstyrsniveau=" + udstyrsniveau +
        ", Stålpris=" + Stålpris +
        ", reg_afgift=" + reg_afgift +
        ", co2_udledning=" + co2_udledning +
        '}';
  }
}
