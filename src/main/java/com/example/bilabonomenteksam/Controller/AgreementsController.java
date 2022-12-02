package com.example.bilabonomenteksam.Controller;

import com.example.bilabonomenteksam.Model.RentalAgreementsModel;
import com.example.bilabonomenteksam.Service.RentalAgreementsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@RestController
public class AgreementsController {


  RentalAgreementsService service2 = new RentalAgreementsService();


  @GetMapping("/addtoaftaler")
  public List<RentalAgreementsModel> addtoaftaler(){
   return service2.getAllCarAgreements();
  }

    @GetMapping("aftale")
    public RentalAgreementsModel getrentalagreement (@RequestParam int vehicleNumber){
      return service2.GetRentalAgreementsModel(vehicleNumber);
    }
/*
   @GetMapping("/aftaler")
  public String rentalAgreements(){
    service.getAllCarAgreements();

    return "aftaler";
  }
/*
  @PostMapping("/aftaler")
  public String aftaler(WebRequest payload) {
    service2.createRentalAgreement(payload);
    return "aftaler";
  }
*/
}
