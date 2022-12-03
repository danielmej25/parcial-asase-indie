package co.unicauca.parcialasaeindie.service;

import co.unicauca.parcialasaeindie.model.dto.CursoDTO;

public interface ICursoService {
    CursoDTO save(CursoDTO cursoDTO);
    CursoDTO findById(int id);
}
