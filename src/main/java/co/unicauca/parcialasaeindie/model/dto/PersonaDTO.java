package co.unicauca.parcialasaeindie.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class PersonaDTO {
    private int id;

    private String noId;
    private String tipoIdentificacion;
    private String nombres;
    private String apellidos;
}
