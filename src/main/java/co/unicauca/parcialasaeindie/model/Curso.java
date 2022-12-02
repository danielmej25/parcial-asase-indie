package co.unicauca.parcialasaeindie.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "curso")
@Getter
@Setter
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private int periodo;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_asignatura")
    @JsonIgnore
    private Asignatura asignatura;
}
