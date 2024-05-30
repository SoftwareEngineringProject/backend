package lk.java.academy.example.services;


import lk.java.academy.example.model.Apointment;
import lk.java.academy.example.model.dao.ApointmentDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class  ApoinmentServices {



    private final ApointmentDAO apointmentDAO;

    public  ApoinmentServices(ApointmentDAO apointmentDAO){
        this.apointmentDAO = apointmentDAO;
    }
    public List<Apointment> getApointment(){
        return apointmentDAO.findAll();
    }

    public ApointmentDAO saveAppointment(ApointmentDAO apointmentDAO){
        return apointmentDAO.save(apointmentDAO);
    }

}
