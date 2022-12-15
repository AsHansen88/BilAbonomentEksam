package com.example.bilabonomenteksam.Controller;

import com.example.bilabonomenteksam.Service.RentalAgreementsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.sql.Date;

//Anders og Jon

@Controller
public class ArgumentsController2 {

  private RentalAgreementsService service2 = new RentalAgreementsService();


  @GetMapping("/aftaler")
  public String agreements(){
    return "aftaler";
  }

  @PostMapping("/aftaler")
  public String agreements(WebRequest payload) {
    service2.createRentalAgreement(payload);
    Date startDate = Date.valueOf(payload.getParameter("startDate"));
    Date endDate = Date.valueOf(payload.getParameter("endDate"));

    return "ListOfAgreements";
  }

}
