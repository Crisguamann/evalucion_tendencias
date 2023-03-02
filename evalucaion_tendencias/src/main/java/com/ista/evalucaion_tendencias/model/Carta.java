package com.ista.evalucaion_tendencias.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "Carta")
public class Carta {
    @Id
    private String id;

    private String nombre;
    private String categoria;
    private int cantidad;

    @DBRef(lazy = true)
    @Cascade(CascadeType.ALL)
    private List<Plato> platos;
}
