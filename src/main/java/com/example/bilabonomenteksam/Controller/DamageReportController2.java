package com.example.bilabonomenteksam.Controller;

import com.example.bilabonomenteksam.Model.DamageReportModel;
import com.example.bilabonomenteksam.Service.DamageReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

//Anders og Jon

@RestController
public class DamageReportController2 {

  DamageReportService damageReportService = new DamageReportService();


  @GetMapping("/addtodamage")
  public List<DamageReportModel> addtodamage(){

    return damageReportService.getAllDamageReport();
  }
  @GetMapping("damage")
  public DamageReportModel getDamageReport(@RequestParam int damageId) {
    return damageReportService.GetDamageReportModel(damageId);

  }


}


