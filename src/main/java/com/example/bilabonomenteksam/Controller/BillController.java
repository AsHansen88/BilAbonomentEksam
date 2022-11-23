package com.example.bilabonomenteksam.Controller;

import com.example.bilabonomenteksam.Model.BilModel;
import com.example.bilabonomenteksam.Repository.Carliste;
import com.example.bilabonomenteksam.Service.BilService;
import com.example.bilabonomenteksam.Service.CarListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillController {
BilService service = new BilService();

}
