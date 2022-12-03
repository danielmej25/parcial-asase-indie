package co.unicauca.parcialasaeindie.service.impl;

import co.unicauca.parcialasaeindie.model.Asignatura;
import co.unicauca.parcialasaeindie.model.dto.AsignaturaDTO;
import co.unicauca.parcialasaeindie.repository.AsignaturaRepository;
import co.unicauca.parcialasaeindie.service.IAsignaturaService;
import co.unicauca.parcialasaeindie.service.mapper.AsignaturaMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AsignaturaService implements IAsignaturaService {
    private final AsignaturaMapper asignaturaMapper;
    private final AsignaturaRepository asignaturaRepository;

    @Transactional
    @Override
    public AsignaturaDTO save(AsignaturaDTO asignaturaDTO) {
        if(asignaturaDTO.getDocentes() == null || asignaturaDTO.getDocentes().size() < 2 || asignaturaDTO.getCursos() == null){
            return null;
        }
        Asignatura asignatura = asignaturaMapper.dtoToEntity(asignaturaDTO);
        return asignaturaMapper.entityToDto(asignaturaRepository.save(asignatura));
    }
}
