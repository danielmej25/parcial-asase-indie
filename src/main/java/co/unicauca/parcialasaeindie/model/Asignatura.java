package co.unicauca.parcialasaeindie.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "asignatura")
@Getter
@Setter
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asignatura")
    private int id;

    @Column(nullable = false)
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "asignatura")
    private List<Curso> cursos;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "asignaturas")
    private List<Docente> docentes;
}
