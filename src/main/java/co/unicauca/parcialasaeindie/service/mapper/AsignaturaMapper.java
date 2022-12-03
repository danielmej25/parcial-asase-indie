package co.unicauca.parcialasaeindie.service.mapper;

import co.unicauca.parcialasaeindie.model.Asignatura;
import co.unicauca.parcialasaeindie.model.dto.AsignaturaDTO;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public abstract class AsignaturaMapper {

    @BeforeMapping
    protected void flushEntity(Asignatura asignatura) {
        if(asignatura != null){
            if(asignatura.getCursos() != null){
                asignatura.getCursos().forEach(curso -> curso.setAsignatura(null));
            }
        }
    }

    public abstract AsignaturaDTO entityToDto(Asignatura entity);

    public abstract Asignatura dtoToEntity(AsignaturaDTO dto);

    public abstract List<AsignaturaDTO> entityToDto(List<Asignatura> entityList);
}


