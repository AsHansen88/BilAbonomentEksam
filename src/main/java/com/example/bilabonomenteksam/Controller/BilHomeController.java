package com.example.bilabonomenteksam.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class BilHomeController {

  @GetMapping("/")
  public String index() {
    return"index";
  }

}
