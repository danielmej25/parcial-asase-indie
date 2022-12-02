package co.unicauca.parcialasaeindie.service.impl;

import co.unicauca.parcialasaeindie.model.Curso;
import co.unicauca.parcialasaeindie.model.dto.CursoDTO;
import co.unicauca.parcialasaeindie.repository.AsignaturaRepository;
import co.unicauca.parcialasaeindie.repository.CursoRepository;
import co.unicauca.parcialasaeindie.service.ICursoService;
import co.unicauca.parcialasaeindie.service.mapper.CursoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CursoService implements ICursoService {

    private final CursoRepository cursoRepository;
    private final AsignaturaRepository asignaturaRepository;
    private final CursoMapper cursoMapper;
    @Override
    public CursoDTO save(CursoDTO cursoDTO) {
        Curso curso = cursoMapper.dtoToEntity(cursoDTO);
        curso.setAsignatura(asignaturaRepository.findById(cursoDTO.getAsignatura().getId()).orElse(curso.getAsignatura()));
        return cursoMapper.entityToDto(cursoRepository.save(curso));
    }
}
