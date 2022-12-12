package com.example.bilabonomenteksam.Model;

import java.sql.Date;

public class DamageReportModel {

private int damageId;
private String damageReportDescription;
private String damageTitle;
private double damagePrice;
private int vehicleNumber;
private double kmTraveledOverLimit;
private double totalDamageCost;
private Date date;


  public DamageReportModel(Date date, int damageId, String damageReportDescription, String damageTitle, double damagePrice, int vehicleNumber, double kmTraveledOverLimit, double totalDamageCost) {


    this.date = date;
    this.damageId = damageId;
    this.damageReportDescription = damageReportDescription;
    this.damageTitle = damageTitle;
    this.damagePrice = damagePrice;
    this.vehicleNumber = vehicleNumber;
    this.kmTraveledOverLimit = kmTraveledOverLimit;
    this.totalDamageCost = totalDamageCost;

  }

  public int getDamageId() {
    return damageId;
  }

  public void setDamageId(int damageId) {
    this.damageId = damageId;
  }

  public String getDamageReportDescription() {
    return damageReportDescription;
  }

  public void setDamageReportDescription(String damageReportDescription) {
    this.damageReportDescription = damageReportDescription;
  }

  public String getDamageTitle() {
    return damageTitle;
  }

  public void setDamageTitle(String damageTitle) {
    this.damageTitle = damageTitle;
  }

  public double getDamagePrice() {
    return damagePrice;
  }

  public void setDamagePrice(double damagePrice) {
    this.damagePrice = damagePrice;
  }

  public int getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehicleNumber(int vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public double getKmTraveledOverLimit() {
    return kmTraveledOverLimit;
  }

  public void setKmTraveledOverLimit(double kmTraveledOverLimit) {
    this.kmTraveledOverLimit = kmTraveledOverLimit;
  }

  public double getTotalDamageCost() {
    return totalDamageCost;
  }

  public void setTotalDamageCost(double totalDamageCost) {
    this.totalDamageCost = totalDamageCost;
  }

  public Date getDate() {
    return date;
  }

  @Override
  public String toString() {
    return "date" + date + "DamageReportModel{" +
        "damageId='" + damageId +
        "damageReportDescription='" + damageReportDescription + '\'' +
        ", damageTitle='" + damageTitle + '\'' +
        ", damagePrice=" + damagePrice +
        ", vehicleNumber=" + vehicleNumber +
        ", kmTraveledOverLimit=" + kmTraveledOverLimit +
        ", totalDamageCost=" + totalDamageCost +
        '}';
  }
}
