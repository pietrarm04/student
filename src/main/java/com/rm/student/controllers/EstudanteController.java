package com.rm.student.controllers;

import com.rm.student.models.EstudanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rm.student.services.EstudanteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path ="/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public EstudanteModel criarEstuante(@RequestBody EstudanteModel estudanteModel){
        return estudanteService.criarEstudante(estudanteModel);
    }

    @GetMapping
    public List<EstudanteModel> listarEstudantes(){
        return estudanteService.findALL();
    }

    @GetMapping("/{id}")
    public Optional<EstudanteModel> buscarIdEstudante(@PathVariable Long id){
        return estudanteService.buscarIdEstudante(id);
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id){
        estudanteService.deletarEstudante(id);
    }

}
