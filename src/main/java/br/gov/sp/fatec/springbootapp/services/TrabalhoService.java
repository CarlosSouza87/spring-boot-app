package br.gov.sp.fatec.springbootapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.gov.sp.fatec.springbootapp.Repository.TrabalhoRepository;
import br.gov.sp.fatec.springbootapp.entity.Trabalho;

@Service
public class TrabalhoService {

    @Autowired
    TrabalhoRepository trabalhoRepository;

    public List<Trabalho> buscaTrabalhoPorTituloNota(String titulo,Integer nota){
        
        return trabalhoRepository.findByTituloAndNotaGreaterThan(titulo,nota);
    }
    public List<Trabalho> listaTrabalhoTodos(){
        return trabalhoRepository.findAll();
    }
    public Trabalho buscaTrabalhoPorId(Long id){
        return trabalhoRepository.findById(id).orElseThrow();

    }
    public Trabalho cadastraTrabalho(Trabalho trabalho){
        return trabalhoRepository.save(trabalho);
        
    }
      

}
