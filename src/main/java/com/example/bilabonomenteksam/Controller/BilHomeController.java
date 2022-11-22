package com.example.bilabonomenteksam.Controller;

import com.example.bilabonomenteksam.Model.BilModel;
import com.example.bilabonomenteksam.Repository.Carliste;
import com.example.bilabonomenteksam.Service.BilService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class BilHomeController {


  private BilService service = new BilService();


  @GetMapping("/")
  public String index() {
    return"index";
  }
  @GetMapping("/udvalg")
  public String udvalg(){
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

  @PostMapping("/udvalg")
  public String createBilList(WebRequest payload) {
    service.bilListe(payload);


    return ("redirect:/");

  }

}


