package co.unicauca.parcialasaeindie.model.dto;

import lombok.Data;

import java.util.List;
@Data
public class AsignaturaDTO {
    private int id;
    private String nombre;
    private List<CursoDTO> cursos;
    private List<DocenteDTO> docentes;
}
