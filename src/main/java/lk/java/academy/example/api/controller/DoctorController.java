package lk.java.academy.example.api.controller;

import lk.java.academy.example.api.model.AppointmentBody;
import lk.java.academy.example.services.DoctorServices;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/doctor")

public class DoctorController {

    private DoctorServices doctorServices;
    @GetMapping("/getDoctor")
    public String getDoctor(){
        return "hello";
    }

    @PostMapping("/saveAppointment")
    public DoctorBody saveDoctor(@RequestBody DoctorBody Body){
        return DoctorServices.saveDoctor(appointmentBody);
    }



}
