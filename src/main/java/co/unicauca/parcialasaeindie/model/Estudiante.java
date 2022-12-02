package co.unicauca.parcialasaeindie.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "estudiante")
@Getter
@Setter
public class Estudiante extends Persona{
    @Column(nullable = false)
    private Date fechaIngreso;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "estudiante")
    private List<Telefono> telefonos;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "idEstudiante")
    private Direccion direccion;
}