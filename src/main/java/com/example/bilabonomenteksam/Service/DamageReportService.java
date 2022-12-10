package com.example.bilabonomenteksam.Service;

import com.example.bilabonomenteksam.Controller.ArgumentsController2;
import com.example.bilabonomenteksam.Model.DamageReportModel;
import com.example.bilabonomenteksam.Repository.DamageReportRepo;
import org.springframework.web.context.request.WebRequest;

import java.lang.reflect.Type;
import java.security.PublicKey;
import java.sql.Date;
import java.util.List;


public class DamageReportService {

    public DamageReportRepo damageRepo = new DamageReportRepo();


    public List<DamageReportModel> getAllDamageReport(){
    return damageRepo.getAllDamageReports();
  }

   public DamageReportModel GetDamageReportModel(int damageId){
    return damageRepo.getDamageReportModel(damageId);
  }

   public void createDamageReport(WebRequest damageReq){

     System.out.printf("\n Reached Cowabunga: %s", damageReq.getParameter("startDate"));
     System.out.printf("\n Reached Cowabunga2: %s", damageReq.getParameter("endDate"));
//     try {
//       System.in.read();
//     }catch (Exception e)
//     {
//       return;
//     }


    DamageReportModel damageReportModel = new DamageReportModel(Date.valueOf(damageReq.getParameter("startDate")),
        Date.valueOf(damageReq.getParameter("endDate")),
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
