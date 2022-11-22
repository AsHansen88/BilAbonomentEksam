package com.example.bilabonomenteksam.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BilHomeController {

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

}


