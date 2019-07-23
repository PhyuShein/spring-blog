package demo.example.blogspring.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    private String interested;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Author() {
    }

    public Author(String name, LocalDate dateOfBirth, String interested, Gender gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.interested = interested;
        this.gender = gender;
    }
}
