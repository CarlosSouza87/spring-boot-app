package br.gov.sp.fatec.springbootapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springbootapp.entity.Trabalho;
import br.gov.sp.fatec.springbootapp.services.TrabalhoService;

@RestController
@RequestMapping(value="/trabalho")
public class TrabalhoController {
    @Autowired
    TrabalhoService trabalhoService;

    @GetMapping
    public ResponseEntity<List<Trabalho>> listatrabalho(String titulo,Integer nota){
        List<Trabalho> listTrabalho=trabalhoService.buscaTrabalhoPorTituloNota(titulo, nota);

        return ResponseEntity.ok().body(listTrabalho);



    }

}
