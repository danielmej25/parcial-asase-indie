package co.unicauca.parcialasaeindie.service.impl;

import co.unicauca.parcialasaeindie.model.Asignatura;
import co.unicauca.parcialasaeindie.model.Docente;
import co.unicauca.parcialasaeindie.model.dto.AsignaturaDTO;
import co.unicauca.parcialasaeindie.repository.AsignaturaRepository;
import co.unicauca.parcialasaeindie.repository.DocenteRepository;
import co.unicauca.parcialasaeindie.service.IAsignaturaService;
import co.unicauca.parcialasaeindie.service.mapper.AsignaturaMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AsignaturaService implements IAsignaturaService {
    private final AsignaturaMapper asignaturaMapper;
    private final DocenteRepository docenteRepository;
    private final AsignaturaRepository asignaturaRepository;

    @Transactional
    @Override
    public AsignaturaDTO save(AsignaturaDTO asignaturaDTO) {
        if(asignaturaDTO.getDocentes() == null || asignaturaDTO.getDocentes().size() < 2 || asignaturaDTO.getCursos() == null){
            return null;
        }
        Asignatura asignatura = asignaturaMapper.dtoToEntity(asignaturaDTO);
        List<Docente> docentes = asignatura.getDocentes();
        for(int i=0; i < docentes.size(); i++){
            Docente docente = docenteRepository.findById(docentes.get(i).getId()).orElse(null);
            if(docente != null){
                docentes.set(i, docente);
            }
        }
        return asignaturaMapper.entityToDto(asignaturaRepository.save(asignatura));
    }

    @Override
    public AsignaturaDTO findById(int id) {
        return asignaturaMapper.entityToDto(asignaturaRepository.findById(id).orElse(null));
    }
}
