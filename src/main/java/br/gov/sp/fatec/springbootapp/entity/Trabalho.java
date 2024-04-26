package br.gov.sp.fatec.springbootapp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="cor_corpo")

public class Trabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cor_id")
    private Long id;

    @Column(name = "cor_nome")
    private String titulo;

    @Column(name = "cor_descricao")
    private String descricao;

    @Column(name = "cor_diametro")
    private Integer  nota;

    @Column(name = "cor_distancia_estrela")
    private Float justificativa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Float getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(Float justificativa) {
        this.justificativa = justificativa;
    }
    
}
