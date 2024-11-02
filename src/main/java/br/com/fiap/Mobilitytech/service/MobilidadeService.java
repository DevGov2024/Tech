package br.com.fiap.Mobilitytech.service;

import br.com.fiap.Mobilitytech.model.Mobilidade;
import br.com.fiap.Mobilitytech.repository.MobilidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobilidadeService {


    @Autowired
    private MobilidadeRepository mobilidadeRepository;


    public Mobilidade insertMobilidade(Mobilidade mobilidade) {

       return mobilidadeRepository.save(mobilidade);
    }
    public List<Mobilidade>getAllMobilidades() {
        return mobilidadeRepository.findAll();
    }
}
