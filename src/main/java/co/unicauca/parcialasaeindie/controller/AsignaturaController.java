package co.unicauca.parcialasaeindie.controller;

import co.unicauca.parcialasaeindie.model.dto.AsignaturaDTO;
import co.unicauca.parcialasaeindie.service.IAsignaturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/asignatura", produces = MediaType.APPLICATION_JSON_VALUE)
public class AsignaturaController {
    private final IAsignaturaService asignaturaService;
    @PostMapping
    public AsignaturaDTO save(@RequestBody AsignaturaDTO asignaturaDTO){
        return asignaturaService.save(asignaturaDTO);
    }

    @GetMapping("/{id}")
    public AsignaturaDTO findById(@PathVariable int id){
        return asignaturaService.findById(id);
    }
}
