package com.example.bilabonomenteksam.Service;

import com.example.bilabonomenteksam.Model.RentalAgreementsModel;
import com.example.bilabonomenteksam.Repository.RentalAgreementRepo;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

public class RentalAgreementsService {
  public RentalAgreementRepo repo = new RentalAgreementRepo();

  public List<RentalAgreementsModel> getAllCarAgreements(){
    return repo.getallCaragreements();
  }

  public void createRentalAgreement(WebRequest req){

    RentalAgreementsModel rentalAgreementsModel = new RentalAgreementsModel(req.getParameter("vehicleNumber"),
        req.getParameter("id"),
        req.getParameter("name"),
        req.getParameter("email"),
        req.getParameter("phonenumber"),
        req.getParameter("address"),
        req.getParameter("rentalPeriod"),
        req.getParameter("price"),
        req.getParameter(""));

    repo.createRentalAgreement(rentalAgreementsModel);

  }

}
