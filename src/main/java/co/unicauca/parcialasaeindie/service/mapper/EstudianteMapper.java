package co.unicauca.parcialasaeindie.service.mapper;

import co.unicauca.parcialasaeindie.model.Direccion;
import co.unicauca.parcialasaeindie.model.Estudiante;
import co.unicauca.parcialasaeindie.model.Telefono;
import co.unicauca.parcialasaeindie.model.dto.DireccionDTO;
import co.unicauca.parcialasaeindie.model.dto.EstudianteDTO;
import co.unicauca.parcialasaeindie.model.dto.TelefonoDTO;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public abstract class EstudianteMapper {

    @AfterMapping
    protected void asignarEstudiante(@MappingTarget Estudiante estudiante) {
        if(estudiante.getDireccion() != null){
            estudiante.getDireccion().setEstudiante(estudiante);
        }
        if(estudiante.getTelefonos() != null){
            estudiante.getTelefonos().forEach(telefono -> telefono.setEstudiante(estudiante));
        }
    }

    @Mapping(target = "telefonos.estudiante",ignore = true)
    public abstract EstudianteDTO entityToDto(Estudiante entity);

    public abstract Estudiante dtoToEntity(EstudianteDTO dto);

    public abstract List<EstudianteDTO> entityListToDtoList(List<Estudiante> entityList);

    @Mapping(target = "estudiante", ignore = true)
    public abstract TelefonoDTO telefonoToTelefonoDTO(Telefono telefono);

    @Mapping(target = "estudiante", ignore = true)
    public abstract DireccionDTO direccionToDireccionDTO(Direccion direccion);

}
