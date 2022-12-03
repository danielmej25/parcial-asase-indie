package co.unicauca.parcialasaeindie.service;

import co.unicauca.parcialasaeindie.model.dto.EstudianteDTO;

import java.util.List;

public interface IEstudianteService {
    EstudianteDTO save(EstudianteDTO estudianteDTO);
    EstudianteDTO findById(int id);
    List<EstudianteDTO> findAll();
    void deleteById(int id);
    EstudianteDTO update(int id, EstudianteDTO estudianteDTO);
}
