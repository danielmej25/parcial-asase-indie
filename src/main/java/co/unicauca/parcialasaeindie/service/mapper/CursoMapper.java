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
public abstract class CursoMapper {

    public abstract CursoDTO entityToDto(Curso entity);

    public abstract Curso dtoToEntity(CursoDTO dto);

    public abstract List<CursoDTO> entityListToDtoList(List<Curso> entityList);

    @Mapping(target = "cursos", ignore = true)
    @Mapping(target = "docentes", ignore = true)
    public abstract AsignaturaDTO asignaturaToAsignaturaDTO(Asignatura asignatura);
}
