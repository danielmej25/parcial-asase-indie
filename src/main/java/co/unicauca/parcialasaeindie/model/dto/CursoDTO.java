package co.unicauca.parcialasaeindie.model.dto;

import lombok.Data;

@Data
public class CursoDTO {

    private int id;
    private String nombre;
    private int periodo;
    private AsignaturaDTO asignatura;
}
