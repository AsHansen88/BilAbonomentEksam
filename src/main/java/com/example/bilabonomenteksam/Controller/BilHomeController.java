package com.example.bilabonomenteksam.Controller;

import com.example.bilabonomenteksam.Model.BilModel;
import com.example.bilabonomenteksam.Repository.Carliste;
import com.example.bilabonomenteksam.Repository.IRepo;
import com.example.bilabonomenteksam.Service.BilService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class BilHomeController {

  private final IRepo<BilModel> Bilrepo = new Carliste();

  @GetMapping("/")
  public String index() {
    return"index";
  }
  @GetMapping("/udvalg")
  public String alleBiler(BilModel bilmodel){
    Bilrepo.getAllBil();
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
/*
  @PostMapping("/udvalg")
  public String createBilList(WebRequest payload) {
    service.bilListe(payload);


    return ("redirect:/");

  }

 */

}


