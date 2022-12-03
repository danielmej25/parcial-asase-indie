package co.unicauca.parcialasaeindie.service.impl;

import co.unicauca.parcialasaeindie.model.Asignatura;
import co.unicauca.parcialasaeindie.model.Docente;
import co.unicauca.parcialasaeindie.model.dto.DocenteDTO;
import co.unicauca.parcialasaeindie.repository.AsignaturaRepository;
import co.unicauca.parcialasaeindie.repository.DocenteRepository;
import co.unicauca.parcialasaeindie.service.IDocenteService;
import co.unicauca.parcialasaeindie.service.mapper.DocenteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DocenteService implements IDocenteService {

    private final DocenteRepository docenteRepository;
    private final AsignaturaRepository asignaturaRepository;
    private final DocenteMapper docenteMapper;
    @Override
    public DocenteDTO save(DocenteDTO docenteDTO) {

        Docente docente = docenteMapper.dtoToEntity(docenteDTO);
        List<Asignatura> asignaturaList = docente.getAsignaturas();
        for(int i=0; i < asignaturaList.size(); i++){
            Asignatura asignatura = asignaturaRepository.findById(asignaturaList.get(i).getId()).orElse(null);
            if(asignatura != null){
                asignaturaList.set(i, asignatura);
            }
        }
        return docenteMapper.entityToDto(docenteRepository.save(docente));
    }
}
