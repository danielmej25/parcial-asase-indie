package co.unicauca.parcialasaeindie.model.dto;


import lombok.Data;

@Data
public class TelefonoDTO {

    private int id;

    private String tipo;

    private String numero;
    private EstudianteDTO estudiante;
}
