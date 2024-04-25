package br.gov.sp.fatec.springbootapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springbootapp.entity.Trabalho;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long>{
    

    List<Trabalho> findByTituloAndNotaGreaterThan(String titulo, Integer nota );


 }
