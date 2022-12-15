package com.example.bilabonomenteksam.Controller;

import com.example.bilabonomenteksam.Model.RentalAgreementsModel;
import com.example.bilabonomenteksam.Service.RentalAgreementsService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

//Anders og Jon

@RestController
public class AgreementsController {


  RentalAgreementsService service2 = new RentalAgreementsService();



  @GetMapping("/addtoaftaler")
  public List<RentalAgreementsModel> addToAgreements(){
      return service2.getAllCarAgreements();
  }

    @GetMapping("aftale")
    public RentalAgreementsModel getrentalagreement (@RequestParam int vehicleNumber){
      return service2.GetRentalAgreementsModel(vehicleNumber);
    }
}
