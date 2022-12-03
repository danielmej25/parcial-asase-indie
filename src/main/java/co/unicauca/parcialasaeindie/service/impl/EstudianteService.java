package co.unicauca.parcialasaeindie.service.impl;

import co.unicauca.parcialasaeindie.model.Direccion;
import co.unicauca.parcialasaeindie.model.Estudiante;
import co.unicauca.parcialasaeindie.model.Telefono;
import co.unicauca.parcialasaeindie.model.dto.EstudianteDTO;
import co.unicauca.parcialasaeindie.repository.EstudianteRepository;
import co.unicauca.parcialasaeindie.service.IEstudianteService;
import co.unicauca.parcialasaeindie.service.mapper.EstudianteMapper;
import co.unicauca.parcialasaeindie.service.mapper.TelefonoMapper;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EstudianteService implements IEstudianteService {

    private final EstudianteRepository estudianteRepository;
    private final EstudianteMapper estudianteMapper;
    private final TelefonoMapper telefonoMapper;

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

    @Override
    public void deleteById(int id) {
        estudianteRepository.deleteById(id);
    }

    @Override
    public EstudianteDTO update(int id, EstudianteDTO estudianteDTO) {
        Estudiante estudiante = estudianteRepository.findById(id).orElse(null);
        if(estudiante == null){
            throw new EntityNotFoundException("Student doesn't exist");
        }
        estudiante.setNombres(estudianteDTO.getNombres());
        estudiante.setApellidos(estudianteDTO.getApellidos());
        estudiante.setFechaIngreso(estudianteDTO.getFechaIngreso());
        Direccion direccion = estudiante.getDireccion();
        direccion.setDireccionResidencia(estudianteDTO.getDireccion().getDireccionResidencia());
        direccion.setCiudad(estudianteDTO.getDireccion().getCiudad());
        direccion.setPais(estudianteDTO.getDireccion().getPais());
        List<Telefono> telefonos = telefonoMapper.telefonosDTOsToTelefonos(estudianteDTO.getTelefonos());
        telefonos.forEach(telefono -> telefono.setEstudiante(estudiante));
        estudiante.setTelefonos(telefonos);
        return estudianteMapper.entityToDto(estudianteRepository.save(estudiante));
    }
}
