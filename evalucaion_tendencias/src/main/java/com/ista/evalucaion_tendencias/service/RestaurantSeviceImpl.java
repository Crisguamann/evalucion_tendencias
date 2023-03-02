package com.ista.evalucaion_tendencias.service;

import com.ista.evalucaion_tendencias.model.Restaurante;
import com.ista.evalucaion_tendencias.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RestaurantSeviceImpl extends GenericServiceImpl<Restaurante, String> implements RestaurantService{

    @Autowired
    RestauranteRepository restauranteRepository;

    @Override
    public CrudRepository<Restaurante, String> getDao() {
        // TODO Auto-generated method stub
        return restauranteRepository;
    }
}
