package com.example.bilabonomenteksam.Service;

import com.example.bilabonomenteksam.Controller.ArgumentsController2;
import com.example.bilabonomenteksam.Model.DamageReportModel;
import com.example.bilabonomenteksam.Repository.DamageReportRepo;
import org.springframework.beans.factory.wiring.ClassNameBeanWiringInfoResolver;
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

  class MyClass{
    int my = 4;
    MyClass(int myi)
    {
      my=myi;
    }
  }



  public MyClass myMethod()
  {
    return new MyClass(7);
  }

  public void usingmyclass()
  {
    MyClass mynewclass = myMethod();
  }

}

//  Date(classname)||.valueOf(methodname)||(damageReq(classname)||.getParameter(methodname)||("startDate"(Typeínput)));
//    ClassName.Methodname1(ClassName.Methodname2(input)); -> Classname.Mehodname1(input); -isinput> Classname.Methodname2(input2); ---- hvad er typen på damageReq?
//    damageRepo.createDamageReport(damageReportModel);
//
//
//public int asdjhl(){
//    int myint;
//    }
//public String alskdf(){
//    new String(); -> instantiate..
//    }