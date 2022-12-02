package co.unicauca.parcialasaeindie.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
@Entity
@Table(name = "direccion")
@Getter
@Setter
public class Direccion{
    @Id
    @Column(name = "id_persona")
    private int id;

    @MapsId
    @OneToOne
    @JoinColumn(name = "id_persona")
    private Estudiante estudiante;

    @Column(length = 30, nullable = false)
    private String direccionResidencia;

    @Column(length = 30, nullable = false)
    private String ciudad;

    @Column(length = 30, nullable = false)
    private String pais;
}
