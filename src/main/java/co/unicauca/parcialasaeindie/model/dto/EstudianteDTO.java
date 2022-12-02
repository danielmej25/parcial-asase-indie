package co.unicauca.parcialasaeindie.model.dto;

import lombok.*;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteDTO extends PersonaDTO{
    private Date fechaIngreso;

    private List<TelefonoDTO> telefonos;

    private DireccionDTO direccion;
}
