package com.ista.evalucaion_tendencias.repository;

import com.ista.evalucaion_tendencias.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
