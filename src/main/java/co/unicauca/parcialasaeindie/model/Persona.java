package co.unicauca.parcialasaeindie.model;

import com.fasterxml.jackson.databind.JsonSerializable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer id;

    @Column(name = "no_identificacion", nullable = false)
    private String noId;

    @Column(nullable = false, length = 30)
    private String tipoIdentificacion;

    @Column(nullable = false, length = 30)
    private String nombres;

    @Column(nullable = false, length = 30)
    private String apellidos;
}
