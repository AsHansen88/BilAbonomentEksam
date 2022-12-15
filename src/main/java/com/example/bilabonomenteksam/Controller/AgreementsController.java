package com.example.bilabonomenteksam.Controller;

import com.example.bilabonomenteksam.Model.RentalAgreementsModel;
import com.example.bilabonomenteksam.Repository.RentalAgreementRepo;
import com.example.bilabonomenteksam.Service.CarPriceCalculator;
import com.example.bilabonomenteksam.Service.RentalAgreementsService;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AgreementsController {


  RentalAgreementsService service2 = new RentalAgreementsService();
  RentalAgreementRepo RentalRepo = new RentalAgreementRepo();
  List<RentalAgreementsModel> basketofCars = new ArrayList<>();
  CarPriceCalculator calculatorService = new CarPriceCalculator();


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
