package com.example.bilabonomenteksam.Service;

import com.example.bilabonomenteksam.Model.RentalAgreementsModel;
import com.example.bilabonomenteksam.Repository.RentalAgreementRepo;
import org.springframework.web.context.request.WebRequest;

import java.sql.Date;
import java.util.List;

public class RentalAgreementsService {
  public RentalAgreementRepo repo = new RentalAgreementRepo();

  public List<RentalAgreementsModel> getAllCarAgreements(){
    return repo.getallCaragreements();
  }

  public RentalAgreementsModel GetRentalAgreementsModel(int vehicleNumber){
    return repo.GetRentalAgreementsModel(vehicleNumber);
  }

  public void createRentalAgreement(WebRequest req){

    RentalAgreementsModel rentalAgreementsModel = new RentalAgreementsModel(Date.valueOf(req.getParameter("startDate")),
        Date.valueOf(req.getParameter("endDate")),
        Integer.parseInt(req.getParameter("vehicleNumber")),
        req.getParameter("name"),
        req.getParameter("email"),
        req.getParameter("address"),
        Integer.parseInt(req.getParameter("phonenumber")),
        req.getParameter("rentalPeriod"),
        Double.parseDouble(req.getParameter("price")));

    repo.createRentalAgreement(rentalAgreementsModel);

  }

}
