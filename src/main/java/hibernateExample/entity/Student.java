package hibernateExample.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 32, nullable = false)
    private String name;

    @Column(name = "mark", nullable = false)
    private int mark;


    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}
