package lk.java.academy.example.api.model;

import jakarta.persistence.ManyToOne;
import lk.java.academy.example.model.Patient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor

public class AppointmentBody {
    private LocalDateTime dateTime;
    private Patient patient;
}
