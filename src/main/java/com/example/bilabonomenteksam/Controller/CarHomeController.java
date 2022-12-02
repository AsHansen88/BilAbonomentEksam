package com.example.bilabonomenteksam.Controller;

import com.example.bilabonomenteksam.Model.CarModel;
import com.example.bilabonomenteksam.Model.RentalAgreementsModel;
import com.example.bilabonomenteksam.Repository.CarlistRepo;
import com.example.bilabonomenteksam.Repository.IRepo;
import com.example.bilabonomenteksam.Repository.RentalAgreementRepo;
import com.example.bilabonomenteksam.Service.CarService;
import com.example.bilabonomenteksam.Service.DamageReportService;
import com.example.bilabonomenteksam.Service.RentalAgreementsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Controller
public class CarHomeController {

  private final IRepo<CarModel> CarRepo = new CarlistRepo();
  RentalAgreementsService service= new RentalAgreementsService();
  RentalAgreementRepo repoagreement = new RentalAgreementRepo();
  DamageReportService damageservice = new DamageReportService();


  @GetMapping("/")
  public String index() {
    return"index";
  }
  @GetMapping("/udvalg")
  public String alleBiler(Model model){
    model.addAttribute("udvalgt", CarRepo.getAllCar());
    return "udvalg";
  }

  /*
  @GetMapping("/tilbagelevering")
        public String tilbagelevering(){
    return "tilbagelevering";
        }
*/
  @GetMapping("/ListOfAgreements")
  public String alleAftaler(Model model){
    model.addAttribute("Aftaler", service.getAllCarAgreements());
    return "ListOfAgreements";
  }

  @GetMapping("/ListOfDamageReports")
  public String allDamage(Model model){
    model.addAttribute("DamageReport", damageservice.getAllDamageReport());
  return "ListOfDamageReports";
  }



    //return aftaler;
 }





