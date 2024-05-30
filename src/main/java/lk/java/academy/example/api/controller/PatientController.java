package lk.java.academy.example.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/patient")
public class PatientController {

    @GetMapping("/getPatient")
    public String getPatient(@RequestBody String name){
        return "hello"+ name;
    }





}
