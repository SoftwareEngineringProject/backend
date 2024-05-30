package lk.java.academy.example.services;

import lk.java.academy.example.model.Patient;
import lk.java.academy.example.model.dao.ApointmentDAO;
import lk.java.academy.example.model.dao.PatientDAO;

import java.util.List;

public class PatientServices {


    private final PatientDAO patientDAO;

    public  PatientServices(PatientDAO patientDAO){ this.patientDAO=patientDAO;}
    public List<Patient> getPatient(){
        return patientDAO.findAll();




}}
