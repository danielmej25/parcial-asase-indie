package co.unicauca.parcialasaeindie.controller;

import co.unicauca.parcialasaeindie.model.dto.EstudianteDTO;
import co.unicauca.parcialasaeindie.service.IEstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/estudiante", produces = MediaType.APPLICATION_JSON_VALUE)
public class EstudianteController {
    private final IEstudianteService estudianteService;
    @PostMapping
    public EstudianteDTO save(@RequestBody EstudianteDTO estudianteDTO){
        return estudianteService.save(estudianteDTO);
    }

    @GetMapping
    public List<EstudianteDTO> findAll(){
        return estudianteService.findAll();
    }

    @GetMapping("/{id}")
    public EstudianteDTO findById(@PathVariable int id){
        return estudianteService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable int id){estudianteService.deleteById(id);}

    @PutMapping("/{id}")
    public EstudianteDTO update(@PathVariable int id, @RequestBody EstudianteDTO estudianteDTO){
        return estudianteService.update(id, estudianteDTO);
    }
}
