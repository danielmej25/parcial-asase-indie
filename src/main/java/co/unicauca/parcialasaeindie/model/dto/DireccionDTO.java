package co.unicauca.parcialasaeindie.model.dto;

import lombok.Data;
@Data
public class DireccionDTO {
    private int id;
    private EstudianteDTO estudiante;
    private String direccionResidencia;

    private String ciudad;

    private String pais;
}
