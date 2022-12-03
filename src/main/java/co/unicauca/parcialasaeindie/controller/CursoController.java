package co.unicauca.parcialasaeindie.controller;

import co.unicauca.parcialasaeindie.model.dto.CursoDTO;
import co.unicauca.parcialasaeindie.service.ICursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/curso", produces = MediaType.APPLICATION_JSON_VALUE)
public class CursoController {

    private final ICursoService cursoService;
    @PostMapping
    public CursoDTO save(@RequestBody CursoDTO cursoDTO){
        return cursoService.save(cursoDTO);
    }

    @GetMapping("/{id}")
    public CursoDTO findById(@PathVariable int id){
        return cursoService.findById(id);
    }
}
