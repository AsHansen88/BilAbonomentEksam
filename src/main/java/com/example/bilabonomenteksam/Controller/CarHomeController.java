package com.example.bilabonomenteksam.Controller;

import com.example.bilabonomenteksam.Model.CarModel;
import com.example.bilabonomenteksam.Repository.CarlistRepo;
import com.example.bilabonomenteksam.Repository.IRepo;
import com.example.bilabonomenteksam.Service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarHomeController {

  private final IRepo<CarModel> CarRepo = new CarlistRepo();
  CarService car= new CarService();


  @GetMapping("/")
  public String index() {
    return"index";
  }
  @GetMapping("/udvalg")
  public String alleBiler(Model model){
    model.addAttribute("udvalgt", CarRepo.getAllCar());
    return "udvalg";
  }
  @GetMapping("/aftaler")
  public String aftaler(){
    return "aftaler";
        }

        @GetMapping("/tilbagelevering")
        public String tilbagelevering(){
    return "tilbagelevering";
        }


    //return ("redirect:/");
 }





