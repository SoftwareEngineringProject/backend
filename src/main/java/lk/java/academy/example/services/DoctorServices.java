package lk.java.academy.example.services;

import lk.java.academy.example.model.Doctor;
import lk.java.academy.example.model.dao.ApointmentDAO;
import lk.java.academy.example.model.dao.DoctorDAO;

import java.util.List;

public class DoctorServices {
    private final DoctorDAO doctorDAO;

    public  DoctorServices(DoctorDAO doctorDAO){
        this.doctorDAO = doctorDAO;

    }
    public List<Doctor> getDoctor(){
        return doctorDAO.findAll();



        public DoctorDAO saveAppointment(DoctorDAO doctortDAO){
            doctorDAO.save(DoctorDAO);
        }


    }}
