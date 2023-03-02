package com.ista.evalucaion_tendencias.repository;

import com.ista.evalucaion_tendencias.model.Carta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartaRepository extends MongoRepository<Carta, String> {
}
