package services;

import models.EstudanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.EstudanteRepository;

import java.util.List;
import java.util.Optional;

public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel criarEstudante(EstudanteModel estudanteModel){
        return estudanteRepository.save(estudanteModel);
    }

    public List<EstudanteModel>findALL(){
        return estudanteRepository.findAll();
    }

    public Optional<EstudanteModel> buscarIdEstudante(Long id){
        return estudanteRepository.findById(id);
    }

    public void deletarEstudante(Long id){
        estudanteRepository.deleteById(id);
    }
}
