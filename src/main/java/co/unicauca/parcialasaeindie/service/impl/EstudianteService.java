package co.unicauca.parcialasaeindie.service.impl;

import co.unicauca.parcialasaeindie.model.Estudiante;
import co.unicauca.parcialasaeindie.model.dto.EstudianteDTO;
import co.unicauca.parcialasaeindie.repository.EstudianteRepository;
import co.unicauca.parcialasaeindie.service.IEstudianteService;
import co.unicauca.parcialasaeindie.service.mapper.EstudianteMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EstudianteService implements IEstudianteService {

    private final EstudianteRepository estudianteRepository;
    private final EstudianteMapper estudianteMapper;

    @Transactional
    @Override
    public EstudianteDTO save(EstudianteDTO estudianteDTO) {
        Estudiante estudiante = estudianteMapper.dtoToEntity(estudianteDTO);
        return estudianteMapper.entityToDto(estudianteRepository.save(estudiante));
    }

    @Override
    public EstudianteDTO findById(int id) {
        return estudianteMapper.entityToDto(estudianteRepository.findById(id).orElse(null));
    }

    @Override
    public List<EstudianteDTO> findAll() {
        return estudianteMapper.entityListToDtoList(estudianteRepository.findAll());
    }
}
