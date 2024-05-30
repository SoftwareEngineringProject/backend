package lk.java.academy.example.model.dao;

import lk.java.academy.example.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface DoctorDAO extends JpaRepository<Doctor,Long> {



}
