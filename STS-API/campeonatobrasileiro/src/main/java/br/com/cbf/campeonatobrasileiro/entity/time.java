package br.com.cbf.campeonatobrasileiro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;


@Entity
@Data

public class time {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer id;
     @Column(length = 20)
     private String nome;
     @Column(length = 4)
     private String sigla;
     @Column(length = 2, name = "estado")
     private String uf;
   
     private String estadio;
}