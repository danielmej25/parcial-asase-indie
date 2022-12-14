package co.unicauca.parcialasaeindie.service.mapper;

import co.unicauca.parcialasaeindie.model.Asignatura;
import co.unicauca.parcialasaeindie.model.Curso;
import co.unicauca.parcialasaeindie.model.dto.AsignaturaDTO;
import co.unicauca.parcialasaeindie.model.dto.CursoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface CursoMapper {

    CursoDTO entityToDto(Curso entity);

    Curso dtoToEntity(CursoDTO dto);

    List<CursoDTO> entityListToDtoList(List<Curso> entityList);

    @Mapping(target = "cursos", ignore = true)
    @Mapping(target = "docentes", ignore = true)
    AsignaturaDTO asignaturaToAsignaturaDTO(Asignatura asignatura);
}
