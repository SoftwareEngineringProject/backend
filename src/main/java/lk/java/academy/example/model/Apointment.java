package lk.java.academy.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name= "Apointment")
@Getter
@Setter
@NoArgsConstructor
public class Apointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateTime;
    private String appointMenType;
    private String appointMenDesc;

    @ManyToOne
    private Patient patient;


}
