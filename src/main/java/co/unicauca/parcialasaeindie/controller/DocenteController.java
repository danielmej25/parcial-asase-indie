package co.unicauca.parcialasaeindie.controller;

import co.unicauca.parcialasaeindie.model.dto.DocenteDTO;
import co.unicauca.parcialasaeindie.service.IDocenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/docente", produces = MediaType.APPLICATION_JSON_VALUE)
public class DocenteController {
    private final IDocenteService docenteService;
    @PostMapping
    DocenteDTO docenteDTO(@RequestBody DocenteDTO docenteDTO){
        return docenteService.save(docenteDTO);
    }
}
