package br.gov.sp.fatec.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springbootapp.entity.Trabalho;

public interface TrabalhoRepository extends JpaRepository< Trabalho, Long>{
    
}
