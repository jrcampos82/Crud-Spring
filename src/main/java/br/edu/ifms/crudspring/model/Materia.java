package br.edu.ifms.crudspring.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String nome;
    int ch;
    String ementa;
    
}
