package lk.java.academy.example.api.controller;

import lk.java.academy.example.api.model.AppointmentBody;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apointment")
public class ApointmentController {

      private ApoinmentServices appoinmentServices;

    @GetMapping("/getApointment")
    public String getApointment(){
        return "hello appointment";
    }

    @PostMapping("/saveAppointment")
    public AppointmentBody saveAppointment(@RequestBody AppointmentBody appointmentBody){
        return appoinmentServices.saveAppointment(appointmentBody);
    }
}
