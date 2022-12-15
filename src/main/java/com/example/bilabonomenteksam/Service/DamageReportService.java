package com.example.bilabonomenteksam.Service;

import com.example.bilabonomenteksam.Model.DamageReportModel;
import com.example.bilabonomenteksam.Repository.DamageReportRepo;
import org.springframework.web.context.request.WebRequest;


import java.sql.Date;
import java.util.List;

//Anders og Jon

public class DamageReportService {

  public DamageReportRepo damageRepo = new DamageReportRepo();


  public List<DamageReportModel> getAllDamageReport() {
    return damageRepo.getAllDamageReports();
  }

  public DamageReportModel GetDamageReportModel(int damageId) {
    return damageRepo.getDamageReportModel(damageId);
  }

  public void createDamageReport(WebRequest damageReq) {


    DamageReportModel damageReportModel = new DamageReportModel(Date.valueOf(damageReq.getParameter("Date")),
        Integer.parseInt(damageReq.getParameter("damageId")),
        damageReq.getParameter("damageReportDescription"),
        damageReq.getParameter("damageTitle"),
        Double.parseDouble(damageReq.getParameter("damagePrice")),
        Integer.parseInt(damageReq.getParameter("vehicleNumber")),
        Double.parseDouble(damageReq.getParameter("kmTraveledOverLimit")),
        Double.parseDouble(damageReq.getParameter("totalDamageCost")));


    damageRepo.createDamageReport(damageReportModel);


  }

}