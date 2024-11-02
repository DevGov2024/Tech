package br.com.fiap.Mobilitytech.controller;


import br.com.fiap.Mobilitytech.model.Mobilidade;
import br.com.fiap.Mobilitytech.service.MobilidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Mobilitytech")
public class MobilidadeController {

@Autowired
private  MobilidadeService mobilidadeService;

@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public Mobilidade insertMobilidade (Mobilidade mobilidade) {
    return mobilidadeService.insertMobilidade(mobilidade);
}
@GetMapping
public List<Mobilidade> getAllMobilidades() {
return mobilidadeService.getAllMobilidades();
}










}
