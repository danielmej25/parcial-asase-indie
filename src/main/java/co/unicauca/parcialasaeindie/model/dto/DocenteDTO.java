package co.unicauca.parcialasaeindie.model.dto;


import lombok.Data;

import java.util.List;

@Data
public class DocenteDTO extends PersonaDTO{
    private String universidad;
    private String tipoDocente;
    private float salario;
    private List<AsignaturaDTO> asignaturas;
}
