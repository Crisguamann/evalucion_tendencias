package com.ista.evalucaion_tendencias.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Cliente")
public class Cliente {
    @Id
    private String id;

    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
}
