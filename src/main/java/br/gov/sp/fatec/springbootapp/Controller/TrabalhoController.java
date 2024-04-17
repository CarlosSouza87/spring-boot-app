package br.gov.sp.fatec.springbootapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springbootapp.entity.Trabalho;
import br.gov.sp.fatec.springbootapp.services.TrabalhoService;

@CrossOrigin
@RestController
@RequestMapping(value="/trabalho")
public class TrabalhoController {
    @Autowired
    TrabalhoService trabalhoService;

    @GetMapping(value="/{titulo}/{nota}")
    public ResponseEntity<List<Trabalho>> listatrabalho(@PathVariable("titulo")String titulo,
                                                        @PathVariable("nota")Integer nota){
        List<Trabalho> listTrabalho=trabalhoService.buscaTrabalhoPorTituloNota(titulo, nota);

        return ResponseEntity.ok().body(listTrabalho);



    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Trabalho> listaIdTrabalho(@PathVariable("id")Long id){                                     ){
        Trabalho trabalho=trabalhoService.buscaTrabalhoPorId(id);

        return ResponseEntity.ok().body(trabalho);
    
    }

    @GetMapping
    public ResponseEntity<List<Trabalho>> listaTodosTrabalho(){
        List<Trabalho> trabalho=trabalhoService.listaTrabalhoTodos();

        return ResponseEntity.ok().body(trabalho);

    }    

    @PostMapping
    public ResponseEntity<Trabalho> cadastraTrabalho(@RequestBody Trabalho trabalho){
        Trabalho trabalho2=trabalhoService.cadastraTrabalho(trabalho);
        return ResponseEntity.ok().body(trabalho2);
        

    }
 
}
