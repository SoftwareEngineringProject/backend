package lk.java.academy.example.model.dao;

import java.time.LocalDateTime;
import java.util.Optional;

import lk.java.academy.example.model.Apointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApointmentDAO extends JpaRepository<Apointment, Long> {
 Optional<Apointment> findByDateTime(LocalDateTime dateTime);
}

public interface ApointmentDAO extends JpaRepository<Apointment, Long> {
 Optional<Apointment> findByDateTime(LocalDateTime dateTime);
}