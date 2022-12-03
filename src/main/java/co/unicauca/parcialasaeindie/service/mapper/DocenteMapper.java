package co.unicauca.parcialasaeindie.service.mapper;

import co.unicauca.parcialasaeindie.model.Asignatura;
import co.unicauca.parcialasaeindie.model.Docente;
import co.unicauca.parcialasaeindie.model.dto.AsignaturaDTO;
import co.unicauca.parcialasaeindie.model.dto.DocenteDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface DocenteMapper {
    DocenteDTO entityToDto(Docente entity);

    Docente dtoToEntity(DocenteDTO dto);

    List<DocenteDTO> entityListToDtoList(List<Docente> entityList);

    @Mapping(target = "docentes", ignore = true)
    AsignaturaDTO asignaturaToAsignaturaDTO(Asignatura asignatura);
}
