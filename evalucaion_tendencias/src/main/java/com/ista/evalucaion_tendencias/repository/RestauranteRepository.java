package com.ista.evalucaion_tendencias.repository;

import com.ista.evalucaion_tendencias.model.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestauranteRepository extends MongoRepository<Restaurante, String> {

}
