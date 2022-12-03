package co.unicauca.parcialasaeindie.service;

import co.unicauca.parcialasaeindie.model.dto.AsignaturaDTO;

public interface IAsignaturaService {
    AsignaturaDTO save(AsignaturaDTO asignaturaDTO);
    AsignaturaDTO findById(int id);
}
