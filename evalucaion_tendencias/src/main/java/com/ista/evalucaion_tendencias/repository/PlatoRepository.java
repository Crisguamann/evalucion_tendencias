package com.ista.evalucaion_tendencias.repository;

import com.ista.evalucaion_tendencias.model.Plato;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlatoRepository extends MongoRepository<Plato, String> {
}
