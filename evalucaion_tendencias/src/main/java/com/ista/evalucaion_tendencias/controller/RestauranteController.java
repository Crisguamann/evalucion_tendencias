package com.ista.evalucaion_tendencias.controller;

import com.ista.evalucaion_tendencias.model.Restaurante;
import com.ista.evalucaion_tendencias.repository.RestauranteRepository;
import com.ista.evalucaion_tendencias.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {
    @Autowired
    private RestaurantService restauranteRepository;

    @GetMapping("/getAll")
    public List<Restaurante> getAll() {
        return restauranteRepository.findByAll();
    }

    @PostMapping("/create")
    public Restaurante create(@RequestBody Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }

    @GetMapping("/getById/{id}")
    public Restaurante getById(@PathVariable String id) {
        return restauranteRepository.findById(id);
    }

    @PutMapping("/update/{id}")
    public Restaurante update(@PathVariable String id, @RequestBody Restaurante restaurante) {
        Restaurante r = restauranteRepository.findById(id);
        if (r == null) {
            return null;
        }else{
            r.setNombre(restaurante.getNombre());
            r.setTelefono(restaurante.getTelefono());
            r.setCorreo(restaurante.getCorreo());
            r.setDireccion(restaurante.getDireccion());
            return r;
        }

    }
}
