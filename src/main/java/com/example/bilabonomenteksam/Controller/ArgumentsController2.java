package com.example.bilabonomenteksam.Controller;

import com.example.bilabonomenteksam.Service.RentalAgreementsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class ArgumentsController2 {

  private RentalAgreementsService service2 = new RentalAgreementsService();

  @GetMapping("/aftaler")
  public String aftaler(){
    return "aftaler";
  }

  @PostMapping("/aftaler")
  public String aftaler(WebRequest payload) {
    service2.createRentalAgreement(payload);
    return "ListOfAgreements";
  }

}
