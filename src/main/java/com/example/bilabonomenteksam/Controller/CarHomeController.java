package com.example.bilabonomenteksam.Controller;

import com.example.bilabonomenteksam.Model.CarModel;
import com.example.bilabonomenteksam.Repository.CarlistRepo;
import com.example.bilabonomenteksam.Repository.IRepo;
import com.example.bilabonomenteksam.Repository.RentalAgreementRepo;
import com.example.bilabonomenteksam.Service.CarPriceCalculator;
import com.example.bilabonomenteksam.Service.DamageReportService;
import com.example.bilabonomenteksam.Service.RentalAgreementsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Anders og Jon

@Controller
public class CarHomeController {

  private final IRepo<CarModel> carRepo = new CarlistRepo();
  RentalAgreementsService service= new RentalAgreementsService();
  RentalAgreementRepo repoagreement = new RentalAgreementRepo();
  DamageReportService damageservice = new DamageReportService();
  CarPriceCalculator carPrice = new CarPriceCalculator();


  @GetMapping("/")
  public String index() {
    return"index";
  }
  @GetMapping("/udvalg")
  public String alleBiler(Model model){
    model.addAttribute("udvalgt", carRepo.getAllCar());
    return "udvalg";
  }

  @GetMapping("/ListOfAgreements")
  public String allAgreements(Model model){
    model.addAttribute("Aftaler", service.getAllCarAgreements());
    model.addAttribute("sum", carPrice.CalculatePrice(repoagreement.getallCaragreements()));
    return "ListOfAgreements";
  }

  @GetMapping("/ListOfDamageReports")
  public String allDamage(Model model){
    model.addAttribute("DamageReport", damageservice.getAllDamageReport());
  return "ListOfDamageReports";
  }



 }





