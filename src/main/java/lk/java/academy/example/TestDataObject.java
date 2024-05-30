package lk.java.academy.example;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name= "Employee")

public class TestDataObject{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    private String name;

    public String getName() {
        return name;
    }

}
